package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class IZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67643a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67644b;

    public IZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f67643a = interfaceC10088yy0;
        this.f67644b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((C7581bY) this.f67643a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76402kc)).intValue(), (ScheduledExecutorService) this.f67644b.zzb());
    }
}
