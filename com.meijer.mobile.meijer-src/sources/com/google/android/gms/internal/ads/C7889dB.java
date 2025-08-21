package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7889dB implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f74214a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f74215b;

    public C7889dB(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f74214a = interfaceC10213yy0;
        this.f74215b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C9069oE) this.f74214a.zzb(), (Executor) this.f74215b.zzb());
    }
}
