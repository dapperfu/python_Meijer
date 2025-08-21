package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10237zA implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f81216a;

    public C10237zA(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f81216a = interfaceC10213yy0;
    }

    public static ZF a(C9675tx c9675tx, Executor executor) {
        return new ZF(c9675tx, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a((C9675tx) this.f81216a.zzb(), U70.b());
    }
}
