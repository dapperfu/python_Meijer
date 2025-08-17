package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.i00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8277i00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f74859a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f74860b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f74861c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f74862d;

    public C8277i00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f74859a = interfaceC10088yy0;
        this.f74860b = interfaceC10088yy02;
        this.f74861c = interfaceC10088yy03;
        this.f74862d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C8386j20 c8386j20Zzb = ((C8493k20) this.f74859a).zzb();
        C8008fZ c8008fZ = (C8008fZ) this.f74860b.zzb();
        List list = (List) this.f74861c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f74862d.zzb();
        if (list.contains("39")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76178Ub)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(c8386j20Zzb, ((Integer) Mc.A.c().a(C8659lf.f76178Ub)).intValue(), scheduledExecutorService);
    }
}
