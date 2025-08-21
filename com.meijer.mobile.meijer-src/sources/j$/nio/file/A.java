package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class A implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f139185a;

    public A(Iterator it) {
        this.f139185a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f139185a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return j$.desugar.sun.nio.fs.g.f(this.f139185a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f139185a.remove();
    }
}
