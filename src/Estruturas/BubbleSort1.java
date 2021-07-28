package Estruturas;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort1 {
    private List<Integer> listaValores = new ArrayList<Integer>();

    public List<Integer> getListaValores() {
        return listaValores;
    }

    public void gerarValores (int qtd){
        for(int i = 0; i < qtd; i++){
            this.listaValores.add((int) ((Math.random() * (1000 - 1)) + 1));
        }
    }

    public void ordenarValores(){
        int aux = 0;
        for(int i = 0; i <= this.listaValores.size(); i++){
            for(int j = 0; j < (this.listaValores.size() - 1); j++){
                if(this.listaValores.get(j) > this.listaValores.get(j + 1)){
                    aux = this.listaValores.get(j);
                    this.listaValores.set(j, this.listaValores.get(j + 1));
                    this.listaValores.set(j + 1, aux);
                }
            }
        }
    }

    public void executar(int qtd){
        System.out.println("Executando BubbleSort 1: ");
        this.gerarValores(qtd);
        System.out.println(this.getListaValores());
        this.ordenarValores();
        System.out.println(this.getListaValores());
        System.out.println("Rotina finalizada com sucesso!");
    }
}
