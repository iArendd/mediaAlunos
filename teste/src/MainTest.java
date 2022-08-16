public class MainTest {

    public static void main(String[] args){

        System.out.println("=====TESTE DE SOMA 1==========================================");

        DisciplinaTest1soma testeSoma1 = new DisciplinaTest1soma(14);
        
        testeSoma1.gerarSomaTeste(2,7);


        System.out.println("  ");

        System.out.println("=====TESTE DE SOMA 2==========================================");

        DisciplinaTest1soma testeSoma2 = new DisciplinaTest1soma(20);
        
        testeSoma2.gerarSomaTeste(2,10);


        System.out.println("  ");



        /*-------------------------------------------------------------------- */

        System.out.println("=====TESTE DE MEDIA 1==========================================");

        DisciplinaTest2media testeMedia1 = new DisciplinaTest2media(7);
        
        testeMedia1.gerarMediaTeste(2,7);


        System.out.println("  ");


        System.out.println("=====TESTE DE MEDIA 2==========================================");

        DisciplinaTest2media testeMedia2 = new DisciplinaTest2media(9);
        
        testeMedia2.gerarMediaTeste(2,9);


        System.out.println("  ");


    }
    
    
}
