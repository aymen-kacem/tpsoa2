package Service;

public class BanqueService {
	public double conversion(double montant) {
		return montant*3*3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanqueService b=new BanqueService();
		double montant = 0;
		System.out.println("le montant apres la conversion est :"+b.conversion(montant));
		

}
}


