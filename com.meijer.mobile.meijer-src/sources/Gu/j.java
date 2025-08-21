package Gu;

/* loaded from: classes8.dex */
public abstract class j {
    public abstract String a();

    j() {
    }

    public static j b(String str) {
        Eu.c.b(c(str), "Invalid TagValue: %s", str);
        return new c(str);
    }

    private static boolean c(String str) {
        if (str.length() <= 255 && Eu.b.b(str)) {
            return true;
        }
        return false;
    }
}
