package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10334t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC10334t0 f81566a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC10334t0 f81567b;

    static {
        C10337u0 c10337u0 = null;
        f81566a = new C10340v0();
        f81567b = new C10343w0();
    }

    private AbstractC10334t0() {
    }

    static AbstractC10334t0 c() {
        return f81566a;
    }

    static AbstractC10334t0 d() {
        return f81567b;
    }

    abstract void a(Object obj, long j10);

    abstract <L> void b(Object obj, Object obj2, long j10);
}
