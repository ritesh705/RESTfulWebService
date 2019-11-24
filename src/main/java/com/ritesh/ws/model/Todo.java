package com.ritesh.ws.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo
{
	@XmlElement private String id;
	@XmlElement private String name;
	@XmlElement private String isCompleted;

	public Todo(){}
	
	public Todo(String id, String name, String isCompleted)
	{
		this.id = id;
		this.name = name;
		this.isCompleted = isCompleted;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}
}
