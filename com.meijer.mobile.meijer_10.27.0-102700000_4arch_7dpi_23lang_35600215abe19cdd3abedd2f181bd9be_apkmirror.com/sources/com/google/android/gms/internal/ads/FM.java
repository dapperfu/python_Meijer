package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FM implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f66793a;

    public FM(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f66793a = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        Xj0 xj0B = U70.b();
        XM xmZzb = ((YM) this.f66793a).zzb();
        if (((Boolean) Mc.A.c().a(C8659lf.f76199W4)).booleanValue()) {
            setSingleton = Collections.singleton(new ZF(xmZzb, xj0B));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        C9233qy0.b(setSingleton);
        return setSingleton;
    }
}
