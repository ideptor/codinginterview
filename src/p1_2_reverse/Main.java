package p1_2_reverse;

public class Main {

	public static String revserse(char[] line) {
		int length=0;
		int size=0;
		char temp;
		int index;
		
		length=line.length;
		size=length/2;
		
		index=0;
		while(index<size) {
			temp = line[index];
			line[index] = line[length-index-1];
			line[length-index-1] = temp;
			index++;
		}
		
		return new String(line);
	}

}
