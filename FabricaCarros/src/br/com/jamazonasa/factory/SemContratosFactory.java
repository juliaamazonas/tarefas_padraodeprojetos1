package br.com.jamazonasa.factory;

public class SemContratosFactory extends Factory{
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BrasiliaCar(80, "cheio", "amarela");
        } else {
            return null;

        }
    }
}
