package com.example.demo.rule.equipment;

import com.example.demo.rule.AbsRule;
import com.example.demo.rule.BalanceRule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class EquipmentRule extends AbsRule implements BalanceRule {

    // 装备强化时长
    private Double strengthenIncome() {
        return 1.0;
    }

    @Override
    public Double getBalanceTime() {
        // 前缀 * 后缀 * 形容词
        return prefixRule() * specialRule() * adjectivesRule() * specialRule();
    }
}
