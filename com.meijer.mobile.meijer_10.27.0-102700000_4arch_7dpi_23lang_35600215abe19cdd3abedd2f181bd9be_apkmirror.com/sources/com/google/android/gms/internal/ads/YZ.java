package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class YZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f71571a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f71572b;

    public YZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f71571a = interfaceC10088yy0;
        this.f71572b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((L00) this.f71571a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76304dc)).intValue(), (ScheduledExecutorService) this.f71572b.zzb());
    }
}
