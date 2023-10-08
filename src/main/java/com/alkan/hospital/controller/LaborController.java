package com.alkan.hospital.controller;

import com.alkan.hospital.dto.LaborDto;
import com.alkan.hospital.dto.request.LoginRequest;
import com.alkan.hospital.response.LaborResponse;
import com.alkan.hospital.service.LaborService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/labors")
public class LaborController {

    private final LaborService service;

    public LaborController(LaborService service) {
        this.service = service;
    }

    @GetMapping("/find-all")
    public ResponseEntity<LaborResponse> findAll(){
        return ResponseEntity.ok(new LaborResponse(200, "Labors found successfully", service.findAll()));
    }
    @PostMapping("/create")
    public ResponseEntity<LaborResponse> create(@RequestBody LaborDto dto){
        return ResponseEntity.ok(new LaborResponse(200, "Labor created successfully", service.create(dto)));
    }
    @PostMapping("/login")
    public ResponseEntity<LaborResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(new LaborResponse(200, "Labor logged in successfully", service.login(request)));
    }

}
