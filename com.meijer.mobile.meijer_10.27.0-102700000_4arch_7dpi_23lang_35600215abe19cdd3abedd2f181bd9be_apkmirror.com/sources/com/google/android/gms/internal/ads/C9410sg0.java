package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9410sg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f78287a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f78288b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9517tg0 f78289c;

    C9410sg0(C9517tg0 c9517tg0, Iterator it) {
        this.f78289c = c9517tg0;
        this.f78288b = c9517tg0.f78612b;
        this.f78287a = it;
    }

    C9410sg0(C9517tg0 c9517tg0) {
        this.f78289c = c9517tg0;
        Collection collection = c9517tg0.f78612b;
        this.f78288b = collection;
        this.f78287a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        this.f78289c.zzb();
        if (this.f78289c.f78612b != this.f78288b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f78287a.remove();
        AbstractC9838wg0 abstractC9838wg0 = this.f78289c.f78615e;
        abstractC9838wg0.f79518e--;
        this.f78289c.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f78287a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f78287a.next();
    }
}
