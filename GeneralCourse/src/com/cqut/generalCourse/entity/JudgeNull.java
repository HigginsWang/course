package com.cqut.generalCourse.entity;

public class JudgeNull {
//	�ַ���Ϊ�շ���false
	public static boolean isNull(Object values){
		return values!=null&&!"".equals(values)&&" "!=values;
	}
	
}
