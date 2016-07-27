
package com.sist.sawon;

import java.util.*;
import java.io.*;

public class MainClass {
	public static void main(String[] args){
		try{
			FileReader in=
					new FileReader("File\\sawon.csv");
			
			String data="";
			int i=0;
			
			//EOF => -1
			while((i=in.read())!=-1){
				data+=String.valueOf((char)i);
			}
			in.close();
			
			System.out.println(data);
			
			String[] datas=data.split("\n");
			SawonVO[] sawon=new SawonVO[datas.length];
			for(i=0;i<datas.length;i++){
				sawon[i]=new SawonVO();
				StringTokenizer st=
						new StringTokenizer(datas[i], ",");
				sawon[i].setSabun(st.nextToken());
				sawon[i].setName(st.nextToken());
				sawon[i].setDept(st.nextToken());
				sawon[i].setJob(st.nextToken());
				sawon[i].setHiredate(st.nextToken());
				sawon[i].setPay(Integer.parseInt(st.nextToken().trim()));
			}
			
			//출력
			for(i=0;i<sawon.length;i++){
				System.out.println("사번:" +sawon[i].getSabun());
				System.out.println("이름:" +sawon[i].getName());
				System.out.println("부서:" +sawon[i].getDept());
				System.out.println("직위:" +sawon[i].getJob());
				System.out.println("입사일:" +sawon[i].getHiredate());
				System.out.println("연봉:" +sawon[i].getPay());
				System.out.println("=====================");
			}
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}














