package com.petproject.petserver.controllers;

import com.petproject.petserver.model.MedicalData;
import com.petproject.petserver.services.MedicalDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1/")
public class MedicalDataController {
    private final MedicalDataService medicalDataService;

    @GetMapping("/medical_data")
    public ResponseEntity<List<MedicalData>> getAllMedicalData() {
        return ResponseEntity.ok(medicalDataService.getAllMedicalData());
    }

    @GetMapping("/medical_data/{id}")
    public ResponseEntity<MedicalData> getMedicalDataByID(@PathVariable Long id) {
        return ResponseEntity.ok(medicalDataService.getMedicalDataByID(id));
    }

    @PostMapping("/medical_data")
    public ResponseEntity<MedicalData> createMedicalData(@RequestBody MedicalData medicalData) {
        return new ResponseEntity<>(medicalDataService.saveMedicalData(medicalData), HttpStatus.CREATED);
    }

    @PutMapping("/medical_data/{id}")
    public ResponseEntity<MedicalData> changeMedicalDataById(@RequestBody MedicalData newMedicalData,
                                                      @PathVariable Long id) {
        newMedicalData.setId(id);
        return new ResponseEntity<>(medicalDataService.saveMedicalData(newMedicalData), HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/medical_data/{id}")
    public ResponseEntity<String> deleteMedicalDataById(@PathVariable Long id) {
        medicalDataService.delete(id);
        return new ResponseEntity<>("Note doesn't exist no more", HttpStatus.ACCEPTED);
    }
}
