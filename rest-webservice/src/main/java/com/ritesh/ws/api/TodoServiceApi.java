package com.ritesh.ws.api;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.ritesh.ws.model.Todo;


public interface TodoServiceApi
{
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todo> getTodos();

	@GET
	@Path("/todos/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Todo read(@PathParam("id") String id);

	@POST
	@Path("/todos")
	@Consumes(MediaType.APPLICATION_JSON)
	void create(Todo todo);

	@PUT
	@Path("/todos/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	void update(@PathParam("id")String id, Todo todo);

	@OPTIONS
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public String getSupportedOperations();

	@DELETE
	@Path("/todos/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	void delete(@PathParam("id")String id);

}