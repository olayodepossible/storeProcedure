package com.stanbic.service.finacle.enquiry.service.service;

import com.stanbic.service.finacle.enquiry.service.dto.response.PostedTransactionResponse;

public interface CallOverService {
    PostedTransactionResponse findAllPostedTransactionBySapId(String sapId, String tranDate);
}
