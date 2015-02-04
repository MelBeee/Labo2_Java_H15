/////////////////////////////////////////////////////////////////////////////////////
//		Classe Voleur 
// 	 Permet à l'utilisateur d'instancier des voleurs/voleuses avec un nbre de larcin donné
//   Fait par Mélissa Boucher et Alexis Parent
//	 30 Janvier 2015
/////////////////////////////////////////////////////////////////////////////////////

final public class Voleur extends Personnage
{
/////////////////////////////////////////////////////////////////////////////////////
// Déclaration des variables/attributs
/////////////////////////////////////////////////////////////////////////////////////
   	// variable contenant le nombre de larcin du voleur
   private int nbLarcins_ = 0;
    // variable contenant le nombre de voleurs instanciés
   private static int nbreVoleur_;
   
/////////////////////////////////////////////////////////////////////////////////////
// Constructeurs
/////////////////////////////////////////////////////////////////////////////////////
	// 3 paramètres
   public Voleur(String nom, char sexe, int nbre)
   {
   	// on définit les variables de l'instance
      super(nom, sexe); // utilise le constructeur de la class personnage 
      SetLarcins(nbre);
      setNbVoleurs(1); // on augmente le nombre de voleur puisqu'un autre est instancié
   }
    // 2 paramètres. nombre de larcins non mentionné donc initialisé à 0
   public Voleur(String nom, char sexe)
   {
      super(nom, sexe); // utilise le constructeur de la class personnage 
      setNbVoleurs(1); // on augmente le nombre de voleur puisqu'un autre est instancié
   }
   
/////////////////////////////////////////////////////////////////////////////////////
// Mutateurs et Accesseurs 
/////////////////////////////////////////////////////////////////////////////////////
	// nombre de voleurs
   public static int getNbVoleurs()
   {
      return nbreVoleur_;
   }
   public void setNbVoleurs(int nbre)
   {
      nbreVoleur_ += nbre;
   }
	// nombre de larcins
   public int GetLarcins()
   {
      return nbLarcins_;
   }
   public void SetLarcins(int Larcins)
   {
	  if(Larcins >= 0) // un voleur ne peut pas avoir commis -10 larcins
		nbLarcins_ = Larcins; 
   }
   public void incNbLarcins()
   {
      SetLarcins(GetLarcins() + 1);
   }
   
/////////////////////////////////////////////////////////////////////////////////////
// Affichage 
/////////////////////////////////////////////////////////////////////////////////////
   public String toString()
   {
      if(Character.toUpperCase(GetSexe()) == 'M')
        return "Mon nom est " + GetNom() + " et je suis un voleur ayant commis " + GetLarcins() + " larcin(s).";
      else if(Character.toUpperCase(GetSexe()) == 'F')
        return "Mon nom est " + GetNom() + " et je suis une voleuse ayant commis " + GetLarcins() + " larcin(s).";
      else // si le sexe est invalide
        return "Mon nom est " + GetNom() + " et mon sexe est invalide mais j'ai commis " + GetLarcins() + " larcin(s).";
   }
}










