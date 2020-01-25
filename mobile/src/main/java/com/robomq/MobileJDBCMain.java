package com.robomq;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robomq.config.AppConfig;
import com.robomq.dao.MobileDao;
import com.robomq.pojo.Mobile;



public class MobileJDBCMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		MobileDao mobileDAO = context.getBean(MobileDao.class);

		System.out.println("List of mobiles is:");

		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

		System.out.println("\nGet mobile with ID 2");

		Mobile mobileById = mobileDAO.getMobileById(2);
		System.out.println(mobileById);

		System.out.println("\nCreating mobile: ");
		Mobile mobile = new Mobile(4,"oppo","4609","50","4");
		System.out.println(mobile);
		mobileDAO.createMobile(mobile);
		System.out.println("\nList of mobile is:");

		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

		System.out.println("\nDeleting mobile with ID 2");
		mobileDAO.deleteMobile(mobileById);

		System.out.println("\nUpdate mobile with ID 4");

		Mobile mmobile = mobileDAO.getMobileById(4);
		mmobile.setQty("CHANGED");
		mobileDAO.updateMobile(mmobile);

		System.out.println("\nList of mobile is:");
		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

		context.close();
	}

}