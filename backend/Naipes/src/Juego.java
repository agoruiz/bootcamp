import java.util.List;

class Juego implements  Naipes, TiposBarajas {

	@Override
	public boolean añadirvalor(int palo,int valor) throws Throwable {
		try {
			try {
				List<Object> object;
			}catch(Exception e){
				throw e.getCause();
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}

	@Override
	public Juego.tipoBarajas propiedadesBaraja() {
		return null;
	}

	@Override
	public boolean asignaryValorPalo(int valor, int palo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean añadirvalor(int valor) throws Throwable {
		// TODO Auto-generated method stub
		return false;
	}

}
