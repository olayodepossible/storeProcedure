package com.stanbic.service.finacle.enquiry.service.dto.response;

import com.stanbic.service.finacle.enquiry.service.dto.ResponseMessage;
import com.stanbic.service.finacle.enquiry.service.dto.callover.PostedTransactionList;

import java.util.List;

public class PostedTransactionResponse {
    private ResponseMessage status;
    private List<PostedTransactionList> postedTransactionList;

    public ResponseMessage getStatus() {
        return status;
    }

    public void setStatus(ResponseMessage status) {
        this.status = status;
    }

    public List<PostedTransactionList> getPostedTransactionList() {
        return postedTransactionList;
    }

    public void setPostedTransactionList(List<PostedTransactionList> postedTransactionList) {
        this.postedTransactionList = postedTransactionList;
    }
}
