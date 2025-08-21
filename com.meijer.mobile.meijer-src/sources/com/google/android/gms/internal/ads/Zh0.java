package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
final class Zh0 extends AbstractC7934dg0 {

    /* renamed from: c, reason: collision with root package name */
    final Iterator f73065c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Set f73066d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Set f73067e;

    Zh0(C7618ai0 c7618ai0, Set set, Set set2) {
        this.f73066d = set;
        this.f73067e = set2;
        this.f73065c = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7934dg0
    protected final Object a() {
        while (this.f73065c.hasNext()) {
            Iterator it = this.f73065c;
            Set set = this.f73067e;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
