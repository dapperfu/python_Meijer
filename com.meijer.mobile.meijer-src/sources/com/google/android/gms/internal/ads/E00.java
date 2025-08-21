package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class E00 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f67155a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f67156b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f67157c;

    public E00(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f67155a = interfaceC10213yy02;
        this.f67156b = interfaceC10213yy03;
        this.f67157c = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C00 zzb() {
        return new C00(U70.b(), ((C8715ky) this.f67155a).a(), (Context) this.f67156b.zzb(), ((C9999wy0) this.f67157c).zzb());
    }
}
