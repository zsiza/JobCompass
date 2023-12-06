import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegalertComponent } from './regalert.component';

describe('RegalertComponent', () => {
  let component: RegalertComponent;
  let fixture: ComponentFixture<RegalertComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RegalertComponent]
    });
    fixture = TestBed.createComponent(RegalertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
