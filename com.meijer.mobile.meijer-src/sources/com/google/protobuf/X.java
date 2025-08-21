package com.google.protobuf;

/* loaded from: classes8.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f91319a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f91320b = new W();

    private static V c() {
        try {
            return (V) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static V a() {
        return f91319a;
    }

    static V b() {
        return f91320b;
    }
}
