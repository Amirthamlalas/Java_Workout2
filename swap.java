class callbyvalue{

    void swap(int a,int b){
        System.out.println("call by value");
        System.out.println("before swap "+a+" "+b);
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("after swap "+a+"  "+b);
    }

}
class callbyreference{
    int a = 3;
    int b = 4;
    void swap(int a,int b){
        System.out.println("call by reference");
        System.out.println("before swap "+a+" "+b);
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("after swap "+a+"  "+b);
    }

}
public class swap {
    int a,b;
    public static void main(String[] args){

    callbyreference ref = new callbyreference();
    ref.swap(ref.a,ref.b);
    callbyvalue val = new callbyvalue();
    val.swap(3,4);
    }
}
