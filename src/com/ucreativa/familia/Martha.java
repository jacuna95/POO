package com.ucreativa.familia;

import java.security.PrivateKey;

public class Martha {

    private int age;
    private String hobby;

    public Martha(String saludo, int age, String hobby){
        this.age = 42;
        this.hobby = "go for a walk";
        System.out.println(saludo);
    }

        public void setAge(){
            this.age= this.age + 1;
        }

    public int getAge(){
            return this.age;

    }
        public String getHobby(){
        return hobby;
        }

}
