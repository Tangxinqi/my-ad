package com.txq.ad.retrieval.util;

import com.txq.ad.retrieval.Configs;
import com.txq.ad.retrieval.sdk.entity.RetrievalRequest;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xinqitang
 * @date 2021/2/3
 */
public class RetrievalRequestFormatter {

    public static void format(RetrievalRequest request) {

        // 填充query定向参数
        formatQuery(request);
        // 根据配置设置参数
        formatParamsByConfig(request);
    }

    private static void formatQuery(RetrievalRequest request) {
        if (request.getTargetingContext() == null) {
            return;
        }
        System.out.println("");
    }

    private static void formatParamsByConfig(RetrievalRequest request) {
        if (StringUtils.isNotBlank(Configs.FILTER_NAME)) {
            request.setFilter(Configs.FILTER_NAME);
        }
        if (StringUtils.isNotBlank(Configs.SCORER_NAME)) {
            request.setScorer(Configs.SCORER_NAME);
        }
        if (Configs.TOP_N > 0) {
            request.setTopn(Configs.TOP_N);
        }
        if (Configs.IS_USE_TARGETING_SEARCH_CACHE) {
            request.getSystemInfo().setUseTargetingSearchCache(true);
        }
    }
}
