package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9535sg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f79127a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f79128b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9642tg0 f79129c;

    C9535sg0(C9642tg0 c9642tg0, Iterator it) {
        this.f79129c = c9642tg0;
        this.f79128b = c9642tg0.f79452b;
        this.f79127a = it;
    }

    C9535sg0(C9642tg0 c9642tg0) {
        this.f79129c = c9642tg0;
        Collection collection = c9642tg0.f79452b;
        this.f79128b = collection;
        this.f79127a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        this.f79129c.zzb();
        if (this.f79129c.f79452b != this.f79128b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f79127a.remove();
        AbstractC9963wg0 abstractC9963wg0 = this.f79129c.f79455e;
        abstractC9963wg0.f80358e--;
        this.f79129c.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f79127a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f79127a.next();
    }
}
