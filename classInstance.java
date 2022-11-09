public class classInstance {
    static int count;
    static int destroyed;
    public classInstance(){
        count++;
    }
    public static void main(String[] args){
        classInstance c1 = new classInstance();
        classInstance c2 = new classInstance();
        classInstance c3 = new classInstance();
        c3 =null;
        Runtime.getRuntime().gc();
        System.out.println("object created:\t"+count);
        System.out.println("object destroyed:\t"+destroyed);
        System.out.println("object alive:\t"+(count-destroyed));

    }
    protected void finalize()
    {
        destroyed++;

    }
}
