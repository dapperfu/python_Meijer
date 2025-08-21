package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8361hg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f75606a;

    /* renamed from: b, reason: collision with root package name */
    Collection f75607b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8467ig0 f75608c;

    C8361hg0(C8467ig0 c8467ig0) {
        this.f75608c = c8467ig0;
        this.f75606a = c8467ig0.f75834c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75606a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f75606a.next();
        this.f75607b = (Collection) entry.getValue();
        return this.f75608c.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6782Df0.m(this.f75607b != null, "no calls to next() since the last call to remove()");
        this.f75606a.remove();
        this.f75608c.f75835d.f80358e -= this.f75607b.size();
        this.f75607b.clear();
        this.f75607b = null;
    }
}
