/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	restfulapp
 * 文件名：	SysUserMapper.java
 * 模块说明：
 * 修改历史：
 * 2018/1/22 - seven - 创建。
 */
package com.seven.cloud.mapper;

import com.seven.cloud.pojo.SysUser;

/**
 * @author seven
 */
public interface SysUserMapper {
  /**
   * 查询
   *
   * @param sysUserId
   * @return
   */
  SysUser selectByPrimaryKey(Long sysUserId);

  /**
   * 插入
   *
   * @param record
   * @return
   */
  int insert(SysUser record);

  /**
   * 删除
   *
   * @param sysUserId
   * @return
   */
  int deleteByPrimaryKey(Long sysUserId);

  /**
   * 插入数据
   *
   * @param record
   * @return
   */
  int insertSelective(SysUser record);

  /**
   * 更新数据根据选择
   *
   * @param record
   * @return
   */
  int updateByPrimaryKeySelective(SysUser record);

  /**
   * @param record
   * @return
   */
  int updateByPrimaryKey(SysUser record);

}
