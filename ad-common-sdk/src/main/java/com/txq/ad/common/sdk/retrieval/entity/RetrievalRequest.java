package com.txq.ad.common.sdk.retrieval.entity;

import lombok.Data;

/**
 * 检索服务请求参数对象
 *
 * @author xinqitang
 * @date 2021/2/3
 */
@Data
public class RetrievalRequest {

    private String filter;
    private String scorer;
    private Integer topn;                   // 基础队列长度, 不包含额外配额, 对应mixer中的GroupedTopn
    private SystemInfo systemInfo;
    private TargetingContext targetingContext;


    @Data
    public static class SystemInfo {
        private boolean isUseTargetingSearchCache;
        private boolean isForceCall;
    }
}
