package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11029f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC11029f1 f84537a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11029f1 f84538b;

    private AbstractC11029f1() {
    }

    abstract <L> void b(Object obj, Object obj2, long j10);

    abstract void d(Object obj, long j10);

    static {
        C11041i1 c11041i1 = null;
        f84537a = new C11037h1();
        f84538b = new C11048k1();
    }

    static AbstractC11029f1 a() {
        return f84537a;
    }

    static AbstractC11029f1 c() {
        return f84538b;
    }
}
