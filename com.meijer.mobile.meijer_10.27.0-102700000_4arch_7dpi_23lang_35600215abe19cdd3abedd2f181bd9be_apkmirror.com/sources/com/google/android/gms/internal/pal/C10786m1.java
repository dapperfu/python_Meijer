package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10786m1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10770l1 f83231a;

    /* renamed from: b, reason: collision with root package name */
    private static final C10770l1 f83232b;

    static {
        C10770l1 c10770l1 = null;
        try {
            c10770l1 = (C10770l1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f83231a = c10770l1;
        f83232b = new C10770l1();
    }

    static C10770l1 a() {
        return f83231a;
    }

    static C10770l1 b() {
        return f83232b;
    }
}
