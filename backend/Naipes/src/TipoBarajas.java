
interface TiposBarajas extends Baraja {
enum tipoBarajas {Espaņola, Inglesa};
enum valor{};
enum palo{};

 boolean asignaryValorPalo (int valor,int palo); 
 boolean aņadirvalor(int valor ) throws Throwable;  
 tipoBarajas propiedadesBaraja();
boolean aņadirvalor(int palo, int valor) throws Throwable;

}
