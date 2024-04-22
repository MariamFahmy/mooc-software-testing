package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;

        if (string == null) {
            return mirror;
        }

        int end = string.length() - 1;
        for (; begin <= string.length() - 1 && end >= 0; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }

        return begin == end ? string : mirror;
    }
}
