/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan18.kelipatan;

/**
 *
 * * @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: menampilkan kelipatan 3.5 sampai 35
 */
public class IF110118008Latihan18Kelipatan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		double a = 3.5, b = 0;
		for (int i = 1; i <= 10; i++, b = a * i)
			System.out.println(b);

	}
	
}
