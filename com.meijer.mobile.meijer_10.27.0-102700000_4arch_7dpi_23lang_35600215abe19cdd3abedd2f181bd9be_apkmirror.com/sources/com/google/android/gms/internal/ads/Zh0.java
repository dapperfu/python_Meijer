package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
final class Zh0 extends AbstractC7809dg0 {

    /* renamed from: c, reason: collision with root package name */
    final Iterator f72225c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Set f72226d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Set f72227e;

    Zh0(C7493ai0 c7493ai0, Set set, Set set2) {
        this.f72226d = set;
        this.f72227e = set2;
        this.f72225c = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7809dg0
    protected final Object a() {
        while (this.f72225c.hasNext()) {
            Iterator it = this.f72225c;
            Set set = this.f72227e;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
