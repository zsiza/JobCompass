import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MakeserviceComponent } from './makeservice.component';

describe('MakeserviceComponent', () => {
  let component: MakeserviceComponent;
  let fixture: ComponentFixture<MakeserviceComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MakeserviceComponent]
    });
    fixture = TestBed.createComponent(MakeserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
