package Bb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class m<K, V> {

    /* renamed from: a, reason: collision with root package name */
    protected Map<K, V> f2150a = new ConcurrentHashMap();

    public class a {
        public void a() throws IOException {
            throw null;
        }

        public void b() {
            throw null;
        }

        public a() {
        }
    }

    public abstract K a(V v10);

    public abstract Iterator<V> b() throws IOException;

    protected abstract void c(m<K, V>.a aVar, V v10) throws IOException;

    public abstract m<K, V>.a e() throws IOException;

    protected abstract V f(K k10);

    public abstract void i(m<K, V>.a aVar, K k10) throws IOException;

    protected final void d(K k10, V v10) {
        if (k10 == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.f2150a.put(k10, v10);
    }

    public final V h(K k10) {
        if (k10 == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        V v10 = this.f2150a.get(k10);
        return v10 == null ? f(k10) : v10;
    }

    protected final void l(K k10) {
        if (k10 == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.f2150a.remove(k10);
    }

    public final void g(m<K, V>.a aVar, V v10) throws IOException {
        d(a(v10), v10);
        c(aVar, v10);
    }

    public final void j(V v10) throws IOException {
        m<K, V>.a aVarE = e();
        try {
            g(aVarE, v10);
        } finally {
            aVarE.a();
        }
    }

    public final void k(K k10) throws IOException {
        m<K, V>.a aVarE = e();
        try {
            i(aVarE, k10);
        } finally {
            aVarE.a();
        }
    }
}
