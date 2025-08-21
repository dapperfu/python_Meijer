package xu;

/* renamed from: xu.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18225c {
    public static <T> void a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T c(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T d(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }
}
