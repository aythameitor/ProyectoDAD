import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empleado } from 'src/app/modelos/empleado';
import { EmpleadoservicioService } from 'src/app/servicios/empleadoservicio.service';

@Component({
  selector: 'app-info',
  templateUrl: './info.component.html',
  styleUrls: ['./info.component.scss']
})
export class InfoComponent implements OnInit {
  public empleados: Array<Empleado> = [];
  id: any;
  constructor(private router: Router, private empleadosservicio: EmpleadoservicioService) { }

  ngOnInit(): void {
    this.loadInfo();
    
  }

  loadInfo(){
    this.empleadosservicio.getEmpleados().subscribe((e: Array<Empleado>)=>{
      this.empleados = e;
    })
  }
}
