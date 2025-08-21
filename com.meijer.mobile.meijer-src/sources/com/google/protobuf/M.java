package com.google.protobuf;

/* loaded from: classes8.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f91292a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f91293b = new L();

    private static K c() {
        try {
            return (K) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static K a() {
        return f91292a;
    }

    static K b() {
        return f91293b;
    }
}
