package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10623c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10606b1 f83069a;

    /* renamed from: b, reason: collision with root package name */
    private static final C10606b1 f83070b;

    static {
        C10606b1 c10606b1 = null;
        try {
            c10606b1 = (C10606b1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f83069a = c10606b1;
        f83070b = new C10606b1();
    }

    static C10606b1 a() {
        return f83069a;
    }

    static C10606b1 b() {
        return f83070b;
    }
}
