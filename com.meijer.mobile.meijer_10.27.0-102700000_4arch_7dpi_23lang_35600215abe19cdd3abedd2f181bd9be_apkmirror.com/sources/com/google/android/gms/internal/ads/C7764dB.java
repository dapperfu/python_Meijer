package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7764dB implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f73374a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f73375b;

    public C7764dB(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f73374a = interfaceC10088yy0;
        this.f73375b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C8944oE) this.f73374a.zzb(), (Executor) this.f73375b.zzb());
    }
}
