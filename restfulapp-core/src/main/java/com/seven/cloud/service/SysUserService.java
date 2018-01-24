/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	restfulapp
 * 文件名：	SysUserService.java
 * 模块说明：
 * 修改历史：
 * 2018/1/22 - seven - 创建。
 */
package com.seven.cloud.service;

import com.seven.cloud.pojo.SysUser;
import sun.rmi.server.InactiveGroupException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author seven
 */
@Path("/sysuserservice")
@Consumes(MediaType.APPLICATION_JSON + "; charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
public interface SysUserService {

  @Path("/users/{id}")
  @GET
  SysUser getById(@PathParam("id") Long id);

  @Path("/save")
  @POST
  int save(SysUser sysUser);

  @Path("/users/{id}/delete")
  @POST
  int delete(@PathParam("id") Long id);

  @Path("/saveselective")
  @POST
  int saveSelective(SysUser sysUser);

  @Path("/update")
  @POST
  int update(SysUser sysUser);

  @Path("/updateselective")
  @POST
  int updateSelective(SysUser sysUser);
}
