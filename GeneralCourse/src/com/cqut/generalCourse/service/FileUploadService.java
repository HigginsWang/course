package com.cqut.generalCourse.service;

import com.cqut.generalCourse.dao.CommonDAO;

public class FileUploadService {
	
	//����Dao�����
	public static CommonDAO dao = null;
	
	//�ڶ����ʼ��ʱ����һ��CommonDAO����
	static{
		dao = new CommonDAO();
	}
	
	//�����ļ��ֶζ���
	public void dealFileFiled(){
		
	}
	
	//�������ļ�����·��
	public String SaveFile(){
		return null;
	}
	
}
