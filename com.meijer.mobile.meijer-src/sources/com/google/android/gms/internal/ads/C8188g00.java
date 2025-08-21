package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.g00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8188g00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f75051a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f75052b;

    public C8188g00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f75051a = interfaceC10213yy0;
        this.f75052b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((R10) this.f75051a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77046Wb)).intValue(), (ScheduledExecutorService) this.f75052b.zzb());
    }
}
