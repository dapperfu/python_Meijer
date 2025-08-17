package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class KZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68112a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68113b;

    public KZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f68112a = interfaceC10088yy0;
        this.f68113b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((C9182qY) this.f68112a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76542uc)).intValue(), (ScheduledExecutorService) this.f68113b.zzb());
    }
}
