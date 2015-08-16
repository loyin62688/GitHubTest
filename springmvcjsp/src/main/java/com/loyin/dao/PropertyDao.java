package com.loyin.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.loyin.entities.DubboFileProperties;

public class PropertyDao {
	
	private DubboFileProperties dubbofileproperty;
	
	public boolean dubboFilePropertiesSave(DubboFileProperties m_DubboFileProperties){
		this.dubbofileproperty = m_DubboFileProperties;
		System.out.println("dubbofileproperty save sucess");
		System.out.println(dubbofileproperty.getJarpath());
		System.out.println(dubbofileproperty.getDubboproviderxmlpath());
		System.out.println(dubbofileproperty.getDubboproviderxmlname());
		return true;
	}
	
	public DubboFileProperties getDubboFileProperties(){
		System.out.println("dubbofileproperty get sucess");
		System.out.println(dubbofileproperty.getJarpath());
		System.out.println(dubbofileproperty.getDubboproviderxmlpath());
		System.out.println(dubbofileproperty.getDubboproviderxmlname());
		return dubbofileproperty;
	}
}
