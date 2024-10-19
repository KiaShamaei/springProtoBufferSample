package com.kia.securingapiwithprotobuf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {

//    @PostMapping("/post")
//    public ResponseEntity<String> uploadPerson(@RequestBody  person) {
//        // Process the person object as needed
//        return ResponseEntity.ok("Received person: " + person.getName());
//    }

//    @GetMapping("/get")
//    public ResponseEntity<Person> downloadPerson() {
//        Person person = Person.newBuilder()
//                .setName("John Doe")
//                .setAge(30)
//                .build();
//        return ResponseEntity.ok(person);
//    }
}