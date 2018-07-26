package com.javagists.jerseyfilms;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.javagists.jerseyfilms.controller.FilmController;
/**
 * 
 * @author javagists.com
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(FilmController.class);
    }
}
