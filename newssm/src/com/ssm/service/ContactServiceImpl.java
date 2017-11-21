package com.ssm.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.ContactDao;
import com.ssm.domain.Contact;

@Service("contactService")
public class ContactServiceImpl implements ContactService{
	@Resource
	private ContactDao contactDao;
	public ContactDao getContactDao() {
		return contactDao;
	}
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	
	public void save(Contact contact) {
		contactDao.save(contact);
	}

	public void update(Contact contact) {
		contactDao.update(contact);
	}

	public void deleteById(int t_id) {
		contactDao.deleteById(t_id);
	}

	public List<Contact> getAll(int id) {
		return contactDao.getAll(id);
	}

	public Contact getAllById(int t_id) {
		return contactDao.getAllById(t_id);
	}

	public List<Contact> dynamicSelect(Map<String,Object> map) {
		return contactDao.dynamicSelect(map);
	}

}
