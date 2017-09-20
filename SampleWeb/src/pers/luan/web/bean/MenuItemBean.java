package pers.luan.web.bean;

import java.util.List;

public class MenuItemBean {

	private String ID, text, type, link, icon;
	private List<MenuItemBean> list;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<MenuItemBean> getList() {
		return list;
	}

	public void setList(List<MenuItemBean> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "MenuItemBean [ID=" + ID + ", text=" + text + ", type=" + type
						+ ", link=" + link + ", icon=" + icon + ", list=" + list
						+ "]";
	}
	
}
