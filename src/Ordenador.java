public class Ordenador {
    private String marca, modelo;
    private int memoriaRAM;
    private int discoDuro;
    private double precio;

    //método CONSTRUCTOR del objeto
    public Ordenador(String marca, String modelo, int memoriaRAM, int discoDuro, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.precio = precio;
    }

    //Getters
    public String getMarca(){
        return this.marca;
    }
    public  String getModelo(){
        return this.modelo;
    }
    public int getMemoriaRAM(){
        return this.memoriaRAM;
    }
    public int getDiscoDuro(){
        return this.discoDuro;
    }
    public double getPrecio(){
        return this.precio;
    }

    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMemoriaRAM(int memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }
    public void setDiscoDuro(int discoDuro){
        this.discoDuro = discoDuro;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "El ordenador es el modelo " + this.modelo + " de la marca " + this.marca + ", con un disco duro de " + discoDuro +  "GB y " + memoriaRAM + "GB de memoria RAM. Su precio es de " + precio + " Euros.";
    }
}
