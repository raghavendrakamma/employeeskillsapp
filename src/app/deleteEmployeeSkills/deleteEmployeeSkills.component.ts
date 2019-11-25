import { Component, OnInit,OnDestroy } from '@angular/core';
import { EmployeeSkillsInfo } from '../model/EmployeeSkillsInfo';
import { EmployeeSkillsService} from '../service/EmployeeSkillsService';
import { Router, ActivatedRoute} from '@angular/router';


@Component({
  selector: 'app-deleteEmployeeSkills',
  templateUrl: './deleteEmployeeSkills.component.html',
  styleUrls: ['./deleteEmployeeSkills.component.css']
})
export class DeleteEmployeeSkillsComponent implements OnInit {

  studentDeleteSuccess:boolean;
  studentDeleteFailed:boolean;
  studentIdToBeDeleted:string;
  employeeSkillsInfo:EmployeeSkillsInfo;
  sub;
  constructor(private _Activatedroute:ActivatedRoute,
    router: Router, private deleteStudentService: EmployeeSkillsService) { }

  ngOnInit() {
    this.sub=this._Activatedroute.paramMap.subscribe(params => { 
      console.log(params);
       this.studentIdToBeDeleted = params.get('id'); 

        this.deleteStudentService.getEmployeeSkillsById(this.studentIdToBeDeleted)
     .subscribe(
          data=> {
            console.log("data");

            this.employeeSkillsInfo =data;
           // alert("Student DELETED successfully");
            //this.router.navigate(['/getStudentsInformation', {}]);
          
          }, error => {
            console.log("UNable to get student" + error);
          
           
        })
   })
        
 
  }

  onSubmit() {
    this.studentDeleteSuccess = false;
    this.studentDeleteFailed = false;
     console.log("Into submit method of addstudent component")
     this.deleteStudentService.deleteEmployeeSkillsInformation(this.studentIdToBeDeleted)
     .subscribe(
          data=> {
            console.log("data");
           // alert("Student DELETED successfully");
            //this.router.navigate(['/getStudentsInformation', {}]);
            this.studentDeleteSuccess = true;
          }, error => {
            console.log("UNable to add student" + error);
           // this.router.navigate(['/getStudentsInformation', {}]);
            this.studentDeleteFailed = true;
        })
   }

   ngOnDestroy() {
    this.sub.unsubscribe();
  }
}
