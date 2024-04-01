package com.example.demo.rule;

import com.example.demo.service.KindRuleService;
import com.example.demo.service.TypeRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : songtc
 * @since : 2024/03/29 17:59
 */
@Component
public abstract class AbsRule implements IRule {

    @Autowired
    protected KindRuleService kindRuleService;

    @Autowired
    protected TypeRuleService typeRuleService;

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
