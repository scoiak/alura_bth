package Estruturas;

public class TesteArray {
    public static void main(String[] args) {
        /*
         * ARRAY
         */
        int [] vetorInteiros = new int[5];
        vetorInteiros[0] = 123;

        // Imprime o valor da posição indicada
        System.out.println(vetorInteiros[0]);

        // Quando nenhum valor foi passado para a posição, retorna zero
        System.out.println(vetorInteiros[1]);

        // Imprimie o valor do ponteiro
        System.out.println(vetorInteiros);

        // Imprime tamanho do array
        System.out.println(vetorInteiros.length);

        // Insere um valor em casa posição
        for(int i = 0; i < vetorInteiros.length; i++){
            vetorInteiros[i] = i * i;
            System.out.println(vetorInteiros[i] );
        }
    }
}
