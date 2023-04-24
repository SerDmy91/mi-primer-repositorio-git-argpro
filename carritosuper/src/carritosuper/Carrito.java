package carritosuper;
import java.util.Scanner;

public class Carrito {

	public static void main(String[] args) {
		
		       Scanner teclado = new Scanner(System.in);  
		       System.out.println("---------Bienvenido al Super de Sergio----------");
		       System.out.println("------------------------------------------------");
		       System.out.println("---Por favor, ingrese un producto a su carro----"); 
		       System.out.println("------------------------------------------------"); 
		       System.out.println("Ingrese el nombre del producto: "); 
		       String ProdNombre1 =   teclado.next();

		       System.out.println("Ingrese la cantidad: "); 
		       int ProdCantidad1 = teclado.nextInt();
		       
		       System.out.println("Ingrese el precio: "); 
		       int ProdPrecio1 = teclado.nextInt();
		       
		       Producto comprar = new Producto(ProdNombre1,ProdCantidad1,ProdPrecio1 );
		                 
		       itemCarrito itemC = new itemCarrito(comprar.PNombre, comprar.PCantidad, comprar.PPrecio,comprar.PCantidad*comprar.PPrecio);
		        System.out.println("Precio sin descuento: " + itemC.ICPTotal);

		        if(itemC.ICPTotal>1000){
		            Descuento compraDesc = new Descuento(
		            		itemC.PNombre,
		            		itemC.PCantidad,
		            		itemC.PPrecio,
		            		itemC.ICPTotal,
		            		itemC.ICPTotal - (itemC.ICPTotal * 0.10)
		            );
		            double total = compraDesc.Descuentod;
		            System.out.println("Producto : " + itemC.PNombre);
		            System.out.println("Precio por Unidad : " + itemC.PPrecio);
		            System.out.println("Cantidad: " + itemC.PCantidad);
		            System.out.println("Total: " + itemC.ICPTotal);
		            System.out.println("-------------------------------"); 
		            System.out.println("Descuento del 10%: " + itemC.ICPTotal * 0.10);
		            System.out.println("-------------------------------");
		            System.out.println("Total a pagar con descuento: " + total);
		            
		        }else{
		        	System.out.println("Producto: " + itemC.PNombre);
		            System.out.println("Precio Unitario: " + itemC.PPrecio);
		            System.out.println("Cantidad: " + itemC.PCantidad);
		            System.out.println("Total: " + itemC.ICPTotal);
		            System.out.println("-----------------------------------"); 
		            System.out.println("La compra debe superar los 1000$ para acceder al descuento");
		        }
		    }
		

	}

