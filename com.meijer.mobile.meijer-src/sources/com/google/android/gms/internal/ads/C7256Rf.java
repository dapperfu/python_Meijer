package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7256Rf implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70751a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70752b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f70753c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f70754d;

    public C7256Rf(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f70751a = interfaceC10213yy0;
        this.f70752b = interfaceC10213yy02;
        this.f70753c = interfaceC10213yy03;
        this.f70754d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7222Qf zzb() {
        return new C7222Qf((ScheduledExecutorService) this.f70751a.zzb(), (Xc.l0) this.f70752b.zzb(), (Xc.c0) this.f70753c.zzb(), (CN) this.f70754d.zzb());
    }
}
