/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Helpers {
    private static final String dateFormat = "yyyy-MM-dd";
    public static boolean isNum(String str) {
       return str.matches("[0-9]+");
    }
    public static boolean isDate(String str) {
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(str);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public  static Date stringToDate(String string) {
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }
    public static Integer stringToInt(String string) {
        Integer intParse = null;

        try {
            intParse = Integer.valueOf(string);
            return intParse;
        } catch (Exception e) {
            return null;
        }
    }
    public static String keyGenerator(String prefix) {
        String timestamp = String.valueOf(System.currentTimeMillis());
        String key= prefix+timestamp;
        key = Sercurity.encryptThisString(key);
        return key;
    }
    public static String formatDate(Date date) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    public static boolean checkExist(String index, ArrayList<String> arrayList) {
        for (String element : arrayList) {
            if (element.equals(index)) {
                return true;
            }
        }
        return false;
    }
    public static Date getCurrentDate() {
        return new Date();
    }


}
