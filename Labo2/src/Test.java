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
      System.out.println( "Au debut de l'histoire il y a " +
            nbPersonnages + " personnage(s)\n" );

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
   
}

class Sorcier extends Personnage
{
   String type_;
   
   public Sorcier(String nom, char sexe, String Type)
   {
      super(nom, sexe);
      SetType(Type);
   }
   
   final String GetType()
   {
      return type_;
   }
   private void SetType(String Type)
   {
      type_ = Type; 
   }
}

class Voleur extends Personnage
{
   int nbLarcins_;
   
   public Voleur(String nom, char sexe, int nbre)
   {
      super(nom, sexe);
      SetLarcins(nbre);
   }
   
   final int GetLarcins()
   {
      return nbLarcins_;
   }
   private void SetLarcins(int Larcins)
   {
      nbLarcins_ = Larcins; 
   }
}























