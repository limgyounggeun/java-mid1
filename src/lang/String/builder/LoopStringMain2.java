package lang.String.builder;

public class LoopStringMain2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder rs = new StringBuilder();
        for(int i=0; i<100000; i++){
            rs.append("hello, java!");

        }
        long endTime = System.currentTimeMillis();
        System.out.println(rs);
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);

    }
}
