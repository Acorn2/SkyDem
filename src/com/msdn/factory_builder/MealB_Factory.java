package com.msdn.factory_builder;

public class MealB_Factory implements MealFactory{

	@Override
	public MealB createMeal() {
		// TODO Auto-generated method stub
		return new MealB();
	}

}
