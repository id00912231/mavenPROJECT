package com.astrai;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Pepe", "Rodriguez", 2.8f);
        Gson gson = new Gson();

        String json = gson.toJson(p);
        System.out.println(json);
    }
}