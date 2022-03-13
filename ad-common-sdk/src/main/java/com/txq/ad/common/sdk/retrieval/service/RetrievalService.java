package com.txq.ad.common.sdk.retrieval.service;

import com.txq.ad.common.sdk.retrieval.entity.RetrievalRequest;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalResponse;

/**
 * @author xinqitang
 * @date 2021/2/3
 */
public interface RetrievalService {
    RetrievalResponse retrieval(RetrievalRequest request);
}
