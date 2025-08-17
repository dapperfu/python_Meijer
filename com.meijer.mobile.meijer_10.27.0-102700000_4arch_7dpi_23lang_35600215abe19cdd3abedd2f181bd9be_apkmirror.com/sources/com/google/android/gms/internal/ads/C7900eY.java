package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.eY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7900eY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f73900a;

    C7900eY(Set set) {
        this.f73900a = set;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f73900a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return Mj0.h(new C7687cY(arrayList, null));
    }
}
