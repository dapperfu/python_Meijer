package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9579uB implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f78758a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f78759b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f78760c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f78761d;

    public C9579uB(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05) {
        this.f78758a = interfaceC10088yy0;
        this.f78759b = interfaceC10088yy02;
        this.f78760c = interfaceC10088yy03;
        this.f78761d = interfaceC10088yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9472tB((C9367sC) this.f78758a.zzb(), ((C7188Sz) this.f78759b).a(), (ScheduledExecutorService) this.f78760c.zzb(), U70.b(), ((C7222Tz) this.f78761d).a());
    }
}
