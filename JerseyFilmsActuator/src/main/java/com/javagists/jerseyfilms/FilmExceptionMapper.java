package com.javagists.jerseyfilms;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
/**
 * 
 * @author javagists.com
 *
 */

@Provider
public class FilmExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable e) {
        return Response.serverError().entity(e.getMessage()).build();
    }

}
