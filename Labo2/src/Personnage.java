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
      setNom("");
      setSexe('M');
   }
   public  Personnage(String n, char s)
   {
      setNom(n);
      setSexe(s);
   }
  
   //////////////////////////////////////////////////////////////////////////////
   // MUTATEURS ET ACCESSEURS
   //////////////////////////////////////////////////////////////////////////////
   public void setNom(String n)
   {
      if(n.length() != 0 && CheckEspace(n))
         nom_ = n;
   }
   
   private boolean CheckEspace(String n)
   {
      boolean resultat = false;
      
      for(int i = 0; i < n.length(); i++)
      {
         if(n.charAt(i) != ' ')
             resultat = true;
      }
      
      return resultat;
   }
   
  public void setSexe(char s)
   {
      if(Character.toUpperCase(s) == 'M' || Character.toUpperCase(s) == 'F')
         sexe_ = s;
   }
   
   public String GetNom()
   {
      return nom_;
   }
   
   public char GetSexe()
   {
      return sexe_;
   }
}