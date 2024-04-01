package com.example.demo.rule.monster;

import com.example.demo.rule.AbsRule;
import com.example.demo.rule.BalanceRule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class MonsterRule extends AbsRule implements BalanceRule {

    // 怪物固定时长
    private Double fixedTime() {
        return 1.0;
    }

    @Override
    public Double getBalanceTime() {
        // 前缀 * 后缀 * 形容词 * 固定时长
        return prefixRule() * suffixRule() * adjectivesRule() * fixedTime();
    }
}
