package cd_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration CDServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("CD Service Starts...");
		CD_Details cdDetails = new CD_DetailsImpl();
		CDServiceRegistration = context.registerService(CD_Details.class.getName(), cdDetails, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("CD Service Stops...");
		CDServiceRegistration.unregister();
		
	}

}
