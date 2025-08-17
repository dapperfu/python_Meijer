package Bb;

import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import com.gimbal.internal.json.JsonWriteException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import vb.C17538d;

/* loaded from: classes4.dex */
public abstract class p<K, T> extends m<K, T> {

    /* renamed from: h, reason: collision with root package name */
    protected static final C6380a f2165h = C6381b.a(p.class.getName());

    /* renamed from: b, reason: collision with root package name */
    protected final SharedPreferences f2166b;

    /* renamed from: d, reason: collision with root package name */
    private final Class<T> f2168d;

    /* renamed from: e, reason: collision with root package name */
    private p<K, T>.b f2169e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f2170f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2171g = false;

    /* renamed from: c, reason: collision with root package name */
    private final C17538d f2167c = new C17538d();

    final class a implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f2172a;

        a(Iterator it) {
            this.f2172a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f2172a.hasNext();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public final T next() {
            return (T) p.this.h(this.f2172a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b extends m<K, T>.a {

        /* renamed from: b, reason: collision with root package name */
        SharedPreferences.Editor f2174b;

        protected b(SharedPreferences.Editor editor) {
            super();
            this.f2174b = editor;
        }

        @Override // Bb.m.a
        public final void a() throws IOException {
            synchronized (p.this.f2166b) {
                if (this != p.this.f2169e) {
                    throw new IllegalStateException("This in not the current transaction");
                }
                try {
                    if (!this.f2174b.commit()) {
                        throw new IOException("Commit to shared prefs failed");
                    }
                } finally {
                    p.r(p.this);
                    p.t(p.this);
                    p.this.f2166b.notifyAll();
                }
            }
        }

        @Override // Bb.m.a
        public final void b() {
            synchronized (p.this.f2166b) {
                try {
                    if (this != p.this.f2169e) {
                        throw new IllegalStateException("This in not the current transaction");
                    }
                    p.r(p.this);
                    p.t(p.this);
                    p.this.f2166b.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static /* synthetic */ b r(p pVar) {
        pVar.f2169e = null;
        return null;
    }

    static /* synthetic */ Thread t(p pVar) {
        pVar.f2170f = null;
        return null;
    }

    protected String o(String str, String str2) {
        return str2;
    }

    protected String q(String str, String str2) {
        return str2;
    }

    private T n(String str) {
        try {
            return (T) this.f2167c.c(this.f2168d, str);
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    private void w() {
        if (this.f2171g) {
            return;
        }
        for (Map.Entry<String, ?> entry : this.f2166b.getAll().entrySet()) {
            T tN = n(o(entry.getKey(), (String) entry.getValue()));
            if (tN != null && !this.f2150a.containsKey(a(tN))) {
                d(a(tN), tN);
            }
        }
        this.f2171g = true;
    }

    @Override // Bb.m
    public final void c(m<K, T>.a aVar, T t10) throws IOException {
        synchronized (this.f2166b) {
            try {
                p<K, T>.b bVar = this.f2169e;
                if (aVar != bVar) {
                    throw new IllegalStateException("Transaction in not the current transaction");
                }
                SharedPreferences.Editor editor = bVar.f2174b;
                try {
                    String string = a(t10).toString();
                    editor.putString(string, q(string, this.f2167c.h(t10)));
                } catch (JsonWriteException e10) {
                    e10.getMessage();
                    throw new IOException("Json Mapping failed - " + e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Bb.m
    public final void i(m<K, T>.a aVar, K k10) throws IOException {
        synchronized (this.f2166b) {
            try {
                if (aVar != this.f2169e) {
                    throw new IllegalStateException("Transaction in not the current transaction");
                }
                super.l(k10);
                this.f2169e.f2174b.remove(k10.toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Bb.m
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final p<K, T>.b e() throws IOException {
        p<K, T>.b bVar;
        try {
            synchronized (this.f2166b) {
                while (this.f2169e != null) {
                    try {
                        if (this.f2170f == Thread.currentThread()) {
                            throw new IllegalStateException("Transaction already in progress on this thread");
                        }
                        this.f2166b.wait();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f2169e = new b(this.f2166b.edit());
                this.f2170f = Thread.currentThread();
                bVar = this.f2169e;
            }
            return bVar;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Transaction wait interrupted");
        }
    }

    public p(SharedPreferences sharedPreferences, Class<T> cls) {
        this.f2166b = sharedPreferences;
        this.f2168d = cls;
    }

    @Override // Bb.m
    public final Iterator<T> b() throws IOException {
        return new a(s().iterator());
    }

    @Override // Bb.m
    protected final T f(K k10) {
        String string = k10.toString();
        String strO = o(string, this.f2166b.getString(string, null));
        if (strO == null) {
            return null;
        }
        T tN = n(strO);
        d(k10, tN);
        return tN;
    }

    public final Set<K> s() {
        w();
        return this.f2150a.keySet();
    }

    public final Collection<T> u() {
        w();
        return this.f2150a.values();
    }
}
