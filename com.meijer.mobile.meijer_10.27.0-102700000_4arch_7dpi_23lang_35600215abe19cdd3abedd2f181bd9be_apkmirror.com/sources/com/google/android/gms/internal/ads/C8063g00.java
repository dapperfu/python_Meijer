package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.g00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8063g00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f74211a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f74212b;

    public C8063g00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f74211a = interfaceC10088yy0;
        this.f74212b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((R10) this.f74211a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76206Wb)).intValue(), (ScheduledExecutorService) this.f74212b.zzb());
    }
}
