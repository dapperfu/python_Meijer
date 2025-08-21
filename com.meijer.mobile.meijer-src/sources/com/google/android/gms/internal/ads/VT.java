package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class VT implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71711a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71712b;

    public VT(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f71711a = interfaceC10213yy0;
        this.f71712b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UT zzb() {
        return new UT((Context) this.f71711a.zzb(), (AbstractC7278Ry) this.f71712b.zzb());
    }
}
