package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class RA implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70638a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70639b;

    public RA(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f70638a = interfaceC10213yy0;
        this.f70639b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C9069oE) this.f70638a.zzb(), (Executor) this.f70639b.zzb());
    }
}
