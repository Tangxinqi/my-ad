package com.txq.ad.retrieval.entity;

import lombok.Data;

/**
 * @author xinqitang
 * @date 2021/2/4
 */
@Data
public class CutLibQueryContext {

    private CutLibResult cutLibResult;

    public void bindQuery() {
        // 初始化参数
    }
}
