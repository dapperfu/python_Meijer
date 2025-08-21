package ow;

/* loaded from: classes14.dex */
public final class q {
    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void b(String str, Throwable th2) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th2.printStackTrace();
    }

    public static String d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean c(String str) {
        String strD = d(str);
        if (strD == null) {
            return false;
        }
        return strD.equalsIgnoreCase("true");
    }
}
