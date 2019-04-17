/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package march7_collection;
import java.util.*;

public class March7 {

    
    public static void Example1(){
    
    	//declare a array list
    ArrayList<String> colors = new ArrayList<String>();
    
    //Declare a array
    String[] favColors = {"red", "blue", "green", "yellow"};
    
    
    for(String color : favColors){
        colors.add(color);//add array to arraylist
    }

    System.out.println("#############");
    
    for(String currentColor : colors){
        
        System.out.println(currentColor);
    }
    //declare a iterator
    Iterator<String> itr = colors.iterator();
    System.out.println("===========");
    System.out.println("NEXT" + itr.next()); //red (first element)
    System.out.println("HAS NEXT" + itr.hasNext());//true

    /*
    Using the iterator, 
        Output all of the elements of our colors arraylist
    HINT:
        hasNext(),  next()
    */
    System.out.println("While 333333333 Has next: " + itr.next());//blue
    while(itr.hasNext()){
    
        System.out.println("While true Has next: " + itr.next());
        //green yellow
    }
    
    //ListIterator can move backwards and forwards
    ListIterator<String> itr2 = colors.listIterator(1);
    // 1--blue, 0--red 2--green 3--yellow
    
    System.out.println("Next ListIterator: " +itr2.next());
   
    if(itr2.hasPrevious()){
    
    System.out.println("Has previous: " + itr2.previous());
        
    }
    
    /*
Task 1
Create a static method that accepts an unlimited amount of String args
    Create a ArrayList variable
        Add only unique String values to ArrayList variable
    Using iterator
        output all of the values
    
    */
    
    }
    public static void Example2(int... numbers){
    
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        
        for(int currentNumber : numbers){
        
            if(!numbersList.contains(currentNumber)){
            
                numbersList.add(currentNumber);
            }
        
        }
        
        for(int currentNumber : numbersList){
        
            System.out.println(currentNumber);
        }
        
        
    
    }
    
    public static void main(String[] args) {
        Example1();
        System.out.println("***************");
        Example2(9, 8, 7, 8, 9, 4);
        
    }
    
}