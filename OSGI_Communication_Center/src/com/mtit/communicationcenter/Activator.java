package com.mtit.communicationcenter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		System.out.println("Communication Center Starts...");
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Communication Center Ends...");
	}

}
