package androidx.view;

import androidx.view.AbstractC6165l;
import o.C16032c;
import p.C16327b;

/* renamed from: androidx.lifecycle.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6127A<T> {

    /* renamed from: k, reason: collision with root package name */
    static final Object f55351k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f55352a;

    /* renamed from: b, reason: collision with root package name */
    private C16327b<InterfaceC6131E<? super T>, AbstractC6127A<T>.d> f55353b;

    /* renamed from: c, reason: collision with root package name */
    int f55354c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55355d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f55356e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f55357f;

    /* renamed from: g, reason: collision with root package name */
    private int f55358g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f55359h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f55360i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f55361j;

    /* renamed from: androidx.lifecycle.A$a */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC6127A.this.f55352a) {
                obj = AbstractC6127A.this.f55357f;
                AbstractC6127A.this.f55357f = AbstractC6127A.f55351k;
            }
            AbstractC6127A.this.o(obj);
        }
    }

    /* renamed from: androidx.lifecycle.A$b */
    private class b extends AbstractC6127A<T>.d {
        @Override // androidx.view.AbstractC6127A.d
        boolean d() {
            return true;
        }

        b(InterfaceC6131E<? super T> interfaceC6131E) {
            super(interfaceC6131E);
        }
    }

    /* renamed from: androidx.lifecycle.A$c */
    class c extends AbstractC6127A<T>.d implements InterfaceC6169p {

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6172s f55364e;

        c(InterfaceC6172s interfaceC6172s, InterfaceC6131E<? super T> interfaceC6131E) {
            super(interfaceC6131E);
            this.f55364e = interfaceC6172s;
        }

        @Override // androidx.view.AbstractC6127A.d
        void b() {
            this.f55364e.getLifecycle().d(this);
        }

        @Override // androidx.view.AbstractC6127A.d
        boolean c(InterfaceC6172s interfaceC6172s) {
            return this.f55364e == interfaceC6172s;
        }

        @Override // androidx.view.AbstractC6127A.d
        boolean d() {
            return this.f55364e.getLifecycle().b().b(AbstractC6165l.b.f55502d);
        }

        @Override // androidx.view.InterfaceC6169p
        public void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
            AbstractC6165l.b bVarB = this.f55364e.getLifecycle().b();
            if (bVarB == AbstractC6165l.b.f55499a) {
                AbstractC6127A.this.n(this.f55366a);
                return;
            }
            AbstractC6165l.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f55364e.getLifecycle().b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.A$d */
    private abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6131E<? super T> f55366a;

        /* renamed from: b, reason: collision with root package name */
        boolean f55367b;

        /* renamed from: c, reason: collision with root package name */
        int f55368c = -1;

        void b() {
        }

        boolean c(InterfaceC6172s interfaceC6172s) {
            return false;
        }

        abstract boolean d();

        d(InterfaceC6131E<? super T> interfaceC6131E) {
            this.f55366a = interfaceC6131E;
        }

        void a(boolean z10) {
            if (z10 == this.f55367b) {
                return;
            }
            this.f55367b = z10;
            AbstractC6127A.this.b(z10 ? 1 : -1);
            if (this.f55367b) {
                AbstractC6127A.this.d(this);
            }
        }
    }

    public AbstractC6127A(T t10) {
        this.f55352a = new Object();
        this.f55353b = new C16327b<>();
        this.f55354c = 0;
        this.f55357f = f55351k;
        this.f55361j = new a();
        this.f55356e = t10;
        this.f55358g = 0;
    }

    protected void k() {
    }

    protected void l() {
    }

    private void c(AbstractC6127A<T>.d dVar) {
        if (dVar.f55367b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f55368c;
            int i11 = this.f55358g;
            if (i10 >= i11) {
                return;
            }
            dVar.f55368c = i11;
            dVar.f55366a.onChanged((Object) this.f55356e);
        }
    }

    void b(int i10) {
        int i11 = this.f55354c;
        this.f55354c = i10 + i11;
        if (this.f55355d) {
            return;
        }
        this.f55355d = true;
        while (true) {
            try {
                int i12 = this.f55354c;
                if (i11 == i12) {
                    this.f55355d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    k();
                } else if (z11) {
                    l();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f55355d = false;
                throw th2;
            }
        }
    }

    void d(AbstractC6127A<T>.d dVar) {
        if (this.f55359h) {
            this.f55360i = true;
            return;
        }
        this.f55359h = true;
        do {
            this.f55360i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                C16327b<InterfaceC6131E<? super T>, AbstractC6127A<T>.d>.d dVarF = this.f55353b.f();
                while (dVarF.hasNext()) {
                    c((d) dVarF.next().getValue());
                    if (this.f55360i) {
                        break;
                    }
                }
            }
        } while (this.f55360i);
        this.f55359h = false;
    }

    public T e() {
        T t10 = (T) this.f55356e;
        if (t10 != f55351k) {
            return t10;
        }
        return null;
    }

    int f() {
        return this.f55358g;
    }

    public boolean g() {
        return this.f55354c > 0;
    }

    public boolean h() {
        return this.f55356e != f55351k;
    }

    public void i(InterfaceC6172s interfaceC6172s, InterfaceC6131E<? super T> interfaceC6131E) {
        a("observe");
        if (interfaceC6172s.getLifecycle().b() == AbstractC6165l.b.f55499a) {
            return;
        }
        c cVar = new c(interfaceC6172s, interfaceC6131E);
        AbstractC6127A<T>.d dVarL = this.f55353b.l(interfaceC6131E, cVar);
        if (dVarL != null && !dVarL.c(interfaceC6172s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarL != null) {
            return;
        }
        interfaceC6172s.getLifecycle().a(cVar);
    }

    public void j(InterfaceC6131E<? super T> interfaceC6131E) {
        a("observeForever");
        b bVar = new b(interfaceC6131E);
        AbstractC6127A<T>.d dVarL = this.f55353b.l(interfaceC6131E, bVar);
        if (dVarL instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarL != null) {
            return;
        }
        bVar.a(true);
    }

    protected void m(T t10) {
        boolean z10;
        synchronized (this.f55352a) {
            z10 = this.f55357f == f55351k;
            this.f55357f = t10;
        }
        if (z10) {
            C16032c.h().d(this.f55361j);
        }
    }

    public void n(InterfaceC6131E<? super T> interfaceC6131E) {
        a("removeObserver");
        AbstractC6127A<T>.d dVarM = this.f55353b.m(interfaceC6131E);
        if (dVarM == null) {
            return;
        }
        dVarM.b();
        dVarM.a(false);
    }

    protected void o(T t10) {
        a("setValue");
        this.f55358g++;
        this.f55356e = t10;
        d(null);
    }

    static void a(String str) {
        if (C16032c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public AbstractC6127A() {
        this.f55352a = new Object();
        this.f55353b = new C16327b<>();
        this.f55354c = 0;
        Object obj = f55351k;
        this.f55357f = obj;
        this.f55361j = new a();
        this.f55356e = obj;
        this.f55358g = -1;
    }
}
