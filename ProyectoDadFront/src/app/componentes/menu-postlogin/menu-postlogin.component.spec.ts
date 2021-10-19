import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuPostloginComponent } from './menu-postlogin.component';

describe('MenuPostloginComponent', () => {
  let component: MenuPostloginComponent;
  let fixture: ComponentFixture<MenuPostloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuPostloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuPostloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
