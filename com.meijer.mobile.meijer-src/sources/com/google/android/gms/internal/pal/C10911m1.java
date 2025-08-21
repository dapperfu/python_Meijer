package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10911m1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10895l1 f84071a;

    /* renamed from: b, reason: collision with root package name */
    private static final C10895l1 f84072b;

    static {
        C10895l1 c10895l1 = null;
        try {
            c10895l1 = (C10895l1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f84071a = c10895l1;
        f84072b = new C10895l1();
    }

    static C10895l1 a() {
        return f84071a;
    }

    static C10895l1 b() {
        return f84072b;
    }
}
