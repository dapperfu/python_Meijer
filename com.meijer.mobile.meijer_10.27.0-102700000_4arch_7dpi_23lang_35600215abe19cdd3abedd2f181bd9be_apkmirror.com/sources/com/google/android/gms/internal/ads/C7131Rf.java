package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7131Rf implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69911a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69912b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f69913c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f69914d;

    public C7131Rf(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f69911a = interfaceC10088yy0;
        this.f69912b = interfaceC10088yy02;
        this.f69913c = interfaceC10088yy03;
        this.f69914d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7097Qf zzb() {
        return new C7097Qf((ScheduledExecutorService) this.f69911a.zzb(), (Vc.l0) this.f69912b.zzb(), (Vc.c0) this.f69913c.zzb(), (CN) this.f69914d.zzb());
    }
}
