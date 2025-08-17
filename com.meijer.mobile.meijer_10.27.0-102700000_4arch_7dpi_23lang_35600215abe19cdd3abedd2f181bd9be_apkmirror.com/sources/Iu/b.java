package Iu;

/* loaded from: classes7.dex */
public final class b {
    public static boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!a(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(char c10) {
        return c10 >= ' ' && c10 <= '~';
    }
}
