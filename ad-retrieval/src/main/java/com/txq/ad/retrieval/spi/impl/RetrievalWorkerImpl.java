package com.txq.ad.retrieval.spi.impl;

import com.txq.ad.retrieval.entity.GlobalObject;
import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.retrieval.sdk.entity.RetrievalRequest;
import com.txq.ad.retrieval.sdk.entity.RetrievalResponse;
import com.txq.ad.retrieval.spi.RetrievalWorker;
import com.txq.ad.retrieval.util.RetrievalRequestFormatter;

/**
 * @author xinqitang
 * @date 2021/2/3
 */
public class RetrievalWorkerImpl implements RetrievalWorker {

    @Override
    public RetrievalResponse process(RetrievalRequest request, IndexTuple tuple) {
        return null;
    }

    private void beginSearch(RetrievalRequest request, GlobalObject context) {

        RetrievalRequestFormatter.format(request);
    }

}
