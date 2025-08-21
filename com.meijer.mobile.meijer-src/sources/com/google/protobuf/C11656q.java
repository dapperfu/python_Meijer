package com.google.protobuf;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11656q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC11654o<?> f91455a = new C11655p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11654o<?> f91456b = c();

    private static AbstractC11654o<?> c() {
        try {
            return (AbstractC11654o) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static AbstractC11654o<?> a() {
        AbstractC11654o<?> abstractC11654o = f91456b;
        if (abstractC11654o != null) {
            return abstractC11654o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC11654o<?> b() {
        return f91455a;
    }
}
