package com.sist.wrapper;
/*
 *  포장(wrapper) 클래스
 *        -자바 기본타입(byte,char,short,int,long,double,float,boolean)
 *           을 클래스화 한 8개의 클래스를 랩퍼클래스라함
 *        -기본 타입 값을 내부에 두고 포장하는 객체
 *        -용도
 *              : (기본타입의 값을 사용할수 없음) 객체만 사용할 수 있는 컬렉션등에
 *                 기본 타입의 값을 사용하기 위해=>wrapper 객체로 만들어 사용
 *        
 *        생성ex)
 *              : 기본타입의 값을 인자로 Wrapper 클래스 생성자 호출
 *              Integer i=new Integer(10);
 *              Boolean b=new Boolean("false");
 *  
 *        -박싱(Boxing)@값이 객체로 바뀌는것
 *           :기본 타입의 값을 Wrapper 객체로 변환하는 것
 *  
 *        -자동 박싱(Auto Boxing)
 *           :Integer ten=10;   //자동박식
 *                    II  
 *           Integer ten=new Integer(10)
 *           10=> new Integer(10);
 *        
 *        -언박싱(unboxing)
 *           :   Wrapper 객체에 들어 있는 기본타입의 값을 빼내는 것
 *  
 *        -자동 언박싱(Auto unboxing)
 *           int i=ten;   //자동 언박싱
 *           ten   =>   ten.getIntValue()
 */
public class WrapperClassLab {
   public static void main(String[] args) {
      Integer i=new Integer(10);
      System.out.println(i);
      char c='4';
      double d=new Double(3.1234);
      
      Integer obj=100;   //자동박싱
      System.out.println("value = "+obj.intValue());
      
      int value=obj;   //자동 언박싱
      System.out.println("value = "+value);
      
      int result=obj+100;
      System.out.println("result = "+result);
   }
}