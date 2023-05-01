package java2;

class D
{
	String msg="it what it is";
	void getMsg()
	{
		System.out.println(msg);
	}
}

class C extends D
{
	void getBMsg()
	{
		System.out.println("no-one can change it");
	}
}

public class Inheritance {
	public static void main(String[] args)
	{
		C b1 = new C();
		b1.msg="thats reality";
		b1.getMsg();
		b1.getBMsg();
	}

}
