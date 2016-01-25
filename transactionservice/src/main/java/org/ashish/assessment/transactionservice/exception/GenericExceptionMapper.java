package org.ashish.assessment.transactionservice.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.ashish.assessment.transactionservice.model.ErrorMsg;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable arg0) {
		ErrorMsg errMsg = new ErrorMsg(arg0.getMessage(), 500);
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errMsg)
				.build();
	}

}
