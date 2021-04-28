package Equipe02.models;

public class Login {
    private Long idutilisateur;
    private String nom_utilisateur;
    private String password_utilisateur;

    public Login() {
    }

    public Long getIdlogin() {
        return idutilisateur;
    }

    public void setIdlogin(Long idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getnomutilisateur() {
        return nom_utilisateur;
    }

    public void setnomutilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getpasswordutilisateur() {
        return password_utilisateur;
    }

    public void setpasswordutilisateur(String password_utilisateur) {
        this.password_utilisateur = password_utilisateur;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + idutilisateur + ", date='" + nom_utilisateur + '\'' + '}';
    }
}
