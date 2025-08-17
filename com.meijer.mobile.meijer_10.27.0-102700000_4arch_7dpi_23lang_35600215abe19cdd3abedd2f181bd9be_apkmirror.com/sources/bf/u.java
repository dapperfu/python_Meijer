package bf;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
class u<T> implements If.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f60207b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<If.b<T>> f60206a = Collections.newSetFromMap(new ConcurrentHashMap());

    private synchronized void d() {
        try {
            Iterator<If.b<T>> it = this.f60206a.iterator();
            while (it.hasNext()) {
                this.f60207b.add(it.next().get());
            }
            this.f60206a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(If.b<T> bVar) {
        try {
            if (this.f60207b == null) {
                this.f60206a.add(bVar);
            } else {
                this.f60207b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static u<?> b(Collection<If.b<?>> collection) {
        return new u<>((Set) collection);
    }

    @Override // If.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f60207b == null) {
            synchronized (this) {
                try {
                    if (this.f60207b == null) {
                        this.f60207b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f60207b);
    }

    u(Collection<If.b<T>> collection) {
        this.f60206a.addAll(collection);
    }
}
