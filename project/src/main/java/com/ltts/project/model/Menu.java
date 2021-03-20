package com.ltts.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String menuid;
	private String menuname;
	private String cost;


	public Menu(String menuid, String menuname, String cost) {
		super();
		this.menuid = menuid;
		this.menuname = menuname;
		this.cost = cost;
	}


	public String getMenuid() {
		return menuid;
	}


	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}


	public String getMenuname() {
		return menuname;
	}


	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", menuname=" + menuname + ", cost=" + cost + "]";
	}
}