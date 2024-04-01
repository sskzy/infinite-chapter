package com.example.demo.rule;

/**
 * @author : songtc
 * @since : 2024/03/29 17:59
 */
public abstract class AbsRule implements IRule {

    @Override
    public Double prefixRule() {
        return 1.0;
    }

    @Override
    public Double suffixRule() {
        return 1.0;
    }

    @Override
    public Double adjectivesRule() {
        return 1.0;
    }

    @Override
    public Double specialRule() {
        return 1.0;
    }
}
