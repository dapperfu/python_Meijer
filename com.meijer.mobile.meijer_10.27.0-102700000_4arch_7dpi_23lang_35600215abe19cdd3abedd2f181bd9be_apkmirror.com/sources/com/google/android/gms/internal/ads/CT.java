package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class CT implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f65786a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f65787b;

    public CT(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f65786a = interfaceC10088yy0;
        this.f65787b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BT zzb() {
        return new BT((Context) this.f65786a.zzb(), (AbstractC7418Zx) this.f65787b.zzb());
    }
}
