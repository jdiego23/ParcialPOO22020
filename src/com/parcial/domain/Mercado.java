package com.parcial.domain;

import java.util.ArrayList;

public class Mercado {
    public static byte CAPACIDAD = 59;
    private String supermercado;
    private ArrayList<Producto> lProducto;

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        lProducto = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getlProducto() {
        return lProducto;
    }

    public void setlProducto(ArrayList<Producto> lProducto) {
        this.lProducto = lProducto;
    }

    public boolean agregar(Producto producto)
    {
        boolean retorno = false;
        if(lProducto.size() <= CAPACIDAD){

            for(int i=0 ;i<lProducto.size(); i++)
            {
                if(lProducto.get(i).getCodigo()==producto.getCodigo())
                {
                    retorno = false;
                }
                else
                {
                    lProducto.add(producto);
                    retorno = true;
                }
            }
        }
        if(retorno == true)
        {
            System.out.println("El produto ya existe");
        }
        else
        {
            System.out.println("Se agrego el producto exitosamente");
        }
        return  retorno;
    }
    public boolean retirar(String nombre)
    {
        boolean retorno = false;
        for(int i=0 ;i < lProducto.size(); i++)
        {
            if(lProducto.get(i).getNombre()==nombre)
            {
                lProducto.remove(i);
                retorno = true;
            }
            else
            {
                retorno =false;
            }
        }
        if(retorno == true)
        {
            System.out.println("El producto fue retirado exitosamente");
        }
        else
        {
            System.out.println("El producto no se encuentra en el mercado");
        }
        return retorno;
    }

    public Producto buscar(String nombre)
    {
        Producto producto = null;

        for(int i=0 ;i < lProducto.size(); i++)
        {
            if(nombre == lProducto.get(i).getNombre())
            {
               producto = lProducto.get(i);
            }
        }
        if(producto ==null)
        {
            System.out.println("El produto " + nombre +" no se encontro");
        }
        else
        {
            System.out.println("El produto " + producto.getNombre() +" se encontro");
        }
        return  producto;
    }
    public Producto buscar(int codigo)
    {
        Producto producto = null;
        for(int i=0 ;i < lProducto.size(); i++)
        {
            if(lProducto.get(i).getCodigo() == codigo)
            {
                producto = lProducto.get(i);

            }
        }
        if(producto ==null)
        {
            System.out.println("El producto no se encontro");
        }
        else
        {
            System.out.println("El produto se encontro");
        }

        return producto;
    }
    public ArrayList<Producto> buscarPorTipo(String tipo)
    {
        Producto producto = null;
        ArrayList<Producto> tipoProducto;
        tipoProducto = new ArrayList<Producto>();
        for(int i=0;i < lProducto.size();i++)
        {
            if(tipo == lProducto.get(i).getTipo())
            {
                producto = lProducto.get(i);
                tipoProducto.add(producto);
                System.out.println("La lista de productos tipo " + tipo + " son " + tipoProducto.get(i).getNombre());
                producto = null;
            }

        }
        return tipoProducto;
    }
    public int calcular()
    {
        int totalPagar = 0;

        for(int i =0;i < lProducto.size(); i++)
        {
            totalPagar = totalPagar + (lProducto.get(i).getPrecio() * lProducto.get(i).getCantidad());
        }
        return totalPagar;
    }
}
