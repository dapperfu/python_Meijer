package kw;

import java.util.Iterator;

/* loaded from: classes14.dex */
public class c<T> implements Iterator<jw.c> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<T> f148925a;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public jw.c next() {
        return new b(this.f148925a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148925a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f148925a.remove();
    }

    public c(Iterator<T> it) {
        this.f148925a = it;
    }
}
