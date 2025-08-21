package wu;

/* loaded from: classes4.dex */
public final class d {
    public static void a(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }
}
