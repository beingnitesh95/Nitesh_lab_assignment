package com.example.employeeapp;

import com.example.employeeapp.repo.Employee;
import com.example.employeeapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeappApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepo employeeRepo;

//    private Logger logger = (Logger) LoggerFactory.getLogger(EmployeeappApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EmployeeappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepo.save(new Employee(2, "Nitesh", "Nitesh@123", 1234567890L));
		//employeeRepo.save(Employee.builder().name("Nitesh").email("Nitesh@123").phone(1234567890).build());
//		Logger.info("Employee saved");
	}
}
