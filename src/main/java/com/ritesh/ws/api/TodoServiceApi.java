package com.ritesh.ws.api;

import com.ritesh.ws.model.Todo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


public interface TodoServiceApi
{
	@POST
	@Path("/todos")
	@Consumes(MediaType.APPLICATION_JSON)
	String create(Todo todo);

	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	List<Todo> getTodos();

	@GET
	@Path("/todos/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Todo read(@PathParam("id") String id);

	@PUT
	@Path("/todos/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	String update(@PathParam("id")String id, Todo todo);

	@DELETE
	@Path("/todos/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	void delete(@PathParam("id")String id);

	@OPTIONS
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	String getSupportedOperations();
}