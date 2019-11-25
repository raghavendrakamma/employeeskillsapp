import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewEmployeeSkillsComponent } from './viewEmployeeSkills.component';

describe('ViewEmployeeSkillsComponent', () => {
  let component: ViewEmployeeSkillsComponent;
  let fixture: ComponentFixture<ViewEmployeeSkillsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewEmployeeSkillsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewEmployeeSkillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
