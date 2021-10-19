import { TestBed } from '@angular/core/testing';

import { EmpleadoservicioService } from './empleadoservicio.service';

describe('EmpleadoservicioService', () => {
  let service: EmpleadoservicioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmpleadoservicioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
