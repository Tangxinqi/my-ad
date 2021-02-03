package com.txq.ad.retrieval.sdk.service;

import com.txq.ad.retrieval.sdk.entity.RetrievalRequest;
import com.txq.ad.retrieval.sdk.entity.RetrievalResponse;

/**
 * @author xinqitang
 * @date 2021/2/3
 */
public interface RetrievalService {
    RetrievalResponse retrieval(RetrievalRequest request);
}
