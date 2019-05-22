package edu.ort.thp.main;
import edu.ort.thp.clases.*;

public class TestEJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TarjetaCredito t1 = new TarjetaCredito(" 4145414122221111","Juan Perez",10000);

		//realizar compra
		t1.realizarCompra(4000);
		System.out.println(t1.toString());
		
		//bajar limite a 3000
		t1.actualizarLimite(3000);
		System.out.println(t1.toString());
		
		
		
		
	}

}
