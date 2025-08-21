package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.My, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7108My implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69606a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69607b;

    public C7108My(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f69606a = interfaceC10213yy0;
        this.f69607b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7870d10(((TY) this.f69606a).zzb(), ((Integer) Oc.A.c().a(C8784lf.f77368tc)).intValue(), (ScheduledExecutorService) this.f69607b.zzb());
    }
}
