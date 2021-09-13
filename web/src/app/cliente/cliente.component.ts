import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Cliente } from '../dtos/Cliente';
import { ApiService } from '../servicios/api.service';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit, OnDestroy {

  public lstClientes: Cliente[] = [];
  private suscription!: Subscription;

  constructor(private apiService: ApiService) { }
  
  ngOnInit(): void {
    this.suscription = this.apiService.getClientes().subscribe(cliente => {
      this.lstClientes = cliente;
    });
  }
  
  ngOnDestroy(): void {
    this.suscription.unsubscribe();
  }
}
