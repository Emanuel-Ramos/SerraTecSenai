package MainPessoas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.Pessoa;
import Classes.Pet;

public class MainPessoa {

	public static void main(String[] args) {
		Scanner sc;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Pessoa> pessoas = new ArrayList<>();
		
		try {
			sc = new Scanner(new File("C:\\Users\\Emanuel\\Desktop\\Senai\\Java\\exercicioArquivo\\src\\Pessoas.txt"));
			Pessoa pessoa = null;
			while(sc.hasNext()) {
				String linha = sc.nextLine();
				if(!linha.isEmpty()) {
					if(pessoa != null) {
                        String[] dadosPet = linha.split(";");
                        String nomePet = dadosPet[0];
                        Pet p = new Pet(nomePet);
                        pessoa.getPets().add(p);
                        continue;

					} else {
						String[] dadosLinha = linha.split(";");
		                String nome = dadosLinha[0];
		                int idade = Integer.parseInt(dadosLinha[1]);
		                LocalDate data = LocalDate.parse(dadosLinha[2], df);		                
		                pessoa = new Pessoa(nome, idade, data);
					}						

				} else {
					pessoas.add(pessoa);
					pessoa = null;
				}
				
			}pessoas.add(pessoa);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\\\Users\\\\Emanuel\\\\Desktop\\\\Senai\\\\Java\\\\aulaArquivos\\\\src\\\\Arquivos\\\\teste.txt", true));
			for (Pessoa pessoa : pessoas) {
                if(pessoa != null) {
                	out.append(pessoa.toString() + "\n");
                }
            }
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Pessoa pessoa : pessoas) {
            if(pessoa != null) {
            	System.out.println(pessoa);
            }
	}
		
}}
