package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class HZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67462a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67463b;

    public HZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f67462a = interfaceC10088yy0;
        this.f67463b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((RX) this.f67462a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76416lc)).intValue(), (ScheduledExecutorService) this.f67463b.zzb());
    }
}
