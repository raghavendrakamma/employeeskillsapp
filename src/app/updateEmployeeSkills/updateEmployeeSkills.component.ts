import { Component, OnInit,OnDestroy } from '@angular/core';
import { EmployeeSkillsInfo } from '../model/EmployeeSkillsInfo';
import { EmployeeSkillsService} from '../service/EmployeeSkillsService';
import { Router, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-updateEmployeeSkills',
  templateUrl: './updateEmployeeSkills.component.html',
  styleUrls: ['./updateEmployeeSkills.component.css']
})
export class UpdateEmployeeSkillsComponent implements OnInit {
  studentIdToBeUpdated:string;
  addStudentInformation:EmployeeSkillsInfo;
  studentCreateSuccess:boolean;
  studentCreateFailed:boolean;
  sub;
  constructor(private _Activatedroute:ActivatedRoute,
    router: Router, private updateStudentService: EmployeeSkillsService) { }

  ngOnInit() {

    this.sub=this._Activatedroute.paramMap.subscribe(params => { 
      console.log(params);
       this.studentIdToBeUpdated = params.get('id'); 

        this.updateStudentService.getEmployeeSkillsById(this.studentIdToBeUpdated)
     .subscribe(
          data=> {
            console.log("data");

            this.addStudentInformation =data;
           // alert("Student DELETED successfully");
            //this.router.navigate(['/getStudentsInformation', {}]);
          
          }, error => {
            console.log("UNable to get student" + error);
          
           
        })
   })
  }

  onSubmit() {
    this.studentCreateSuccess = false;
    this.studentCreateFailed = false;
     console.log("Into submit method of addEmployeeSkills component")
     this.updateStudentService.updateEmployeeSkillsInformation(this.addStudentInformation)
     .subscribe(
          data=> {
            console.log("data");
            //alert("EmployeeSkills added successfully");
            //this.router.navigate(['/getStudentsInformation', {}]);
            this.studentCreateSuccess = true;
          }, error => {
            console.log("UNable to update EmployeeSkills" + error);
           // this.router.navigate(['/getStudentsInformation', {}]);
            this.studentCreateFailed = true;
        })
   }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

}
