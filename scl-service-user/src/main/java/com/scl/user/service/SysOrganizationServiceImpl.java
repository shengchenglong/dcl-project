package com.scl.user.service;

import javax.annotation.Resource;


import org.springframework.transaction.annotation.Transactional;

import com.scl.user.domain.SysOrganization;
import com.scl.user.mapper.SysOrganizationMapper;

/**
 * 组织接口实现类
 * 
 * @author shengchenglong
 *
 */
@Transactional
public class SysOrganizationServiceImpl implements SysOrganizationService  {
	
	@Resource
	private SysOrganizationMapper organizationMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		return organizationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysOrganization record) {
		return organizationMapper.insert(record);
	}

	@Override
	public int insertSelective(SysOrganization record) {
		return organizationMapper.insertSelective(record);
	}

	@Override
	public SysOrganization selectByPrimaryKey(String id) {
		return organizationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SysOrganization record) {
		return organizationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysOrganization record) {
		return organizationMapper.updateByPrimaryKey(record);
	}

}
