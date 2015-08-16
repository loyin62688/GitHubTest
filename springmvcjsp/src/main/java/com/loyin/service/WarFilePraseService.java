package com.loyin.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.loyin.dao.PropertyDao;
import com.loyin.entities.DubboFileProperties;

public class WarFilePraseService {
	@Autowired
	private PropertyDao m_db;
	
	public boolean warFilePropertiesSave(DubboFileProperties x){
		return m_db.dubboFilePropertiesSave(x);
	}
	
	public void warfilePropertiesGet(){
		
	}
}
