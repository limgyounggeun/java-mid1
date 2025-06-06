package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz1 = String.class; //1. 클래스에서 조회
        //Class clazz2 = new String().getClass(); //2.인스턴스에서 조회
        //Class class3 = Class.forName("java.lang.String"); //3. 문자열로조회

        //모든 필드 조회
        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //모든 메서드 조회
        Method[] declaredMethods = clazz1.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        //상위 클래스 조회
        System.out.println("Superclass: " + clazz1.getSuperclass().getName());

        //인터페이스 정보 조회
        Class[] interfaces = clazz1.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i);
        }
    }
}
