package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.a00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7423a00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f72329a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f72330b;

    public C7423a00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f72329a = interfaceC10088yy0;
        this.f72330b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((S00) this.f72329a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76514sc)).intValue(), (ScheduledExecutorService) this.f72330b.zzb());
    }
}
