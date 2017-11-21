package com.ssm.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ssm.domain.Contact;
import com.ssm.mapper.ContactMapper;

@Repository("contactDao")
public class ContactDaoImpl implements ContactDao {
	
	@Resource(name="contactMapper")
	private ContactMapper contactMapper;
	public ContactMapper getContactMapper() {
		return contactMapper;
	}
	public void setContactMapper(ContactMapper contactMapper) {
		this.contactMapper = contactMapper;
	}

	
	public void save(Contact contact) {
		contactMapper.save(contact);
	}

	public void update(Contact contact) {
		contactMapper.update(contact);
	}

	public void deleteById(int t_id) {
		contactMapper.deleteById(t_id);
	}

	public List<Contact> getAll(int id) {
		return contactMapper.getAll(id);
	}

	public Contact getAllById(int t_id) {
		return contactMapper.getAllById(t_id);
	}

	public List<Contact> dynamicSelect(Map<String,Object> map) {
		return contactMapper.dynamicSelect(map);
	}


}
