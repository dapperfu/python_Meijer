package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class A implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f138596a;

    public A(Iterator it) {
        this.f138596a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f138596a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return j$.desugar.sun.nio.fs.g.f(this.f138596a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f138596a.remove();
    }
}
