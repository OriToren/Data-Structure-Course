public class Recur {
    public static void orirow(int size){ //consists of a,b,c with ab and bc not allowed

        realorirow(size,"");

    }

    private static void realorirow(int size,String word){

        if (size==0){

            System.out.println(word);

        }

        if (word.equalsIgnoreCase("") && size>0){

            realorirow(size-1,word+'a');

            realorirow(size-1,word+'c');

            realorirow(size-1,word+'b');

            return;

        }

        if (word.charAt(word.length()-1) == 'b' && size>0) {

            realorirow(size-1,word+'a');

            realorirow(size-1,word+'b');

        }

        if (word.charAt(word.length()-1) == 'a' && size>0){

            realorirow(size-1,word+'a');

            realorirow(size-1,word+'c');

        }

        if (word.charAt(word.length()-1) == 'c' && size>0){

            realorirow(size-1,word+'a');

            realorirow(size-1,word+'c');

            realorirow(size-1,word+'b');

        }

    }

}

