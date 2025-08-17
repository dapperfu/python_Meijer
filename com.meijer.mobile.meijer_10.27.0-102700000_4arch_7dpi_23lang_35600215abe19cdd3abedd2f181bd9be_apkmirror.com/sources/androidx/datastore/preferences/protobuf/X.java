package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f54207a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f54208b = new W();

    static V a() {
        return f54207a;
    }

    static V b() {
        return f54208b;
    }

    private static V c() {
        if (b0.f54215d) {
            return null;
        }
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
