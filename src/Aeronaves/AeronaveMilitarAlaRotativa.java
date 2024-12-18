package Aeronaves;

public class AeronaveMilitarAlaRotativa extends AlaRotativa {
    private boolean tieneArmamento;
    private int rangoMinimo;

    public AeronaveMilitarAlaRotativa(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, int cantAspas, int cantRotores, boolean tieneArmamento, int rangoMinimo) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima, cantAspas, cantRotores);
        this.tieneArmamento = tieneArmamento;
        this.rangoMinimo = rangoMinimo;
    }

    public int rangoMinimoDeTrabajo(){
        return this.rangoMinimo;
    }
}

