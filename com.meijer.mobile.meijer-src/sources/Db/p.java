package Db;

import android.content.SharedPreferences;
import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xb.C18150d;

/* loaded from: classes4.dex */
public abstract class p<K, T> extends m<K, T> {

    /* renamed from: h, reason: collision with root package name */
    protected static final C13784a f6110h = C13785b.a(p.class.getName());

    /* renamed from: b, reason: collision with root package name */
    protected final SharedPreferences f6111b;

    /* renamed from: d, reason: collision with root package name */
    private final Class<T> f6113d;

    /* renamed from: e, reason: collision with root package name */
    private p<K, T>.b f6114e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f6115f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6116g = false;

    /* renamed from: c, reason: collision with root package name */
    private final C18150d f6112c = new C18150d();

    final class a implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f6117a;

        a(Iterator it) {
            this.f6117a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6117a.hasNext();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public final T next() {
            return (T) p.this.h(this.f6117a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b extends m<K, T>.a {

        /* renamed from: b, reason: collision with root package name */
        SharedPreferences.Editor f6119b;

        protected b(SharedPreferences.Editor editor) {
            super();
            this.f6119b = editor;
        }

        @Override // Db.m.a
        public final void a() throws IOException {
            synchronized (p.this.f6111b) {
                if (this != p.this.f6114e) {
                    throw new IllegalStateException("This in not the current transaction");
                }
                try {
                    if (!this.f6119b.commit()) {
                        throw new IOException("Commit to shared prefs failed");
                    }
                } finally {
                    p.r(p.this);
                    p.t(p.this);
                    p.this.f6111b.notifyAll();
                }
            }
        }

        @Override // Db.m.a
        public final void b() {
            synchronized (p.this.f6111b) {
                try {
                    if (this != p.this.f6114e) {
                        throw new IllegalStateException("This in not the current transaction");
                    }
                    p.r(p.this);
                    p.t(p.this);
                    p.this.f6111b.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static /* synthetic */ b r(p pVar) {
        pVar.f6114e = null;
        return null;
    }

    static /* synthetic */ Thread t(p pVar) {
        pVar.f6115f = null;
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
            return (T) this.f6112c.c(this.f6113d, str);
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    private void w() {
        if (this.f6116g) {
            return;
        }
        for (Map.Entry<String, ?> entry : this.f6111b.getAll().entrySet()) {
            T tN = n(o(entry.getKey(), (String) entry.getValue()));
            if (tN != null && !this.f6095a.containsKey(a(tN))) {
                d(a(tN), tN);
            }
        }
        this.f6116g = true;
    }

    @Override // Db.m
    public final void c(m<K, T>.a aVar, T t10) throws IOException {
        synchronized (this.f6111b) {
            try {
                p<K, T>.b bVar = this.f6114e;
                if (aVar != bVar) {
                    throw new IllegalStateException("Transaction in not the current transaction");
                }
                SharedPreferences.Editor editor = bVar.f6119b;
                try {
                    String string = a(t10).toString();
                    editor.putString(string, q(string, this.f6112c.h(t10)));
                } catch (JsonWriteException e10) {
                    e10.getMessage();
                    throw new IOException("Json Mapping failed - " + e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Db.m
    public final void i(m<K, T>.a aVar, K k10) throws IOException {
        synchronized (this.f6111b) {
            try {
                if (aVar != this.f6114e) {
                    throw new IllegalStateException("Transaction in not the current transaction");
                }
                super.l(k10);
                this.f6114e.f6119b.remove(k10.toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Db.m
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final p<K, T>.b e() throws IOException {
        p<K, T>.b bVar;
        try {
            synchronized (this.f6111b) {
                while (this.f6114e != null) {
                    try {
                        if (this.f6115f == Thread.currentThread()) {
                            throw new IllegalStateException("Transaction already in progress on this thread");
                        }
                        this.f6111b.wait();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f6114e = new b(this.f6111b.edit());
                this.f6115f = Thread.currentThread();
                bVar = this.f6114e;
            }
            return bVar;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Transaction wait interrupted");
        }
    }

    public p(SharedPreferences sharedPreferences, Class<T> cls) {
        this.f6111b = sharedPreferences;
        this.f6113d = cls;
    }

    @Override // Db.m
    public final Iterator<T> b() throws IOException {
        return new a(s().iterator());
    }

    @Override // Db.m
    protected final T f(K k10) {
        String string = k10.toString();
        String strO = o(string, this.f6111b.getString(string, null));
        if (strO == null) {
            return null;
        }
        T tN = n(strO);
        d(k10, tN);
        return tN;
    }

    public final Set<K> s() {
        w();
        return this.f6095a.keySet();
    }

    public final Collection<T> u() {
        w();
        return this.f6095a.values();
    }
}
