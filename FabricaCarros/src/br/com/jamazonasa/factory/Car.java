package br.com.jamazonasa.factory;

public abstract  class Car {

    private int horsePower;
    private String fuelSource;
    private  String color;

    public Car (int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void starEngine(){
        System.out.println("Cobustível: " + fuelSource + " e está pronto para ser utilizada");
    }

    public void clean(){
        System.out.println(getClass().getSimpleName());
        System.out.println("A cor " + color.toLowerCase() + " do carro está limpa e brilhante");
    }

    public void mechanicCheck(){
        System.out.println("O carro está com a manutenção em dia");
    }

    public void fuelCar(){
        System.out.println("Combustível: " + fuelSource.toLowerCase());
    }
}
