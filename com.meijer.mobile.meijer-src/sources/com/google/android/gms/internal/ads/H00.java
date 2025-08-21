package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes6.dex */
public final class H00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68159a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68160b;

    public H00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f68159a = interfaceC10213yy0;
        this.f68160b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F00 zzb() {
        return new F00(((C9990wu) this.f68159a).a(), (Intent) this.f68160b.zzb());
    }
}
