package com.example.demo.rule;

import com.example.demo.rule.equipment.EquipmentRules;
import com.example.demo.rule.monster.MonsterRules;
import com.example.demo.rule.role.RoleRules;
import com.example.demo.rule.skill.SkillRules;
import lombok.Data;

/**
 * @author : songtc
 * @since : 2024/03/29 18:18
 */
@Data
public abstract class RealTime {

    private EquipmentRules equipmentRules;
    private MonsterRules monsterRules;
    private RoleRules roleRules;
    private SkillRules skillRules;

    // 可能出现在任意位置
    // 随机时长(角色特殊逻辑) + 负重(角色特殊逻辑) + (怪物规则时长/人物规则时长(角色特殊逻辑)) - 背包道具时长祝福(角色特殊逻辑)
    public Double getRealTime() {
        return monsterRules.getRuleTime() / roleRules.getRuleTime();
    }
}

