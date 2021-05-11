package MainArquivos;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MainArquivo {
	public static void main(String[] args) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\\\Users\\\\Emanuel\\\\Desktop\\\\Senai\\\\Java\\\\aulaArquivos\\\\src\\\\Arquivos\\\\teste.txt", true));
			out.append("Exemplo de saída de arquivo");
			out.append("\nfeito no dia 10/05.");
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//	public static void main(String[] args) {
//		File arquivo = new File("C:\\Users\\Emanuel\\Desktop\\Senai\\Java\\aulaArquivos\\src\\Arquivos\\teste.txt");
//		
//		Scanner ler;
//		try {
//			ler = new Scanner(new InputStreamReader(new FileInputStream(arquivo),"UTF-8"));
//			while (ler.hasNext()) {
//				System.out.println(ler.nextLine());
//			}
//			ler.close();
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//	}
}
