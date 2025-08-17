package com.google.protobuf;

/* loaded from: classes7.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f90453a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f90454b = new L();

    private static K c() {
        try {
            return (K) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static K a() {
        return f90453a;
    }

    static K b() {
        return f90454b;
    }
}
