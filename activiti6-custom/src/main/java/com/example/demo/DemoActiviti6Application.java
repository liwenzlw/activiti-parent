package com.example.demo;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoActiviti6Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoActiviti6Application.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

//	@Bean
//	public CommandLineRunner init(final RepositoryService repositoryService,
//								  final RuntimeService runtimeService,
//								  final TaskService taskService) {
//
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... strings) throws Exception {
//				System.out.println("Number of process definitions : "
//						+ repositoryService.createProcessDefinitionQuery().count());
//				System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
//				runtimeService.startProcessInstanceByKey("oneTaskProcess");
//				System.out.println("Number of tasks after process start: " + taskService.createTaskQuery().count());
//			}
//		};
//
//	}


//	@Bean
//	public CommandLineRunner init(final MyService myService) {
//
//		return new CommandLineRunner() {
//			public void run(String... strings) throws Exception {
//				myService.createDemoUsers();
//			}
//		};
//
//	}

}
