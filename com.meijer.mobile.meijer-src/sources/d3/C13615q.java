package d3;

import a3.r;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: d3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13615q<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13606h f127936a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13612n f127937b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f127938c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f127939d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f127940e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f127941f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f127942g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f127943h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f127944i;

    /* renamed from: d3.q$a */
    public interface a<T> {
        void invoke(T t10);
    }

    /* renamed from: d3.q$b */
    public interface b<T> {
        void a(T t10, a3.r rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d3.q$c */
    static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f127945a;

        /* renamed from: b, reason: collision with root package name */
        private r.b f127946b = new r.b();

        /* renamed from: c, reason: collision with root package name */
        private boolean f127947c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f127948d;

        public void c(b<T> bVar) {
            this.f127948d = true;
            if (this.f127947c) {
                this.f127947c = false;
                bVar.a(this.f127945a, this.f127946b.e());
            }
        }

        public void a(int i10, a<T> aVar) {
            if (this.f127948d) {
                return;
            }
            if (i10 != -1) {
                this.f127946b.a(i10);
            }
            this.f127947c = true;
            aVar.invoke(this.f127945a);
        }

        public void b(b<T> bVar) {
            if (this.f127948d || !this.f127947c) {
                return;
            }
            a3.r rVarE = this.f127946b.e();
            this.f127946b = new r.b();
            this.f127947c = false;
            bVar.a(this.f127945a, rVarE);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f127945a.equals(((c) obj).f127945a);
        }

        public int hashCode() {
            return this.f127945a.hashCode();
        }

        public c(T t10) {
            this.f127945a = t10;
        }
    }

    public C13615q(Looper looper, InterfaceC13606h interfaceC13606h, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC13606h, bVar, true);
    }

    private C13615q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC13606h interfaceC13606h, b<T> bVar, boolean z10) {
        this.f127936a = interfaceC13606h;
        this.f127939d = copyOnWriteArraySet;
        this.f127938c = bVar;
        this.f127942g = new Object();
        this.f127940e = new ArrayDeque<>();
        this.f127941f = new ArrayDeque<>();
        this.f127937b = interfaceC13606h.e(looper, new Handler.Callback() { // from class: d3.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f127932a.g(message);
            }
        });
        this.f127944i = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f127939d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f127938c);
            if (this.f127937b.b(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.f127944i) {
            C13599a.g(Thread.currentThread() == this.f127937b.f().getThread());
        }
    }

    public C13615q<T> d(Looper looper, InterfaceC13606h interfaceC13606h, b<T> bVar) {
        return new C13615q<>(this.f127939d, looper, interfaceC13606h, bVar, this.f127944i);
    }

    public C13615q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f127936a, bVar);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        C13599a.e(t10);
        synchronized (this.f127942g) {
            try {
                if (this.f127943h) {
                    return;
                }
                this.f127939d.add(new c<>(t10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        l();
        if (!this.f127941f.isEmpty()) {
            if (!this.f127937b.b(1)) {
                InterfaceC13612n interfaceC13612n = this.f127937b;
                interfaceC13612n.i(interfaceC13612n.a(1));
            }
            boolean zIsEmpty = this.f127940e.isEmpty();
            this.f127940e.addAll(this.f127941f);
            this.f127941f.clear();
            if (zIsEmpty) {
                while (!this.f127940e.isEmpty()) {
                    this.f127940e.peekFirst().run();
                    this.f127940e.removeFirst();
                }
            }
        }
    }

    public void h(final int i10, final a<T> aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f127939d);
        this.f127941f.add(new Runnable() { // from class: d3.p
            @Override // java.lang.Runnable
            public final void run() {
                C13615q.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f127942g) {
            this.f127943h = true;
        }
        Iterator<c<T>> it = this.f127939d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f127938c);
        }
        this.f127939d.clear();
    }

    public void j(T t10) {
        l();
        Iterator<c<T>> it = this.f127939d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f127945a.equals(t10)) {
                next.c(this.f127938c);
                this.f127939d.remove(next);
            }
        }
    }

    public void k(int i10, a<T> aVar) {
        h(i10, aVar);
        f();
    }
}
