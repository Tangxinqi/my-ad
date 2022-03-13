package com.txq.ad.retrieval.spi.impl;

import com.txq.ad.retrieval.entity.GlobalObject;
import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.retrieval.entity.SunfishThirdContext;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalRequest;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalResponse;
import com.txq.ad.retrieval.spi.CutLibJob;
import com.txq.ad.retrieval.spi.RetrievalJob;
import com.txq.ad.retrieval.spi.RetrievalWorker;
import com.txq.ad.retrieval.util.RetrievalRequestFormatter;

/**
 * @author xinqitang
 * @date 2021/2/3
 */
public class RetrievalWorkerImpl implements RetrievalWorker {

    private RetrievalJob retrievalJob;

    private CutLibJob cutLibJob;

    @Override
    public RetrievalResponse process(RetrievalRequest request, IndexTuple tuple) {

        // 初始化参数
        RetrievalRequestFormatter.format(request);

        // 召回广告
        GlobalObject object = new GlobalObject();
        SunfishThirdContext sunfishThirdContext = new SunfishThirdContext();
        retrievalJob.retrieval(request, sunfishThirdContext, object, tuple);

        // 如果是强制召回的, 直接返回
        if (request.getSystemInfo().isForceCall()) {
            return new RetrievalResponse();
        }

        // 超时截断
        cutLibJob.cut(request,sunfishThirdContext, object, tuple);

        // scoring阶段

        return null;
    }
}
