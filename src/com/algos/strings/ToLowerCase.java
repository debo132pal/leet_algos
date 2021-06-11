package com.algos.strings;

public class ToLowerCase {

    public String toLowerCase(String s) {
        StringBuilder st = new StringBuilder();
        for( int i = 0 ; i < s.length() ; i++  ){
            char c = s.charAt(i);
            if( c >= 'A' && c  <= 'Z')
                c  = (char) ( c - 'A' + 'a');
            st.append(c);
        }
        return st.toString();
    }

    public static void main(String[] args) {
        ToLowerCase lc = new ToLowerCase();
        System.out.println( lc.toLowerCase("Hello"));
    }
}
