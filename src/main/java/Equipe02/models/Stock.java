package Equipe02.models;

public class Stock {
    private Long idstock;
    private String condiments;
    private String utilitaires;
    private String quantite;

    public Stock() {
    }

    public Long getId() {
        return idstock;
    }

    public void setId(Long id) {
        this.idstock = id;
    }

    public String getName() {
        return condiments;
    }

    public void setName(String name) {
        this.condiments = name;
    }

    public String getUtilitaires() {
        return utilitaires;
    }

    public void setUtilitaires(String utilitaires) {
        this.utilitaires = utilitaires;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String number) {
        this.quantite = number;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + idstock + ", name='" + condiments + '\'' + '}';
    }
}
