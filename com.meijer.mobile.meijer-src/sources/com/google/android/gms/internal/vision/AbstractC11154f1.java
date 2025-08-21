package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11154f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC11154f1 f85377a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11154f1 f85378b;

    private AbstractC11154f1() {
    }

    abstract <L> void b(Object obj, Object obj2, long j10);

    abstract void d(Object obj, long j10);

    static {
        C11166i1 c11166i1 = null;
        f85377a = new C11162h1();
        f85378b = new C11173k1();
    }

    static AbstractC11154f1 a() {
        return f85377a;
    }

    static AbstractC11154f1 c() {
        return f85378b;
    }
}
