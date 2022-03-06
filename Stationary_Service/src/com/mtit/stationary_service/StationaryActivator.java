package com.mtit.stationary_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class StationaryActivator implements BundleActivator {

	
	ServiceRegistration stationaryServiceRegistartion;
	

	public void start(BundleContext context) throws Exception {
		System.out.println("Stationary Service Starts....");
		Stationary stationary = new StationaryImpl();
		stationaryServiceRegistartion = context.registerService(Stationary.class.getName(), stationary, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stationary Service Stop...");
		stationaryServiceRegistartion.unregister();
		
	}

}
