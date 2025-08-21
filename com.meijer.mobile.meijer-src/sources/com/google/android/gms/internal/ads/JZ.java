package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class JZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68775a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68776b;

    public JZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f68775a = interfaceC10213yy0;
        this.f68776b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((C8879mY) this.f68775a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77270mc)).intValue(), (ScheduledExecutorService) this.f68776b.zzb());
    }
}
