package df;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
class s implements Hf.d, Hf.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<Hf.b<Object>, Executor>> f128435a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<Hf.a<?>> f128436b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f128437c;

    private synchronized Set<Map.Entry<Hf.b<Object>, Executor>> f(Hf.a<?> aVar) {
        ConcurrentHashMap<Hf.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f128435a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // Hf.d
    public synchronized <T> void b(Class<T> cls, Hf.b<? super T> bVar) {
        z.b(cls);
        z.b(bVar);
        if (this.f128435a.containsKey(cls)) {
            ConcurrentHashMap<Hf.b<Object>, Executor> concurrentHashMap = this.f128435a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f128435a.remove(cls);
            }
        }
    }

    @Override // Hf.d
    public synchronized <T> void c(Class<T> cls, Executor executor, Hf.b<? super T> bVar) {
        try {
            z.b(cls);
            z.b(bVar);
            z.b(executor);
            if (!this.f128435a.containsKey(cls)) {
                this.f128435a.put(cls, new ConcurrentHashMap<>());
            }
            this.f128435a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void e() {
        Queue<Hf.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f128436b;
                if (queue != null) {
                    this.f128436b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<Hf.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    @Override // Hf.d
    public <T> void a(Class<T> cls, Hf.b<? super T> bVar) {
        c(cls, this.f128437c, bVar);
    }

    s(Executor executor) {
        this.f128437c = executor;
    }

    public void g(final Hf.a<?> aVar) {
        z.b(aVar);
        synchronized (this) {
            try {
                Queue<Hf.a<?>> queue = this.f128436b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<Hf.b<Object>, Executor> entry : f(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: df.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((Hf.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
