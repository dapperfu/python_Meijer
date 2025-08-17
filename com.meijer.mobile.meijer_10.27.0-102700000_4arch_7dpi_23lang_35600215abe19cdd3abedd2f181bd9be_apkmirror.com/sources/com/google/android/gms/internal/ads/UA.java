package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class UA implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70555a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70556b;

    public UA(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70555a = interfaceC10088yy0;
        this.f70556b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C8944oE) this.f70555a.zzb(), (Executor) this.f70556b.zzb());
    }
}
