package com.example.demo.rule;

/**
 * @author : songtc
 * @since : 2024/03/29 18:29
 */
public interface IRule {
    // 前缀规则
    Double prefixRule();

    // 后缀规则
    Double suffixRule();

    // 形容词规则
    Double adjectivesRule();

    // 特殊规则
    Double specialRule();
}
