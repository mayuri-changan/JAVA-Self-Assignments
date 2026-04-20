package com.q1;

//Generic Class
class Box<T> {
 T data;

 void setData(T data) {
     this.data = data;
 }

 T getData() {
     return data;
 }
}

//Main Class
public class Obj {
 public static void main(String[] args) {

     Box<Integer> obj = new Box<>();
     obj.setData(50);

     System.out.println(obj.getData());
 }
}

