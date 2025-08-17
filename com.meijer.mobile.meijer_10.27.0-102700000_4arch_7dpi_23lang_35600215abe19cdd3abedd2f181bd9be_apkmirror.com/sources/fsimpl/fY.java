package fsimpl;

/* loaded from: classes14.dex */
public class fY {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean a(String str, String str2) {
        return str != null ? str.equals(str2) : str2 == null;
    }

    public static boolean b(CharSequence charSequence) {
        return a(charSequence) || charSequence.toString().trim().isEmpty();
    }

    public static String c(CharSequence charSequence) {
        return b(charSequence) ? "" : charSequence.toString().trim();
    }

    public static String d(CharSequence charSequence) {
        if (b(charSequence)) {
            return null;
        }
        return charSequence.toString().trim();
    }
}
