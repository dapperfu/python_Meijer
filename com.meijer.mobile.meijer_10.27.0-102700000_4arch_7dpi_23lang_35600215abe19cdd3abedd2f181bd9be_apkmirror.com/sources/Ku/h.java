package Ku;

/* loaded from: classes7.dex */
public abstract class h {
    public abstract String b();

    h() {
    }

    public static h a(String str) {
        Iu.c.b(c(str), "Invalid TagKey name: %s", str);
        return new a(str);
    }

    private static boolean c(String str) {
        if (!str.isEmpty() && str.length() <= 255 && Iu.b.b(str)) {
            return true;
        }
        return false;
    }
}
