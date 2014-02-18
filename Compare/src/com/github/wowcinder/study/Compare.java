package com.github.wowcinder.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * Comparator o1-o2 正序,o2-o1反序 ,Comparable this-other正序,other-this反序
 * 
 * @author XuehuiHe
 * 
 */

public class Compare implements Comparable<Compare> {
	private Integer pos;

	public Compare() {
	}

	public Compare(Integer pos) {
		setPos(pos);
	}

	@Override
	public int compareTo(Compare o) {
		return o.getPos() - this.getPos();
	}

	public Integer getPos() {
		return pos;
	}

	public void setPos(Integer pos) {
		this.pos = pos;
	}

	public static void main(String[] args) {
		List<Compare> list = new ArrayList<Compare>();
		list.add(new Compare(1));
		list.add(new Compare(3));
		list.add(new Compare(2));
		Collections.sort(list);
		for (Compare integer : list) {
			System.out.println(integer.getPos());
		}
	}

	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("o1:" + o1 + ",o2:" + o2);
				return o2 - o1;
			}
		});
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
