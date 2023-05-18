package sv.edu.utec.parcial4_bonillamelara.entidades;

public class EntClientes {
    private int ID_Cliente;
    private String sNombreCliente;
    private String sApellidosCliente;
    private String sDireccionClientes;
    private String sCiudadCliente;

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getsNombreCliente() {
        return sNombreCliente;
    }

    public void setsNombreCliente(String sNombreCliente) {
        this.sNombreCliente = sNombreCliente;
    }

    public String getsApellidosCliente() {
        return sApellidosCliente;
    }

    public void setsApellidosCliente(String sApellidosCliente) {
        this.sApellidosCliente = sApellidosCliente;
    }

    public String getsDireccionClientes() {
        return sDireccionClientes;
    }

    public void setsDireccionClientes(String sDireccionClientes) {
        this.sDireccionClientes = sDireccionClientes;
    }

    public String getsCiudadCliente() {
        return sCiudadCliente;
    }

    public void setsCiudadCliente(String sCiudadCliente) {
        this.sCiudadCliente = sCiudadCliente;
    }
}
