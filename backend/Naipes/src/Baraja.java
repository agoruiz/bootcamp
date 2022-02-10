import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/*Baraja contiene un list de naipes
 */
  abstract class Baraja<T>{
	  List<T> naipe= new ArrayList<T>();
	  public abstract boolean Barajar();
	  public abstract boolean Repartir();
  }
  
  abstract class Naipe<T> {	 
	  abstract HashMap<T, Integer> rellenarbaraja();
  }
  
	  
  class Española extends Naipe{
	int numerocartas = 48;
	int numeropalos = 4;
	int valormaxcarta =10;
	
	enum palos {Bastos, Copas, Oros,Espadas};
	HashMap<palos,Integer> cartas = new HashMap<palos, Integer>();
	/*La Baraja española se compone de 4 palos en los cuales contiene 10 cartas 
	 * numeradas del 1 al 10
	 */
	@Override
	public HashMap rellenarbaraja() {
		for(int i=0; i<numeropalos; i++) {
			for(int j=0; j<valormaxcarta; j++) {
				if(i==0) {
					cartas.put(palos.Bastos, j+1);
				}
				else if(i==1) {
					cartas.put(palos.Copas, j+1);
				}
				else if(i==2) {
					cartas.put(palos.Espadas, j+1);
				}
				else if(i==3) {
					cartas.put(palos.Oros, j+1);
				}
			}
						
		}
		return cartas;
	}


	@Override
	public boolean Barajar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Repartir() {
		// TODO Auto-generated method stub
		return false;
	}


	
	  
  
  
 
	  
  }


  
  
  