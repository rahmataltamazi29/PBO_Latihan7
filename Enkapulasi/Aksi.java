import java.util.Scanner;


public class Aksi {
	public static void main(String args[]){
		String NIK,Nama,JenisKelamin;
		int Umur;
		String NIM,Fakultas,Jurusan;
		double Tugas1,Tugas2,Tugas3;
		double UTS,UAS;
		double hasil;
		
		Mahasiswa MHS = new Mahasiswa();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukkan NIK : ");
		NIK = sc.nextLine();
		System.out.print("masukkan nama anda : ");
		Nama = sc.nextLine();
		System.out.println("Masukkan jenis kelamin: ");
		JenisKelamin = sc.nextLine();
		System.out.println("Masukkan umur: ");
		Umur = sc.nextInt();
		
		NIM =  sc.nextLine();
		System.out.println("Masukkan NIM: ");
	    NIM =  sc.nextLine();
		System.out.println("Masukkan Fakultas: ");
		Fakultas = sc.nextLine();
	
		
		System.out.println("Masukkan Jurusan: ");
		Jurusan = sc.nextLine();
		
		System.out.println("Masukkan TGS1: ");
		Tugas1 = sc.nextDouble();
		System.out.println("Masukkan TGS2: ");
		Tugas2 = sc.nextDouble();
		System.out.println("Masukkan TGS3: ");
		Tugas3 = sc.nextDouble();
		System.out.println("Masukkan UTS: ");
		UTS = sc.nextDouble();
		System.out.println("Masukkan UAS: ");
		UAS = sc.nextDouble();
		
		
		MHS.identitas(NIK,Nama,JenisKelamin,Umur);
		MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
		MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3, UTS, UAS);
		
		
	}
}