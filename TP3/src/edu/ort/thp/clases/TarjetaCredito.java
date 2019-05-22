package edu.ort.thp.clases;

public class TarjetaCredito {

	private String numero;
	private String titular;
	private double limite;
	private double disponible;

	// Getter and Setter
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getDisponible() {
		return disponible;
	}

	public void setDisponible(double disponible) {
		this.disponible = disponible;
	}

	// Constructores

	public TarjetaCredito() {
		this.numero = "";
		this.titular = "";
		this.limite = 0;
		this.disponible = 0;
	}

	public TarjetaCredito(String num, String til, double lim) {
		this.numero = num;
		this.titular = til;
		this.limite = lim;
		this.disponible = lim;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [numero=" + numero + ", titular=" + titular + ", limite=" + limite + ", disponible="
				+ disponible + "]";
	}

	/*
	 * puedoComprar, método privado que según un monto devuelve true si puede
	 * hacer la compra, o false en caso contrario.
	 */

	private boolean puedoComprar(double monto) {
		boolean var = true;
		if (monto > this.disponible || monto > this.limite) {
			var = false;
		}
		return var;
	}

	/*
	 * realizarCompra, método público que dado un monto devuelve un booleano si
	 * lo pudo realizar, actualizando los atributos que corresponda
	 */

	public boolean realizarCompra(double monto) {
		boolean var = false;
		if (this.puedoComprar(monto)) {
			this.disponible -= monto;
			var = true;
		}
		
		return var;
	}
	
	/* actualizarLimite, método público que recibe el nuevo límite y actualiza a la vez el
		disponible. Si el límite es menor al anterior debe decrementar el disponible. Si el
		mismo resulta menor a 0, se lo debe poner en 0 */
	
	public void actualizarLimite(double lim){
		if(lim < this.limite){
			this.disponible -= limite;
			if(this.disponible <= 0){
				this.disponible = 0;
			}
		}
		this.limite = lim;
	}
	
	
	

}
