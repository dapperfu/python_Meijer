package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.i00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8402i00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f75699a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f75700b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f75701c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f75702d;

    public C8402i00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f75699a = interfaceC10213yy0;
        this.f75700b = interfaceC10213yy02;
        this.f75701c = interfaceC10213yy03;
        this.f75702d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C8511j20 c8511j20Zzb = ((C8618k20) this.f75699a).zzb();
        C8133fZ c8133fZ = (C8133fZ) this.f75700b.zzb();
        List list = (List) this.f75701c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f75702d.zzb();
        if (list.contains("39")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f77018Ub)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(c8511j20Zzb, ((Integer) Oc.A.c().a(C8784lf.f77018Ub)).intValue(), scheduledExecutorService);
    }
}
