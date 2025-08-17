package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.h00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8170h00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f74568a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f74569b;

    public C8170h00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f74568a = interfaceC10088yy0;
        this.f74569b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10((C8008fZ) this.f74568a.zzb(), ((Integer) Mc.A.c().a(C8659lf.f76192Vb)).intValue(), (ScheduledExecutorService) this.f74569b.zzb());
    }
}
