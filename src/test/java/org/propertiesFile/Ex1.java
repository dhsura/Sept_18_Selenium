package org.propertiesFile;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Ex1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream 
					("./PropertiesFile/Config.properties");
			Properties prop = new Properties ();
			prop.load(fis);
			String bName =prop.getProperty("browserName");
			String url =prop.getProperty("URL");
			String uName =prop.getProperty("UserName");
			String pwd =prop.getProperty("Password");
			System.out.println("browserName : "+bName);
			System.out.println("URL : "+url);
			System.out.println("UserName : "+uName);
			System.out.println("Password : "+pwd);
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
