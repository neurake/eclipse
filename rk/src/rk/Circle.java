package rk;
// Interface declaration:by first user
interface Drawable
{
	void draw();
}
// implemantation:by Second user
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}

public class Circle implements Drawable
{
	
	public void draw()
	{
		System.out.println("drawing circle");
	}

	public static void main(String[] args) {
		Drawable a=new Circle();
		a.draw();
		Drawable b=new Rectangle();
		b.draw();
	}

}
