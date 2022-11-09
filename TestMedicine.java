class Medicine{
    String name = "Star Hospital";
    String address="Oachira,Kollam";


    void displayLabel(){
        System.out.println(name);
        System.out.println(address);
    }
}
class Tablet extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("amount as prescribed by doctor");
    }
}
class Ointment extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only");
    }
}



public class TestMedicine {
    public static void main(String[] args){

        double i = Math.random() *4;
        int v = (int) i;
        System.out.println("random number\t"+v);
        switch (v){
            case 1:
                Medicine M1 = new Medicine();
                Tablet T1 = new Tablet();
                M1.displayLabel();
                T1.displayLabel();
                break;
            case 2:
                Medicine M2 = new Medicine();
                Syrup s1 = new Syrup();
                M2.displayLabel();
                s1.displayLabel();
                break;
            case 3:
                Medicine M3 = new Medicine();
                Ointment o1 = new Ointment();
                M3.displayLabel();
                o1.displayLabel();
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
