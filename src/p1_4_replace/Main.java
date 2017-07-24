package p1_4_replace;

public class Main {

	public static Object replace(char[] origin, int size) {
		int spaceCnt = 0;
		for(int i=0; i<size; i++) {
			if(origin[i] == ' ') spaceCnt++;
		}
		int targetIndex = size+spaceCnt*2-1;   // mistake: 3 -> 2, add -1
		int srcIndex=size-1;
		
		while(srcIndex >= 0) {
			if(origin[srcIndex] == ' ') {
				origin[targetIndex-2]='%';
				origin[targetIndex-1]='2';
				origin[targetIndex]='0';
				targetIndex -= 3;
			} else {
				origin[targetIndex] = origin[srcIndex];
				targetIndex -= 1;
			}
			srcIndex -= 1;
		}
		
		return (new String(origin)).trim();
	}

}
