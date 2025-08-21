package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class VZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71727a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71728b;

    public VZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f71727a = interfaceC10213yy0;
        this.f71728b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((A00) this.f71727a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77340rc)).intValue(), (ScheduledExecutorService) this.f71728b.zzb());
    }
}
