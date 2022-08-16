import java.util.HashMap;
import java.util.Random;

public class Disciplina {

    private String nomeDisciplina;
    private String aluno;
    private float media;
    HashMap<Integer, Integer> provas = new HashMap<Integer, Integer>();


    Random aleatorio = new Random();


    public Disciplina(String nomeDisc, String nomeAluno) {

        this.setNomeDisciplina(nomeDisc);
        this.setAluno(nomeAluno);

    }

    public void mostrar(){

        System.out.println("Disciplina: " + this.getNomeDisciplina());
        System.out.println("Aluno: " + this.getAluno());
        System.out.println("Provas: " + this.getProvas());

        
        System.out.println("A média é: " + media);

        System.out.println("==========");

    }

    public void gerarProvas(){

        int auxilio = 5;
        float soma = 0;

        for(int i = 0; i < auxilio; i++){

            int nota = aleatorio.nextInt(10);

            provas.put(i, nota);

            soma = soma + nota;

            //System.out.println("Prova "+ (i+1) + " " + soma);
            //System.out.println(pr.get(i));

        }

        System.out.println("==========");

        media = soma / auxilio;

    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }


    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    public String getAluno() {
        return aluno;
    }


    public void setAluno(String aluno) {
        this.aluno = aluno;
    }


    public HashMap<Integer, Integer> getProvas() {
        return provas;
    }

    /*
    public void setProvas(HashMap<Integer, Integer> pr) {

        int auxilio = 5;

        for(int i = 0; i < auxilio; i++){

            int contador = i + 1;

            pr.put(i, contador);

            //System.out.println(pr.get(i));

        }

        this.provas = pr;
    }
    */
    
    
    
}
