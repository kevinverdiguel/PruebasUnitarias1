public class Cable {
    int idCable;
    float saldoCable;

    public Cable(int id, float saldo){
        idCable = id;
        saldoCable = saldo;
    }

    public int getIdCable() {
        return idCable;
    }

    public void setIdCable(int idCable) {
        this.idCable = idCable;
    }

    public float getSaldoCable() {
        return saldoCable;
    }

    public void setSaldoCable(float saldoCable) {
        this.saldoCable = saldoCable;
    }
}
