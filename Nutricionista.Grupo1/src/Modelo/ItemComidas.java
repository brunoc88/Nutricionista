
package Modelo;


public class ItemComidas {
    private int idItemComidas;
    private Dieta idDieta;
    private Comida idComida;
    private boolean estado;

    public ItemComidas() {
    }

    public ItemComidas(Dieta idDieta, Comida idComida, boolean estado) {
        this.idDieta = idDieta;
        this.idComida = idComida;
        this.estado = estado;
    }

    public ItemComidas(int idItemComidas, Dieta idDieta, Comida idComida, boolean estado) {
        this.idItemComidas = idItemComidas;
        this.idDieta = idDieta;
        this.idComida = idComida;
        this.estado = estado;
    }

    public int getIdItemComidas() {
        return idItemComidas;
    }

    public void setIdItemComidas(int idItemComidas) {
        this.idItemComidas = idItemComidas;
    }

    public Dieta getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(Dieta idDieta) {
        this.idDieta = idDieta;
    }

    public Comida getIdComida() {
        return idComida;
    }

    public void setIdComida(Comida idComida) {
        this.idComida = idComida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ItemComidas{" + "idItemComidas=" + idItemComidas + ", idDieta=" + idDieta + ", idComida=" + idComida + ", estado=" + estado + '}';
    }
    
    
}
