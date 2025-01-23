package com.nvbwcho.vehichletyperegister.controllers;


import com.nvbwcho.vehichletyperegister.services.BodyTypeService;
import com.nvbwcho.vehichletyperegister.services.DoorTypeService;
import com.nvbwcho.vehichletyperegister.services.WagonTypeService;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class MainRestController {


    @Autowired
    private WagonTypeService wagonTypeService;

    @Autowired
    private BodyTypeService bodyTypeService;

    @Autowired
    private DoorTypeService doorTypeService;


    @GetMapping("/allWagonTypes")
    public ResponseEntity<List<WagonType>> getAvailableWagonTypes(){

        List<WagonType> wagonTypes=wagonTypeService.getAllWagonTyes();

        return  new ResponseEntity<>(wagonTypes, HttpStatus.OK);


    }
}
