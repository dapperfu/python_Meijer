package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.gQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8106gQ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f74309a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f74310b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f74311c;

    public C8106gQ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05) {
        this.f74309a = interfaceC10088yy0;
        this.f74310b = interfaceC10088yy04;
        this.f74311c = interfaceC10088yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7892eQ zzb() {
        return new C7892eQ((ScheduledExecutorService) this.f74309a.zzb(), U70.b(), C7439a80.b(), ((BQ) this.f74310b).zzb(), C8272hy0.a(C9553ty0.a(this.f74311c)));
    }
}
