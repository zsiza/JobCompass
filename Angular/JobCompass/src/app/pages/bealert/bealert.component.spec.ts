import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BealertComponent } from './bealert.component';

describe('BealertComponent', () => {
  let component: BealertComponent;
  let fixture: ComponentFixture<BealertComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BealertComponent]
    });
    fixture = TestBed.createComponent(BealertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
