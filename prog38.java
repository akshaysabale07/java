class Employee

{

       private static int empno ;
 
       private static double salary;

        static double totalsalary;

      static int counter = 0;

     
       Employee(double salary)

  {

         this.salary = salary;

         empno = empno+1;

         this.totalsalary = totalsalary+salary;

        counter = counter+1;

 }

        void display()

{

     System.out.println("\nId of empoyee = "+empno);
     System.out.println("Salary of empoyee = "+salary);

  }

    void totalsal()
 {

           System.out.println("\n\nTotalSalary of empoyee = "+totalsalary);
  
            System.out.println("\n\nTotalNumber of empoyee = "+counter);
 
  }

       
  }


   public class prog38
{
  
    public static void main(String args[])

{
     Employee e1 = new Employee(10);

      e1.display();

     Employee e2 = new Employee(20);

      e2.display();

     Employee e3 = new Employee(30);

      e3.display();

      e3.totalsal();

     
}

 }

