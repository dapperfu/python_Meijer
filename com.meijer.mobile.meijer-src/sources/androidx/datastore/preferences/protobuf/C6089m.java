package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6089m {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f54529a = c();

    public static C6090n a() {
        C6090n c6090nB = b("getEmptyRegistry");
        return c6090nB != null ? c6090nB : C6090n.f54537c;
    }

    private static final C6090n b(String str) {
        Class<?> cls = f54529a;
        if (cls == null) {
            return null;
        }
        try {
            return (C6090n) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
