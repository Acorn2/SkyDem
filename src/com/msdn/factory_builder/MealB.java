package com.msdn.factory_builder;

public class MealB extends MealBuilder{
	Meal mealb=new Meal();
	@Override
	public void buildFood() {
		// TODO Auto-generated method stub
		mealb.setFood("∫∫±§");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		mealb.setDrink("≥»÷≠");
	}
	
	public MealB(){
		this.buildDrink();
		this.buildFood();
	}
	public Meal getMeal(){
		return mealb;
	}
}
