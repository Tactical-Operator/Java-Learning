public class looptest{
    public static void main(String[] args){
        for(int i=0;i<100000;i++){
            test();
        }
        System.out.println();
    }

    static void test(){
        int g = 1+2;
        System.out.println(g);
    }
}