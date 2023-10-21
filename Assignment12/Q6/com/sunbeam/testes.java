package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Stream<Integer> strm=Stream.iterate(1, x->x+1)
.limit(6);

Integer strm1= strm.reduce(1,(a,b)->a*b);
//strm1.forEach(i -> System.out.println(i));
System.out.println(strm1);

	}

}
