package com.at.hp;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<Student,String> students = new HashMap();


        Student s1 = new Student("张三",18);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("wangwu",39);


        //1.添加元素，key中使用自定义对象 要重写hashcode 和equals 方法
        students.put(s1,"is good");
        students.put(s2,"is better");
        students.put(s3,"is the best");
        students.put(new Student("wangwu",39),"is the best");
        System.out.println(students.size());

        //2.删除元素

        students.remove(s1);
        System.out.println(students.size());

        //3.遍历
        //1.KeySet()方法，返回的是set集合

        for(Student s : students.keySet()){
            System.out.println("元素为"+s.toString()+students.get(s));
        }
        //2.EntrySet()方法 返回Set集合  但是 集合中既有Key 也有Value
        for (Map.Entry<Student,String> entry : students.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        //4.判断

        System.out.println(students.containsKey(new Student("wangwu",39)));


    }



}
