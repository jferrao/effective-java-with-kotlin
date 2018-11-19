package io.mandrake.effective.item04;

import java.text.Normalizer;
import java.util.Locale;

public class StringUtility {

    private StringUtility() {
        throw new AssertionError();
    }

    public static String replaceNonAscii(String string, String replacement) {
        return string.replaceAll("[^\\p{ASCII}]", replacement);
    }

    public static String removeNonAscii(String string) {
        return replaceNonAscii(string,"");
    }

    public static String removeEmoji(String string) {
        return string.replaceAll("[^\\p{L}\\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}\\s]", "");
    }

    public static String convertDiacritics(String string) {
        if (!Normalizer.isNormalized(string, Normalizer.Form.NFD)) {
            final String normalizedString = Normalizer.normalize(string, Normalizer.Form.NFD);
            return normalizedString.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        }
        return string;
    }

    public static String toUrlFriendlySLug(String string) {
        if (string != null && !string.isEmpty()) {
            string = convertDiacritics(string);
            string = removeNonAscii(string);
            string = string.trim().replaceAll("\\s+", "-").toLowerCase(Locale.ENGLISH);
        }
        return string;
    }

}
