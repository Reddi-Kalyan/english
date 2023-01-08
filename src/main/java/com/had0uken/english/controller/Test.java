package com.had0uken.english.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2A,5);
        String s=bCryptPasswordEncoder.encode("admin");
        System.out.println(s);
    }
}
