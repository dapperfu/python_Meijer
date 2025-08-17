package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC11320p<?> f88488a = new C11321q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11320p<?> f88489b = c();

    static AbstractC11320p<?> a() {
        AbstractC11320p<?> abstractC11320p = f88489b;
        if (abstractC11320p != null) {
            return abstractC11320p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC11320p<?> b() {
        return f88488a;
    }

    private static AbstractC11320p<?> c() {
        if (b0.f88318d) {
            return null;
        }
        try {
            return (AbstractC11320p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
