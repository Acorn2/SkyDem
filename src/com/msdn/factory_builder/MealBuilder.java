package com.msdn.factory_builder;

import com.msdn.builder.Meal;

public abstract class MealBuilder {
//	   Meal meal = new Meal();  
	      
	    public abstract void buildFood();  
	      
	    public abstract void buildDrink();  
	    
	    public MealBuilder(){
	    	
	    }
	      
//	    public Meal getMeal(){  
//	        return meal;  
//	    } 
}
