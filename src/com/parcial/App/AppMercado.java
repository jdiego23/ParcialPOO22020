package com.parcial.App;


import com.parcial.domain.Mercado;
import com.parcial.domain.Producto;

import java.util.ArrayList;
import java.util.Arrays;

import static com.parcial.domain.TipoProducto.*;

public class AppMercado
{
    public static void main(String[] args)
    {
        int totalpagar = 0;
        Mercado mercado = new Mercado("JuanMercado");

        Producto res = new Producto(1,"Carne de res",1,10000,CARNES);
        Producto cebolla = new Producto(2,"Cebollar",1,600,VERDURAS);
        Producto colanta = new Producto(3,"Leche",1,1700,LACTEOS);
        Producto mango = new Producto(4,"Mango",1,1000,FRUTA);
        Producto agridulce = new Producto(5,"Pan Agridulce",1,400,PAN);
        Producto pez = new Producto(6,"Sardina",1,2500,ENLATADOS);
        Producto juguete = new Producto(7,"Carro",1,5000,JUGUETOS);
        Producto aseo = new Producto(8,"Desodorante",1,15000,ASEO_PERSONAL);
        Producto fresa = new Producto(9,"Mango",1,2000,FRUTA);

        mercado.getlProducto().addAll((Arrays.asList(cebolla,colanta,mango,agridulce,pez,juguete,aseo,fresa)));

        mercado.agregar(res);
        mercado.retirar(res.getNombre());

        mercado.buscar("Fresa");
        mercado.buscar(5);

        mercado.buscarPorTipo(VERDURAS);
        totalpagar = mercado.calcular();
        System.out.println("El total de su compra es:" + totalpagar);

    }
}
