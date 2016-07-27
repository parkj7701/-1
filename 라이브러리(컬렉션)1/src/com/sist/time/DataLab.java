package com.sist.time;
/*
 * Data 클래스
 * 	-날짜를 표현하는 클래스
 * 	-날짜 정보를 객체간에 주고 받을 떄 주로 사용
 * 	-시스템의 시간을 읽어온다=> 등록일(게시판,회원가입)
 */

import java.text.SimpleDateFormat;
import java.util.*;
public class DataLab {
	public static void main(String[] args) {
		Date data=new Date();
		System.out.println(data);
		System.out.println(data.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 hh시 mm분 ss초");
		System.out.println(sdf);
		System.out.println(sdf.format(data));
	}
}
