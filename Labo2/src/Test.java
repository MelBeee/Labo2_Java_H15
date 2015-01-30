/*
 Created by Melissa et Alexis
 */
public class Test
{
   static final int MAX_PERSONNAGES = 10;

   public static void main( String args[] )
   {
      int nbPersonnages = 0; // nombre courant de personnages

      //
      // création du tableau de personnages
      //
      Personnage pers[] = new Personnage[ MAX_PERSONNAGES ];

      //
      // décompte des personnages au début de l'histoire
      //
      nbPersonnages = Sorcier.getNbSorciers() + Voleur.getNbVoleurs();
      System.out.println( "Au debut de l'histoire il y a " + nbPersonnages + " personnage(s)\n" );

      //
      // création des personnages
      //
      pers[ 0 ] = new Sorcier( "Gandalf", 'M' );
      pers[ 1 ] = new Sorcier( "Zoumtor", 'M', "air" );
      pers[ 2 ] = new Sorcier( "Sagasse", 'F', "feu" );
      pers[ 3 ] = new Voleur( "Zarpeur", 'M' );
      pers[ 4 ] = new Voleur( "Filouzine", 'F', 7 );
      pers[ 5 ] = new Voleur( "Ombro", 'M', 50 );

      //
      // modification de quelques personnages
      //
      pers[ 0 ].setNom( "Kalamanji" );
      pers[ 1 ].setNom( "   " ); // aucun effet
      ( ( Sorcier )pers[ 1 ] ).setType( "pizza" ); // aucun effet
      ( ( Sorcier )pers[ 2 ] ).setType( "eau" );
      pers[ 3 ].setSexe( 'X' ); // aucun effet
      ( ( Voleur )pers[ 5 ] ).incNbLarcins();

      //
      // présentation des personnages
      //
      nbPersonnages = Sorcier.getNbSorciers() + Voleur.getNbVoleurs();
      for( int i = 0; i < nbPersonnages; i++ )
         System.out.println( pers[ i ] );

      
      //
      // décompte des personnages à la fin de l'histoire
      //
      System.out.println( "\nA la fin de l'histoire il y a " +
            nbPersonnages + " personnage(s)" );
   }
}

class Personnage
{
   //////////////////////////////////////////////////////////////////////////////
   // ATTRIBUTS
   //////////////////////////////////////////////////////////////////////////////
   private String nom ;
   private char sexe;
  
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
         nom = n;
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
      if(s == 'M' || s == 'F')
         sexe = s;
   }
   
   public String GetNom()
   {
      return nom;
   }
   
   public char GetSexe()
   {
      return sexe;
   }
}

class Sorcier extends Personnage
{
   String type_;
   static int nbreSorcier_;
   
   public Sorcier(String nom, char sexe, String Type)
   {
      super(nom, sexe);
      setType(Type);
      setNbSorciers(1);
   }
   public Sorcier(String nom, char sexe)
   {
      super(nom, sexe);
      setType("Inconnu");
      setNbSorciers(1);
   }
   
   public static int getNbSorciers()
   {
      return nbreSorcier_;
   }
   
   public void setNbSorciers(int nbre)
   {
      nbreSorcier_ += nbre;
   }
   
   public String GetType()
   {
      return type_;
   }
   public void setType(String Type)
   {
      type_ = Type; 
   }
   public String toString()
   {
      if(GetSexe() == 'M')
         return "Mon nom est " + GetNom() + " et je suis un sorcier de type " + GetType();
      else
         return "Mon nom est " + GetNom() + " et je suis une sorciere de type " + GetType();
   }
}

class Voleur extends Personnage
{
   int nbLarcins_;
   static int nbreVoleur_;
   
   public Voleur(String nom, char sexe, int nbre)
   {
      super(nom, sexe);
      SetLarcins(nbre);
      setNbVoleurs(1);
   }
   
   public Voleur(String nom, char sexe)
   {
      super(nom, sexe);
      SetLarcins(1);
      setNbVoleurs(1);
   }
   
   public static int getNbVoleurs()
   {
      return nbreVoleur_;
   }
   
   public void setNbVoleurs(int nbre)
   {
      nbreVoleur_ += nbre;
   }
   
   public int GetLarcins()
   {
      return nbLarcins_;
   }
   public void SetLarcins(int Larcins)
   {
      nbLarcins_ = Larcins; 
   
   }
   public void incNbLarcins()
   {
      
   }
   public String toString()
   {
      if(GetSexe() == 'M')
        return "Mon nom est " + GetNom() + " et je suis un voleur ayant commis " + GetLarcins() + " larcins.";
      else
        return "Mon nom est " + GetNom() + " et je suis une voleuse ayant commis " + GetLarcins() + " larcins.";
   }
}























