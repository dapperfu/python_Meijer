package bf;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
class s implements Ff.d, Ff.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<Ff.b<Object>, Executor>> f60200a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<Ff.a<?>> f60201b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f60202c;

    private synchronized Set<Map.Entry<Ff.b<Object>, Executor>> f(Ff.a<?> aVar) {
        ConcurrentHashMap<Ff.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f60200a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // Ff.d
    public synchronized <T> void a(Class<T> cls, Ff.b<? super T> bVar) {
        z.b(cls);
        z.b(bVar);
        if (this.f60200a.containsKey(cls)) {
            ConcurrentHashMap<Ff.b<Object>, Executor> concurrentHashMap = this.f60200a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f60200a.remove(cls);
            }
        }
    }

    @Override // Ff.d
    public synchronized <T> void b(Class<T> cls, Executor executor, Ff.b<? super T> bVar) {
        try {
            z.b(cls);
            z.b(bVar);
            z.b(executor);
            if (!this.f60200a.containsKey(cls)) {
                this.f60200a.put(cls, new ConcurrentHashMap<>());
            }
            this.f60200a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void e() {
        Queue<Ff.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f60201b;
                if (queue != null) {
                    this.f60201b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<Ff.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    @Override // Ff.d
    public <T> void c(Class<T> cls, Ff.b<? super T> bVar) {
        b(cls, this.f60202c, bVar);
    }

    s(Executor executor) {
        this.f60202c = executor;
    }

    public void g(final Ff.a<?> aVar) {
        z.b(aVar);
        synchronized (this) {
            try {
                Queue<Ff.a<?>> queue = this.f60201b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<Ff.b<Object>, Executor> entry : f(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: bf.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((Ff.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
