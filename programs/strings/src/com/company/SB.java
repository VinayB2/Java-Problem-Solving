package com.company;
//StringBuilder:
// --mutable
public class SB {
    public static void main(String[]args){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            s.append(ch);
        }
        System.out.println(s);
    }
}
