
import java.util.Locale;
import java.util.Scanner;


public class Questao001 {
    public static void main(String[] args) {
    /*
    Faça um programa que leia cinco grupos de quatro valores (A, B, C, D) e mostre-os na ordem lida.
    Em seguida, organize-os em ordem crescente e decrescente.
    */
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
        //Dados recebidos sobre o grupo 1
        int grupo1 = 4;
        int[] vetor1;
        vetor1 = new int[grupo1];
        int auxiliar1 = 0;
        int auxiliar2 = 0;
        
        for(int i = 0; i < grupo1; i++){
            System.out.print("Insira o "+(i+1)+ "º valor do Grupo 1: ");
            vetor1[i] = sc.nextInt();
            
        }
        
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");
        
        //Dados recebidos sobre o grupo 2
        int grupo2 = 4;
        int[] vetor2;
        vetor2 = new int[grupo2];
        int auxiliar3 = 0;
        int auxiliar4 = 0;
        
        for(int i = 0; i < grupo2; i++){
            System.out.print("Insira o "+(i+1)+ "º valor do Grupo 2: ");
            vetor2[i] = sc.nextInt();
            
        }
         
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");
        
        //Dados recebidos sobre o grupo 3
        int grupo3 = 4;
        int[] vetor3;
        vetor3 = new int[grupo3];
        int auxiliar5 = 0;
        int auxiliar6 = 0;
        
        for(int i = 0; i < grupo3; i++){
            System.out.print("Insira o "+(i+1)+ "º valor do Grupo 3: ");
            vetor3[i] = sc.nextInt();
            
        }
        
         
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");
        
         //Dados recebidos sobre o grupo 4
        int grupo4 = 4;
        int[] vetor4;
        vetor4 = new int[grupo4];
        int auxiliar7 = 0;
        int auxiliar8 = 0; 
        
        for(int i = 0; i < grupo4; i++){
            System.out.print("Insira o "+(i+1)+ "º valor do Grupo 4: ");
            vetor4[i] = sc.nextInt();
            
        }
        
         
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");
        
         //Dados recebidos sobre o grupo 5
        int grupo5 = 4;
        int[] vetor5;
        vetor5 = new int[grupo5];
        int auxiliar9 = 0;
        int auxiliar10 = 0; 
        
        for(int i = 0; i < grupo5; i++){
            System.out.print("Insira o "+(i+1)+ "º valor do Grupo 5: ");
            vetor5[i] = sc.nextInt();
            
        }
        
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");
        
        
        System.out.println(" Valores que você informou para o Grupo 1: "+vetor1[0]+" "+vetor1[1]+" "+vetor1[2]+" "+vetor1[3]);
        System.out.println(" Valores que você informou para o Grupo 2: "+vetor2[0]+" "+vetor2[1]+" "+vetor2[2]+" "+vetor2[3]);
        System.out.println(" Valores que você informou para o Grupo 3: "+vetor3[0]+" "+vetor3[1]+" "+vetor3[2]+" "+vetor3[3]);
        System.out.println(" Valores que você informou para o Grupo 4: "+vetor4[0]+" "+vetor4[1]+" "+vetor4[2]+" "+vetor4[3]);
        System.out.println(" Valores que você informou para o Grupo 5: "+vetor5[0]+" "+vetor5[1]+" "+vetor5[2]+" "+vetor5[3]);
        
        //GRUPO 1
          for(int i = 0; i < grupo1; i++){
            
            for(int j = 0; j < grupo1; j++){
                
                if(vetor1[j] > vetor1[i]){
                    auxiliar1 = vetor1[i];
                    vetor1[i] = vetor1[j];
                    vetor1[j] = auxiliar1;
                
                }
            
            }
        
        }
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("               GRUPO 1               ");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Em ordem CRESCENTE: ");
        
        
        for(int j = 0; j < grupo1; j++){
        System.out.println(vetor1[j]);
        }
        
        
        System.out.println("");
        System.out.println("Em ordem DECRESCENTE: ");
        
         for(int a = 1; a < grupo1; a++){
            
            for(int b = 0; b < a; b++){
                
                if(vetor1[a] > vetor1[b]){
                    auxiliar2 = vetor1[a];
                    vetor1[a] = vetor1[b];
                    vetor1[b] = auxiliar2;
                
                }
            
            }
        
        }
        
         for(int b = 0; b < grupo1; b++ ){
             System.out.print(vetor1[b]);
             System.out.println("");
             
         }
        
       //GRUPO 2
          for(int i = 0; i < grupo2; i++){
            
            for(int j = 0; j < grupo2; j++){
                
                if(vetor2[j] > vetor2[i]){
                    auxiliar3 = vetor2[i];
                    vetor2[i] = vetor2[j];
                    vetor2[j] = auxiliar3;
                
                }
            
            }
        
        }
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("               GRUPO 2               ");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Em ordem CRESCENTE: ");
        
        
        for(int j = 0; j < grupo2; j++){
        System.out.println(vetor2[j]);
        }
        
        
        System.out.println("");
        System.out.println("Em ordem DECRESCENTE: ");
        
         for(int a = 1; a < grupo2; a++){
            
            for(int b = 0; b < a; b++){
                
                if(vetor2[a] > vetor2[b]){
                    auxiliar4 = vetor2[a];
                    vetor2[a] = vetor2[b];
                    vetor2[b] = auxiliar4;
                
                }
            
            }
        
        }
        
         for(int b = 0; b < grupo2; b++ ){
             System.out.print(vetor2[b]);
             System.out.println("");
             
         }
        
         //GRUPO 3
          for(int i = 0; i < grupo3; i++){
            
            for(int j = 0; j < grupo3; j++){
                
                if(vetor3[j] > vetor3[i]){
                    auxiliar5 = vetor3[i];
                    vetor3[i] = vetor3[j];
                    vetor3[j] = auxiliar5;
                
                }
            
            }
        
        }
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("               GRUPO 3               ");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Em ordem CRESCENTE: ");
        
        
        for(int j = 0; j < grupo3; j++){
        System.out.println(vetor3[j]);
        }
        
        
        System.out.println("");
        System.out.println("Em ordem DECRESCENTE: ");
        
         for(int a = 1; a < grupo3; a++){
            
            for(int b = 0; b < a; b++){
                
                if(vetor3[a] > vetor3[b]){
                    auxiliar6 = vetor3[a];
                    vetor3[a] = vetor3[b];
                    vetor3[b] = auxiliar6;
                
                }
            
            }
        
        }
        
         for(int b = 0; b < grupo3; b++ ){
             System.out.print(vetor3[b]);
             System.out.println("");
             
         }
     
         //GRUPO 4
          for(int i = 0; i < grupo4; i++){
            
            for(int j = 0; j < grupo4; j++){
                
                if(vetor4[j] > vetor4[i]){
                    auxiliar7 = vetor4[i];
                    vetor4[i] = vetor4[j];
                    vetor4[j] = auxiliar7;
                
                }
            
            }
        
        }
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("               GRUPO 4               ");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Em ordem CRESCENTE: ");
        
        
        for(int j = 0; j < grupo4; j++){
        System.out.println(vetor4[j]);
        }
        
        
        System.out.println("");
        System.out.println("Em ordem DECRESCENTE: ");
        
         for(int a = 1; a < grupo4; a++){
            
            for(int b = 0; b < a; b++){
                
                if(vetor4[a] > vetor4[b]){
                    auxiliar8 = vetor4[a];
                    vetor4[a] = vetor4[b];
                    vetor4[b] = auxiliar8;
                
                }
            
            }
        
        }
        
         for(int b = 0; b < grupo4; b++ ){
             System.out.print(vetor4[b]);
             System.out.println("");
             
         }
   
         //GRUPO 5
          for(int i = 0; i < grupo5; i++){
            
            for(int j = 0; j < grupo5; j++){
                
                if(vetor5[j] > vetor5[i]){
                    auxiliar9 = vetor5[i];
                    vetor5[i] = vetor5[j];
                    vetor5[j] = auxiliar9;
                
                }
            
            }
        
        }
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("               GRUPO 5               ");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Em ordem CRESCENTE: ");
        
        
        for(int j = 0; j < grupo5; j++){
        System.out.println(vetor5[j]);
        }
        
        
        System.out.println("");
        System.out.println("Em ordem DECRESCENTE: ");
        
         for(int a = 1; a < grupo5; a++){
            
            for(int b = 0; b < a; b++){
                
                if(vetor5[a] > vetor5[b]){
                    auxiliar10 = vetor5[a];
                    vetor5[a] = vetor5[b];
                    vetor5[b] = auxiliar10;
                
                }
            
            }
        
        }
        
         for(int b = 0; b < grupo5; b++ ){
             System.out.print(vetor5[b]);
             System.out.println("");
             
         }
   
 
        
        sc.close();
    }
   
        
    
}
