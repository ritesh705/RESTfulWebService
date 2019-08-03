package com.ritesh.ws.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ritesh.ws.model.Todo;


public interface TodoServiceApi
{

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String testWebService();

	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todo> getTodos();
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	void create(Todo todo);

	@GET
	@Path("/todo/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Todo read(@PathParam("id") String id);

	@PUT
	@Path("/update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	void update(@PathParam("id")String id, Todo todo);

	@DELETE
	@Path("/delete/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	void delete(@PathParam("id")String id);
	}