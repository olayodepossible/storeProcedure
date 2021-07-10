package com.stanbic.service.finacle.enquiry.service.service;

import com.stanbic.service.finacle.enquiry.service.dto.response.PostedTransactionResponse;
import com.stanbic.service.finacle.enquiry.service.dto.ResponseMessage;
import com.stanbic.service.finacle.enquiry.service.dto.callover.PostedTransactionList;
import com.stanbic.service.finacle.enquiry.service.entity.TransactionLog;
import com.stanbic.service.finacle.enquiry.service.exception.OperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;

import java.util.List;

/**
 * @author Abayomi
 */

@Service
public class CallOverServiceImpl implements CallOverService {
    private static final Logger log = LoggerFactory.getLogger(CallOverServiceImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    public PostedTransactionResponse findAllPostedTransactionBySapId(String sapId, String tranDate) {
        PostedTransactionResponse transactionResponse;
        List<PostedTransactionList> postedTransactionList = new ArrayList<>();

        try {
            log.info("**** Enter CallOverServiceImpl try block ****");
            List<TransactionLog> transactionLogs = em.createNamedStoredProcedureQuery("TransactionLog.fetchPostedTransaction")
                    .setParameter( "SAP_ID", sapId )
                    .setParameter( "v_tran_date", tranDate )
                    .getResultList();

            if (transactionLogs.size() == 0){
                transactionResponse = new PostedTransactionResponse();
                transactionResponse.setStatus(ResponseMessage.NOT_FOUND);
                return transactionResponse;
            }
            for (TransactionLog row : transactionLogs) {
                PostedTransactionList callOverDto = new PostedTransactionList();
                BeanUtils.copyProperties(row, callOverDto);
                postedTransactionList.add(callOverDto);
            }

            transactionResponse = new PostedTransactionResponse();
            transactionResponse.setStatus(ResponseMessage.SUCCESS);
            transactionResponse.setPostedTransactionList(postedTransactionList);

            return transactionResponse;
        } catch (Exception ex) {
            throw new OperationException(ex.getMessage(), ex);
        }

    }
}
