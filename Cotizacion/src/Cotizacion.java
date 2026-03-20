/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Cotizacion { 

    // atributos
    private int folio;
    private String descripcionAuto;
    private float precio;
    private float porcentajePagoInicial;
    private int plazo;

    // constructores

    public Cotizacion() {
        this.folio = 0;
        this.descripcionAuto = "";
        this.precio = 0.0f;
        this.porcentajePagoInicial = 0.0f;
        this.plazo = 0;
    }

    public Cotizacion(int folio, String descripcionAuto, float precio, float porcentajePagoInicial, int plazo) {
        this.folio = folio;
        this.descripcionAuto = descripcionAuto;
        this.precio = precio;
        this.porcentajePagoInicial = porcentajePagoInicial;
        this.plazo = plazo;
    }

    public Cotizacion(Cotizacion x) {
        this.folio = x.folio;
        this.descripcionAuto = x.descripcionAuto;
        this.precio = x.precio;
        this.porcentajePagoInicial = x.porcentajePagoInicial;
        this.plazo = x.plazo;
    }

    // getters y setters (todos juntos)

    public int getFolio() {
        return this.folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcionAuto() {
        return this.descripcionAuto;
    }

    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPorcentajePagoInicial() {
        return this.porcentajePagoInicial;
    }

    public void setPorcentajePagoInicial(float porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    public int getPlazo() {
        return this.plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    // métodos de cálculo (abajo como dijiste)

    public float calcularPagoInicial() {
        return this.precio * 
                (this.porcentajePagoInicial / 100);
    }

    public float calcularTotalFin() {
        return this.precio - this.calcularPagoInicial();
    }

    public float calcularPagoMensual() {
        if (this.plazo == 0) {
            return 0;
        }
        return this.calcularTotalFin() / this.plazo;
    }

    // imprimir

    public void imprimirCotizacion() {
        System.out.println("Folio: " + this.folio);
        System.out.println("Auto: " + this.descripcionAuto);
        System.out.println("Precio: " + this.precio);
        System.out.println("Porcentaje inicial: " + this.porcentajePagoInicial + "%");
        System.out.println("Plazo: " + this.plazo + " meses");
        System.out.println("Pago inicial: " + this.calcularPagoInicial());
        System.out.println("Total a financiar: " + this.calcularTotalFin());
        System.out.println("Pago mensual: " + this.calcularPagoMensual());
    }
}
    

