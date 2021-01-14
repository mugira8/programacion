package RetoBodeguilla;

import java.util.ArrayList;
import java.util.Iterator;

public class Factura implements Facturacion{
	
	private int zenbakia;
	private String izena;
	private String abizena;
	private ArrayList<LineaFactura> lineas=new ArrayList<LineaFactura>();
	private double total;
	
	public Factura(int zenbakia, String izena, String abizena) {
		this.zenbakia = zenbakia;
		this.izena = izena;
		this.abizena = abizena;

	}

	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void aniadirLinea(String codigo, int cantidad, double totalLinea) {
		LineaFactura nuevaL=new LineaFactura(codigo,cantidad,totalLinea);
		this.lineas.add(nuevaL);
		System.out.println("ok");
		System.out.println("Lineas: "+ lineas.size() );
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Num factura: "+this.zenbakia+"\r\n"
				+ "Nombre cliente: "+this.izena+"\r\n"
				+ "Apellido cliente: "+this.abizena+"\r\n"
				+ "....................................");
		
		System.out.println("Lineas: "+ lineas.size() );
		
		Iterator<LineaFactura> iteradorLineafactura=lineas.iterator();
		LineaFactura lineafacturaTemp;
		
		while(iteradorLineafactura.hasNext()) {
			System.out.println(iteradorLineafactura.hasNext());
			lineafacturaTemp=iteradorLineafactura.next();
			System.out.println("Codigo: "+lineafacturaTemp.getCodigo()+"Cantidad: "+lineafacturaTemp.getCantidad()+"  Subtotal: "+lineafacturaTemp.getTotalLinea());
		}
		
		System.out.println(calcularTotal());
		
	}
	

	@Override
	public double calcularTotal() {
		// TODO Auto-generated method stub
		Iterator<LineaFactura> iteradorLineafactura=lineas.iterator();
		LineaFactura lineafacturaTemp;
		
		while(iteradorLineafactura.hasNext()) {
			lineafacturaTemp=iteradorLineafactura.next();
			this.total+=lineafacturaTemp.getTotalLinea();
		}
		return total;
	}	

}
