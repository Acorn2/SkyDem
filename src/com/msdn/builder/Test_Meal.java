package com.msdn.builder;

public class Test_Meal {
	public static void main(String[] args) {
		KFCWaiter kfcWaiter=new KFCWaiter();
		SubMealBuilderA mealA=new SubMealBuilderA();
		kfcWaiter.setMealBuilder(mealA);
		Meal ma=kfcWaiter.construct();
		System.out.println("A�ײ͵���ɣ�");
		System.out.println(ma.getFood()+"---"+ma.getDrink());
	}
}
