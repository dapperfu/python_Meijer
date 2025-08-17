package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes6.dex */
public final class H00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67319a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67320b;

    public H00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f67319a = interfaceC10088yy0;
        this.f67320b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F00 zzb() {
        return new F00(((C9865wu) this.f67319a).a(), (Intent) this.f67320b.zzb());
    }
}
