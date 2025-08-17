package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.f00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7956f00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f73992a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f73993b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f73994c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f73995d;

    public C7956f00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f73992a = interfaceC10088yy0;
        this.f73993b = interfaceC10088yy02;
        this.f73994c = interfaceC10088yy03;
        this.f73995d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        H10 h10Zzb = ((J10) this.f73992a).zzb();
        C8008fZ c8008fZ = (C8008fZ) this.f73993b.zzb();
        List list = (List) this.f73994c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f73995d.zzb();
        if (list.contains("35")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76220Xb)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(h10Zzb, ((Integer) Mc.A.c().a(C8659lf.f76220Xb)).intValue(), scheduledExecutorService);
    }
}
