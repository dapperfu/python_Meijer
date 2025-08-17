package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.pal.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10658e2 extends C10707h2 implements Serializable, InterfaceC10675f2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C10658e2 f83097b = new C10658e2(0);

    public static C10658e2 a(long j10) {
        return j10 == 0 ? f83097b : new C10658e2(j10);
    }

    public static C10658e2 b(long j10) {
        return new C10658e2(C10723i2.a(j10, 3600000));
    }

    public static C10658e2 e(long j10) {
        return new C10658e2(C10723i2.a(j10, 1000));
    }

    public C10658e2(long j10) {
        super(j10);
    }
}
