package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6080d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f54446a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f54447b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f54448c;

    static {
        f54448c = (f54446a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class<?> b() {
        return f54447b;
    }

    static boolean c() {
        if (f54446a) {
            return true;
        }
        return (f54447b == null || f54448c) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
