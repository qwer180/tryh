import java.util.Scanner;
public class Main{
    public static void main ( String arg [] ){

        Scanner a = new Scanner ( System.in );

        String str;
        char [] ch = new char [100];

        str = a.nextLine ( );

        for ( int i = 0 ; i < str.length ( ); i++ ){

            if ( str.charAt ( i ) >= 'A' && str.charAt ( i ) <= 'Z' ){

                ch [i] = ( char ) ( str.charAt ( i ) + 32 );
            }
            else{
                ch [i] = str.charAt ( i );
            }

            System.out.print ( ch [i] );
        }
    }
}