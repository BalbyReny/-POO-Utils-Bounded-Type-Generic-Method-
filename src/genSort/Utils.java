package genSort;

public final class Utils
{
    private Utils(){} //Esta clase no se necesita instanciar so-
    
    private static <T extends Number> void quickSort(T arr[], int low, int high) /*Implementación del Algoritmo QuickSort.
    Funciona con cualquier array cuyo tipo herede de la clase Number, y sus index más bajo y más alto como enteros.*/
    {
        T pivot = arr[low]; //Utilizar el elemento del index más bajo como pivote o guía
        int i = low;
        int j = high;
        T aux; //Variable auxiliar de tipo genérico (pero heredando de Number)
        //Búsquedas e intercambios sobre y por debajo del elemento pivote
        while (i < j) {
            while (arr[i].floatValue() <= pivot.floatValue() && i < j) { 
                i++;
            }
            while (arr[j].floatValue() > pivot.floatValue()) {
                j--;
            }
            if (i < j) {
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        //Uso de recursión para repetir el proceso en ambas direcciones hasta tener arrays individuales (?) ordenados correctamente.
        if (low < j - 1) {
            quickSort(arr, low, j-1);
        }
        if (j + 1 < high) {
            quickSort(arr, j+1, high);
        }
    }
    
    public static <U> void printArray(U arr[]) //Método que itera e imprime del array (funciona con cualquier tipo)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println("\n");
    }

    public static <T extends Number> void quickSort(T arr[]) //Sobrecarga del método quickSort original para utilizarse más fácil
    {
        quickSort(arr, 0, arr.length-1); //llamada a quickSort con todos sus argumentos
    }
}    