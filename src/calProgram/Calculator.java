package calProgram;

class circle
{
	void area1(int a)
	{
		System.out.println("Area of the circle: " + 3.14 * a *a);
	}
}
class rectangle
{
	void area2(int b, int c)
	{
		System.out.println("Area of the rectangle: " +  b * c);
	}
}

class cuboid
{
	void area3(int l,int b,int h)
	{
		System.out.println("Area of the cubiod: " + 2*(l*b + b*h + l*h));
	}
}






public class Calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		circle a=new circle();
		rectangle b=new rectangle();
		cuboid c= new cuboid();
		a.area1(10);
		b.area2(10, 10);
		c.area3(10, 10, 10);

	}
	
	
	

}
