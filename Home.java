class OneBHK{
    float roomArea;
    float hallArea;
    float price;
    public OneBHK(){

        System.out.println("default constructor superclass");
    }

    public OneBHK(float x, float y, float z) {
        roomArea = x;
        hallArea = y;
        price = z;

    }
    void show(String x){
        System.out.println(x);
        System.out.println("RoomArea\t"+roomArea);
        System.out.println("HallArea\t"+hallArea);
        System.out.println("Price\t\t"+price);
    }
}

class TwoBHK extends OneBHK{
    float room2Area;

    public TwoBHK(){

        System.out.println("default constructor subclass");

    }
    public TwoBHK(float x,float y,float z,float a){
        super(x,y,z);
        room2Area = a;
    }

    @Override
    void show(String x) {
        super.show(x);
        System.out.println("Room2Area\t"+room2Area);
        System.out.println(" \n");
    }
}

public class Home {
    public static void main(String[] args){
        OneBHK one = new OneBHK();
        OneBHK oneB = new OneBHK(23,42,45);


        TwoBHK two1 = new TwoBHK();
        TwoBHK flat1 = new TwoBHK(423,4325,524,45);
        TwoBHK flat2 = new TwoBHK(667,343,324,66);
        TwoBHK flat3 = new TwoBHK(455,266,256,25);

        flat1.show("flat1");
        flat2.show("flat2");
        flat3.show("flat3");

        System.out.println("Total Price:\t"+(flat1.price+flat2.price+flat3.price));

    }
}
