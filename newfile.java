public class Activity {
public static String concatenateStrings(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
    
        char[] str3 = new char[len1 + len2];
     
        int i = 0;
        while (i < len1) {

            str3[i]= str1.charAt(i);

            i++;

        }

        int j = 0;

        while (i < len1+len2) {

            str3[i]= str2.charAt(j);
            i++;

            j++;

        }
            return new String(str3);

    }
            public static void main(String[] args) {

                String str1 = "Arvy";
                String str2 = "Buranday";

                String concatenatedString = concatenateStrings(str1, str2);
                System.out.println("Concatenated string:" + concatenatedString);

}

}