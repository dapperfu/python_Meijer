package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC11445p<?> f89328a = new C11446q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11445p<?> f89329b = c();

    static AbstractC11445p<?> a() {
        AbstractC11445p<?> abstractC11445p = f89329b;
        if (abstractC11445p != null) {
            return abstractC11445p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC11445p<?> b() {
        return f89328a;
    }

    private static AbstractC11445p<?> c() {
        if (b0.f89158d) {
            return null;
        }
        try {
            return (AbstractC11445p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
