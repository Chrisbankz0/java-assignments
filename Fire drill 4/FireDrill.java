

public class FireDrill{

    public static void taskOne(int [] scores){

        for (int index = 1; index <= scores.length; index++) {
            System.out.printf("%d", index);
        }
	System.out.println();


    }

    public static void taskTwo(int [] scores){

        for (int index = 1; index <= scores.length; index++) {
		if (index % 2 == 0){
			System.out.printf("%d", index);
		}
        }
		System.out.println();

    }

    public static void taskThree(int [] scores){

        for (int index = 1; index <= scores.length; index++) {
		if (index % 2 != 0){
			System.out.printf("%d", index);
		}
        }
		System.out.println();

    }

    public static void taskFour(int [] scores){

        for (int index = 1; index <= scores.length; index++) {
		if (index % 3 == 0){
			System.out.printf("%d", index);
		}
		else{
			System.out.print("0");
		}
        }
		System.out.println();

    }


public static void main(String [] args){

        int [] scores = {1,2,3,4,5,6,7,8,9,10};
	
	taskOne(scores);
	taskTwo(scores);
	taskThree(scores);
	taskFour(scores);

       }

}















