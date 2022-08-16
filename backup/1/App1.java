/*import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de inserções: ");
        int quantInsercoes = leitor.nextInt();


        String disciplina[] = new String[quantInsercoes];
        String nomeAluno[] = new String[quantInsercoes];
        float notaProvas[] = new float[quantInsercoes];
        

        for(int i = 0; i < quantInsercoes; i++){

            System.out.println("===== Digite o nome do aluno " + (i+1) + " ======");
            nomeAluno[i] = leitor.next();

            System.out.println("===== Digite o nome da disciplina do aluno " + (i+1) + " =====");
            disciplina[i] = leitor.next();


            int incremento = i +1;
            int j2 = 0;

            Provas aluno[] = new Provas[incremento];

            for(int j1 = 0; j1 < quantInsercoes; j1++){

                System.out.println("===== Digite a nota da prova" + (i+1) + " do aluno " + (i+1) + " ======");
                notaProvas[j1] = leitor.nextFloat();

                aluno[i] = new Provas(
                    
                    nomeAluno[i],
                    disciplina[i],
                    notaProvas[j1],
                    notaProvas[j2]
                    
                ); 

            }

            aluno[i].calculaMedia(); 

            
        }
        
    }
}
        //Aluno 1
            /*
            System.out.println("Informe a disciplina");
            disciplina[0] = leitor.nextLine();
            aluno[0] = new Provas(
                
                "João",
                disciplina[0],
                8.5f,
                7.0f
                
            ); 
            aluno[0].calculaMedia();


        //Aluno 2

            System.out.println("Informe a disciplina");
            disciplina[1] = leitor.nextLine();
            aluno[1] = new Provas(
                
                "Alfredo",
                disciplina[1],
                8.5f,
                7.0f
                
            ); 
            aluno[1].calculaMedia();
            System.out.println("=========");
        */

        


