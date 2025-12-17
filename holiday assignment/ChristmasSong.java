public class ChristmasSong{
public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {

            System.out.print("On the ");

            switch (day) {
                case 1:  System.out.print("first"); break;

                case 2:  System.out.print("second"); break;

                case 3:  System.out.print("third"); break;

                case 4:  System.out.print("fourth"); break;

                case 5:  System.out.print("fifth"); break;

                case 6:  System.out.print("sixth"); break;

                case 7:  System.out.print("seventh"); break;

                case 8:  System.out.print("eighth"); break;

                case 9:  System.out.print("ninth"); break;

                case 10: System.out.print("tenth"); break;

                case 11: System.out.print("eleventh"); break;

                case 12: System.out.print("twelfth"); break;
            }

            System.out.println(" day of Christmas my true love sent to me:");

            
            switch (day) {
                case 12:
                    System.out.println("Twelve Drummers Drumming,");

                case 11:
                    System.out.println("Eleven Pipers Piping,");

                case 10:
                    System.out.println("Ten Lords a-Leaping,");

                case 9:
                    System.out.println("Nine Ladies Dancing,");
                    
                case 8:
                    System.out.println("Eight Maids a-Milking,");

                case 7:
                    System.out.println("Seven Swans a-Swimming,");
                    
                case 6:
                    System.out.println("Six Geese a-Laying,");

                case 5:
                    System.out.println("Five Golden Rings,");

                case 4:
                    System.out.println("Four Calling Birds,");
            
                case 3:
                    System.out.println("Three French Hens,");
                    
                case 2:
                    System.out.println("Two Turtle Doves,");
            
                case 1:
                    System.out.println("And a Partridge in a Pear Tree.");
            }
            System.out.println();
        }
    }
}