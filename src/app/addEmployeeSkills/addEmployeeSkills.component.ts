import { Component, OnInit } from '@angular/core';
import { EmployeeSkillsInfo } from '../model/EmployeeSkillsInfo';
import { EmployeeSkillsService} from '../service/EmployeeSkillsService';
import { Router, ActivatedRoute} from '@angular/router';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-addEmployeeSkills',
  templateUrl: './addEmployeeSkills.component.html',
  styleUrls: ['./addEmployeeSkills.component.css']
})
export class AddEmployeeSkillsComponent implements OnInit {
  
  addStudentInformation:EmployeeSkillsInfo = new EmployeeSkillsInfo();
  router: Router;
  studentCreateSuccess:boolean;
  studentCreateFailed:boolean;
  constructor(router: Router, private addStudentService: EmployeeSkillsService) {
    this.router= router;
   }

   ngOnInit() {
    }

 onSubmit() {
  this.studentCreateSuccess = false;
  this.studentCreateFailed = false;
   console.log("Into submit method of addEmployeeSkills component")
   this.addStudentService.addEmployeeSkills(this.addStudentInformation)
   .subscribe(
        data=> {
          console.log("data");
          //alert("EmployeeSkills added successfully");
          //this.router.navigate(['/getStudentsInformation', {}]);
          this.studentCreateSuccess = true;
        }, error => {
          console.log("UNable to add EmployeeSkills" + error);
         // this.router.navigate(['/getStudentsInformation', {}]);
          this.studentCreateFailed = true;
      })
 }
}
