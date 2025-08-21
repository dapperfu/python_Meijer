package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f54431a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f54432b = new W();

    static V a() {
        return f54431a;
    }

    static V b() {
        return f54432b;
    }

    private static V c() {
        if (b0.f54439d) {
            return null;
        }
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
