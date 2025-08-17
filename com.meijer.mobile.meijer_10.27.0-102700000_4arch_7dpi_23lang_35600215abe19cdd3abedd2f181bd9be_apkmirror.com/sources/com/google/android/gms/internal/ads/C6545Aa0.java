package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Aa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6545Aa0 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f65139a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f65140b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f65141c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f65142d;

    public C6545Aa0(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f65139a = interfaceC10088yy0;
        this.f65140b = interfaceC10088yy02;
        this.f65141c = interfaceC10088yy03;
        this.f65142d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C10147za0(((C9865wu) this.f65139a).a(), ((C6912Ku) this.f65140b).a(), (ScheduledExecutorService) this.f65141c.zzb(), (com.google.android.gms.common.util.f) this.f65142d.zzb());
    }
}
