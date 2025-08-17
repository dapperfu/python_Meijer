package Za;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class f<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    protected List<WeakReference<T>> f42576a = new ArrayList();

    protected final synchronized void a(T t10) {
        if (t10 != null) {
            this.f42576a.add(new WeakReference<>(t10));
            this.f42576a.size();
        }
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return new h(this.f42576a);
    }
}
