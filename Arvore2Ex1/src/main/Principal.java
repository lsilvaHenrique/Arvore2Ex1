package main;

import br.edu.fateczl.arvoreint.*;

public class Principal {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.insert(30);
        arvore.insert(15);
        arvore.insert(10);
        arvore.insert(20);
        arvore.insert(60);
        arvore.insert(40);
        arvore.insert(80);
        
        try {
            System.out.println("Travessia Pré-Ordem:");
            arvore.prefixSearch();
            
            System.out.println("\nTravessia Em Ordem (Crescente):");
            arvore.infixSearch();
            
            System.out.println("\nTravessia Pós-Ordem:");
            arvore.postfixSearch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

