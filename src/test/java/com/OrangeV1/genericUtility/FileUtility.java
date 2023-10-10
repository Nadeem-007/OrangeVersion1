package com.OrangeV1.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readFileFromProperties(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resource/commondata.properties");
		
		Properties pro=new Properties();
		pro.load(fis);
		
		String value = pro.getProperty(key);
		return value;
	}
}
