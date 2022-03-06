package reload_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration reloadServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Reload Service Starts...");
		Reload reload = new ReloadImpl();
		reloadServiceRegistration = context.registerService(Reload.class.getName(), reload, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Reload Service Stops...");
		reloadServiceRegistration.unregister();
	}

}
