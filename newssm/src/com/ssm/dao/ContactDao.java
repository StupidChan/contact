package com.ssm.dao;

import java.util.List;
import java.util.Map;

import com.ssm.domain.Contact;

public interface ContactDao {

	public void save(Contact contact);
	
	public void update(Contact contact);
	
	public void deleteById(int t_id);

	public List<Contact> getAll(int id);
	
	public Contact getAllById(int t_id);
	
	public List<Contact> dynamicSelect(Map<String,Object> map);
	
}
