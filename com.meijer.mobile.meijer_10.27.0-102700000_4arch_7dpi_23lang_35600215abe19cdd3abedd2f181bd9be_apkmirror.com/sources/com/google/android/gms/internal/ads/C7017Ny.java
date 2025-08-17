package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7017Ny implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68975a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68976b;

    public C7017Ny(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f68975a = interfaceC10088yy0;
        this.f68976b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((E00) this.f68975a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76472pc)).intValue(), (ScheduledExecutorService) this.f68976b.zzb());
    }
}
