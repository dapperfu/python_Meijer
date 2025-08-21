package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6093q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC6091o<?> f54567a = new C6092p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC6091o<?> f54568b = c();

    static AbstractC6091o<?> a() {
        AbstractC6091o<?> abstractC6091o = f54568b;
        if (abstractC6091o != null) {
            return abstractC6091o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC6091o<?> b() {
        return f54567a;
    }

    private static AbstractC6091o<?> c() {
        if (b0.f54439d) {
            return null;
        }
        try {
            return (AbstractC6091o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
