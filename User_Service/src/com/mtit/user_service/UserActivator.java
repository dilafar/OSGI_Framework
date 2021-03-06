package com.mtit.user_service;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.communicationcenter.*;
import com.mtit.stationary_service.*;

import cd_service.CD_Details;
import reload_service.Reload;



public class UserActivator implements BundleActivator {
	
	ServiceReference serviceReference;
	private static String descision ;
	
	
	public void start(BundleContext context) throws Exception {
		System.out.println("User Service Starts...");
		Scanner input = new Scanner(System.in);
		do {
			int select = ServicesImpl.chooseServiceType();
			
			if (select == 1) {
				serviceReference = context.getServiceReference(Stationary.class.getName());
				Stationary stationary = (Stationary)context.getService(serviceReference);
				ServicesImpl.StationaryService(stationary);
				
			}else if(select == 2) {
				serviceReference = context.getServiceReference(Reload.class.getName());
				Reload reload = (Reload)context.getService(serviceReference);
				ServicesImpl.ReloadService(reload);
				
			}else if(select == 3) {
				serviceReference = context.getServiceReference(CD_Details.class.getName());
				CD_Details cdDetails = (CD_Details)context.getService(serviceReference);
				ServicesImpl.CDService(cdDetails);
				
			}else {
				System.out.println("Enter a valied code .....!");
			}
			System.out.println("*** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.println("Do you need to purchase more Items ? [Y/N] ");
			descision = input.next();
			
		}while(descision.equals("Y"));
		
	}
	

	public void stop(BundleContext context) throws Exception {
		System.out.println("User Stoped.....");
		context.ungetService(serviceReference);
	}

}
