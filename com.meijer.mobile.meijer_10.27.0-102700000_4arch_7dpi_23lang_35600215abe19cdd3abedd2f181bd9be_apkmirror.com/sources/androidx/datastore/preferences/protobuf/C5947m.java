package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5947m {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f54305a = c();

    public static C5948n a() {
        C5948n c5948nB = b("getEmptyRegistry");
        return c5948nB != null ? c5948nB : C5948n.f54313c;
    }

    private static final C5948n b(String str) {
        Class<?> cls = f54305a;
        if (cls == null) {
            return null;
        }
        try {
            return (C5948n) cls.getDeclaredMethod(str, null).invoke(null, null);
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
