package com.app.li;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestTwo {

	public static void main(String[] args) {
		TestOne o1 = new TestOne("Yvaraj1", "uv.gamil1");
		TestOne o2 = new TestOne("uvaraj2", "uv.gamil2");
		TestOne o3 = new TestOne("raj3", "uv.gamil3");
		List<TestOne> li = new ArrayList<TestOne>();
		li.add(o1);
		li.add(o2);
		li.add(o3);
		for (TestOne testOne : li) {
			System.out.println(testOne.getEmail());
			System.out.println(testOne.getName());
		}
	}
}
