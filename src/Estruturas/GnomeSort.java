package Estruturas;

public class GnomeSort implements OrdenacaoBase{
    @Override
    public void ordenarValores(){
        int i = 1;
        while(i < this.listaValores.size()){
            if(i == 0 || listaValores.get(i - 1).compareTo(listaValores.get(i)) <= 0){
                i++;
            } else {
                int aux = listaValores.get(i - 1);
                listaValores.set(i-1, listaValores.get(i));
                listaValores.set(i, aux);
                i--;
            }

        }
    }
}
