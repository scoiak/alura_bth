package Estruturas;

import java.util.ArrayList;
import java.util.List;

public interface OrdenacaoBase {
    List<Integer> listaValores = new ArrayList<Integer>();

    default List<Integer> getListaValores() {
        return listaValores;
    }

    default void gerarValores (int qtd){
        for(int i = 0; i < qtd; i++){
            this.listaValores.add((int) ((Math.random() * (1000 - 1)) + 1));
        }
    }

    default void ordenarValores(){
    }

    default void executar(int qtd){
        System.out.println("Executando rotina de ordenação: ");
        this.gerarValores(qtd);
        System.out.println(this.getListaValores());
        this.ordenarValores();
        System.out.println(this.getListaValores());
        System.out.println("Rotina finalizada com sucesso!");
    }
}
