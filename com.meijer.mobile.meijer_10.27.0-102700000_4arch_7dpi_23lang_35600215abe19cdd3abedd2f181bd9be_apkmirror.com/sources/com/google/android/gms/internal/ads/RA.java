package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class RA implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69798a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69799b;

    public RA(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f69798a = interfaceC10088yy0;
        this.f69799b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C8944oE) this.f69798a.zzb(), (Executor) this.f69799b.zzb());
    }
}
