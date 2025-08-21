package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.a00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7548a00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73169a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73170b;

    public C7548a00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f73169a = interfaceC10213yy0;
        this.f73170b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((S00) this.f73169a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77354sc)).intValue(), (ScheduledExecutorService) this.f73170b.zzb());
    }
}
