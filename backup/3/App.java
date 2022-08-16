
public class App {

    public static void main(String[] args){


        Disciplina disciplina[] = new Disciplina[2];

        disciplina[0] = new Disciplina("Historia", "Matheus");
        
        disciplina[0].gerarProvas();
        disciplina[0].mostrar();

        disciplina[1] = new Disciplina("Historia", "Alex");
        
        disciplina[1].gerarProvas();
        disciplina[1].mostrar();
        
    }
}
