package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f54404a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f54405b = new L();

    static K a() {
        return f54404a;
    }

    static K b() {
        return f54405b;
    }

    private static K c() {
        if (b0.f54439d) {
            return null;
        }
        try {
            return (K) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
