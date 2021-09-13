package com.digitalware.test.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPedido;
	
	@Column(name = "idCliente", insertable = false, updatable = false)
	private Long idCliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	@Column(name = "estado", length = 1)
	private String estado;

	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPedido", cascade = CascadeType.ALL)
	private List<DetallePedido> lstDetallePedido;
}
