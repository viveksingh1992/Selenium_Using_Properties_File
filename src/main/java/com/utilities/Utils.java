package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


	public final class Utils {


	    private static Properties properties = new Properties();
	    static {
	        try {
	        	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//properties//config.properties");
	            properties.load(fs);
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.exit(-1);
	        }
	    }
	    
	    private Utils() {
	    }

	    public static String getProperty(String property) {
	        return properties.getProperty(property);
	    }

	   
}
