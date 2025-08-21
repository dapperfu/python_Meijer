package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class Zx0 extends AbstractList {

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7650ay0 f73152c = AbstractC7650ay0.b(Zx0.class);

    /* renamed from: a, reason: collision with root package name */
    final List f73153a;

    /* renamed from: b, reason: collision with root package name */
    final Iterator f73154b;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Yx0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (this.f73153a.size() > i10) {
            return this.f73153a.get(i10);
        }
        if (!this.f73154b.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f73153a.add(this.f73154b.next());
        return get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        AbstractC7650ay0 abstractC7650ay0 = f73152c;
        abstractC7650ay0.a("potentially expensive size() call");
        abstractC7650ay0.a("blowup running");
        while (this.f73154b.hasNext()) {
            this.f73153a.add(this.f73154b.next());
        }
        return this.f73153a.size();
    }

    public Zx0(List list, Iterator it) {
        this.f73153a = list;
        this.f73154b = it;
    }
}
