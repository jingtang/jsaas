package com.redxun.sys.ldap.manager;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.redxun.core.dao.IDao;
import com.redxun.core.manager.BaseManager;
import com.redxun.sys.ldap.dao.SysLdapLogDao;
import com.redxun.sys.ldap.entity.SysLdapLog;
/**
 * <pre> 
 * 描述：SysLdapLog业务服务类
 * 构建组：miweb
 * 作者：keith
 * 邮箱: chshxuan@163.com
 * 日期:2014-2-1-上午12:52:41
 * 使用范围：授权给敏捷集团使用
 * </pre>
 */
@Service
public class SysLdapLogManager extends BaseManager<SysLdapLog>{
	@Resource
	private SysLdapLogDao sysLdapLogDao;
	@SuppressWarnings("rawtypes")
	@Override
	protected IDao getDao() {
		return sysLdapLogDao;
	}
}