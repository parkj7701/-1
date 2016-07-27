package com.sist.time;
/*
 * 	Calendar 클래스
 * 	-달력을 표현한 추상클래스
 */

import java.util.*;
public class CaleandarLab {
	public static void main(String[] args) {
		//OS에 설정된 시간대(TimeZone) 기존의 Calendar 객체 얻기
		//Calendar는 추상클래스 이므로 new 를 사용불가
		Calendar cal=Calendar.getInstance();
		//싱글턴 패턴
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH); //MONTH = 0~11 까지로되있음
		int day=cal.get(Calendar.DATE);
		int week=cal.get(Calendar.DAY_OF_WEEK);  // 1~7까지로 되있음
		String[] strWeek={"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year+"년");
		System.out.println(month+1+"월");
		System.out.println(day+"일");
		System.out.println(strWeek[week-1]+"요일");
		
		String[] availableIDs=TimeZone.getAvailableIDs();
		for(String id : availableIDs){
			System.out.println(id);
		}
		
		//다른 시간대의 Calendar 객체 얻기
		TimeZone timezone=TimeZone.getTimeZone("America/New_York");
		//cal=Calendar.getInstance(timezone);
		
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH); //MONTH = 0~11 까지로되있음
		day=cal.get(Calendar.DATE);
		week=cal.get(Calendar.DAY_OF_WEEK);  // 1~7까지로 되있음
		
		System.out.println("\nL.A");
		System.out.print(year+"년 ");
		System.out.print(month+1+"월 ");
		System.out.print(day+"일 ");
		System.out.println(strWeek[week-1]+"요일");
		
		//날짜 및 시간정보 얻기
		int ampm=cal.get(Calendar.AM_PM);
		String strAMPM=null;
		if(ampm==Calendar.AM)
			strAMPM="오전";
		else{
			strAMPM="오후";
		}
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		System.out.print(strAMPM+" "+hour+"시 "+minute+"분 " +second+"초\n");
		
	}

}
