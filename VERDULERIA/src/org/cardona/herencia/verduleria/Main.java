package org.cardona.herencia.verduleria;

public class Main {
    public static void main(String[] args) {
        Producto [] productos = new Producto[8];
        productos[0] = new Lacteo(1500,300,"Yogurt Griego",99.99);
        productos[1] = new Lacteo(500,150,"Queso Mozzarella",150.99);
        productos[2] = new Fruta(100,"Amarillo","Banano", 7.99);
        productos[3] = new Fruta(50,"Rojo","Manzana",3.99);
        productos[4] = new Limpieza("Perfume",1000.00,"Suavitel",29.99);
        productos[5] = new Limpieza("Sulfato de sodio",500.00,"Fabuloso",20.99);
        productos[6] = new NoPerecible(30,70,"Miel",4.99);
        productos[7] = new NoPerecible(50,150,"Azúcar",3.99);

        for (Producto producto : productos ){
            System.out.println("Nombre: " + producto.getNombre() + "\n" + "Precio" + producto.getPrecio() + "$");
        }
        Object producto = null;
        if(producto instanceof Lacteo){
            System.out.println("Cantidad: " + ((Lacteo)producto).getCantidad());
            System.out.println("Proteínas: " + ((Lacteo)producto).getProteinas());
        } else if (producto instanceof Fruta){
            System.out.println("Peso(gr): " + ((Fruta)producto).getPeso());
            System.out.println("Color: " + ((Fruta)producto).getColor());
        } else if (producto instanceof  Limpieza) {
            System.out.println("Componentes: " + ((Limpieza)producto).getComponentes());
            System.out.println("Litros: " + ((Limpieza)producto).getLitros());
        } else if (producto instanceof NoPerecible){
            System.out.println("Contenido: " + ((NoPerecible)producto).getContenido());
            System.out.println("Calorías: " + ((NoPerecible)producto).getCalorias());
        }


    }
}
