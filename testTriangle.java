package testTriangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import TriangleClass.Triangle;

@RunWith(Parameterized.class)
public class testTriangle {
	
	private int a;
	private int b;
	private int c;
	private String expected;
	
	public testTriangle(int input1,int input2, int input3, String expected) 
	{
		this.a = input1;
		this.b = input2;
		this.c = input3;
		this.expected = expected;
	}
	
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
				{1,1,1,"equilateral"},
				{2,3,5,"No"},
				{6,6,8,"isosceles"},
				{6,7,8,"scalene"}
	});
	}

	
	@Test
	public void testTriangles() {
		assertEquals(this.expected,Triangle.triangle(a,b,c));;
	}
	
	
}
