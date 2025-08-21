package com.google.android.gms.dynamic;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f65820a;

    f(a aVar) {
        this.f65820a = aVar;
    }

    @Override // com.google.android.gms.dynamic.e
    public final void a(c cVar) {
        this.f65820a.f65815a = cVar;
        Iterator it = this.f65820a.f65817c.iterator();
        while (it.hasNext()) {
            ((m) it.next()).b(this.f65820a.f65815a);
        }
        this.f65820a.f65817c.clear();
        this.f65820a.f65816b = null;
    }
}
