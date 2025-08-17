package tt;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class g<TT> implements Iterator<TT> {

    /* renamed from: a, reason: collision with root package name */
    List<WeakReference<TT>> f162098a;

    /* renamed from: b, reason: collision with root package name */
    ListIterator<WeakReference<TT>> f162099b;

    /* renamed from: c, reason: collision with root package name */
    TT f162100c;

    private void a() {
        while (this.f162099b.hasNext()) {
            WeakReference<TT> next = this.f162099b.next();
            TT tt2 = next.get();
            this.f162100c = tt2;
            if (tt2 != null) {
                return;
            }
            this.f162099b.remove();
            this.f162098a.remove(next);
        }
        this.f162100c = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f162100c != null;
    }

    @Override // java.util.Iterator
    public final TT next() {
        TT tt2 = this.f162100c;
        a();
        return tt2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public g(List<WeakReference<TT>> list) {
        this.f162098a = list;
        this.f162099b = new ArrayList(list).listIterator();
        a();
    }
}
