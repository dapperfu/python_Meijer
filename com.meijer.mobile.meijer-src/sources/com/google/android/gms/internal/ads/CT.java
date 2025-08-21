package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class CT implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f66626a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f66627b;

    public CT(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f66626a = interfaceC10213yy0;
        this.f66627b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BT zzb() {
        return new BT((Context) this.f66626a.zzb(), (AbstractC7543Zx) this.f66627b.zzb());
    }
}
