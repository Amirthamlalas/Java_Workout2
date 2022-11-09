import java.util.Scanner;

class Faculty{
    int facultyid;
    float salary;
    void show() {

        System.out.println("id\t"+facultyid);

        System.out.println("salary\t"+salary);
    }
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;

  void input(){
      System.out.println("enter the id");
      Scanner sc = new Scanner(System.in);
      facultyid = sc.nextInt();

     System.out.println("enter the basic");
      basic = sc.nextFloat();

      System.out.println("enter the allowance");
      allowance = sc.nextFloat();
      salary = basic + allowance;
  }

    @Override
    void show() {
        super.show();
        System.out.println("Basic\t"+basic);
        System.out.println("Allowance\t"+allowance);

    }
}
class PartTimeFaculty extends Faculty{
    float hour;
    float rate;
    void input(){
        System.out.println("enter the id");
        Scanner sc = new Scanner(System.in);
        facultyid = sc.nextInt();

        System.out.println("enter the hour");
        hour = sc.nextFloat();

        System.out.println("enter the rate");
        rate = sc.nextFloat();
        salary = hour * rate;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Hour\t"+hour);
        System.out.println("Rate\t"+rate);
    }
}


public class DriverClass {
    public static void  main(String[] args){

        PartTimeFaculty person1 = new PartTimeFaculty();
        PartTimeFaculty person2 = new PartTimeFaculty();
        FullTimeFaculty person3 = new FullTimeFaculty();
        FullTimeFaculty person4 = new FullTimeFaculty();
        person1.input();
        person1.show();
        person2.input();
        person2.show();
        person3.input();
        person3.show();
        person4.input();
        person4.show();
    }
}
