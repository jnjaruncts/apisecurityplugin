package com.example.filedemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@Validated
public class SampleController {

    @PostMapping(value="/Lead/{campaign}/{site}/{eventType}", produces="application/json")
    public ResponseEntity<?> getLeapAPI(@PathVariable(name = "campaign") String campaign,
                                        String site,
                                        @PathVariable("eventType")  String eventType,
                                        @RequestParam(name = "locale",defaultValue = "", required = true) String locale,
                                        @RequestParam(name="validateOnly",required = false) boolean validateOnly) {


        return null;
    }


}   
