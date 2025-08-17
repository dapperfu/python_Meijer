package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class PZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69359a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69360b;

    public PZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f69359a = interfaceC10088yy0;
        this.f69360b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((C7582bZ) this.f69359a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76346gc)).intValue(), (ScheduledExecutorService) this.f69360b.zzb());
    }
}
