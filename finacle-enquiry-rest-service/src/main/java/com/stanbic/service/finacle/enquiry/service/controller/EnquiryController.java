package com.stanbic.service.finacle.enquiry.service.controller;

import com.stanbic.service.finacle.enquiry.service.dto.response.PostedTransactionResponse;
import com.stanbic.service.finacle.enquiry.service.dto.ResponseMessage;
import com.stanbic.service.finacle.enquiry.service.service.CallOverServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


/**
 * @author Abayomi
 */

@Api(value = "Finacle Enquiry Controller ")
@Validated
@RestController
@RequestMapping("finacle/enquiry/service")
public class EnquiryController {
    @Autowired
    private CallOverServiceImpl callOverService;

    @GetMapping()
    public ResponseEntity<PostedTransactionResponse> getUserPostedTransaction(
            @ApiParam(value = "SAP_Id", required = true, example = "A171784")
            @RequestParam(value = "user_id") @NotBlank String user_id,
            @ApiParam(value = "tranDate", required = true, example = "27-JUL-11")
            @RequestParam(value = "transaction_date") @NotBlank String transaction_date){
        PostedTransactionResponse response = callOverService.findAllPostedTransactionBySapId(user_id, transaction_date);
        if (response.getStatus().equals(ResponseMessage.SUCCESS)){
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }
}
