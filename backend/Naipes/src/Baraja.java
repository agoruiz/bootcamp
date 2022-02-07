import java.util.Collection;
import java.util.HashMap;
import java.util.List;

interface JuegosdeCartas {
	  
  }

  interface Baraja<T> extends JuegosdeCartas{
	  int NumeroCartas=0;
	  
	  public void rellenar();
	  public void devuelveCartas();
	  public boolean Barajar();
	  public boolean Repartir();
  }
  
  interface Naipe {
	 int valor=0;
	 int palo=0;
	 HashMap<String, String> cartas = new HashMap<String, String>();
  }
  
  class Española implements Baraja, Naipe{
	  
  }
  
  class Francesa implements Baraja, Naipe{
	  
  }