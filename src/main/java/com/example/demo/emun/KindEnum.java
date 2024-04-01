package com.example.demo.emun;

import lombok.Getter;

/**
 * @author : songtc
 * @since : 2024/04/01 15:48
 */
@Getter
public enum KindEnum {
    ORDINARY(0, "通用"),
    EQUIPMENT(1, "素材"),
    SKILL(2, "装备"),
    MONSTER(3, "魔法"),
    MATERIAL(4, "怪物");

    private final Integer code;
    private final String name;

    KindEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
