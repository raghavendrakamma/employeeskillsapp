package employee.skills.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import employee.skills.model.EmployeeSkillsInformation;
import employee.skills.service.EmployeeSkillsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(value = "Swagger2StudentInformationController", description = "Adds Employee skills informaation and retrieves student information")

public class EmployeeSkillsController {
	@Autowired
	EmployeeSkillsService employeeSkillsService;
	 
	@RequestMapping(value = "/viewEmployeeSkillsInformation", method = RequestMethod.GET)
	  @ApiOperation(value = "returns the list of EmployeeSkills", response = Iterable.class, tags = "viewEmployeeSkillsInformation")
	  @ApiResponses(value = {
	               @ApiResponse(code = 200, message = "Success|OK"),
	               @ApiResponse(code = 401, message = "not authorized!"),
	               @ApiResponse(code = 403, message = "forbidden!!!"),
	               @ApiResponse(code = 404, message = "not found!!!") })
	   public List<EmployeeSkillsInformation> getEmployeeSkillsInformation() {
		  System.out.println("--- Tyring to Retrieve all EmployeeSkills list");
	      List<EmployeeSkillsInformation> studentsList = employeeSkillsService.getAllEmployeeSkills();
	      return studentsList;
	   }
	  
	  @RequestMapping(value = "/addEmployeeSkillsInformation", method = RequestMethod.POST)
	  @ApiOperation(value = "Adds a new EmployeeSkills information into our system of records", response = Iterable.class, tags = "addEmployeeSkillsInformation")
	  @ApiResponses(value = {
	               @ApiResponse(code = 200, message = "Success|OK"),
	               @ApiResponse(code = 401, message = "not authorized!"),
	               @ApiResponse(code = 403, message = "forbidden!!!"),
	               @ApiResponse(code = 404, message = "not found!!!") })
	   public EmployeeSkillsInformation addEmployeeSkillsInformation(@RequestBody EmployeeSkillsInformation employeeSkillsInformation) throws Exception {
		  System.out.println("===Here is your EmployeeSkills information"+employeeSkillsInformation.toString());
	      return employeeSkillsService.createOrUpdateEmployeeSkills(employeeSkillsInformation);
	     // return "{\"status\":\"success\"}";
	  }
	  
	  @RequestMapping(value = "/updateEmployeeSkillsInformation", method = RequestMethod.PUT)
	  @ApiOperation(value = "Updates EmployeeSkills information into our system of records", response = Iterable.class, tags = "updateEmployeeSkillsInformation")
	  @ApiResponses(value = {
	               @ApiResponse(code = 200, message = "Success|OK"),
	               @ApiResponse(code = 401, message = "not authorized!"),
	               @ApiResponse(code = 403, message = "forbidden!!!"),
	               @ApiResponse(code = 404, message = "not found!!!") })
	   public EmployeeSkillsInformation updateEmployeeSkillsInformation(@RequestBody EmployeeSkillsInformation employeeSkillsInformation) throws Exception {
		  System.out.println("===Here is your EmployeeSkills information"+employeeSkillsInformation.toString());
	      return employeeSkillsService.updateEmployeeSkills(employeeSkillsInformation);
	      
	  }
	  
	  
	  @RequestMapping(value = "/deleteEmployeeSkillsInformation/{employeeSkillsId}", method = RequestMethod.GET)
	  @ApiOperation(value = "Deletes a EmployeeSkills information from our system of records", response = Iterable.class, tags = "deleteEmployeeSkillsInformation")
	  @ApiResponses(value = {
	               @ApiResponse(code = 200, message = "Success|OK"),
	               @ApiResponse(code = 401, message = "not authorized!"),
	               @ApiResponse(code = 403, message = "forbidden!!!"),
	               @ApiResponse(code = 404, message = "not found!!!") })
	   public EmployeeSkillsInformation deleteEmployeeSkillsInformation(@PathVariable("employeeSkillsId") String employeeSkillsId) throws Exception {
	  System.out.println("===Delete EmployeeSkills information"+employeeSkillsId);
	      return employeeSkillsService.deleteEmployeeSkillsById(Long.parseLong(employeeSkillsId));
	     
	  }
	  
	  @RequestMapping(value = "/getEmployeeSkillsById/{employeeSkillsId}", method = RequestMethod.GET)
	  @ApiOperation(value = "Gets a EmployeeSkills information from our system of records", response = Iterable.class, tags = "getEmployeeSkillsById")
	  @ApiResponses(value = {
	               @ApiResponse(code = 200, message = "Success|OK"),
	               @ApiResponse(code = 401, message = "not authorized!"),
	               @ApiResponse(code = 403, message = "forbidden!!!"),
	               @ApiResponse(code = 404, message = "not found!!!") })
	   public EmployeeSkillsInformation getEmployeeSkillsInformation(@PathVariable("employeeSkillsId") String employeeSkillsId) throws Exception {
		  System.out.println("--Get EmployeeSkills by Id"+employeeSkillsId);
		  return employeeSkillsService.getEmployeeSkillsById(Long.parseLong(employeeSkillsId));
	  }
}
