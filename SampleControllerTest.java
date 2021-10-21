package com.example.filedemo.controller;


import org.springframework.http.ResponseEntity;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
import  com.example.filedemo.utils.BSLConstants;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@Validated
public class SampleControllerTest {

    @PostMapping(value="/Lead/{campaign}/{site}/{eventType}", produces="application/json")
    public ResponseEntity<?> getLeapAPI(@Size(max=10) @Pattern(regexp = BSLConstants.CAMPAIGN) @PathVariable(name = "campaign") String campaign,
                                        @Pattern(regexp = BSLConstants.SITE) @PathVariable("site") String site,
                                        @Size(max=3) @Pattern(regexp = BSLConstants.EVENTTYPE) @PathVariable("eventType")  String eventType,
                                        @Size(max=5) @Pattern(regexp = BSLConstants.LOCALE) @RequestParam(name = "locale",defaultValue = "", required = true) String locale,
                                        @RequestParam(name="validateOnly",required = false) boolean validateOnly) {


        return null;
    }


}
