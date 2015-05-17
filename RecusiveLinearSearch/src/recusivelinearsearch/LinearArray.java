/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recusivelinearsearch;

import java.util.Random;

/**
 *
 * @author Birsen
 */
public class LinearArray {
    
	   private int[] data;
	   private static Random generator = new Random();
	   private int low;
 
	   public LinearArray( int size )
	   {
		   low = 0;
	      data = new int[ size ];
 
	      for ( int i = 0; i < size; i++ )
	         data[ i ] = 10 + generator.nextInt( 90 );
	   } 
           
	   public int recursiveLinearSearch( int [] data, int low, int searchKey )
	   {
	      
	         if (low >= data.length)
	         	return -1;
 
	         else if (searchKey == data[low])
	         {
				 return low;
			 }
                 
	             return recursiveLinearSearch(data, low + 1, searchKey);
 
	   } 
           
	   public int performSearch(int serachKey)
	   {
		   return recursiveLinearSearch(data, low, serachKey);
		 
	   }
 
	   public String toString()
	   {
	      StringBuilder temporary = new StringBuilder();
 
	      for ( int element : data )
	         temporary.append( element + " " );
 
	      temporary.append( "\n" );
	      return temporary.toString();
	   } 
    
}
