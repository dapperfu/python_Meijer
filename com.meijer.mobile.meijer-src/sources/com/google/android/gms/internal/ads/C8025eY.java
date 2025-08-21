package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.eY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8025eY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f74740a;

    C8025eY(Set set) {
        this.f74740a = set;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f74740a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return Mj0.h(new C7812cY(arrayList, null));
    }
}
