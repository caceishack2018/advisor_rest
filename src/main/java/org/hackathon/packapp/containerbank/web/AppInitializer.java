package org.hackathon.packapp.containerbank.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {
	 private static final String SPRING_PROFILE = "jpa";
    @Override
    public void onStartup(ServletContext container) throws ServletException {
    	
    	XmlWebApplicationContext rootAppContext = new XmlWebApplicationContext();
        rootAppContext.setConfigLocations("classpath:spring/business-config.xml", "classpath:spring/tools-config.xml","classpath:spring/mvc-core-config.xml");
        rootAppContext.getEnvironment().setDefaultProfiles(SPRING_PROFILE);
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.scan("org.hackathon.packapp.containerbank.conf");
        container.addListener(new ContextLoaderListener(rootAppContext));
 
        ServletRegistration.Dynamic dispatcher = container.addServlet("mvc", new DispatcherServlet(rootAppContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");   
    }
}