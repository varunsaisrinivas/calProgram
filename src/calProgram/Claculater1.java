package calProgram;

class circle1
{
	void area1(int a)
	{
		System.out.println("Area of the circle: " + 3.14 * a *a);
	}
}
class rectangle1
{
	void area2(int b, int c)
	{
		System.out.println("Area of the rectangle: " +  b * c);
	}
}

class cuboid1
{
	void area3(int l,int b,int h)
	{
		System.out.println("Area of the cubiod: " + 2*(l*b + b*h + l*h));
	}
}






public class Claculater1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		circle1 a=new circle1();
		rectangle1 b=new rectangle1();
		cuboid1 c= new cuboid1();
		a.area1(10);
		b.area2(10, 10);
		c.area3(10, 10, 10);

	}
	
	
	

}