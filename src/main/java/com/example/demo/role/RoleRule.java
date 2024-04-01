package com.example.demo.role;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class RoleRule {
    // 角色面板规则
    private Double rolePanelRule() {
        return 1.0;
    }

    public Double getRuleTime() {
        // 人物基础面板加成
        return this.rolePanelRule();
    }
}
