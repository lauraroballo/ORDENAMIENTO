package arreglo_estructura;



import java.util.Arrays;
import javax.swing.JFrame;

public class Arreglo_Estructura extends JFrame {

    private int cantidadNumeros;
    private int cantidadAleatoria;
    private int numerosOrdenados;

    public int getNumerosOrdenados() {
        return numerosOrdenados;
    }

    public void setNumerosOrdenados(int numerosOrdenados) {
        this.numerosOrdenados = numerosOrdenados;
    }
    private int[] numerosAleatorios;

    public int[] getNumerosAleatorios() {
        return numerosAleatorios;
    }

    public void setNumerosAleatorios(int[] numerosAleatorios) {
        this.numerosAleatorios = numerosAleatorios;
    }
    private int[] burbujaOrdenado;
    private int[] insercionOrdenado;
    private int[] seleccionOrdenado;
    private int[] shellOrdenado;
    private int[] heapSortOrdenado;
    private int[] quickSortOrdenado;
    private GeneradorAleatorio generador;

    public Arreglo_Estructura(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
        this.cantidadAleatoria = cantidadNumeros;
        this.generador = new GeneradorAleatorio();
        this.numerosAleatorios = generador.generarNumerosAleatorios(this.cantidadAleatoria);
        this.ordenarNumeros();
    }

    public int getCantidadNumeros() {
        return cantidadNumeros;
    }

    public void setCantidadNumeros(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
    }

    public int getCantidadAleatoria() {
        return cantidadAleatoria;
    }

    public void setCantidadAleatoria(int cantidadAleatoria) {
        this.cantidadAleatoria = cantidadAleatoria;
        this.numerosAleatorios = generador.generarNumerosAleatorios(this.cantidadAleatoria);
    }

    

    public void setBurbujaOrdenado(int[] burbujaOrdenado) {
        this.burbujaOrdenado = burbujaOrdenado;
    }

    public int[] getBurbujaOrdenado() {
        return burbujaOrdenado;
    }

    public void setInsercionOrdenado(int[] insercionOrdenado) {
        this.insercionOrdenado = insercionOrdenado;
    }

    public int[] getInsercionOrdenado() {
        return insercionOrdenado;
    }
        public int[] getSeleccionOrdenado() {
        return seleccionOrdenado;
    }

    public int[] getShellOrdenado() {
        return shellOrdenado;
    }

    public int[] getHeapSortOrdenado() {
        return heapSortOrdenado;
    }

    public int[] getQuickSortOrdenado() {
        return quickSortOrdenado;
    }

     public void ordenarNumeros() {
        this.burbujaOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        this.insercionOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        this.seleccionOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        this.shellOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        this.heapSortOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        this.quickSortOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        

        generador.ordenarBurbuja(this.burbujaOrdenado);
        generador.ordenarInsercion(this.insercionOrdenado);
        generador.ordenarSeleccion(this.seleccionOrdenado);
        generador.ordenarShell(this.shellOrdenado);
        generador.ordenarHeapSort(this.heapSortOrdenado);
        generador.ordenarQuickSort(this.quickSortOrdenado, 0, this.quickSortOrdenado.length - 1);
    }
}
