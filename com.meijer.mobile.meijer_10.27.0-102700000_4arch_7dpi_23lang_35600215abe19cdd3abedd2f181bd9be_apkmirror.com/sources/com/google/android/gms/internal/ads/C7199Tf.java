package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7199Tf implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70428a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70429b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f70430c;

    public C7199Tf(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f70428a = interfaceC10088yy0;
        this.f70429b = interfaceC10088yy02;
        this.f70430c = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7165Sf(((C9865wu) this.f70428a).a(), (ScheduledExecutorService) this.f70429b.zzb(), C6879Jv.a(), (W80) this.f70430c.zzb());
    }
}
