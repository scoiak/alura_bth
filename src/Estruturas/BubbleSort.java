package Estruturas;

public class BubbleSort implements OrdenacaoBase {

    @Override
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
}
