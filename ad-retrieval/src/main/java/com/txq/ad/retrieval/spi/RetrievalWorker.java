package com.txq.ad.retrieval.spi;

import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalRequest;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalResponse;

/**
 * @author xinqitang
 * @date 2021/2/3
 */
public interface RetrievalWorker {
    /**
     * @param request 检索条件
     * @param tuple   检索索引集合
     */
    RetrievalResponse process(RetrievalRequest request, IndexTuple tuple);
}
