package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class XX implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f72182a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f72183b;

    public XX(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f72182a = interfaceC10213yy0;
        this.f72183b = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new VX((com.google.common.util.concurrent.q) this.f72182a.zzb(), U70.b(), (ScheduledExecutorService) this.f72183b.zzb());
    }
}
