package com.example.demo;

import com.example.demo.entities.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
patientRepository.save(new Patient(null,"Mohamed",new Date(),false,4000));
patientRepository.save(new Patient(null,"Hanane",new Date(),false,432));
	patientRepository.save(new Patient(null,"Imane",new Date(),true,340));

	}
}
