package carritosuper;

class Producto {
	
    String PNombre;   
    int PCantidad;    
    double PPrecio;
		    
	    public Producto(String PNombre, int PCantidad, double PPrecio){  
		        this.PNombre = PNombre; 
		        this.PCantidad= PCantidad; 
		        this.PPrecio = PPrecio;
		    }
	}

		class itemCarrito extends Producto{   
		    double ICPTotal;
		    
		        public itemCarrito(String PNombre, int PCantidad, double PPrecio, double ICPTotal){
		        	
		        super(PNombre, PCantidad, PPrecio);  
		        this.ICPTotal =  ICPTotal;  		   
		    }

		}

		class Descuento extends itemCarrito { 
		    double Descuentod;  

		    
		    public Descuento(String PNombre, int PCantidad, double PPrecio, double ICPTotal, double DescuentoD){
		        super(PNombre,PCantidad,PPrecio,ICPTotal);
		        this.Descuentod = DescuentoD;
		    }
 }