import java.util.HashMap;
import java.util.Random;

public class Disciplina {

    private String nomeDisciplina;
    private float media;

    HashMap<Integer, Integer> provas = new HashMap<Integer, Integer>();


    private Random aleatorio = new Random();


    public Disciplina(String nomeDisc) {

        this.setNomeDisciplina(nomeDisc);

    }

    public void mostrar(){

        System.out.println("Disciplina: " + this.getNomeDisciplina());
        //System.out.println("Aluno: " + this.getAluno());
        System.out.println("Provas: " + this.getProvas());

        
        System.out.println("A média é: " + media);

    }

    public void gerarProvas(){

        int quantProvas = 5;
        float soma = 0;

        for(int i = 0; i < quantProvas; i++){

            int nota = aleatorio.nextInt(10);

            float peso = 0;

            //Checks if the index is even or odd to bring weight of note
            if(i %2 == 0){

                peso = 0.5f;

            }else{

                peso = 1f;
            }

            //Insert index and teste grade
            provas.put(i, nota);

            //Sum note one by one and multiply with weight of note
            soma = soma + (nota * peso);
            
            /*System.out.println("Prova "+ (i+1) + " | Nota: " + nota);
            System.out.println("Prova "+ (i+1) + " | Peso: " + peso);
            System.out.println("Prova "+ (i+1) + " | Soma: " + soma);*/

        }

        media = soma / quantProvas;

    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }


    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    public HashMap<Integer, Integer> getProvas() {
        return provas;
    }

  
    
}
