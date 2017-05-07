package com.msdn.builder;

public abstract class MealBuilder {
	protected Meal meal=new Meal();
	
	public abstract void buildFood();	
	public abstract void buidlDrink();
	
	public Meal getMeal(){
		return meal;
	}
}
