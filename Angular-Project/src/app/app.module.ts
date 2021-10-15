import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AgregarComponent } from './Persona/agregar/agregar.component';
import { ListarComponent } from './Persona/listar/listar.component';
import { EliminarComponent } from './Persona/eliminar/eliminar.component';
import { ActualizarComponent } from './Persona/actualizar/actualizar.component';
import { AppRoutingModule } from './app-routing.module';






@NgModule({
  declarations: [
    AppComponent,
    AgregarComponent,
    ListarComponent,
    EliminarComponent,
    ActualizarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
  
})

export class AppModule { }
