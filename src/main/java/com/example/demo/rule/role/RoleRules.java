package com.example.demo.rule.role;

import com.example.demo.rule.AbsRule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:46
 */
public abstract class RoleRules extends AbsRule {
    // 角色面板规则
    public Double rolePanelRule() {
        return 1.0;
    }

    // 角色技能规则
    public Double roleSkillRule() {
        return 1.0;
    }

    // 角色装备规则
    public Double roleEquipmentRule() {
        return 1.0;
    }

    @Override
    public Double getRuleTime() {
        // 人物基础面板加成 * 法术规则时长 * 装备规则时长
        return this.rolePanelRule() * this.roleSkillRule() * this.roleEquipmentRule();
    }
}
