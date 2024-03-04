package arreglo_estructura;

public class GeneradorAleatorio {
    
    public int[] generarNumerosAleatorios(int cantidadAleatoria) {
        int[] numerosAleatorios = new int[cantidadAleatoria];
        for (int i = 0; i < cantidadAleatoria; i++) {
            numerosAleatorios[i] = (int) (Math.random() * cantidadAleatoria); 
        }
        return numerosAleatorios;
    }

    public void ordenarBurbuja(int[] numeros) {
         long tiempoInicio = System.nanoTime();
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
                long tiempoFin = System.nanoTime();
        long duracionNanosegundos = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución de BURBUJA en nanosegundos: " + duracionNanosegundos);

    }

    public void ordenarInsercion(int[] numeros) {
          long tiempoInicio = System.nanoTime();
        int n = numeros.length;
        for (int i = 1; i < n; ++i) {
            int key = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = key;
        }
         long tiempoFin = System.nanoTime();
        long duracionNanosegundos = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución de INSERCION en nanosegundos: " + duracionNanosegundos);

    }
    
     public void ordenarSeleccion(int[] numeros) {
         long tiempoInicio = System.nanoTime();
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }
                 long tiempoFin = System.nanoTime();
        long duracionNanosegundos = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución de SELECCION en nanosegundos: " + duracionNanosegundos);
    }
    
    // Ejemplo de ordenación por Shell
    public void ordenarShell(int[] numeros) {
        long tiempoInicio = System.nanoTime();
        int n = numeros.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = numeros[i];
                int j;
                for (j = i; j >= gap && numeros[j - gap] > temp; j -= gap) {
                    numeros[j] = numeros[j - gap];
                }
                numeros[j] = temp;
            }
        }
                 long tiempoFin = System.nanoTime();
        long duracionNanosegundos = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución de SHELL en nanosegundos: " + duracionNanosegundos);
    }

    // Ejemplo de ordenación por HeapSort
    public void ordenarHeapSort(int[] numeros) {
        long tiempoInicio = System.nanoTime();
        int n = numeros.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(numeros, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = numeros[0];
            numeros[0] = numeros[i];
            numeros[i] = temp;
            heapify(numeros, i, 0);
        }
         long tiempoFin = System.nanoTime();
        long duracionNanosegundos = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución de HEAPSORT en nanosegundos: " + duracionNanosegundos);
    }

    private void heapify(int[] numeros, int n, int i) {
      
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && numeros[left] > numeros[largest]) {
            largest = left;
        }

        if (right < n && numeros[right] > numeros[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = numeros[i];
            numeros[i] = numeros[largest];
            numeros[largest] = swap;

            heapify(numeros, n, largest);
        }
 
    }

    // Ejemplo de ordenación por QuickSort
    public void ordenarQuickSort(int[] numeros, int low, int high) {
        long tiempoInicio = System.nanoTime();
        if (low < high) {
            int partitionIndex = partition(numeros, low, high);
            ordenarQuickSort(numeros, low, partitionIndex - 1);
            ordenarQuickSort(numeros, partitionIndex + 1, high);
        }
            long tiempoFin = System.nanoTime();
        long duracionNanosegundos = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución de QUOCK SORT en nanosegundos: " + duracionNanosegundos);
    }
    
    private int partition(int[] numeros, int low, int high) {
        int pivot = numeros[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numeros[j] < pivot) {
                i++;
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
        int temp = numeros[i + 1];
        numeros[i + 1] = numeros[high];
        numeros[high] = temp;
        return i + 1;
    }
     
}
