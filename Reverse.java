import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	String original,reverse="";
	Scanner in=new Scanner(System.in);
	System.out.println("ENTER THE ORIGINAL STRING");
	original=in.nextLine();
	int length=original.length();
	for(int i=length-1;i>=0;i--){
		reverse=reverse+original.charAt(i);
		}
	System.out.println("REVERSE STRING IS : " +reverse);
		}

}
