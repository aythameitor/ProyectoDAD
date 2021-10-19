import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FondoPostloginComponent } from './fondo-postlogin.component';

describe('FondoPostloginComponent', () => {
  let component: FondoPostloginComponent;
  let fixture: ComponentFixture<FondoPostloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FondoPostloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FondoPostloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
