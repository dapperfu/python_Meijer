package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.e00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7849e00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f73738a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f73739b;

    public C7849e00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f73738a = interfaceC10088yy0;
        this.f73739b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((F10) this.f73738a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76234Yb)).intValue(), (ScheduledExecutorService) this.f73739b.zzb());
    }
}
