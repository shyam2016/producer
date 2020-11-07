package com.shyam.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@Slf4j
public class ProducerController {
    @GetMapping(value = "/profile")
    public ResponseEntity<Employee> getEmployee() throws InterruptedException {
        log.info("start getEmployee Details");
        ResponseEntity<Employee> result = ResponseEntity.ok(Employee.builder()
                .employeeId("1")
                .employeeName("John")
                .build());
        Thread.sleep(20000);
        log.info("End getEmployee Details");
        return result;
    }

    @GetMapping(value = "/address")
    public ResponseEntity<Address> getEmployeeAddress() throws InterruptedException {
        log.info("start getEmployeeAddress");
        ResponseEntity<Address> result = ResponseEntity.ok(
                Address.builder()
                        .street("woodduck ln")
                        .city("wheeling")
                        .state("IL")
                        .zipCode("600990")
                        .build());
        Thread.sleep(3000);
        log.info("End getEmployeeAddress");
        return result;
    }
}