package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.f00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8081f00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f74832a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f74833b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f74834c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f74835d;

    public C8081f00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f74832a = interfaceC10213yy0;
        this.f74833b = interfaceC10213yy02;
        this.f74834c = interfaceC10213yy03;
        this.f74835d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        H10 h10Zzb = ((J10) this.f74832a).zzb();
        C8133fZ c8133fZ = (C8133fZ) this.f74833b.zzb();
        List list = (List) this.f74834c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f74835d.zzb();
        if (list.contains("35")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f77060Xb)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(h10Zzb, ((Integer) Oc.A.c().a(C8784lf.f77060Xb)).intValue(), scheduledExecutorService);
    }
}
