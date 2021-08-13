package LeetCode;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;

public class ExecutarTeste {
    public static void main(String[] args) {
        String texto = "kaio CESAR stricker 1BETHA";
        StringBuffer result = new StringBuffer();

        Matcher matcher = Pattern.compile("(?:^| )[^a-z]*[a-z]").matcher(texto.toLowerCase());
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toUpperCase());
        }
        matcher.appendTail(result);

        System.out.println(result);
    }
}