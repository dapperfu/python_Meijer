package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9047pC implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f77526a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f77527b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f77528c;

    public C9047pC(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f77526a = interfaceC10088yy0;
        this.f77527b = interfaceC10088yy02;
        this.f77528c = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C8833nC(((C8940oC) this.f77526a).zzb(), ((C9874wy0) this.f77527b).zzb(), U70.b(), (ScheduledExecutorService) this.f77528c.zzb());
    }
}
