package com.msdn.factory_builder;

public class Test {
	public static void main(String[] args) {
		MealA_Factory af=new MealA_Factory();
		MealA mealA=af.createMeal();
		Meal m=mealA.getMeal();
		System.out.println("Ã◊≤Õ¿‡–Õ£∫");
		System.out.println(m.getFood()+"---"+m.getDrink());
	}
}
