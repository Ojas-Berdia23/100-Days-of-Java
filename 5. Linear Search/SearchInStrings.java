public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Ojas";
        char target = 'j';
        System.out.println(search(name,target));

    }

    // using for-each loop
    static boolean search2(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for(char ch : str.toCharArray()) {
            if(target == ch) {
                return true;
            }
        }
        return false;
    }

    // using for loop
    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for(int i=0; i<str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
