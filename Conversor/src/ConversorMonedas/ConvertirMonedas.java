package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void PesoMexDolar(double cantidad) {
		double monedaDolar = cantidad / 16.72;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
		
	}
	
	public void PesoMexEur(double cantidad) {
		double monedaDolar = cantidad / 18.77;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Euros");
		
	}
	
	public void PesoMexLib(double cantidad) {
		double monedaDolar = cantidad / 21.89;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Libras");
		
	}
	
	public void PesoMexYenJap(double cantidad) {
		double monedaDolar = cantidad / 8.29;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Yen Japones");
		
	}
	
	public void PesoMexWonKor(double cantidad) {
		double monedaDolar = cantidad / 0.013;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Yen Japones");
		
	}
	
	/////////////////////////////////////////////////////
	
	public void ConvertirDolaresMxn(double cantidad) {
		double monedaDolar = cantidad * 16.72;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolar $ " + monedaDolar + "  en pesos");
		
	}
	
	public void ConvertirEurosMxn(double cantidad) {
		double monedaDolar = cantidad * 18.77;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes Eur $ " + monedaDolar + "  en pesos");
		
	}
	
	public void ConvertirLibraMxn(double cantidad) {
		double monedaDolar = cantidad * 21.89;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libra $ " + monedaDolar + "  en pesos");
		
	}
	
	public void ConvertirYenMxn(double cantidad) {
		double monedaDolar = cantidad * 8.29;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen $ " + monedaDolar + "  en pesos");
		
	}
	
	public void ConvertirWonMxn(double cantidad) {
		double monedaDolar = cantidad * 0.013;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won $ " + monedaDolar + "  en pesos");
		
	}
	
	
	
}
