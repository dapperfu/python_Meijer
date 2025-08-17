package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class BJ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f65520a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f65521b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f65522c;

    public BJ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f65520a = interfaceC10088yy0;
        this.f65521b = interfaceC10088yy02;
        this.f65522c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new AJ(((QI) this.f65520a).a(), ((XH) this.f65521b).zzb(), (Executor) this.f65522c.zzb(), U70.b());
    }
}
