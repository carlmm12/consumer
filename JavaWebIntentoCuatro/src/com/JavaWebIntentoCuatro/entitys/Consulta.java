package com.JavaWebIntentoCuatro.entitys;

public class Consulta {
    private String tarjeta_id;
    private String monto;
    private String tipoTransaccion;
    
	public Consulta() {
		super();
	}
	
	public Consulta(String tarjeta_id, String monto, String tipoTransaccion) {
		super();
		this.tarjeta_id = tarjeta_id;
		this.monto = monto;
		this.tipoTransaccion = tipoTransaccion;
	}

	
	

	public String getTarjeta_id() {
		return tarjeta_id;
	}

	public void setTarjeta_id(String tarjeta_id) {
		this.tarjeta_id = tarjeta_id;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tarjeta_id == null) ? 0 : tarjeta_id.hashCode());
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
		Consulta other = (Consulta) obj;
		if (tarjeta_id == null) {
			if (other.tarjeta_id != null)
				return false;
		} else if (!tarjeta_id.equals(other.tarjeta_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consulta [tarjeta_id=" + tarjeta_id + ", monto=" + monto + ", tipoTransaccion=" + tipoTransaccion + "]";
	}
    
	
    
}
