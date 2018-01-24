/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	restfulapp
 * 文件名：	SysUserController.java
 * 模块说明：
 * 修改历史：
 * 2018/1/22 - seven - 创建。
 */
package com.seven.cloud.controller;

import com.seven.cloud.pojo.SysUser;
import com.seven.cloud.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author seven
 */
@Controller
@RequestMapping("/sysUserController")
public class SysUserController {

  @Resource
  private SysUserService sysUserService;

  @RequestMapping("/showUserToJspById/{userId}")
  public String showUser(Model model, @PathVariable("userId") Long userId) {
    SysUser user = sysUserService.getById(userId);
    model.addAttribute("user", user);
    return "showUser";
  }

  @RequestMapping("/showUserToJSONById/{userId}")
  @ResponseBody
  public SysUser showUser(@PathVariable("userId") Long userId) {
    SysUser user = sysUserService.getById(userId);
    return user;
  }
}
