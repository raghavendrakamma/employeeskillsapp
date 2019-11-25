import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmployeeSkillsComponent } from './addEmployeeSkills.component';

describe('AddEmployeeSkillsComponent', () => {
  let component: AddEmployeeSkillsComponent;
  let fixture: ComponentFixture<AddEmployeeSkillsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddEmployeeSkillsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEmployeeSkillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
