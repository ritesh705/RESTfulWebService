package com.ritesh.ws.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

import com.ritesh.ws.api.TodoServiceApi;
import com.ritesh.ws.model.Data;
import com.ritesh.ws.model.Todo;

@Path("/TodoService")
public class TodoServiceImpl implements TodoServiceApi
{
	Data data;
	
	public Data getData()
	{
		if(data == null)
		{
			data = new Data();
		}
		return data;
	}

	public void setData(Data data)
	{
		this.data = data;
	}

	@Override
	public void create(Todo request)
	{
		Data data01 = getData();
		List<Todo> todoList = data01.getTodoList();
		todoList.add(request);
	}
	
	@Override
	public Todo read(String id)
	{
		Data data01 = getData();
		Todo todo01 = data01.getTodo(id);
		return todo01;
	}

	@Override
	public void update(String id, Todo todo)
	{
		Data data01 = getData();
		Todo todo01 = data01.getTodo(id);
		todo01.setId(todo.getId());
		todo01.setIsCompleted(todo.getIsCompleted());
		todo01.setName(todo.getName());
	}

	@Override
	public void delete(String id)
	{
		Data data01 = getData();
		Todo todo01 = data01.getTodo(id);
		data01.remove(todo01);
	}

	@Override
	public String getSupportedOperations()
	{
		return "{\"GET, POST, PUT, DELETE\"}";
	}

	public List<Todo> getTodos()
	{
		Data data01 = getData();
		List<Todo> todoList = data01.getTodoList();
		List<Todo> todoListResponse = new ArrayList<Todo>();
		for(Todo o : todoList)
		{
			Todo todo = new Todo();
			todo.setId(o.getId());
			todo.setIsCompleted(o.getIsCompleted());
			todo.setName(o.getName());
			todoListResponse.add(todo);
		}
		return todoListResponse;
	}
}
