public abstract class Personnage
{
   //////////////////////////////////////////////////////////////////////////////
   // ATTRIBUTS
   //////////////////////////////////////////////////////////////////////////////
   private String nom_ ;
   private char sexe_  ;
  
   //////////////////////////////////////////////////////////////////////////////
   // CONSTRUCTEURS
   //////////////////////////////////////////////////////////////////////////////
   public  Personnage()
   {
      // Mettre des valeurs par défaut aux attributs
      setNom("");
      setSexe('M');
   }
   public  Personnage(String n, char s)
   {
      // Mettre les valriables passé en pramètre dans les attributs
      setNom(n);
      setSexe(s);
   }
  
   //////////////////////////////////////////////////////////////////////////////
   // MUTATEURS ET ACCESSEURS
   //////////////////////////////////////////////////////////////////////////////
   public void setNom(String n)
   {
      // Regarder si le nom est vide ou qu'il n'y a pas seulement des espaces dans la variable nom
      String s = n.trim();
   
      if(s.length() != 0)
         nom_ = n;
   }
   
  public void setSexe(char s)
   {
      // Regarder si le sexe équivaut à M ou F
      if(Character.toUpperCase(s) == 'M' || Character.toUpperCase(s) == 'F')
         sexe_ = s;
   }
   
   public String GetNom()
   {
      // Retourne le nom
      return nom_;
   }
   
   public char GetSexe()
   {
   // Retourne le sexe
      return sexe_;
   }
}