package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9704uB implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f79598a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f79599b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f79600c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f79601d;

    public C9704uB(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05) {
        this.f79598a = interfaceC10213yy0;
        this.f79599b = interfaceC10213yy02;
        this.f79600c = interfaceC10213yy03;
        this.f79601d = interfaceC10213yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9597tB((C9492sC) this.f79598a.zzb(), ((C7313Sz) this.f79599b).a(), (ScheduledExecutorService) this.f79600c.zzb(), U70.b(), ((C7347Tz) this.f79601d).a());
    }
}
