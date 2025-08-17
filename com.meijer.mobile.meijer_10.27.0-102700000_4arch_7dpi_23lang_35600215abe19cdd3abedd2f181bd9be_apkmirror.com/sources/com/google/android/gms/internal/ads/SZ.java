package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class SZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70121a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70122b;

    public SZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70121a = interfaceC10088yy0;
        this.f70122b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((C8810n00) this.f70121a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76332fc)).intValue(), (ScheduledExecutorService) this.f70122b.zzb());
    }
}
