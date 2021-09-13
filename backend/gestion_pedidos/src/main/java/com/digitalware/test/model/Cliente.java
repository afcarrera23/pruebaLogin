package com.digitalware.test.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCliente;

	@Column(name = "numDocCliente")
	private String numDocCliente;

	@Column(name = "nombreCliente")
	private String nombreCliente;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente" ,cascade = CascadeType.ALL)
	private List<Pedido> lstPedidos;

}
