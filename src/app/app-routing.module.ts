import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ViewEmployeeSkillsComponent } from './viewEmployeeSkills/viewEmployeeSkills.component';
import { AddEmployeeSkillsComponent } from './addEmployeeSkills/addEmployeeSkills.component';
import { UpdateEmployeeSkillsComponent } from  './updateEmployeeSkills/updateEmployeeSkills.component';
import { DeleteEmployeeSkillsComponent } from  './deleteEmployeeSkills/deleteEmployeeSkills.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'homePage', component: HomeComponent},
  {path:'getEmployeeSkillsInformation', component: ViewEmployeeSkillsComponent},
  {path:'addEmployeeSkillsInformation', component: AddEmployeeSkillsComponent},
  {path:'updateEmployeeSkillsInformation', component: UpdateEmployeeSkillsComponent},
  {path:'updateEmployeeSkillsInformation/:id', component: UpdateEmployeeSkillsComponent},
  {path:'deleteEmployeeSkillsInformation/:id', component: DeleteEmployeeSkillsComponent},
  {path:'deleteEmployeeSkillsInformation', component: DeleteEmployeeSkillsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
