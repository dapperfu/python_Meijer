package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class WA implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f71026a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f71027b;

    public WA(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f71026a = interfaceC10088yy0;
        this.f71027b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C8944oE) this.f71026a.zzb(), (Executor) this.f71027b.zzb());
    }
}
