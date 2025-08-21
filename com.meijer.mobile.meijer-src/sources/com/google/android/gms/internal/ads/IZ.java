package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class IZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68483a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68484b;

    public IZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f68483a = interfaceC10213yy0;
        this.f68484b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((C7706bY) this.f68483a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77242kc)).intValue(), (ScheduledExecutorService) this.f68484b.zzb());
    }
}
