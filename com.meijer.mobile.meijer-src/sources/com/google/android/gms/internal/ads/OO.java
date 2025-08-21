package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class OO implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69909a;

    public OO(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f69909a = interfaceC10213yy0;
    }

    public static ZF a(NO no2, Executor executor) {
        return new ZF(no2, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a((NO) this.f69909a.zzb(), U70.b());
    }
}
