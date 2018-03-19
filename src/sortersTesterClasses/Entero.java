package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;

import interfaces.Sorter;
import sorterClasses.InsertionSortSorter;

public class Entero { 
    private static int value; 
    
    private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>();
    
    public Entero(int v) { value = v; }
    
    public int getValue() { return value; } 
    
    public String toString() { return value + ""; }
    
    public static void main(String[] args) {
    	InsertionSortSorter is = new InsertionSortSorter();
    	Entero[] ARR =  new Entero[15];      ;
    	for(int i = 0 ; i<ARR.length  ; i++ ){
    		
    	}
    	
    
    }
  
 } 

