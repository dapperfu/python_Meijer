package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9172pC implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f78366a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f78367b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f78368c;

    public C9172pC(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f78366a = interfaceC10213yy0;
        this.f78367b = interfaceC10213yy02;
        this.f78368c = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C8958nC(((C9065oC) this.f78366a).zzb(), ((C9999wy0) this.f78367b).zzb(), U70.b(), (ScheduledExecutorService) this.f78368c.zzb());
    }
}
