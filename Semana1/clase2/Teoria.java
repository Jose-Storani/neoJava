package Semana1.clase2;

public class Teoria {
	
	public static class Categoria{
		double maxIIBB;
		int maxSuperficie;
		int maxEnergia;
		
		public Categoria(double maxIIBB, int maxSuperficie, int maxEnergia) {
			this.maxIIBB = maxIIBB;
			this.maxSuperficie = maxSuperficie;
			this.maxEnergia = maxEnergia;
		}
		
		
		
	};
	
	public static class Usuario{
		String name;
		int dni;
		String address;
		
		public Usuario(String name, int dni, String address) {
			this.name = name;
			this.dni = dni;
			this.address = address;
		}
		Teoria.Categoria categoria_A = new Teoria.Categoria(748382.07,30,3330);
		Teoria.Categoria categoria_B = new Teoria.Categoria(1112459.83,45,5000);
		Teoria.Categoria categoria_C = new Teoria.Categoria(1557443.75,60,6700);
		Teoria.Categoria categoria_D = new Teoria.Categoria(1934273.04,85,10000);
		Teoria.Categoria categoria_E = new Teoria.Categoria(2277684.56,110,13000);
		Teoria.Categoria categoria_F = new Teoria.Categoria(2847105.07,150,16500);
		Teoria.Categoria categoria_G = new Teoria.Categoria(3416526.83,200,20000);
		Teoria.Categoria categoria_H = new Teoria.Categoria(4229985.60,200,20000);
		public String determinarCategoriaMonotributo(int ingresos, int superficie, int energia) {
			if(ingresos < categoria_A.maxIIBB && superficie < categoria_A.maxSuperficie && energia < categoria_A.maxEnergia ) {
				return "CATEGORIA A";
			}
			else if(ingresos < categoria_C.maxIIBB && superficie < categoria_C.maxSuperficie && energia < categoria_C.maxEnergia) {
				return "CATEGORIA C";
			}
			else if(ingresos < categoria_D.maxIIBB && superficie < categoria_D.maxSuperficie && energia < categoria_D.maxEnergia) {
				return "CATEGORIA D";
			}
			else if(ingresos < categoria_E.maxIIBB && superficie < categoria_E.maxSuperficie && energia < categoria_E.maxEnergia) {
				return "CATEGORIA E";
			}
			else if(ingresos < categoria_F.maxIIBB && superficie < categoria_F.maxSuperficie && energia < categoria_F.maxEnergia) {
				return "CATEGORIA F";
			}
			else if(ingresos < categoria_B.maxIIBB && superficie < categoria_B.maxSuperficie && energia < categoria_B.maxEnergia) {
				return "CATEGORIA B";
			}
			else if(ingresos < categoria_G.maxIIBB || superficie < categoria_G.maxSuperficie || energia < categoria_G.maxEnergia) {
				return "CATEGORIA G";
			}
			else return "CATEGORIA H";
		}
	}
	
	
	
	public static void main(String[] args) {
		Teoria.Usuario pedro = new Teoria.Usuario("Pedrito", 35702514, "Gutierrez 66");
		System.out.println(pedro.determinarCategoriaMonotributo(3500000, 50, 100));
		
		
	}
}
