import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Usuario } from "../dtos/Usuario";
import { Cliente } from "../dtos/Cliente";
import { Producto } from "../dtos/Producto";

@Injectable({
  providedIn: "root"
})
export class ApiService {  
  private localhost = "http://localhost:8080/api"; // URL to web api

  constructor(private http: HttpClient) {}

  public getLogin(formData:any): Observable<Usuario> {
    return this.http.post<Usuario>(this.localhost+'/usuario/getUsuario',formData);
  }

  public getClientes(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(this.localhost+'/cliente/getClientes');
  }

  public getProductos(): Observable<Producto[]> {
    return this.http.get<Producto[]>(this.localhost+'/producto/getProductos');
  }
}