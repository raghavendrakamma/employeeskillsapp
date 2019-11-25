import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ViewEmployeeSkillsComponent } from './viewEmployeeSkills/viewEmployeeSkills.component';
import { AddEmployeeSkillsComponent } from './addEmployeeSkills/addEmployeeSkills.component';
import { FormsModule } from '@angular/forms';
import { EmployeeSkillsService } from './service/EmployeeSkillsService';
import { HttpClientModule } from '@angular/common/http';
import { DataTablesModule } from 'angular-datatables';
import {TabMenuModule} from 'primeng/tabmenu';
import {TableModule} from 'primeng/table';
import {FieldsetModule} from 'primeng/fieldset';
import {MenubarModule} from 'primeng/menubar';
import { UpdateEmployeeSkillsComponent } from './updateEmployeeSkills/updateEmployeeSkills.component';
import { DeleteEmployeeSkillsComponent } from './deleteEmployeeSkills/deleteEmployeeSkills.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ViewEmployeeSkillsComponent,
    AddEmployeeSkillsComponent,
    UpdateEmployeeSkillsComponent,
    DeleteEmployeeSkillsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    DataTablesModule,
    TableModule,
    FieldsetModule,
    TabMenuModule,
  ],
  providers: [EmployeeSkillsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
