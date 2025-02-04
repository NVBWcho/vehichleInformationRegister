package com.nvbwcho.vehichletyperegister.controllers;


import com.nvbwcho.vehichletyperegister.daos.BodyTypeDao;
import com.nvbwcho.vehichletyperegister.services.BodyTypeService;
import com.nvbwcho.vehichletyperegister.services.DoorTypeService;
import com.nvbwcho.vehichletyperegister.services.WagonTypeService;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehichleTypes")
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


    @PostMapping("/addnew")
    public ResponseEntity<GenericWagonBodyType> addNewWagonBodyType(@RequestBody BodyTypeDao bodyTypeDao){
        try{
            System.out.println(bodyTypeDao);
            return  new ResponseEntity<>(bodyTypeService.addNewBodyType(bodyTypeDao).get(),HttpStatus.OK);
        } catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
