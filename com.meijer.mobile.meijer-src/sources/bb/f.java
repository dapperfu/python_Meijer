package bb;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class f<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    protected List<WeakReference<T>> f60243a = new ArrayList();

    protected final synchronized void a(T t10) {
        if (t10 != null) {
            this.f60243a.add(new WeakReference<>(t10));
            this.f60243a.size();
        }
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return new h(this.f60243a);
    }
}
