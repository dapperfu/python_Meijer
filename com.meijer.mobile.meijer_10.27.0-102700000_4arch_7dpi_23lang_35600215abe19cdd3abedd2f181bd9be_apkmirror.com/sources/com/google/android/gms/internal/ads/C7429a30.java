package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.a30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7429a30 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f72336a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f72337b;

    public C7429a30(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f72336a = interfaceC10088yy02;
        this.f72337b = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new Y20(C8800mw.a(), (ScheduledExecutorService) this.f72336a.zzb(), ((C9865wu) this.f72337b).a());
    }
}
