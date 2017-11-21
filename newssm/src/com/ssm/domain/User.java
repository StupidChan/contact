package com.ssm.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
	   public int id;
	   private String username;
	   private String password;
	   
	   private List<Contact> contactList=new ArrayList<Contact>();
	   public List<Contact> getContactList() {
			return contactList;
	   }
	   public void setContactList(List<Contact> contactList) {
			this.contactList = contactList;
	   }

		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	   
}
