package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class E00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f66315a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f66316b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f66317c;

    public E00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f66315a = interfaceC10088yy02;
        this.f66316b = interfaceC10088yy03;
        this.f66317c = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C00 zzb() {
        return new C00(U70.b(), ((C8590ky) this.f66315a).a(), (Context) this.f66316b.zzb(), ((C9874wy0) this.f66317c).zzb());
    }
}
