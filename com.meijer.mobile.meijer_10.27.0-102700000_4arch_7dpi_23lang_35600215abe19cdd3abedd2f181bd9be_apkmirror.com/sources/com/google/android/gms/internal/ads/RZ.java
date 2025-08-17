package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class RZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69888a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69889b;

    public RZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f69888a = interfaceC10088yy0;
        this.f69889b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((C8862nZ) this.f69888a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76444nc)).intValue(), (ScheduledExecutorService) this.f69889b.zzb());
    }
}
