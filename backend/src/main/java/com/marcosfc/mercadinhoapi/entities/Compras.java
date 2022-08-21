package com.marcosfc.mercadinhoapi.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.marcosfc.mercadinhoapi.entities.pk.ComprasPK;

@Entity
@Table(name = "tb_Compras")
public class Compras implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComprasPK id = new ComprasPK();
	
	private LocalDate data;
	
	public Compras() {
	}

	public Compras(Cliente cliente, Produto produto, LocalDate data) {
		id.setCliente(cliente);
		id.setProduto(produto);
		this.data = data;
	}
	
	public Cliente getCliente() {
		return id.getCliente();
	}
	
	public void setCliente(Cliente cliente) {
		id.setCliente(cliente);
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compras other = (Compras) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
