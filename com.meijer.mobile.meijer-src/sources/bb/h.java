package bb;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class h<TT> implements Iterator<TT> {

    /* renamed from: a, reason: collision with root package name */
    List<WeakReference<TT>> f60244a;

    /* renamed from: b, reason: collision with root package name */
    ListIterator<WeakReference<TT>> f60245b;

    /* renamed from: c, reason: collision with root package name */
    TT f60246c;

    private void a() {
        while (this.f60245b.hasNext()) {
            WeakReference<TT> next = this.f60245b.next();
            TT tt2 = next.get();
            this.f60246c = tt2;
            if (tt2 != null) {
                return;
            }
            this.f60245b.remove();
            this.f60244a.remove(next);
        }
        this.f60246c = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60246c != null;
    }

    @Override // java.util.Iterator
    public final TT next() {
        TT tt2 = this.f60246c;
        a();
        return tt2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public h(List<WeakReference<TT>> list) {
        this.f60244a = list;
        this.f60245b = new ArrayList(list).listIterator();
        a();
    }
}
