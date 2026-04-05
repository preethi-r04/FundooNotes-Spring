package com.bridgelabz.fundoo_notes.cache;


import java.util.HashMap;
import java.util.Map;

public class TokenCache {

    private static final Map<String, String> cache = new HashMap<>();

    public static void store(String email, String token) {
        cache.put(email, token);
    }

    public static String get(String email) {
        return cache.get(email);
    }
}