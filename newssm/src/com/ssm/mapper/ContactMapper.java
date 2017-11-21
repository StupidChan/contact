package com.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.ssm.domain.Contact;

public interface ContactMapper {
	/**
	 * 保存通讯录
	 */
	public void save(Contact contact);
	
	/**
	 * 根据主键更新通讯录
	 */
	public void update(Contact contact);
	
	/**
	 * 根据主键删除通讯录
	 */
	public void deleteById(int t_id);
	
	/**
	 * 根据用户ID查询全部
	 */
	public List<Contact> getAll(int id);
	
	/**
	 * 根据ID条件查询单个记录，并不是查询全部，懒得改方法名
	 */
	public Contact getAllById(int t_id);
	
	/**
	 * 动态查询
	
	public List<Contact> dynamicSelect(int user_id,String t_name,String t_school,String t_gender);
	*/
	 
	public List<Contact> dynamicSelect(Map<String,Object> map );
}
