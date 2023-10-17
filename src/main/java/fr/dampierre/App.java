package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);

        // 1. Salaire initiale 400euro

        int salaireinitiale = 400;

        // 3. Quota de vente pour la prime = 10 sur 1semaine

       System.out.println("Entrez le quota du commercial :");
       int quotacommercial = clavier.nextInt();

        // 4. SI le nombre de vente = Quota alors ajouter au salaire la prime

        if (quotacommercial >= 10){
            quotacommercial = salaireinitiale + 250;
        };

        // 5. Afficher le salaire

        System.out.println("Le salaire du commercial est :" + quotacommercial);



    }
    
}
