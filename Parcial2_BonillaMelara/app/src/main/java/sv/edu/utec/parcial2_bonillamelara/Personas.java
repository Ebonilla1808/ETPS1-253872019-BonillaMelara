package sv.edu.utec.parcial2_bonillamelara;

public class Personas {
    private String nombre;
    private String cargo;
    private String compñia;
    public Personas(String nombre, String cargo, String compañia) {
        this.nombre=nombre;
        this.cargo = cargo;
        this.compñia = compañia;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCompñia() {
        return compñia;
    }
}
