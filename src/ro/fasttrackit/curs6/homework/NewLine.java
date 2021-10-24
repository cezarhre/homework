package ro.fasttrackit.curs6.homework;

import java.util.Arrays;
import java.util.regex.Pattern;

public class NewLine {
    public static void main(String[] args) {
        String str = "Ana are mere.Merele sunt multe.Fructele sunt bune. ";
        String [] result = str.split(Pattern.quote("."));
        for(String res : result) {
            System.out.println(res);
        }
    }
}
