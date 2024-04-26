package resuablecomponents;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class propertiesoperation {
	
	static Properties prop=new Properties();
	
	public static String getpropertyvalue(String key) throws Exception {
		
		String propfilepath=System.getProperty("user.dir")+"/src/test/resources/congig.properties";
		FileInputStream fis=new FileInputStream(propfilepath);
		prop.load(fis);
		
		
		//read data
		
		String value=prop.get(key).toString();
		
		if(StringUtils.isEmpty(value)) {
			throw new Exception("Value is empty");
		}
		return value;
		
		
		
	}

}
