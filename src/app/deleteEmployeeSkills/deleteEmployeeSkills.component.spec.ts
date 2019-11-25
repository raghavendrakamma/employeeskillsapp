import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteEmployeeSkillsComponent } from './deleteEmployeeSkills.component';

describe('DeleteEmployeeSkillsComponent', () => {
  let component: DeleteEmployeeSkillsComponent;
  let fixture: ComponentFixture<DeleteEmployeeSkillsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeleteEmployeeSkillsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteEmployeeSkillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
