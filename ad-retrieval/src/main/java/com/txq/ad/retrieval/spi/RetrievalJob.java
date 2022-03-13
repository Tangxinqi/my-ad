package com.txq.ad.retrieval.spi;

import com.txq.ad.retrieval.entity.GlobalObject;
import com.txq.ad.retrieval.entity.IndexTuple;
import com.txq.ad.retrieval.entity.SunfishThirdContext;
import com.txq.ad.common.sdk.retrieval.entity.RetrievalRequest;

/**
 * @author xinqitang
 * @date 2021/2/4
 */
public interface RetrievalJob {
    void retrieval(RetrievalRequest request, SunfishThirdContext sunfishThirdContext, GlobalObject object, IndexTuple indexTuple);
}
