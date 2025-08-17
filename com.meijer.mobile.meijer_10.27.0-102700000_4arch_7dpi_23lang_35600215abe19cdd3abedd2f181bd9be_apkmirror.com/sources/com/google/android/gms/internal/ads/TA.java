package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class TA implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70311a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70312b;

    public TA(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70311a = interfaceC10088yy0;
        this.f70312b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C8944oE) this.f70311a.zzb(), (Executor) this.f70312b.zzb());
    }
}
