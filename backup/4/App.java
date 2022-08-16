
public class App {

    public static void main(String[] args){

        int quantDisciplina = 8;
        int quantAlunos = 1;
        String nomeDisciplina = "";

        Disciplina disciplina[] = new Disciplina[quantDisciplina];
        Aluno aluno[] = new Aluno[quantAlunos];

        //Disciplina
        for(int i = 0;  i < quantDisciplina; i++){

            if(i == 0){

                nomeDisciplina = "Portugês";

            }else if(i == 1){

                nomeDisciplina = "Matemática";

            }else if(i == 2){

                nomeDisciplina = "História";

            }else if(i == 3){
                
                nomeDisciplina = "Geografia";

            }else if(i == 4){

                nomeDisciplina = "Física";

            }else if(i == 5){

                nomeDisciplina = "Química";
                
            }else if(i == 6){
                
                nomeDisciplina = "Inglês";

            }else{

                nomeDisciplina = "Matéria inválida";

            }

            disciplina[i] = new Disciplina(nomeDisciplina);


            //Aluno
            for(int j = 0; j < quantAlunos; j++){

                aluno[j] = new Aluno(j);
                
                
                System.out.println("==========");
                
                aluno[j].mostrarAluno();
                disciplina[i].gerarProvas();
                disciplina[i].mostrar();

                System.out.println("==========");
                
            }
            

        }
        
    }
}
