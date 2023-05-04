package com.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.model.InfoData1;
import com.model.InfoManager;

@ManagedBean(name="infodata",eager=true)
public class InfoData 
{
	List<InfoData1> list;

	public List<InfoData1> getList() 
	{
		try
		{
			InfoManager im=new InfoManager();
			list=im.Reading();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}

	public void setList(List<InfoData1> list) 
	{
		this.list = list;
	}
}



