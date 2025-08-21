package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class HZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68302a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68303b;

    public HZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f68302a = interfaceC10213yy0;
        this.f68303b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((RX) this.f68302a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77256lc)).intValue(), (ScheduledExecutorService) this.f68303b.zzb());
    }
}
