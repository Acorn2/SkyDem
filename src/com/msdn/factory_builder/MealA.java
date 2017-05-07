package com.msdn.factory_builder;

public class MealA extends MealBuilder{
	Meal meala=new Meal();
	private Meal Meal;
	@Override
	public void buildFood() {
		// TODO Auto-generated method stub
		meala.setFood("º¶»‚æÌ");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meala.setDrink("ø…¿÷");
	}
	public MealA(){
		this.buildDrink();
		this.buildFood();
	}
	public Meal getMeal(){
		return meala;
	}
}
