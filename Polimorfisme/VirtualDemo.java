public class VirtualDemo{
	public static void main(String[]args){
		Gaji s=new Gaji("Jervin","monginsidi",3,5000.00);
		
		pegawai e = new Gaji("wahyu","samarinda",2,2500.00);
		
		System.out.println("Memanggil mailCheck Berdasarkan referensi gaji --");
		
		s.mailcheck();
		
		System.out.println("\nMemanggil mailCheck Berdasarkan referensi pegawai--");
		
		e.mailcheck();
	}
}