import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Producto } from 'src/app/modelos/producto';
import { ProductoservicioService } from 'src/app/servicios/productoservicio.service';

@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  styleUrls: ['./productos.component.scss']
})
export class ProductosComponent implements OnInit {
  public productos: Array<Producto> = [];
  idproducto: any;
  constructor(private router: Router, private productoservice: ProductoservicioService) { }
  

  ngOnInit(): void {
    this.loadInfo();
  }

  loadInfo(){
    this.productoservice.getProductos().subscribe((p: Array<Producto>)=>{
      this.productos = p;
    })
  }
}
