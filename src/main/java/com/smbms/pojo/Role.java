package com.smbms.pojo;

import java.util.Date;
import java.util.List;

/**
 * 
 * 2019年6月24日
 * @author Ray
 *
 */
public class Role {
/*
 * 
FieldTypeComment
idbigint(20) NOT NULL主键ID
roleCodevarchar(15) NULL角色编码
roleNamevarchar(15) NULL角色名称
createdBybigint(20) NULL创建者
creationDatedatetime NULL创建时间
modifyBybigint(20) NULL修改者
modifyDatedatetime NULL修改时间
 */
	private Long id;
	private String roleCode;
	private String roleName;
	private Long createdBy;
	private Date creationDate;
	private Long modifyBy;
	private Date modifyDate;
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Long getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", roleCode='" + roleCode + '\'' +
				", roleName='" + roleName + '\'' +
				", createdBy=" + createdBy +
				", creationDate=" + creationDate +
				", modifyBy=" + modifyBy +
				", modifyDate=" + modifyDate +
				", users=" + users +
				'}';
	}
}
