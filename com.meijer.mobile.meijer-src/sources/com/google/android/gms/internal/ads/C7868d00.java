package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.d00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7868d00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f74155a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f74156b;

    public C7868d00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f74155a = interfaceC10213yy0;
        this.f74156b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((C9044o10) this.f74155a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77088Zb)).intValue(), (ScheduledExecutorService) this.f74156b.zzb());
    }
}
