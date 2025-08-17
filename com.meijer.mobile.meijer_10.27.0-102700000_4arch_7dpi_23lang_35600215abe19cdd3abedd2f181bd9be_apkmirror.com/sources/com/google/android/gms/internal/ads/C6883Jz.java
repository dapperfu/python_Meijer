package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Jz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6883Jz implements InterfaceC8004fV {

    /* renamed from: a, reason: collision with root package name */
    public final List f67998a;

    public C6883Jz(List list) {
        this.f67998a = list;
    }

    public C6883Jz(C6577Az c6577Az) {
        this.f67998a = Collections.singletonList(Mj0.h(c6577Az));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8004fV
    public final void zzr() {
        Iterator it = this.f67998a.iterator();
        while (it.hasNext()) {
            Mj0.r((com.google.common.util.concurrent.q) it.next(), new C6849Iz(this), C7923ek0.c());
        }
    }
}
