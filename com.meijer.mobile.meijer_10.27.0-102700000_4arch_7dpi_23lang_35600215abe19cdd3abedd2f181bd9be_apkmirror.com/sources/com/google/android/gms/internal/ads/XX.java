package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class XX implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f71342a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f71343b;

    public XX(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f71342a = interfaceC10088yy0;
        this.f71343b = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new VX((com.google.common.util.concurrent.q) this.f71342a.zzb(), U70.b(), (ScheduledExecutorService) this.f71343b.zzb());
    }
}
