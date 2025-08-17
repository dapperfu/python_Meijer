package Ku;

/* loaded from: classes7.dex */
public abstract class j {
    public abstract String a();

    j() {
    }

    public static j b(String str) {
        Iu.c.b(c(str), "Invalid TagValue: %s", str);
        return new c(str);
    }

    private static boolean c(String str) {
        if (str.length() <= 255 && Iu.b.b(str)) {
            return true;
        }
        return false;
    }
}
