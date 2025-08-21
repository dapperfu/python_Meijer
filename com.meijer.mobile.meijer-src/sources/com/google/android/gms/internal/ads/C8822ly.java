package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ly, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8822ly implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f77525a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f77526b;

    public C8822ly(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f77525a = interfaceC10213yy0;
        this.f77526b = interfaceC10213yy02;
    }

    public static C9708uD b(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        return new C9708uD(scheduledExecutorService, fVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9708uD zzb() {
        return b((ScheduledExecutorService) this.f77525a.zzb(), (com.google.android.gms.common.util.f) this.f77526b.zzb());
    }
}
