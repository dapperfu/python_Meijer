package com.google.protobuf;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11531q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC11529o<?> f90616a = new C11530p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11529o<?> f90617b = c();

    private static AbstractC11529o<?> c() {
        try {
            return (AbstractC11529o) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static AbstractC11529o<?> a() {
        AbstractC11529o<?> abstractC11529o = f90617b;
        if (abstractC11529o != null) {
            return abstractC11529o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC11529o<?> b() {
        return f90616a;
    }
}
