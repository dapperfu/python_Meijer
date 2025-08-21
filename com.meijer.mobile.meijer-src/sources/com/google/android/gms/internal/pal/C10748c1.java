package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10748c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10731b1 f83909a;

    /* renamed from: b, reason: collision with root package name */
    private static final C10731b1 f83910b;

    static {
        C10731b1 c10731b1 = null;
        try {
            c10731b1 = (C10731b1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f83909a = c10731b1;
        f83910b = new C10731b1();
    }

    static C10731b1 a() {
        return f83909a;
    }

    static C10731b1 b() {
        return f83910b;
    }
}
