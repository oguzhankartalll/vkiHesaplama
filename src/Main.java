import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		double boy,kg,vki;

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen Boyunuzu Giriniz(MT-1.72-):");
		boy = input.nextDouble();

		System.out.print("Lütfen Kilonuzu Giriniz(KG-110-):");
		kg = input.nextDouble();

		vki = kg / (boy * boy);

		System.out.println("VKİ'niz:" + vki);
	}
}