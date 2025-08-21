package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class BJ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f66360a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f66361b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f66362c;

    public BJ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f66360a = interfaceC10213yy0;
        this.f66361b = interfaceC10213yy02;
        this.f66362c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new AJ(((QI) this.f66360a).a(), ((XH) this.f66361b).zzb(), (Executor) this.f66362c.zzb(), U70.b());
    }
}
