package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class VZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70887a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70888b;

    public VZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70887a = interfaceC10088yy0;
        this.f70888b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((A00) this.f70887a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76500rc)).intValue(), (ScheduledExecutorService) this.f70888b.zzb());
    }
}
