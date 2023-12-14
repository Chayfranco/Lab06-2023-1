package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
    if (array == null || array.length == 0) {
        return array;
    }
    int maior = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] >maior) {
           maior = array[i];
        }
    }
    int[] arrayNovo = new int[maior + 1];
    for (int i = 0; i < array.length; i++) {
        arrayNovo[array[i]]++;
    }
    int j = 0;
    for (int i = 0; i <=maior; i++) {
        while (arrayNovo[i] > 0) {
            array[j++] = i;
            arrayNovo[i]--;
        }
    }

    return array;
}

}
