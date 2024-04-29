public class App {
    public static void main(String[] args) throws Exception {
        Ordenador pc1 = new Ordenador("Apple", "MacBook Air",  8, 256, 999);
        Ordenador pc2 = new Ordenador("Dell", "XPS 13", 16, 512, 1229);
        Ordenador pc3 = new Ordenador("Lenovo", "ThinkPad X1 Carbon", 16, 512, 1499);
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
        System.out.println(pc3.toString());
        
        System.out.println("La marcas de los 3 son " + pc1.getMarca() + ", " + pc2.getMarca() + " y " + pc3.getMarca());
        System.out.println("El precio del pc2 es de " + pc2.getPrecio() + " EUR y la marca es " + pc2.getMarca());
        pc2.setPrecio(859);
        System.out.println("OFERTA DE ÚLTIMA HORA: El precio del pc2 es de SOLO " + pc2.getPrecio() + " EUR y la marca es " + pc2.getMarca());

    }
}
