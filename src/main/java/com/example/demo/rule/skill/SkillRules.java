package com.example.demo.rule.skill;

import com.example.demo.rule.AbsRule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class SkillRules implements AbsRule {
    // 技能施法时长
    public Double startTime() {
        return 1.0;
    }

    @Override
    public Double getRuleTime() {
        // (前缀 * 后缀 * 形容词 * 固定时长)/施法前摇
        return this.prefixRule() * this.suffixRule() * this.adjectivesRule() / this.startTime();
    }
}
