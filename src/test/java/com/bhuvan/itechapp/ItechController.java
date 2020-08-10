package com.bhuvan.itechapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ItechController
{
    // Content-Type text/plain
    @RequestMapping(value = "/test")
    public String test() {
        return "Hello world !";
    }

    // Content-Type application/json
    @RequestMapping(value = "/test-json")
    public Map testJson(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Bhuvan");
        map.put("city", "Thanjavur");
        map.put("workplace", "Chennai");
        map.put("pincode", 613007);

        return map;
    }

    // Content-Type application/json
    @RequestMapping(value = "/bhuvan")
    public Person getBhuvan() {
        Address address = new Address();
        address.city = "Thanjavur";
        address.state = "tamil nadu";
        address.pincode = 610001;

        List<String> languages = new ArrayList<>();
        languages.add("ta");
        languages.add("en");
        languages.add("hi");

        Person person = new Person();
        person.id = 1;
        person.name = "Bhuvan";
        person.address = address;
        person.languages = languages;

        return person;
    }
}
