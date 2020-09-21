class prog3

{
static public void main(String args[])
	{
	int x=40;
int y= (x*2)+(3*x)-7;
System.out.println(y);
	
//x=0;
//y=0;
	y=x++ + ++x;
	System.out.println( "x is "+x);
	System.out.println( " y is "+y);
	
	int z=x++ - --y - --x + x++;
	System.out.println( "x is "+x);
	System.out.println( " y is "+y);
	System.out.println( "z is "+z);
	
	boolean xx=true;
	boolean yy=true;
	boolean zz;
		
zz=xx&&yy || !(xx||yy);	
System.out.println( "x is "+xx);
	System.out.println( " y is "+yy);
	System.out.println( "z is "+zz);
	
	}
}