import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactoComponent } from './paginas/contacto/contacto.component';
import { EnviosComponent } from './paginas/envios/envios.component';
import { InfoPostLoginComponent } from './paginas/info-post-login/info-post-login.component';
import { InfoComponent } from './paginas/info/info.component';
import { LoginComponent } from './paginas/login/login.component';

import { ProductosComponent } from './paginas/productos/productos.component';
import { ServiciosComponent } from './paginas/servicios/servicios.component';

const routes: Routes = [
  {path: '', redirectTo: 'servicios', pathMatch:'full'},
  {path:'contacto', component: ContactoComponent},
  {path:'servicios', component: ServiciosComponent},
  {path:'info', component:InfoComponent},
  {path:'login', component:LoginComponent},
  {path:'infopostlogin', component:InfoPostLoginComponent},
  {path:'productos', component:ProductosComponent},
  {path:'envios', component:EnviosComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
