package com.example.emos.wx.controller.form;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录dto
 */
@Data
@ApiModel
public class LoginForm {
    @NotBlank(message = "临时授权码不能为空")
    private String code;
}
