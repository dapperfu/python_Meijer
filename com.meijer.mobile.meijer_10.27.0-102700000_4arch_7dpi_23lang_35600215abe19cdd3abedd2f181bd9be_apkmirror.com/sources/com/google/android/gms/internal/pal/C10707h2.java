package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.pal.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10707h2 extends AbstractC10691g2 implements Serializable, InterfaceC10675f2 {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f83146a;

    protected C10707h2(long j10) {
        this.f83146a = j10;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10675f2
    public final long zzd() {
        return this.f83146a;
    }
}
