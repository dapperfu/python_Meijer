package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class FY implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f66824a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f66825b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f66826c;

    public FY(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f66824a = interfaceC10088yy0;
        this.f66825b = interfaceC10088yy02;
        this.f66826c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DY(((C9865wu) this.f66824a).a(), (C6568Aq) this.f66825b.zzb(), (ScheduledExecutorService) this.f66826c.zzb(), U70.b());
    }
}
