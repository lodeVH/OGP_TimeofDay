/**
 * @invar | 0 <= getUur() && getUur() < 24
 * @invar | 0 <= getMinuten() && getMinuten() < 60
 */
public class TimeofDay {
	   /**
	    * @invar | 0<= uur && uur < 24
	    * @invar | 0<= minuten && minuten < 60
	    */
       private int uur;
       private int minuten;
       
       int getUur() {return this.uur;}
       int getMinuten() {return this.minuten;}
       
       /**
        * @throws IllegalArgumentException | uur < 0 || 23 < uur
	    * @throws IllegalArgumentException | minuten < 0 || 59 < minuten
        * 
        * @post | getUur() == uur
	    * @post | getMinuten() == minuten
        *
        */
       TimeofDay(int uur,int minuten){
    	   if (uur < 0 || 23 < uur)
   			  throw new IllegalArgumentException("geen geldig uur");
   		   if (minuten < 0 || 59 < minuten)
   			  throw new IllegalArgumentException("geen geldige mintuten");
    	   
    	   this.uur=uur;
    	   this.minuten=minuten;
       }
}
