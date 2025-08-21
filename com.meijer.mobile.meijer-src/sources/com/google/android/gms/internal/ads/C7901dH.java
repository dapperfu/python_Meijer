package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7901dH implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final JG f74228a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f74229b;

    public C7901dH(JG jg2, InterfaceC10213yy0 interfaceC10213yy0) {
        this.f74228a = jg2;
        this.f74229b = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f74228a.d((Executor) this.f74229b.zzb());
    }
}
