package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class QU implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70418a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70419b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f70420c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f70421d;

    public QU(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05) {
        this.f70418a = interfaceC10213yy02;
        this.f70419b = interfaceC10213yy03;
        this.f70420c = interfaceC10213yy04;
        this.f70421d = interfaceC10213yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final OU zzb() {
        return new OU(U70.b(), (ScheduledExecutorService) this.f70418a.zzb(), (InterfaceC6838Ez) this.f70419b.zzb(), (C8022eV) this.f70420c.zzb(), (L90) this.f70421d.zzb());
    }
}
