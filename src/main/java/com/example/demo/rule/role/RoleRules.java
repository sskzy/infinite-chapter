package com.example.demo.rule.role;

import com.example.demo.rule.AbsRule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class RoleRules extends AbsRule {
    // 角色面板规则
    private Double rolePanelRule() {
        return 1.0;
    }

    @Override
    public Double getRuleTime() {
        // 人物基础面板加成
        return this.rolePanelRule();
    }
}
