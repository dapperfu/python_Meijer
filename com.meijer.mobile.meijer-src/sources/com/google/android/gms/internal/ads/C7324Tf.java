package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7324Tf implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71268a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71269b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f71270c;

    public C7324Tf(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f71268a = interfaceC10213yy0;
        this.f71269b = interfaceC10213yy02;
        this.f71270c = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7290Sf(((C9990wu) this.f71268a).a(), (ScheduledExecutorService) this.f71269b.zzb(), C7004Jv.a(), (W80) this.f71270c.zzb());
    }
}
