package com.xwd.study.util.execl;

import java.util.ArrayList;
import java.util.List;

public class HeaderUtil {
	/**
	 * 得到bean的知道字段
	 * @param cla
	 * @param fielsName
	 * @return
	 * @throws Exception
	 */
	public static String [] getFielsName(Class<?> cla,String[] fielsName) throws Exception{
		List<String> names=new ArrayList<>();
		for(String name :fielsName){
			names.add(cla.getDeclaredField(name).getAnnotation(Header.class).value());
		}
		return names.toArray(new String[fielsName.length]);
	}
}
