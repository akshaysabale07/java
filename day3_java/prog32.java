class Student{
	 private int rno;// instance var
	 private String name;// instance + ref var + primitive var 
	  static int count;
	 Student()
	 {
		 count++;
	 }
	 
	 void setData(int roll,String nm)
	 {
		 rno=roll;
		 name=nm;
	 }
	 void showData()
	 {
		 System.out.println("Roll no. is " +rno);
		 System.out.println("name is: " +name);
	 }
	 
	 
 }
 
// main method
	class prog32{
		public static void main(String ab[])
		{
			Student s1=new Student();
			s1.setData(1,"Anjali badgujar");
			s1.showData();
			Student s2=new Student();
			Student s3=new Student();
			System.out.println(Student.count);
		}
	}
	 
	 
	 