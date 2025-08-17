package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class QU implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69578a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69579b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f69580c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f69581d;

    public QU(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05) {
        this.f69578a = interfaceC10088yy02;
        this.f69579b = interfaceC10088yy03;
        this.f69580c = interfaceC10088yy04;
        this.f69581d = interfaceC10088yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final OU zzb() {
        return new OU(U70.b(), (ScheduledExecutorService) this.f69578a.zzb(), (InterfaceC6713Ez) this.f69579b.zzb(), (C7897eV) this.f69580c.zzb(), (L90) this.f69581d.zzb());
    }
}
