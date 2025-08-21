package tt;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    protected List<WeakReference<T>> f163399a = new ArrayList();

    protected final synchronized void f(T t10) {
        if (t10 != null) {
            this.f163399a.add(new WeakReference<>(t10));
            this.f163399a.size();
        }
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return new g(this.f163399a);
    }
}
