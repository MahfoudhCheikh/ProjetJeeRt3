package mr.iscae.acces;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

public class GestionAccess {
	List<Users> Utilisateurs;

	public GestionAccess() {
		Utilisateurs = new ArrayList<>();
		Utilisateurs.add(new Users("admin", "admin"));
	}

	// Méthode de recherche par utilisateur et mode de passe
	public Boolean RechercheUser(String user, String password) {
		int i = 0;
		Boolean trouveU = false;
		while ((i < Utilisateurs.size()) && (!trouveU)) {
			if ((Utilisateurs.get(i).getUser()) == user) {
				trouveU = true;
			} else {
				i++;
			}
		}
		int j = 0;
		Boolean trouveP = false;
		while ((j < Utilisateurs.size()) && (!trouveP)) {
			if ((Utilisateurs.get(j).getPassword()) == password) {
				trouveP = true;
			} else {
				j++;
			}
		}
		if (trouveU && trouveP)
			return true;
		else
			return false;
	}

	// Méthode de la valitidé d'existance d'un user
	public Boolean AjouterUser(Users user) {
		if (false)
			return false;
		else {
			String NUser = user.getUser();
			String NPassword = user.getPassword();
			Utilisateurs.add(new Users(NUser, NPassword));
			return true;
		}
	}

	// methode d'affichage des utilisateurs

	public void AfficheUsers() {
		for (int i = 0; i < Utilisateurs.size(); i++) {
			System.out.println("Info user[" + (i + 1) + "] : ");
			System.out.println(Utilisateurs.get(i));
		}
	}

}
