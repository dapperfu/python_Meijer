package ow;

import java.util.Iterator;

/* loaded from: classes13.dex */
public class c<T> implements Iterator<nw.c> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<T> f155259a;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nw.c next() {
        return new b(this.f155259a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f155259a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f155259a.remove();
    }

    public c(Iterator<T> it) {
        this.f155259a = it;
    }
}
