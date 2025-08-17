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
public final class C13482q<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13473h f127134a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13479n f127135b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f127136c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f127137d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f127138e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f127139f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f127140g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f127141h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f127142i;

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
        public final T f127143a;

        /* renamed from: b, reason: collision with root package name */
        private r.b f127144b = new r.b();

        /* renamed from: c, reason: collision with root package name */
        private boolean f127145c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f127146d;

        public void c(b<T> bVar) {
            this.f127146d = true;
            if (this.f127145c) {
                this.f127145c = false;
                bVar.a(this.f127143a, this.f127144b.e());
            }
        }

        public void a(int i10, a<T> aVar) {
            if (this.f127146d) {
                return;
            }
            if (i10 != -1) {
                this.f127144b.a(i10);
            }
            this.f127145c = true;
            aVar.invoke(this.f127143a);
        }

        public void b(b<T> bVar) {
            if (this.f127146d || !this.f127145c) {
                return;
            }
            a3.r rVarE = this.f127144b.e();
            this.f127144b = new r.b();
            this.f127145c = false;
            bVar.a(this.f127143a, rVarE);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f127143a.equals(((c) obj).f127143a);
        }

        public int hashCode() {
            return this.f127143a.hashCode();
        }

        public c(T t10) {
            this.f127143a = t10;
        }
    }

    public C13482q(Looper looper, InterfaceC13473h interfaceC13473h, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC13473h, bVar, true);
    }

    private C13482q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC13473h interfaceC13473h, b<T> bVar, boolean z10) {
        this.f127134a = interfaceC13473h;
        this.f127137d = copyOnWriteArraySet;
        this.f127136c = bVar;
        this.f127140g = new Object();
        this.f127138e = new ArrayDeque<>();
        this.f127139f = new ArrayDeque<>();
        this.f127135b = interfaceC13473h.e(looper, new Handler.Callback() { // from class: d3.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f127130a.g(message);
            }
        });
        this.f127142i = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f127137d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f127136c);
            if (this.f127135b.b(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.f127142i) {
            C13466a.g(Thread.currentThread() == this.f127135b.f().getThread());
        }
    }

    public C13482q<T> d(Looper looper, InterfaceC13473h interfaceC13473h, b<T> bVar) {
        return new C13482q<>(this.f127137d, looper, interfaceC13473h, bVar, this.f127142i);
    }

    public C13482q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f127134a, bVar);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        C13466a.e(t10);
        synchronized (this.f127140g) {
            try {
                if (this.f127141h) {
                    return;
                }
                this.f127137d.add(new c<>(t10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        l();
        if (!this.f127139f.isEmpty()) {
            if (!this.f127135b.b(1)) {
                InterfaceC13479n interfaceC13479n = this.f127135b;
                interfaceC13479n.i(interfaceC13479n.a(1));
            }
            boolean zIsEmpty = this.f127138e.isEmpty();
            this.f127138e.addAll(this.f127139f);
            this.f127139f.clear();
            if (zIsEmpty) {
                while (!this.f127138e.isEmpty()) {
                    this.f127138e.peekFirst().run();
                    this.f127138e.removeFirst();
                }
            }
        }
    }

    public void h(final int i10, final a<T> aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f127137d);
        this.f127139f.add(new Runnable() { // from class: d3.p
            @Override // java.lang.Runnable
            public final void run() {
                C13482q.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f127140g) {
            this.f127141h = true;
        }
        Iterator<c<T>> it = this.f127137d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f127136c);
        }
        this.f127137d.clear();
    }

    public void j(T t10) {
        l();
        Iterator<c<T>> it = this.f127137d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f127143a.equals(t10)) {
                next.c(this.f127136c);
                this.f127137d.remove(next);
            }
        }
    }

    public void k(int i10, a<T> aVar) {
        h(i10, aVar);
        f();
    }
}
