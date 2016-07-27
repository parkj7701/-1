package com.sist.wrapper;

class Box{
   Object item;
   
   public void setBox(Object item){
      this.item=item;
   }
   
   public Object getBox(){
      return item;
   }
}

public class WrapperClassLab2 {
   public static void main(String[] args) {
      Box box=new Box();
      box.setBox("또오해영");
      String data=(String) box.getBox();
      System.out.println(data);
      
      box.setBox(10);
      int i=(int) box.getBox();
            System.out.println(i);
            
            box.setBox(10.5);
            double b=(double) box.getBox();
            System.out.println(b);
   }

}