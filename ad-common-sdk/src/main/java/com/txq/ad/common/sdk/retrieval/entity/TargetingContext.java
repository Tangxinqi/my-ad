package com.txq.ad.common.sdk.retrieval.entity;

import lombok.Data;

/**
 * @author xinqitang
 * @date 2021/2/4
 */
@Data
public class TargetingContext {

    /**
     * 用户上下文
     */
    private UserContext userContext;
    /**
     * 广告位上下文
     */
    private PosContext posContext;
    /**
     * 流量上下文
     */
    private FlowContext flowContext;
    /**
     * 合约特有字段
     */
    private ContractInfo contractInfo;


    @Data
    public static class UserContext {

    }

    @Data
    public static class PosContext {

    }

    @Data
    public static class FlowContext {

    }

    @Data
    public static class ContractInfo {

    }
}
