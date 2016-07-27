package com.sist.wrapper;
/*
 *  class AA<K,V>    ==>Map
 *        꺾새안에는 타입을넣음
 *  class AA<K,V,T> ==> Map
 *  
 *  T : Type
 *  E : Element
 *  K : Key
 *  V : Value      //   ?;;
 *  
 *  Map<K,V>
 *  Map<String.Object>
 *  Map<String,?>      ?=들어갈수도 있고 아닐수도있고 ?
 */

class Box2<T>{
   T item;   //TYPE (어떤 클래스)
   
   public void setBox(T item){
      this.item=item;
   }
   
   public T getBox(){
      return item;
   }
}


public class WrapperClassLab3 {
   public static void main(String[] args) {
      Box2<String> box=new Box2<String>();
      box.setBox("또ㅡㅡ");
      String data=box.getBox();
      System.out.println(data);
      
      Box2<Integer> box2=new Box2();
      box2.setBox(110);
      int i=box2.getBox();
      System.out.println(i);
      
      Box2<Double> box3=new Box2();
      box3.setBox(10.5);
      double d=box3.getBox();
      System.out.println(d);
      
      
   }
}