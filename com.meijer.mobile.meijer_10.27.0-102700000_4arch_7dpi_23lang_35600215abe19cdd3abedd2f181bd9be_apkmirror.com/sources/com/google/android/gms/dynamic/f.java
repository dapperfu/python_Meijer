package com.google.android.gms.dynamic;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f64980a;

    f(a aVar) {
        this.f64980a = aVar;
    }

    @Override // com.google.android.gms.dynamic.e
    public final void a(c cVar) {
        this.f64980a.f64975a = cVar;
        Iterator it = this.f64980a.f64977c.iterator();
        while (it.hasNext()) {
            ((m) it.next()).b(this.f64980a.f64975a);
        }
        this.f64980a.f64977c.clear();
        this.f64980a.f64976b = null;
    }
}
