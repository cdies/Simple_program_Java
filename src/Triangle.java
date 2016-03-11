
public class Triangle{
	
	private double a,b,c;
	private double  p,s;
	
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Triangle(){
		this (0,0,0);
	}
	
	void getResult(){
		
		if (a + b <= c || a + c <= b || b + c <= a || a == 0 || b == 0 || c == 0)
        {
			System.out.println("Это не треугольник!");
			return;
        }
		
		p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        
        System.out.println("Площадь треугольника: " + s);
	}

}