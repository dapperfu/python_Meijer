package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.b00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7655b00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73536a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73537b;

    public C7655b00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f73536a = interfaceC10213yy0;
        this.f73537b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((C7657b10) this.f73536a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77116bc)).intValue(), (ScheduledExecutorService) this.f73537b.zzb());
    }
}
