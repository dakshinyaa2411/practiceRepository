
 class StringMethods {
	 public int convertToInt(StringPlay sp,String str) {
		 sp.convert=Integer.parseInt(str);
		 return sp.convert;
	 }
	 public int getMax(StringPlay sp,String str,char ch) {
		 int counter=0;
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)==ch) {
				 counter++;
			 }
		 }
		 sp.max=counter;
		 return sp.max;
	 }

}
