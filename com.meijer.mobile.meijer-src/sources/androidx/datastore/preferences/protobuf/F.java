package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final D f54384a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final D f54385b = new E();

    static D a() {
        return f54384a;
    }

    static D b() {
        return f54385b;
    }

    private static D c() {
        if (b0.f54439d) {
            return null;
        }
        try {
            return (D) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
