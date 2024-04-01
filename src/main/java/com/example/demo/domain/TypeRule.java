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
public class TypeRule {

    /**
    *
    */
    @ApiModelProperty("")
    private Integer id;
    /**
    * 字段类型(0:通用 1:前缀 2:后缀 3:形容词)
    */
    @ApiModelProperty("字段类型(0:通用 1:前缀 2:后缀 3:形容词)")
    private Integer type;
    /**
    * 字段类型名称
    */
    @ApiModelProperty("字段类型名称")
    private String typeName;
    /**
    * 字段类型倍率
    */
    @ApiModelProperty("字段类型倍率")
    private Double typeMultiplier;


}
