
import java.util.HashMap;


public class DisciplinaTest2media {
    
    float soma = 0;
    float media = 0;
    float mediaEsperada;
    
    HashMap<Integer, Integer> provas = new HashMap<Integer, Integer>();


    public DisciplinaTest2media(float mediaEsp){

        this.setMediaEsperada(mediaEsp);
    }


    public void gerarMediaTeste(int quantProvas, int notaBase){

        /*int quantProvas = 2;
        int notaBase = 7;*/

        
        for(int i = 0; i < quantProvas; i++){

            int nota = notaBase;            

            provas.put(i, nota);

            soma = soma + nota;

        }

        media = soma / quantProvas;

        if(mediaEsperada == media){

            System.out.println("O teste foi aprovado! O valor esperado: " + mediaEsperada + " é igual ao resultado obtido: " + media);
    
        }else{
    
            System.out.println("O teste foi recusado, o valor esperado: " + mediaEsperada + " é diferente do resultado obtido: " + media);
    
        }

    }


    public float getMediaEsperada() {
        return mediaEsperada;
    }


    public void setMediaEsperada(float mediaEsperada) {
        this.mediaEsperada = mediaEsperada;
    }

    
    


    
}

