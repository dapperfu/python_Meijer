package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FM implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f67633a;

    public FM(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f67633a = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        Xj0 xj0B = U70.b();
        XM xmZzb = ((YM) this.f67633a).zzb();
        if (((Boolean) Oc.A.c().a(C8784lf.f77039W4)).booleanValue()) {
            setSingleton = Collections.singleton(new ZF(xmZzb, xj0B));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
