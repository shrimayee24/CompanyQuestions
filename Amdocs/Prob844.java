//string comparison after putting backspace
class Prob844 {
    public boolean backspaceCompare(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        StringBuilder scheck = new StringBuilder();
        StringBuilder tcheck = new StringBuilder();

     //put each character in stringbuilder 
     //if # occurs,delete last appended character in stringbuilder
        for (char c : schar) {
            if (c == '#') {
                //edge case for deletion-stringbuilder should not be empty
                if (scheck.length() > 0) {
                    scheck.deleteCharAt(scheck.length() - 1);
                }
            } else {
                scheck.append(c);
            }
        }

        for (char c : tchar) {
            if (c == '#') {
                if (tcheck.length() > 0) {
                    tcheck.deleteCharAt(tcheck.length() - 1);
                }
            } else {
                tcheck.append(c);
            }
        }

//check if both final strings are equal or not
        String sfinal = scheck.toString();
        String tfinal = tcheck.toString();
        return sfinal.equals(tfinal);
    }
}
