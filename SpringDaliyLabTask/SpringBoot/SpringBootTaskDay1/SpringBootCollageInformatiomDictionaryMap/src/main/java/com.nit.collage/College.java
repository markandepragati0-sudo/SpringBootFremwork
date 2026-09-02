package com.nit.collage;

import java.util.Map;

public class College {
	private String name;
	private Map<String, String> information;

	public College() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getInformation() {
		return information;
	}

	public void setInformation(Map<String, String> information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Collage [name=" + name + ", Address=" + information.get("address") + ", Course="
				+ information.get("course") + ", City=" + information.get("city") + ", Type=" + information.get("type")
				+ "]";
	}

}
