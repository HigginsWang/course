package com.cqut.generalCourse.entity;

public class TranslateToInt {
	//ת��Ϊ����
		public static int getInterger(Object values){
			Double d = new Double((Double)values);
			return d.intValue();
		}
}
