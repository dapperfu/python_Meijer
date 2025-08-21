package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class FY implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f67664a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f67665b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f67666c;

    public FY(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f67664a = interfaceC10213yy0;
        this.f67665b = interfaceC10213yy02;
        this.f67666c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DY(((C9990wu) this.f67664a).a(), (C6693Aq) this.f67665b.zzb(), (ScheduledExecutorService) this.f67666c.zzb(), U70.b());
    }
}
