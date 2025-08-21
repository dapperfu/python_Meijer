package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.a30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7554a30 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73176a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73177b;

    public C7554a30(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f73176a = interfaceC10213yy02;
        this.f73177b = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new Y20(C8925mw.a(), (ScheduledExecutorService) this.f73176a.zzb(), ((C9990wu) this.f73177b).a());
    }
}
