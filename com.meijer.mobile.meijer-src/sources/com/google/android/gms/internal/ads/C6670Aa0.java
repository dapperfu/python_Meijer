package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Aa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6670Aa0 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f65979a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f65980b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f65981c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f65982d;

    public C6670Aa0(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f65979a = interfaceC10213yy0;
        this.f65980b = interfaceC10213yy02;
        this.f65981c = interfaceC10213yy03;
        this.f65982d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C10272za0(((C9990wu) this.f65979a).a(), ((C7037Ku) this.f65980b).a(), (ScheduledExecutorService) this.f65981c.zzb(), (com.google.android.gms.common.util.f) this.f65982d.zzb());
    }
}
