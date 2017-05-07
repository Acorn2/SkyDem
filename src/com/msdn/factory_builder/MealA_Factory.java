package com.msdn.factory_builder;

public class MealA_Factory implements MealFactory{

	@Override
	public MealA createMeal() {
		// TODO Auto-generated method stub
		return new MealA();
	}

}
