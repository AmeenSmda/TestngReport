package org.task;

import java.io.IOException;

import org.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Concept extends BaseClass{

     	@Test
	     private void tc1() {
		System.out.println("TC1 Passed");
     	Assert.assertEquals(true, true);
     	}
		
     	@Test
		private void tc2() {
     		System.out.println("TC2 Passed");
         		
     	}
	    
		@Test
	       private void tc3(){
			System.out.println("TC3 Passed");
			Assert.assertEquals(true, true);
			       	
			}
	      
	      @Test
	      private void tc4(){
	    	  System.out.println("TC4 Passed");
	       	 	 
	    	  }
	          
	      @Test
	      private void tc5() {
	    	  System.out.println("TC5 Passed");
	       	
	      }
	          

	}

