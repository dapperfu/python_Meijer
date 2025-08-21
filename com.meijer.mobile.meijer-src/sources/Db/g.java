package Db;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class g<T> implements f<T>, Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    protected List<WeakReference<T>> f6091a = new ArrayList();

    @Override // Db.f
    public final synchronized void a(T t10) {
        if (t10 != null) {
            this.f6091a.add(new WeakReference<>(t10));
            if (this.f6091a.size() == 1) {
                o();
            }
        }
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return new bb.h(this.f6091a);
    }

    public void l() {
    }

    public final synchronized void m(T t10) {
        try {
            if (this.f6091a.size() > 0) {
                ListIterator<WeakReference<T>> listIterator = this.f6091a.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    T t11 = listIterator.next().get();
                    if (t11 == t10) {
                        listIterator.remove();
                        break;
                    } else if (t11 == null) {
                        listIterator.remove();
                    }
                }
                if (this.f6091a.size() == 0) {
                    l();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized int n() {
        return this.f6091a.size();
    }

    public void o() {
    }
}
