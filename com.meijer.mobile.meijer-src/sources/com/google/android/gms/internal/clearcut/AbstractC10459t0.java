package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10459t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC10459t0 f82406a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC10459t0 f82407b;

    static {
        C10462u0 c10462u0 = null;
        f82406a = new C10465v0();
        f82407b = new C10468w0();
    }

    private AbstractC10459t0() {
    }

    static AbstractC10459t0 c() {
        return f82406a;
    }

    static AbstractC10459t0 d() {
        return f82407b;
    }

    abstract void a(Object obj, long j10);

    abstract <L> void b(Object obj, Object obj2, long j10);
}
