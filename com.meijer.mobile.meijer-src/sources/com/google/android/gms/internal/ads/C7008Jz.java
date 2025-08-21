package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Jz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7008Jz implements InterfaceC8129fV {

    /* renamed from: a, reason: collision with root package name */
    public final List f68838a;

    public C7008Jz(List list) {
        this.f68838a = list;
    }

    public C7008Jz(C6702Az c6702Az) {
        this.f68838a = Collections.singletonList(Mj0.h(c6702Az));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8129fV
    public final void zzr() {
        Iterator it = this.f68838a.iterator();
        while (it.hasNext()) {
            Mj0.r((com.google.common.util.concurrent.q) it.next(), new C6974Iz(this), C8048ek0.c());
        }
    }
}
