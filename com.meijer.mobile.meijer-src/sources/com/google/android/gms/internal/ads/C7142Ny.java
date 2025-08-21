package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7142Ny implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69815a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69816b;

    public C7142Ny(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f69815a = interfaceC10213yy0;
        this.f69816b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((E00) this.f69815a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77312pc)).intValue(), (ScheduledExecutorService) this.f69816b.zzb());
    }
}
