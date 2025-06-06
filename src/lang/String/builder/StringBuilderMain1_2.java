package lang.String.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c").append("d")
                .insert(1, "java")
                        .delete(1, 5)
                                .reverse();
        System.out.println(sb);

    }
}
