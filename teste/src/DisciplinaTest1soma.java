import java.util.HashMap;


public class DisciplinaTest1soma {

    float soma = 0;
    public float somaEsperada;

    HashMap<Integer, Integer> provas = new HashMap<Integer, Integer>();

    public DisciplinaTest1soma(float somaEsp){

        this.setSomaEsperada(somaEsp);
    }


    public void gerarSomaTeste(int quantProvas, int notaBase){

        for(int i = 0; i < quantProvas; i++){

            
            int nota = notaBase;            

            provas.put(i, nota);

            soma = soma + nota;

        }

        if(somaEsperada == soma){

            System.out.println("O teste foi aprovado! O valor esperado: " + somaEsperada + " é igual ao resultado obtido: " + soma);

        }else{

            System.out.println("O teste foi recusado, o valor esperado: " + somaEsperada + " é diferente do resultado obtido: " + soma);

        }

    }


    public float getSomaEsperada() {
        return somaEsperada;
    }


    public void setSomaEsperada(float somaEsperada) {
        this.somaEsperada = somaEsperada;
    }


    
    
}
