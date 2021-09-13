import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Producto } from '../dtos/Producto';
import { ApiService } from '../servicios/api.service';

@Component({
  selector: 'app-producto',
  templateUrl: './producto.component.html',
  styleUrls: ['./producto.component.css']
})
export class ProductoComponent implements OnInit, OnDestroy {

  public lstProductos: Producto[] = [];
  private suscription!: Subscription;

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.suscription = this.apiService.getProductos().subscribe(prod => {
      this.lstProductos = prod;
    });
  }

  ngOnDestroy(): void {
    this.suscription.unsubscribe();
  }

}
