/* public class Provas {

    private String aluno;
    private String disciplina;
    private float media;
    //private int provas[];
    private float prova1, prova2;
    

    public Provas(String al, String disc, float p1, float p2) {

        this.setAluno(al);
        this.setDisciplina(disc);
        this.setProva1(p1);
        this.setProva2(p2);

    }


    public void calculaMedia(){

        float pesoProva1 = 0.5f;
        float pesoProva2 = 1.0f;

        this.setMedia(((this.getProva1() * pesoProva1) + (this.getProva2()) * pesoProva2) / 2);

        System.out.println("Aluno: " + this.getAluno());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Prova 1: " + this.getProva1());
        System.out.println("Peso: " + pesoProva1);
        System.out.println("Prova 2: " + this.getProva2());
        
        System.out.println("Média: " + media);

    }


    //GETTERS N SETTERS

    public float getMedia(){

        return this.media;

    }

    public void setMedia(float m){

        this.media = m;

    }


    public String getAluno(){

        return this.aluno;
    }

    public void setAluno(String a){

        this.aluno = a;

    }


    public String getDisciplina(){

        return disciplina;

    }

    public void setDisciplina(String disc){

        this.disciplina = disc;

    }


    
    public float getProva1() {
        return prova1;
    }

    public void setProva1(float p1) {
        this.prova1 = p1;
    }


    public float getProva2() {
        return prova2;
    }

    public void setProva2(float p2) {

        this.prova2 = p2;


    }

    
    /*

        public float getProvas1() {
            return provas[0];
        }

        public void setProvas2(float provas2) {
            this.provas[1] = provas2;
        }


        public float getProva2() {
            return prova2;
        }

        public void setProva2(float p2) {

            this.prova2 = p2;


        }

    */

