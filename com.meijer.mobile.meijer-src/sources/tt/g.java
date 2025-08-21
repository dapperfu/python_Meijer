package tt;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes12.dex */
public final class g<TT> implements Iterator<TT> {

    /* renamed from: a, reason: collision with root package name */
    List<WeakReference<TT>> f163400a;

    /* renamed from: b, reason: collision with root package name */
    ListIterator<WeakReference<TT>> f163401b;

    /* renamed from: c, reason: collision with root package name */
    TT f163402c;

    private void a() {
        while (this.f163401b.hasNext()) {
            WeakReference<TT> next = this.f163401b.next();
            TT tt2 = next.get();
            this.f163402c = tt2;
            if (tt2 != null) {
                return;
            }
            this.f163401b.remove();
            this.f163400a.remove(next);
        }
        this.f163402c = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f163402c != null;
    }

    @Override // java.util.Iterator
    public final TT next() {
        TT tt2 = this.f163402c;
        a();
        return tt2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public g(List<WeakReference<TT>> list) {
        this.f163400a = list;
        this.f163401b = new ArrayList(list).listIterator();
        a();
    }
}
