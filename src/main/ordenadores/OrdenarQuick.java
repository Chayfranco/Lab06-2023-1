package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo = array[inicio];
        int i = inicio;

        for (int j = inicio + 1; j <= fim; j++){
            if (array[j] <= pivo){
                i+=1;
            int lugar = array[i];
            array[i] = array[j];
            array[j] = lugar;
         
            }
        }
        return i;
    }

}
