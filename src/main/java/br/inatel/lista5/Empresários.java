package br.inatel.lista5;

public class Empresários {
    private float identificador;
    private String EstadoCivil;
    private boolean filho;
    private float salario;
    private String Graudeinstituição;

    public float getIdentificador() {
        return identificador;
    }

    public void setIdentificador(float identificador) {
        this.identificador= identificador;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public boolean isFilho() {
        return filho;
    }

    public void setFilho(boolean filho) {
        this.filho = filho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getGraudeinstituição() {
        return Graudeinstituição;
    }

    public void setGraudeinstituição(String graudeinstituição) {
        Graudeinstituição = graudeinstituição;
    }
}
