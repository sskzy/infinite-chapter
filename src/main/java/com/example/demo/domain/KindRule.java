package com.example.demo.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
* @author : songtc
* @since : 2024-04-01 15:44:07
*/
@Setter
@Getter
public class KindRule {

    /**
    * 
    */
    @ApiModelProperty("")
    private Integer id;
    /**
    * 字段种类(0:通用 1:装备 2:魔法 3:怪物 4:素材)
    */
    @ApiModelProperty("字段种类(0:通用 1:装备 2:魔法 3:怪物 4:素材)")
    private Integer kind;
    /**
    * 字段种类名称
    */
    @ApiModelProperty("字段种类名称")
    private String kindName;
    /**
    * 字段种类倍率
    */
    @ApiModelProperty("字段种类倍率")
    private Double kindMultiplier;
}
