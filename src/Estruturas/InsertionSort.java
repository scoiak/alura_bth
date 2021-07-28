package Estruturas;

public class InsertionSort implements OrdenacaoBase{

    @Override
    public void ordenarValores(){
        for (int i = 1; i < listaValores.size(); i++){
            int aux = listaValores.get(i);
            int j = i;
            while ((j > 0) && (listaValores.get(j-1) > aux)){
                this.listaValores.set(j, listaValores.get(j-1));
                j -= 1;
            }
            listaValores.set(j, aux);
        }
    }
}
