/////////////////////////////////////////////////////////////////////////////////////
//		Classe Sorcier 
// 	 Permet à l'utilisateur d'instancier des sorciers/sorcières avec un type donné
//   Fait par Mélissa Boucher et Alexis Parent
//	 30 Janvier 2015
/////////////////////////////////////////////////////////////////////////////////////

public class Sorcier extends Personnage
{
/////////////////////////////////////////////////////////////////////////////////////
// Déclaration des variables/attributs
/////////////////////////////////////////////////////////////////////////////////////

	// variable contenant le type du sorcier (eau/air/feu/terre/inconnu)
   private String type_ = "inconnu";
    // variable contenant le nombre de sorcier instancié
   private static int nbreSorcier_ = 0;
   
/////////////////////////////////////////////////////////////////////////////////////
// Constructeurs
/////////////////////////////////////////////////////////////////////////////////////
    // 3 parametres
   public Sorcier(String nom, char sexe, String Type)
   {
	// on définit les variables de l'instance
      super(nom, sexe); // utilise le constructeur de la class personnage 
      setType(Type);
	  setNbSorciers(1); // on augmente le nombre de sorcier puisqu'un autre est instancié
	}
	 // 2 parametres. Type n'est pas mentionné donc initialisé à "inconnu"
   public Sorcier(String nom, char sexe)
   {
      super(nom, sexe); // utilise le constructeur de la class personnage 
      setNbSorciers(1); // on augmente le nombre de sorcier puisqu'un autre est instancié
   }
  
/////////////////////////////////////////////////////////////////////////////////////
// Mutateurs et Accesseurs 
/////////////////////////////////////////////////////////////////////////////////////
	// nombre de sorciers
   public static int getNbSorciers()
   {
      return nbreSorcier_;
   }
   public void setNbSorciers(int nbre)
   {
      nbreSorcier_ += nbre;
   }
    //type de sorcier
   public String GetType()
   {
      return type_;
   }
   public void setType(String Type)
   {
    // vérifier si le type est dans les 5 choix (air/feu/terre/eau/inconnu)
       if(	Type.toLowerCase().equals("air") 	|| 
            Type.toLowerCase().equals("feu")  	|| 
            Type.toLowerCase().equals("terre")  || 
            Type.toLowerCase().equals("eau") 	|| 
            Type.toLowerCase().equals("inconnu"))
       {
           type_ = Type; // si oui on l'attribut, si non on le laisse comme il était avant(lors d'un changement')
       }
   }
   
/////////////////////////////////////////////////////////////////////////////////////
// Affichage 
/////////////////////////////////////////////////////////////////////////////////////
   public String toString()
   {
      if(Character.toUpperCase(GetSexe()) == 'M') 
         return "Mon nom est " + GetNom() + " et je suis un sorcier de type " + GetType();
      else if(Character.toUpperCase(GetSexe()) == 'F')
         return "Mon nom est " + GetNom() + " et je suis une sorciere de type " + GetType();
      else // si le sexe est invalide 
         return "Mon nom est " + GetNom() + " et mon sexe est invalide. Je suis de type " + GetType();
   }
}























