public class Employee {
    int EmpID;
    String Name;
    String Result=" ";
    int ass1,ass2,ass3;
    void Employee(int e, String n,int a1,int a2,int a3){
        EmpID = e;
        Name = n;
        ass1 = a1;
        ass2 = a2;
        ass3 = a3;


    }
    void  display(){
        System.out.println(EmpID);
        System.out.println(Name);
        if((ass1>75)&(ass2>75)&(ass3>75)){
            Result = "Promoted";
            System.out.println(Result);
        }
        else {
            Result = "Demoted";
            System.out.println(Result);
        }
        float Total = ass1+ass2+ass3;
        float Percent = (Total/300)*100;
        System.out.println(Total);
        System.out.println(Percent);
    }


    public static void  main(String[] args){
        Employee emp = new Employee();
        emp.Employee(2,"Ron",46,67,47);
        emp.display();
        Employee emp2 = new Employee();
        emp2.Employee(2,"Rohit",76,87,90);
        emp2.display();
    }
}
