package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간을 밀리초로 가져온다
        long l = System.currentTimeMillis();
        System.out.println(l);
        //현재 시간을 나노초로 가져온다
        long nanoTime = System.nanoTime();
        System.out.println(nanoTime);

        //환경변수를 읽는다.
        System.out.println(System.getenv());

        //시스템 속성을 읽는다.
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originArray = {'h', 'e','l','l', 'o'};
        char[] copyArray = new char[5];
        System.arraycopy(originArray,0,copyArray,0,originArray.length);

        //배열 출력
        System.out.println(Arrays.toString(originArray));
        System.out.println(Arrays.toString(copyArray));

        //시스템 종료
        System.exit(0);
        System.out.println("hello");
    }
}
