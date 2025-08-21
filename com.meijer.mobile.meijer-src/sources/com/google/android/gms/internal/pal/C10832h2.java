package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.pal.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10832h2 extends AbstractC10816g2 implements Serializable, InterfaceC10800f2 {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f83986a;

    protected C10832h2(long j10) {
        this.f83986a = j10;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10800f2
    public final long zzd() {
        return this.f83986a;
    }
}
