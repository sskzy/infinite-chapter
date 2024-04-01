package com.example.demo.rule.equipment;

import com.example.demo.rule.AbsRule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class EquipmentRules extends AbsRule {

    // 装备强化时长
    private Double strengthenIncome() {
        return 1.0;
    }

    @Override
    public Double getRuleTime() {
        // 前缀 * 后缀 * 形容词 * 装备强化时长
        return prefixRule() * specialRule() * adjectivesRule() * specialRule();
    }
}
