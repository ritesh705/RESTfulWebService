package com.ritesh.ws.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Data {

	static List<Todo> todoList;
	static{
		todoList = new ArrayList<Todo>();
	}

	public List<Todo> getTodoList() {
		if(todoList == null){
			todoList = new ArrayList<Todo>();
		}
		return todoList;
	}

	public void setTodoList(List<Todo> todoList) {
		Data.todoList = todoList;
	}
	
	public Todo getTodo(String id){
		
		Todo todo = null;
		for(Todo o : todoList){
			if(StringUtils.equalsIgnoreCase(id, o.getId())){
				todo = o;
				break;
			}
		}
		return todo;
	}

	public void remove(Todo request) {
		
		Todo todo = null;
		for(Todo o : todoList){
			if(StringUtils.equalsIgnoreCase(request.getId(), o.getId())){
				todo = o;
				break;
				}
			}
		todoList.remove(todo);
		}
}
