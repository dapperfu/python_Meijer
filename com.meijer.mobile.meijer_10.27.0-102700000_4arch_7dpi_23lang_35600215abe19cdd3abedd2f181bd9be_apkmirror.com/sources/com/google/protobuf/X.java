package com.google.protobuf;

/* loaded from: classes7.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f90480a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f90481b = new W();

    private static V c() {
        try {
            return (V) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static V a() {
        return f90480a;
    }

    static V b() {
        return f90481b;
    }
}
