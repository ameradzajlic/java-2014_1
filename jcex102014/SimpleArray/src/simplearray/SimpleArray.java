package simplearray;

import java.util.Arrays;
import java.util.List;

public class SimpleArray {
    
    public static void main(String[] args) { 
        //get array length
        int[] x = { 1,2,3,4,5 };
        System.out.println("Length of array x is " + x.length);
        
        //array passed by reference
        int[] array = { 1,2,3,4,5 };
        int[] array1 = array; 
        array1[3]=15;
        System.out.println(array[3]);
        
        //cloning array
        int[] array2 = array.clone();
        array2[3]=35;
        System.out.println(array[3]);
        
        //clone and arraycopy
        class MyClass { public int x; }
        MyClass myObj = new MyClass();
        myObj.x = 10;
        MyClass[] myClassArray = { myObj };
        MyClass[] myClassArray1 = myClassArray.clone();
        MyClass[] myClassArray2 = new MyClass[myClassArray.length];
        System.arraycopy(myClassArray, 0, myClassArray2, 0, myClassArray.length);
        myObj.x = 25;
        System.out.println(myClassArray1[0].x);
        System.out.println(myClassArray2[0].x);
        
        //Convert array to list
        Integer[] array_of_ints = { 1,2,3,4 };
        List<Integer> convertedArray = Arrays.asList(array_of_ints); 
        System.out.println(convertedArray.get(0)); 

        String[] cities = { "Paris","London","New York" };
        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i]);
        }
        
        String[] jedi = { "Qui-Gon Jinn","Obi-Wan Kenobi","New York" };
        for(String city : cities){
            System.out.println(city);
        }
        
        String[] races = { "Ork","Undead","Elf" };
        int counter = 0;
        while(counter<races.length){
            System.out.println(races[counter++]);
        }
    }
}
