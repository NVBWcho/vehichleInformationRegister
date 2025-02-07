package com.nvbwcho.vehichletyperegister.controllers;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLServer {


    @QueryMapping
    public  String runTest(@Argument String greeting){
        System.out.println(greeting);
        return  greeting;
    }
}
