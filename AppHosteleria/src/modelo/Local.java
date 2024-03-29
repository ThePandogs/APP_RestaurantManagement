/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ThePandogs Clase que representa un local. Contiene información sobre
 * el establecimiento, las salas, camareros, productos y grupos de productos.
 */
public class Local {

    int id_establecimiento;
    String nombre;
    String direccion;
    String cif;
    String prefijo_telefono;
    String telefono;
    List<Sala> salas;
    Map<Integer, Camarero> camareros;
    Map<Integer, Producto> productos;
    List<GrupoProducto> gruposProductos;

    /**
     * Constructor de la clase Local.
     *
     * @param id_establecimiento el identificador del establecimiento
     * @param nombre el nombre del local
     * @param direccion la dirección del local
     * @param cif el CIF del local
     * @param prefijo_telefono el prefijo del número de teléfono del local
     * @param telefono el número de teléfono del local
     */
    public Local(int id_establecimiento, String nombre, String direccion, String cif, String prefijo_telefono, String telefono) {

        this.id_establecimiento = id_establecimiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cif = cif;
        this.prefijo_telefono = prefijo_telefono;
        this.telefono = telefono;

        salas = new ArrayList();
        camareros = new HashMap();
        productos = new HashMap();
        gruposProductos = new ArrayList();

    }

    public int getId_establecimiento() {
        return id_establecimiento;
    }

    public void setId_establecimiento(int id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getPrefijo_telefono() {
        return prefijo_telefono;
    }

    public void setPrefijo_telefono(String prefijo_telefono) {
        this.prefijo_telefono = prefijo_telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public Map<Integer, Camarero> getCamareros() {
        return camareros;
    }

    public void setCamareros(Map<Integer, Camarero> camareros) {
        this.camareros = camareros;
    }

    public List<GrupoProducto> getGruposProductos() {
        return gruposProductos;
    }

    public void setGruposProductos(List<GrupoProducto> gruposProductos) {
        this.gruposProductos = gruposProductos;
    }

    public Map<Integer, Producto> getProductos() {
        return productos;
    }

}
