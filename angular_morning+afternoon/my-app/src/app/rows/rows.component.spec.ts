import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RowsComponent } from './rows.component';

describe('EmployeeRecordsComponent', () => {
  let component: RowsComponent;
  let fixture: ComponentFixture<RowsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RowsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RowsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});