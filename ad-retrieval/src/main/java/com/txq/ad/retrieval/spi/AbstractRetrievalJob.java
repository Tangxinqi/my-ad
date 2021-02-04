package com.txq.ad.retrieval.spi;

import com.txq.ad.retrieval.entity.GlobalObject;
import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.retrieval.entity.SunfishThirdContext;
import com.txq.ad.retrieval.sdk.entity.RetrievalRequest;

/**
 * @author xinqitang
 * @date 2021/2/4
 */
public abstract class AbstractRetrievalJob implements RetrievalJob {

    @Override
    public void retrieval(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object,  IndexTuple indexTuple) {

    }

    abstract void beforeRetrieval(RetrievalRequest request, GlobalObject object);

    abstract void doRetrieval(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple);

    abstract void afterRetrieval(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple);
}
