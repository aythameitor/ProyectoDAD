import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoPostLoginComponent } from './info-post-login.component';

describe('InfoPostLoginComponent', () => {
  let component: InfoPostLoginComponent;
  let fixture: ComponentFixture<InfoPostLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoPostLoginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoPostLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
