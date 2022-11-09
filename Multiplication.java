class MathFunction{

    public void multiply(int x,int y){
        int ans = x*y;
        System.out.println("result:\t"+ans);

    }
    public void multiply(float x,float y){
        float ans = x*y;
        System.out.println("result:\t"+ans);

    }
    public void multiply(int x,float y){
        float ans = x*y;
        System.out.println("result:\t"+ans);
    }
}

public class Multiplication {

    public  static  void  main(String[] args){

        MathFunction calc = new MathFunction();
        calc.multiply(2,3);
        calc.multiply(3,  4.234f);
        calc.multiply(2.3f,4.5f);


    }
}
