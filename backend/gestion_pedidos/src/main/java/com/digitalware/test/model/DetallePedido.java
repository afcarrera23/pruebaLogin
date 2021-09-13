package com.digitalware.test.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalle_pedido")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class DetallePedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDetallePedido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido")
	private Pedido pedido;
	
	@Column(name = "idPedido", insertable = false, updatable = false)
	private Long idPedido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto")
	private Producto producto;
	
	@Column(name = "idProducto", insertable = false, updatable = false)
	private Long idProducto;

	@Column(name = "cantidad")
	private Long cantidad;

}
