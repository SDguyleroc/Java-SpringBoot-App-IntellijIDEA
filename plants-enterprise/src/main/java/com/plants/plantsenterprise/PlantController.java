package com.plants.plantsenterprise;

import com.plants.plantsenterprise.dto.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantController {

    @RequestMapping("/")
    public String getIndex(){


        return "index";
    }

    // to return all specimen
    @GetMapping("/specimen")
    public ResponseEntity fetchAllSpecimen(){
        return new ResponseEntity(HttpStatus.OK);
    }

    // to return only one specimen using the Id
    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/specimen", consumes ="application/json", produces ="application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
        return specimen;
    }

    @DeleteMapping("/specimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable String id){
        return new ResponseEntity(HttpStatus.OK);
    }

}
