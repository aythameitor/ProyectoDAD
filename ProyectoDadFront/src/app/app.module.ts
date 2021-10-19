import {  NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './componentes/menu/menu.component';
import { FondoComponent } from './componentes/fondo/fondo.component';
import { LoginComponent } from './paginas/login/login.component';
import { ContactoComponent } from './paginas/contacto/contacto.component';
import { InfoComponent } from './paginas/info/info.component';

import { ServiciosComponent } from './paginas/servicios/servicios.component';
import { FondoPostloginComponent } from './componentes/fondo-postlogin/fondo-postlogin.component';
import { MenuPostloginComponent } from './componentes/menu-postlogin/menu-postlogin.component';
import { EnviosComponent } from './paginas/envios/envios.component';
import { InfoPostLoginComponent } from './paginas/info-post-login/info-post-login.component';
import { ProductosComponent } from './paginas/productos/productos.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import {MatCardModule} from '@angular/material/card';



@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    FondoComponent,
    LoginComponent,
    ContactoComponent,
    InfoComponent,
    ServiciosComponent,
    LoginComponent,
    FondoPostloginComponent,
    MenuPostloginComponent,
    EnviosComponent,
    InfoPostLoginComponent,
    ProductosComponent,
   

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NoopAnimationsModule,
    HttpClientModule,
    MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
