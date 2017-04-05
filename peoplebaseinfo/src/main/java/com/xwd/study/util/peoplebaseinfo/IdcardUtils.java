package com.xwd.study.util.peoplebaseinfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IdcardUtils {
	
    public static Map<String, String> cityCodeMap = new HashMap<String, String>() {    
        {    
            this.put("11", "北京");    
            this.put("12", "天津");    
            this.put("13", "河北");    
            this.put("14", "山西");    
            this.put("15", "内蒙古");    
            this.put("21", "辽宁");    
            this.put("22", "吉林");    
            this.put("23", "黑龙江");    
            this.put("31", "上海");    
            this.put("32", "江苏");    
            this.put("33", "浙江");    
            this.put("34", "安徽");    
            this.put("35", "福建");    
            this.put("36", "江西");    
            this.put("37", "山东");    
            this.put("41", "河南");    
            this.put("42", "湖北");    
            this.put("43", "湖南");    
            this.put("44", "广东");    
            this.put("45", "广西");    
            this.put("46", "海南");    
            this.put("50", "重庆");    
            this.put("51", "四川");    
            this.put("52", "贵州");    
            this.put("53", "云南");    
            this.put("54", "西藏");    
            this.put("61", "陕西");    
            this.put("62", "甘肃");    
            this.put("63", "青海");    
            this.put("64", "宁夏");    
            this.put("65", "新疆");    
            this.put("71", "台湾");    
            this.put("81", "香港");    
            this.put("82", "澳门");    
            this.put("91", "国外");    
        }    
    };    
        
    /**  
     * 获取省份 
     */    
    public static String getProvince(String idcard) {    
        String province = null;    
        String provinceId = idcard.substring(0, 2);    
        Set<String> key = cityCodeMap.keySet();    
        for (String id : key) {    
            if (id.equals(provinceId)) {    
                province = cityCodeMap.get(id);    
                break;    
            }    
        }    
        return province;
    }    
    
    /**  
     * 获取年份
     */    
    public static int getYear(String idcard) {    
        String birthday = idcard.substring(6, 14);    
        Date birthdate = null;
		try {
			birthdate = new SimpleDateFormat("yyyyMMdd")    
			        .parse(birthday);
		} catch (ParseException e) {
		}    
        GregorianCalendar currentDay = new GregorianCalendar();    
        currentDay.setTime(birthdate);    
        return currentDay.get(Calendar.YEAR);    
    }    
    
    /**  
     * 获取月份
     */    
    public static int getMonth(String idcard) {    
        String birthday = idcard.substring(6, 14);    
        Date birthdate = null;
		try {
			birthdate = new SimpleDateFormat("yyyyMMdd")    
			        .parse(birthday);
		} catch (ParseException e) {
		}    
        GregorianCalendar currentDay = new GregorianCalendar();    
        currentDay.setTime(birthdate);    
        return currentDay.get(Calendar.MONTH) + 1;    
    }    
    
    /**  
     * 获取日期   
     */    
    public static int getDay(String idcard) {    
        String birthday = idcard.substring(6, 14);    
        Date birthdate = null;
		try {
			birthdate = new SimpleDateFormat("yyyyMMdd")    
			        .parse(birthday);
		} catch (ParseException e) {
		}    
        GregorianCalendar currentDay = new GregorianCalendar();    
        currentDay.setTime(birthdate);    
        return currentDay.get(Calendar.DAY_OF_MONTH);   
    }    
    
    /**  
     * 获取性别
     */    
    public static String getGender(String idcard) {    
    	String id17 = idcard.substring(16, 17);    
        if (Integer.parseInt(id17) % 2 != 0) {    
        	return "1";      
        } else if(Integer.parseInt(id17) % 2 == 0){    
        	return "2";    
        }else{
        	return "0";    
        }    
    }    
    
    /**  
     * 获取出生日期
     */    
    public static Date getBirthday(String idcard) {    
    	String birthday = idcard.substring(6, 14);    
        Date birthdate = null;
		try {
			birthdate = new SimpleDateFormat("yyyyMMdd").parse(birthday);
		} catch (ParseException e) {
		} 
        return birthdate;    
    }    
    
    /**
     * 获取年龄
     */
    public static int getAge(String idcard) { 
    	String birthday = idcard.substring(6, 14);    
        Date birthdate = null;
		try {
			birthdate = new SimpleDateFormat("yyyyMMdd").parse(birthday);
		} catch (ParseException e) {
		}    
        GregorianCalendar currentDay = new GregorianCalendar();    
        currentDay.setTime(birthdate);    
        
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy");  
        String year=simpleDateFormat.format(new Date());  
        return Integer.parseInt(year)-currentDay.get(Calendar.YEAR);  
    }
}
