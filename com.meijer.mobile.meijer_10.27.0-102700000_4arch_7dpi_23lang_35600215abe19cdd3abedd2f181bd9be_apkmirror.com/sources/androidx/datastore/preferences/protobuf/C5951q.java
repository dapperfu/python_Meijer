package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5951q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5949o<?> f54343a = new C5950p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5949o<?> f54344b = c();

    static AbstractC5949o<?> a() {
        AbstractC5949o<?> abstractC5949o = f54344b;
        if (abstractC5949o != null) {
            return abstractC5949o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC5949o<?> b() {
        return f54343a;
    }

    private static AbstractC5949o<?> c() {
        if (b0.f54215d) {
            return null;
        }
        try {
            return (AbstractC5949o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
