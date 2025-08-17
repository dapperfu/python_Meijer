package Za;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class h<TT> implements Iterator<TT> {

    /* renamed from: a, reason: collision with root package name */
    List<WeakReference<TT>> f42577a;

    /* renamed from: b, reason: collision with root package name */
    ListIterator<WeakReference<TT>> f42578b;

    /* renamed from: c, reason: collision with root package name */
    TT f42579c;

    private void a() {
        while (this.f42578b.hasNext()) {
            WeakReference<TT> next = this.f42578b.next();
            TT tt2 = next.get();
            this.f42579c = tt2;
            if (tt2 != null) {
                return;
            }
            this.f42578b.remove();
            this.f42577a.remove(next);
        }
        this.f42579c = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42579c != null;
    }

    @Override // java.util.Iterator
    public final TT next() {
        TT tt2 = this.f42579c;
        a();
        return tt2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public h(List<WeakReference<TT>> list) {
        this.f42577a = list;
        this.f42578b = new ArrayList(list).listIterator();
        a();
    }
}
