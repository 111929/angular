import { NgModule } from "@angular/core";
import {  RouterModule, Routes } from "@angular/router";

import { ActualizarComponent } from "./Persona/actualizar/actualizar.component";
import { AgregarComponent } from "./Persona/agregar/agregar.component";
import { ListarComponent } from "./Persona/listar/listar.component";





const routes: Routes=[
    {path:'listar', component:ListarComponent},
    {path: 'agregar', component: AgregarComponent},
    {path: 'actualizar', component: ActualizarComponent}
];

@NgModule({

    imports: [RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{}
