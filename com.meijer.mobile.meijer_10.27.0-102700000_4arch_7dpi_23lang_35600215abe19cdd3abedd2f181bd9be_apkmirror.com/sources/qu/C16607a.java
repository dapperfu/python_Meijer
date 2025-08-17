package qu;

import Au.b;

/* renamed from: qu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16607a {
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof Au.a) {
            return cls.cast(obj);
        }
        if (obj instanceof b) {
            return (T) a(((b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), Au.a.class, b.class));
    }
}
