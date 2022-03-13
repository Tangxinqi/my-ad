package com.txq.ad.retrieval.spi;

import com.txq.ad.retrieval.entity.CutLibQueryContext;
import com.txq.ad.retrieval.entity.GlobalObject;
import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.retrieval.entity.SunfishThirdContext;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalRequest;

/**
 * @author xinqitang
 * @date 2021/2/4
 */
public abstract class AbstractCutLibJob implements CutLibJob{

    protected CutLibQueryContext context;

    protected abstract void beforeWork(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple);
    protected abstract void doWork(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple);
    protected abstract void afterWork(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple);

    @Override
    public void cut(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple) {
        beforeWork(request, sunfishThirdContext, object, indexTuple);
        doWork(request, sunfishThirdContext, object, indexTuple);
        afterWork(request, sunfishThirdContext, object, indexTuple);
    }

}
