package rk;
interface A5
{
	int a=10;
	void show();
}
interface B
{
	String name="abc";
	void msg();
}
class C  implements A5,B
{
	public void show()
	{
		System.out.println("value is="+a);
	
	}
	public void msg()
	{
		System.out.println("name is="+name);
	}
	public static void main(String args[])
	{
		C obj1=new C();
		obj1.show();
		obj1.msg();
		
	}

}
