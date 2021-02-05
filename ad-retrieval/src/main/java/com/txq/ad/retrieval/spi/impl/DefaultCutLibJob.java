package com.txq.ad.retrieval.spi.impl;

import com.txq.ad.retrieval.entity.GlobalObject;
import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.retrieval.entity.SunfishThirdContext;
import com.txq.ad.retrieval.sdk.entity.RetrievalRequest;
import com.txq.ad.retrieval.spi.AbstractCutLibJob;

/**
 * @author xinqitang
 * @date 2021/2/4
 */
public class DefaultCutLibJob extends AbstractCutLibJob {

    @Override
    protected void beforeWork(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple) {
        // 初始化参数
        context.bindQuery();

        // 此处省略初始化trace相关的
    }

    @Override
    protected void doWork(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple) {
        // TODO SplitTestFunctor.doSplit需要在研究下功能

    }

    @Override
    protected void afterWork(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple) {

    }
}
