package TriangleClass;

public class Triangle {
	
	
	public void Triangle(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static String triangle(int a, int b, int c){
		
		if(a >= 0 && b >= 0 && c >=0){
			if(a + b >c)
			{
				if(a == b || b ==c || a ==c)
				{
					if(a == b && b == c)
					{
						return "equilateral";
					}
					return "isosceles";
				}
				else{
					return "scalene";
				}
			}
			else{
				return "No";
			}
		}
		else{
			return "No";
		}
		
		
		
	}
	
	public int a;
	public int b;
	public int c;

}
