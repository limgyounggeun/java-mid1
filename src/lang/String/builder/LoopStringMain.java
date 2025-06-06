package lang.String.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String rs ="";
        for(int i=0; i<100000; i++){
            rs += "hello, java!";

        }
        long endTime = System.currentTimeMillis();
        System.out.println(rs);
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);

    }
}
