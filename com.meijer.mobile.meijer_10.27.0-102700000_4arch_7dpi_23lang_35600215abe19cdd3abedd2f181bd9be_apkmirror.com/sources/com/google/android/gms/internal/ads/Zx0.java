package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class Zx0 extends AbstractList {

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7525ay0 f72312c = AbstractC7525ay0.b(Zx0.class);

    /* renamed from: a, reason: collision with root package name */
    final List f72313a;

    /* renamed from: b, reason: collision with root package name */
    final Iterator f72314b;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Yx0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (this.f72313a.size() > i10) {
            return this.f72313a.get(i10);
        }
        if (!this.f72314b.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f72313a.add(this.f72314b.next());
        return get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        AbstractC7525ay0 abstractC7525ay0 = f72312c;
        abstractC7525ay0.a("potentially expensive size() call");
        abstractC7525ay0.a("blowup running");
        while (this.f72314b.hasNext()) {
            this.f72313a.add(this.f72314b.next());
        }
        return this.f72313a.size();
    }

    public Zx0(List list, Iterator it) {
        this.f72313a = list;
        this.f72314b = it;
    }
}
