import { EmployeeSkillsInfo } from '../model/EmployeeSkillsInfo';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn:'root'
})
export class EmployeeSkillsService {
    
    private baseUrl = "http://localhost:8080";
    
    constructor(private http:HttpClient){}
   
    addEmployeeSkills(addEmployeeSkills:Object):Observable<EmployeeSkillsInfo> {
        console.log("EmployeeSkills object from Client"+addEmployeeSkills);
        return this.http.post<EmployeeSkillsInfo>(`${this.baseUrl}`+'/addEmployeeSkillsInformation', addEmployeeSkills);
    }
   
    viewEmployeeSkillsInformation():Observable<EmployeeSkillsInfo[]> {
        return this.http.get<EmployeeSkillsInfo[]>(`${this.baseUrl}`+'/viewEmployeeSkillsInformation');
    }

    deleteEmployeeSkillsInformation(employeeSkillsId: string):Observable<EmployeeSkillsInfo[]> {
        return this.http.get<EmployeeSkillsInfo[]>(`${this.baseUrl}`+'/deleteEmployeeSkillsInformation'+'/'+employeeSkillsId);
    }

    updateEmployeeSkillsInformation(addEmployeeSkills:Object):Observable<EmployeeSkillsInfo> {
        return this.http.put<EmployeeSkillsInfo>(`${this.baseUrl}`+'/updateEmployeeSkillsInformation', addEmployeeSkills);
    }

    getEmployeeSkillsById(employeeSkillsId: string):Observable<EmployeeSkillsInfo> {
        return this.http.get<EmployeeSkillsInfo>(`${this.baseUrl}`+'/getEmployeeSkillsById'+'/'+employeeSkillsId);
    }
}