package Equipe02.models;

public class ReservationModel {
    private Long idreservation;
    private String date;
    private String heure;
    private String nom_client;
    private Long table_idtable;

    public Long getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(Long idreservation) {
        this.idreservation = idreservation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getNomClient() {
        return nom_client;
    }

    public void setNomClient(String nom_client) {
        this.nom_client = nom_client;
    }

    public Long getIdtable() {
        return table_idtable;
    }

    public void setIdtable(Long table_idtable) {
        this.table_idtable = table_idtable;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + idreservation + ", date='" + date + '\'' + '}';
    }
}
