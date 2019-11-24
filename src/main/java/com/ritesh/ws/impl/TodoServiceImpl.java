package com.ritesh.ws.impl;

import com.ritesh.ws.api.TodoServiceApi;
import com.ritesh.ws.model.Data;
import com.ritesh.ws.model.Todo;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/todoservice")
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
	public String create(Todo request)
	{
		String response = null;
		Data data01 = getData();
		List<Todo> todoList = data01.getTodoList();
		if(request != null)
		{
			todoList.add(request);
			response = "Success";
		}
		else
		{
			response = "Request is null";
		}
		return response;
	}
	
	@Override
	public Todo read(String id)
	{
		Data data01 = getData();
		return data01.getTodo(id);
	}

	@Override
	public String update(String id, Todo todo)
	{
		String response = null;
		Data data01 = getData();
		Todo todo01 = data01.getTodo(id);
		if(todo01 != null)
		{
			todo01.setId(todo.getId());
			todo01.setIsCompleted(todo.getIsCompleted());
			todo01.setName(todo.getName());
			response = "Update is successful";
		}
		else
		{
			response = "Request is null";
		}
		return response;
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
		List<Todo> todoListResponse = new ArrayList<>();
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
