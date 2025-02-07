package com.nvbwcho.vehichletyperegister.controllers;


import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.nvbwcho.vehichletyperegister.daos.BodyTypeDao;
import com.nvbwcho.vehichletyperegister.daos.DoorTypeDao;
import com.nvbwcho.vehichletyperegister.daos.WagonTypeDoa;
import com.nvbwcho.vehichletyperegister.exceptions.NonUniqueValueException;
import com.nvbwcho.vehichletyperegister.services.BodyTypeService;
import com.nvbwcho.vehichletyperegister.services.DoorTypeService;
import com.nvbwcho.vehichletyperegister.services.WagonTypeService;
import com.nvbwcho.vehichletyperegister.vehichletype.WagonType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.doortype.GenericWagonDoorType;
import com.nvbwcho.vehichletyperegister.vehichletype.wagontype.wagonbodytype.GenericWagonBodyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
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
    public ResponseEntity<List<WagonType>> getAvailableWagonTypes() {

        List<WagonType> wagonTypes = wagonTypeService.getAllWagonTyes();

        return new ResponseEntity<>(wagonTypes, HttpStatus.OK);


    }


    @PostMapping("/addnewBodyType")
    public ResponseEntity<GenericWagonBodyType> addNewWagonBodyType(@RequestBody BodyTypeDao bodyTypeDao) {
        try {
            System.out.println(bodyTypeDao);
            return new ResponseEntity<>(bodyTypeService.addNewBodyType(bodyTypeDao).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }


    @PostMapping("/addnewDoorType")
    public ResponseEntity<GenericWagonDoorType> addNewWagonDoorType(@RequestBody DoorTypeDao doorTypeDao) {
        try {
            System.out.println(doorTypeDao);
            return new ResponseEntity<>(doorTypeService.addNewDoorType(doorTypeDao).get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("addnewWagonType")

    public ResponseEntity<WagonType> addNewWagonType(@RequestBody WagonTypeDoa wagonTypeDoa) {

        System.out.println(wagonTypeDoa);
        return new ResponseEntity<>(wagonTypeService.addNewWagonType(wagonTypeDoa).get(), HttpStatus.OK);

    }

    @ExceptionHandler(NonUniqueValueException.class)
    public ResponseEntity<String> handleNonUniqueValueException(NonUniqueValueException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleJsonParseException(HttpMessageNotReadableException ex) {
        Throwable cause = ex.getCause(); // Get the root cause of the exception

        if (cause instanceof InvalidFormatException invalidFormatException) {
            System.out.println(invalidFormatException);
            Object invalidValue = invalidFormatException.getValue();
            // Extract invalid value
            String fieldName = invalidFormatException.getPath().get(0).getFieldName();

            return new ResponseEntity<>(
                    "Invalid value: '" + invalidValue + "' is not a valid datatype for "+fieldName,
                    HttpStatus.BAD_REQUEST
            );
        }
        return new ResponseEntity<>("Invalid JSON format or data type mismatch", HttpStatus.BAD_REQUEST);
    }

}
