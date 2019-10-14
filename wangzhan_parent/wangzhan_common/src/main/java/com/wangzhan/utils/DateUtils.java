package com.wangzhan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期转化工具类
 */
public class DateUtils {

    /**
     * 日期类转换字符串
     * @param date 时间日期
     * @return String
     */
    public static String toDateString(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date).toString();
    }

    /**
     * 字符串转换日期类
     * @param date
     * @return
     * @throws ParseException
     */
    public static Date toDate(String date) throws ParseException {
        return  new SimpleDateFormat("yyyy-MM-dd").parse(date);
    }

    /**
     * 获取年月份
     * @param date
     * @return
     */
    public static String getMonth(Date date){
        return new SimpleDateFormat("yyyy-MM").format(date).toString();
    }
    /**
     * 获取周一
     * @param date 当前时间
     * @return Date
     */
    public static Date getMonday(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return cal.getTime();
    }

}
