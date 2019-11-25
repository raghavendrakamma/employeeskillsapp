import { Component, OnInit } from '@angular/core';
import { EmployeeSkillsService} from '../service/EmployeeSkillsService';
import { Router, ActivatedRoute} from '@angular/router';
import { EmployeeSkillsInfo } from '../model/EmployeeSkillsInfo';

@Component({
  selector: 'app-viewEmployeeSkills',
  templateUrl: './viewEmployeeSkills.component.html',
  styleUrls: ['./viewEmployeeSkills.component.css']
})
export class ViewEmployeeSkillsComponent implements OnInit {
  studentsInformation: EmployeeSkillsInfo[];
  columnHeaders: any[];
  constructor(router: Router, private studentService: EmployeeSkillsService) { }

  ngOnInit() {
    this.studentService.viewEmployeeSkillsInformation().
      subscribe(data => {
        this.studentsInformation = data;
      });
      this.columnHeaders = [
          {header: 'Employee Id', field: 'studentId'},
          {header: 'Employee Name', field: 'studentName'},
          {header: 'Email Id', field: 'email'},
          {header: 'Contact Number', field: 'contactNumber'},
          {header: 'Courses Information', field: 'coursesFamiliarWith'},
           
      ]
  }

}
