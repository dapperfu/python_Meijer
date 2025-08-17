package androidx.view;

import androidx.view.AbstractC6023l;
import o.C15957c;
import p.C16182b;

/* renamed from: androidx.lifecycle.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5985A<T> {

    /* renamed from: k, reason: collision with root package name */
    static final Object f55127k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f55128a;

    /* renamed from: b, reason: collision with root package name */
    private C16182b<InterfaceC5989E<? super T>, AbstractC5985A<T>.d> f55129b;

    /* renamed from: c, reason: collision with root package name */
    int f55130c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55131d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f55132e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f55133f;

    /* renamed from: g, reason: collision with root package name */
    private int f55134g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f55135h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f55136i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f55137j;

    /* renamed from: androidx.lifecycle.A$a */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC5985A.this.f55128a) {
                obj = AbstractC5985A.this.f55133f;
                AbstractC5985A.this.f55133f = AbstractC5985A.f55127k;
            }
            AbstractC5985A.this.o(obj);
        }
    }

    /* renamed from: androidx.lifecycle.A$b */
    private class b extends AbstractC5985A<T>.d {
        @Override // androidx.view.AbstractC5985A.d
        boolean d() {
            return true;
        }

        b(InterfaceC5989E<? super T> interfaceC5989E) {
            super(interfaceC5989E);
        }
    }

    /* renamed from: androidx.lifecycle.A$c */
    class c extends AbstractC5985A<T>.d implements InterfaceC6027p {

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC6030s f55140e;

        c(InterfaceC6030s interfaceC6030s, InterfaceC5989E<? super T> interfaceC5989E) {
            super(interfaceC5989E);
            this.f55140e = interfaceC6030s;
        }

        @Override // androidx.view.AbstractC5985A.d
        void b() {
            this.f55140e.getLifecycle().d(this);
        }

        @Override // androidx.view.AbstractC5985A.d
        boolean c(InterfaceC6030s interfaceC6030s) {
            return this.f55140e == interfaceC6030s;
        }

        @Override // androidx.view.AbstractC5985A.d
        boolean d() {
            return this.f55140e.getLifecycle().b().b(AbstractC6023l.b.f55278d);
        }

        @Override // androidx.view.InterfaceC6027p
        public void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
            AbstractC6023l.b bVarB = this.f55140e.getLifecycle().b();
            if (bVarB == AbstractC6023l.b.f55275a) {
                AbstractC5985A.this.n(this.f55142a);
                return;
            }
            AbstractC6023l.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f55140e.getLifecycle().b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.A$d */
    private abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5989E<? super T> f55142a;

        /* renamed from: b, reason: collision with root package name */
        boolean f55143b;

        /* renamed from: c, reason: collision with root package name */
        int f55144c = -1;

        void b() {
        }

        boolean c(InterfaceC6030s interfaceC6030s) {
            return false;
        }

        abstract boolean d();

        d(InterfaceC5989E<? super T> interfaceC5989E) {
            this.f55142a = interfaceC5989E;
        }

        void a(boolean z10) {
            if (z10 == this.f55143b) {
                return;
            }
            this.f55143b = z10;
            AbstractC5985A.this.b(z10 ? 1 : -1);
            if (this.f55143b) {
                AbstractC5985A.this.d(this);
            }
        }
    }

    public AbstractC5985A(T t10) {
        this.f55128a = new Object();
        this.f55129b = new C16182b<>();
        this.f55130c = 0;
        this.f55133f = f55127k;
        this.f55137j = new a();
        this.f55132e = t10;
        this.f55134g = 0;
    }

    protected void k() {
    }

    protected void l() {
    }

    private void c(AbstractC5985A<T>.d dVar) {
        if (dVar.f55143b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f55144c;
            int i11 = this.f55134g;
            if (i10 >= i11) {
                return;
            }
            dVar.f55144c = i11;
            dVar.f55142a.onChanged((Object) this.f55132e);
        }
    }

    void b(int i10) {
        int i11 = this.f55130c;
        this.f55130c = i10 + i11;
        if (this.f55131d) {
            return;
        }
        this.f55131d = true;
        while (true) {
            try {
                int i12 = this.f55130c;
                if (i11 == i12) {
                    this.f55131d = false;
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
                this.f55131d = false;
                throw th2;
            }
        }
    }

    void d(AbstractC5985A<T>.d dVar) {
        if (this.f55135h) {
            this.f55136i = true;
            return;
        }
        this.f55135h = true;
        do {
            this.f55136i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                C16182b<InterfaceC5989E<? super T>, AbstractC5985A<T>.d>.d dVarF = this.f55129b.f();
                while (dVarF.hasNext()) {
                    c((d) dVarF.next().getValue());
                    if (this.f55136i) {
                        break;
                    }
                }
            }
        } while (this.f55136i);
        this.f55135h = false;
    }

    public T e() {
        T t10 = (T) this.f55132e;
        if (t10 != f55127k) {
            return t10;
        }
        return null;
    }

    int f() {
        return this.f55134g;
    }

    public boolean g() {
        return this.f55130c > 0;
    }

    public boolean h() {
        return this.f55132e != f55127k;
    }

    public void i(InterfaceC6030s interfaceC6030s, InterfaceC5989E<? super T> interfaceC5989E) {
        a("observe");
        if (interfaceC6030s.getLifecycle().b() == AbstractC6023l.b.f55275a) {
            return;
        }
        c cVar = new c(interfaceC6030s, interfaceC5989E);
        AbstractC5985A<T>.d dVarL = this.f55129b.l(interfaceC5989E, cVar);
        if (dVarL != null && !dVarL.c(interfaceC6030s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarL != null) {
            return;
        }
        interfaceC6030s.getLifecycle().a(cVar);
    }

    public void j(InterfaceC5989E<? super T> interfaceC5989E) {
        a("observeForever");
        b bVar = new b(interfaceC5989E);
        AbstractC5985A<T>.d dVarL = this.f55129b.l(interfaceC5989E, bVar);
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
        synchronized (this.f55128a) {
            z10 = this.f55133f == f55127k;
            this.f55133f = t10;
        }
        if (z10) {
            C15957c.h().d(this.f55137j);
        }
    }

    public void n(InterfaceC5989E<? super T> interfaceC5989E) {
        a("removeObserver");
        AbstractC5985A<T>.d dVarM = this.f55129b.m(interfaceC5989E);
        if (dVarM == null) {
            return;
        }
        dVarM.b();
        dVarM.a(false);
    }

    protected void o(T t10) {
        a("setValue");
        this.f55134g++;
        this.f55132e = t10;
        d(null);
    }

    static void a(String str) {
        if (C15957c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public AbstractC5985A() {
        this.f55128a = new Object();
        this.f55129b = new C16182b<>();
        this.f55130c = 0;
        Object obj = f55127k;
        this.f55133f = obj;
        this.f55137j = new a();
        this.f55132e = obj;
        this.f55134g = -1;
    }
}
