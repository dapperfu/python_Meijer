package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class VT implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70871a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70872b;

    public VT(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70871a = interfaceC10088yy0;
        this.f70872b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UT zzb() {
        return new UT((Context) this.f70871a.zzb(), (AbstractC7153Ry) this.f70872b.zzb());
    }
}
