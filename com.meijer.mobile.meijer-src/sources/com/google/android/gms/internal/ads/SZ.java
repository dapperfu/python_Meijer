package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class SZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70961a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70962b;

    public SZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f70961a = interfaceC10213yy0;
        this.f70962b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((C8935n00) this.f70961a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77172fc)).intValue(), (ScheduledExecutorService) this.f70962b.zzb());
    }
}
