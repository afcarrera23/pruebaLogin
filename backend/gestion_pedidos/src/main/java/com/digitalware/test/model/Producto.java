package com.digitalware.test.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "producto")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProducto;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "cantidad")
	private Long cantidad;

	@Column(name = "valor")
	private Long valor;

	@Column(name = "estado", length = 1)
	private String estado;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idProducto" ,cascade = CascadeType.ALL)
	private List<DetallePedido> lstDetallePedido;

}
