package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ly, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8697ly implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f76685a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f76686b;

    public C8697ly(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f76685a = interfaceC10088yy0;
        this.f76686b = interfaceC10088yy02;
    }

    public static C9583uD b(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        return new C9583uD(scheduledExecutorService, fVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9583uD zzb() {
        return b((ScheduledExecutorService) this.f76685a.zzb(), (com.google.android.gms.common.util.f) this.f76686b.zzb());
    }
}
