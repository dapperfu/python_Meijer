package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8236hg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f74766a;

    /* renamed from: b, reason: collision with root package name */
    Collection f74767b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8342ig0 f74768c;

    C8236hg0(C8342ig0 c8342ig0) {
        this.f74768c = c8342ig0;
        this.f74766a = c8342ig0.f74994c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f74766a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f74766a.next();
        this.f74767b = (Collection) entry.getValue();
        return this.f74768c.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6657Df0.m(this.f74767b != null, "no calls to next() since the last call to remove()");
        this.f74766a.remove();
        this.f74768c.f74995d.f79518e -= this.f74767b.size();
        this.f74767b.clear();
        this.f74767b = null;
    }
}
