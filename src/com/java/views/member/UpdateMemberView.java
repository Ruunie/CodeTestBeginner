package com.java.views.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.views.View;

public class UpdateMemberView extends View {

	{
		String menu = "************** 회원정보 변경 *******************\n";
		setMenu(menu);

	}

	@Override
	public Map<String, Object> view(Map<String, Object> param) {

		Scanner scann = new Scanner(System.in);
		Map<String, Object> dataMap = new HashMap<String, Object>();

		System.out.print("이름 : ");
		dataMap.put("name", scann.nextLine());
		System.out.print("전화번호 : ");
		dataMap.put("phone", scann.nextLine());

		return dataMap;
	}

}
