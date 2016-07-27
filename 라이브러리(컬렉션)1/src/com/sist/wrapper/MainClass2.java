package com.sist.wrapper;
import java.util.*;

public class MainClass2 {
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>();
		//ArrayList<SawonVO> list=new ArrayList<>();
		list.add("이방원"); 	//0
		list.add("하륜");		//2
		list.add("민씨");		//3 4
		list.add("최영");		//4 5 
		list.add("이인임");	//5 6
		
		list.add(1, "정도전"); //1
		list.add(3, "이성계"); //   3
		
		System.out.println("저장 갯수 :" +list.size());
		for(int i=0;i<list.size();i++){
			String name=list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("3번 삭제");
		list.remove(3);
		
		System.out.println("저장 갯수 :" +list.size());
		for(int i=0;i<list.size();i++){
			String name=list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		
		System.out.println("2번 수정");
		list.set(2, "이연");
		
		System.out.println("저장 갯수 :" +list.size());
		for(int i=0;i<list.size();i++){
			String name=list.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		
		System.out.println("전체 삭제");
		list.clear();
		
		System.out.println("저장 갯수 :" +list.size());
		for(int i=0;i<list.size();i++){
			String name=list.get(i);
			System.out.println(name);
		}
		System.out.println();
	}
	
}