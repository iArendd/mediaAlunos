public class Aluno{

    private int nomeAluno;


    //CONSTRUCTOR

    public Aluno(int aluno){

        this.setNomeAluno(aluno);

    }

    
    //METHODS
    
    public void mostrarAluno(){

        System.out.println("Aluno ID: " + nomeAluno);

    }

    //GETTERS N SETTERS

    public int getNomeAluno() {

        return nomeAluno;

    }

    public void setNomeAluno(int aluno) {

        this.nomeAluno = aluno;

    }

    
}