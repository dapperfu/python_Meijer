package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5938d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f54222a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f54223b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f54224c;

    static {
        f54224c = (f54222a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class<?> b() {
        return f54223b;
    }

    static boolean c() {
        if (f54222a) {
            return true;
        }
        return (f54223b == null || f54224c) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
