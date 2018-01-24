/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	restfulapp
 * 文件名：	SysUserService.java
 * 模块说明：
 * 修改历史：
 * 2018/1/22 - seven - 创建。
 */
package com.seven.cloud.service.impl;

import com.seven.cloud.mapper.SysUserMapper;
import com.seven.cloud.pojo.SysUser;
import com.seven.cloud.service.SysUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author seven
 */
@Service
public class SysUserServiceImpl implements SysUserService {

  @Resource
  private SysUserMapper sysUserMapper;

  public SysUser getById(Long id) {
    return sysUserMapper.selectByPrimaryKey(id);
  }

  @Override
  public int save(SysUser sysUser) {
    sysUserMapper.insert(sysUser);
    return 0;
  }

  @Override
  public int delete(Long id) {
    sysUserMapper.deleteByPrimaryKey(id);
    return 0;
  }

  @Override
  public int saveSelective(SysUser sysUser) {
    sysUserMapper.insertSelective(sysUser);
    return 0;
  }

  @Override
  public int update(SysUser sysUser) {
    sysUserMapper.updateByPrimaryKey(sysUser);
    return 0;
  }

  @Override
  public int updateSelective(SysUser sysUser) {
    sysUserMapper.updateByPrimaryKeySelective(sysUser);
    return 0;
  }
}
