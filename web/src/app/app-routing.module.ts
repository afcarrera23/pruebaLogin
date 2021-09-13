import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from "./app.component";
import { ClienteComponent } from './cliente/cliente.component';
import { LoginComponent } from "./login/login.component";
import { ProductoComponent } from './producto/producto.component';
import { RegisterComponent } from "./register/register.component";

const routes: Routes = 
[
  { path: "", component: LoginComponent, pathMatch: "full" },
  { path: "login", component: LoginComponent, pathMatch: "full" },
  { path: "cliente", component: ClienteComponent, pathMatch: "full" },
  { path: "producto", component: ProductoComponent, pathMatch: "full" },
  { path: "register", component: RegisterComponent, pathMatch: "full" }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routing = RouterModule.forRoot(routes);
