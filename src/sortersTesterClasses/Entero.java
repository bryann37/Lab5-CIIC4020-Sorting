package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;

import dataGenerator.DataGenerator;
import interfaces.Sorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class Entero { 
    private static int value; 
    
    private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>();
    
    public Entero(int v) { value = v; }
    
    public int getValue() { return value; } 
    
    public String toString() { return value + ""; }
    
    static SelectionSortSorter<Entero> sorter = new SelectionSortSorter<>();
    
    public static void main(String[] args) {
    	
    	DataGenerator generate = new DataGenerator(20);
    	Integer[] data = generate.generateData();
    	Entero[] ARR =  new Entero[15];
    
    	
    	for(int i = 0 ; i<ARR.length  ; i++ ){
    		ARR[i] = new Entero(i);   		
    	}
    	sorter.sort(ARR, null);
    
    }
  
 } 

