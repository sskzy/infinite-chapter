package com.example.demo.emun;

import lombok.Getter;

/**
 * @author : songtc
 * @since : 2024/04/01 15:48
 */
@Getter
public enum TypeEnum {
    ORDINARY(0, "通用"),
    PREFIX(1, "前缀"),
    SUFFIX(2, "后缀"),
    ADJECTIVES(3, "形容词");

    private final Integer code;
    private final String name;

    TypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
