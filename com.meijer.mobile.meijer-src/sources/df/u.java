package df;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
class u<T> implements Kf.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f128442b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<Kf.b<T>> f128441a = Collections.newSetFromMap(new ConcurrentHashMap());

    private synchronized void d() {
        try {
            Iterator<Kf.b<T>> it = this.f128441a.iterator();
            while (it.hasNext()) {
                this.f128442b.add(it.next().get());
            }
            this.f128441a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(Kf.b<T> bVar) {
        try {
            if (this.f128442b == null) {
                this.f128441a.add(bVar);
            } else {
                this.f128442b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static u<?> b(Collection<Kf.b<?>> collection) {
        return new u<>((Set) collection);
    }

    @Override // Kf.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f128442b == null) {
            synchronized (this) {
                try {
                    if (this.f128442b == null) {
                        this.f128442b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f128442b);
    }

    u(Collection<Kf.b<T>> collection) {
        this.f128441a.addAll(collection);
    }
}
