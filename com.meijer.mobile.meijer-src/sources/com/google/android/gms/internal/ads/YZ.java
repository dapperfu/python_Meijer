package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class YZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f72411a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f72412b;

    public YZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f72411a = interfaceC10213yy0;
        this.f72412b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((L00) this.f72411a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77144dc)).intValue(), (ScheduledExecutorService) this.f72412b.zzb());
    }
}
