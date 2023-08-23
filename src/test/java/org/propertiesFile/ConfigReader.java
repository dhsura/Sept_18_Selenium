package org.propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public  String getPropData (String key) {
		try {
			FileInputStream fis = new FileInputStream 
					("./PropertiesFile/Config.properties");
			Properties prop = new Properties ();
			prop.load(fis);
//			String value = prop.getProperty(key);
//			return value;
			return prop.getProperty(key);
	
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
	public  Properties init_prop () {
		try {
			FileInputStream fis = new FileInputStream 
					("./PropertiesFile/Config.properties");
			Properties prop = new Properties ();
			prop.load(fis);

			return prop;
	
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
