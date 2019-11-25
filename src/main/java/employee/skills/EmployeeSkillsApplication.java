package employee.skills;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeSkillsApplication {
   public static void main(String[] args) {
      SpringApplication.run(EmployeeSkillsApplication.class, args);
   }
   @Bean
   public Docket productApi() {
      return new Docket(DocumentationType.SWAGGER_2).select()
    		  .apis(RequestHandlerSelectors.basePackage("employee.skills"))//FIler URLS only from this Package
             // .paths(regex("/product.*"))//Consider only Urls that starts with "/product". Its an additional filet to "basePackage"
      		  .build().apiInfo(metaData());
         }
   private ApiInfo metaData() {
       ApiInfo apiInfo = new ApiInfo(
               "Spring Boot REST API",
               "Spring Boot REST API for Online Store",
               "1.0",
               "Terms of service",
               new Contact("Raghu", "http://localhost:8080", "test@mygmail.com"),
              "Apache License Version 2.0",
               "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
       return apiInfo;
   }
}