package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversionMonedas {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double cantidad) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libra Esterlina", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	
	case "De Pesos a Dólar": 
		monedas.PesoMexDolar(cantidad);
		break;
		
	case "De Pesos a Euro": 
		monedas.PesoMexEur(cantidad);
		break;
		
	case "De Pesos a Libra Esterlina":
		monedas.PesoMexLib(cantidad);
		break;
		
	case "De Pesos a Yen Japonés":
		monedas.PesoMexYenJap(cantidad);
		break;
		
	case "De Pesos a Won sub-coreano":
		monedas.PesoMexWonKor(cantidad);
		break;
		
		////////////////////////////
		
	case "De Dólar a Pesos":
		monedas.ConvertirDolaresMxn(cantidad);
		break;
		
	case "De Euro a Pesos":
		monedas.ConvertirEurosMxn(cantidad);
		break;
		
	case "De Libras Esterlinas a Pesos":
		monedas.ConvertirLibraMxn(cantidad);
		break;
	 
	case "De Yen Japonés a Pesos":
		monedas.ConvertirYenMxn(cantidad);
		break;
		
	case "De Won sub-coreano a Pesos":
		monedas.ConvertirWonMxn(cantidad);
		break;
	}
	}


}
