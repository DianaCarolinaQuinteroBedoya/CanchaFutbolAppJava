package tiendas;
public class Tienda {
	
	
	int caja;
	producto pro1;
	producto pro2;
	producto pro3;
	producto pro4;
	
	public void hacerPedido() {
		producto pro1 = new producto("Jugo hit", "3450", 9.2);
		System.out.println(pro1.nombre+": "+pro1.precio+": "+pro1.id);
		
	}
	
	public producto getPro1() {
		return pro1;
	}
	public void setP1(producto pro1) {
		this.pro1 = pro1;
	}
	public producto getPro2() {
		return pro2;
	}
	public void setPro2(producto pro2) {
		this.pro2 = pro2;
	}
	public producto getPro3() {
		return pro3;
	}
	public void setPro3(producto pro3) {
		this.pro3 = pro3;
	}
	public producto getPro4() {
		return pro4;
	}
	public void setP4(producto pro4) {
		this.pro4 = pro4;
	}


	
}