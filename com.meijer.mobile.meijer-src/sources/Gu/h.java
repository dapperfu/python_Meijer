package Gu;

/* loaded from: classes8.dex */
public abstract class h {
    public abstract String b();

    h() {
    }

    public static h a(String str) {
        Eu.c.b(c(str), "Invalid TagKey name: %s", str);
        return new a(str);
    }

    private static boolean c(String str) {
        if (!str.isEmpty() && str.length() <= 255 && Eu.b.b(str)) {
            return true;
        }
        return false;
    }
}
