package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.gQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8231gQ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f75149a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f75150b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f75151c;

    public C8231gQ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05) {
        this.f75149a = interfaceC10213yy0;
        this.f75150b = interfaceC10213yy04;
        this.f75151c = interfaceC10213yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8017eQ zzb() {
        return new C8017eQ((ScheduledExecutorService) this.f75149a.zzb(), U70.b(), C7564a80.b(), ((BQ) this.f75150b).zzb(), C8397hy0.a(C9678ty0.a(this.f75151c)));
    }
}
