package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.a;
import androidx.biometric.e;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import androidx.view.c0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f extends c0 {

    /* renamed from: a, reason: collision with root package name */
    private Executor f47324a;

    /* renamed from: b, reason: collision with root package name */
    private e.a f47325b;

    /* renamed from: c, reason: collision with root package name */
    private e.d f47326c;

    /* renamed from: d, reason: collision with root package name */
    private e.c f47327d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.biometric.a f47328e;

    /* renamed from: f, reason: collision with root package name */
    private g f47329f;

    /* renamed from: g, reason: collision with root package name */
    private DialogInterface.OnClickListener f47330g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f47331h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47333j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f47334k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f47335l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f47336m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f47337n;

    /* renamed from: o, reason: collision with root package name */
    private C6130D<e.b> f47338o;

    /* renamed from: p, reason: collision with root package name */
    private C6130D<androidx.biometric.c> f47339p;

    /* renamed from: q, reason: collision with root package name */
    private C6130D<CharSequence> f47340q;

    /* renamed from: r, reason: collision with root package name */
    private C6130D<Boolean> f47341r;

    /* renamed from: s, reason: collision with root package name */
    private C6130D<Boolean> f47342s;

    /* renamed from: u, reason: collision with root package name */
    private C6130D<Boolean> f47344u;

    /* renamed from: w, reason: collision with root package name */
    private C6130D<Integer> f47346w;

    /* renamed from: x, reason: collision with root package name */
    private C6130D<CharSequence> f47347x;

    /* renamed from: i, reason: collision with root package name */
    private int f47332i = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f47343t = true;

    /* renamed from: v, reason: collision with root package name */
    private int f47345v = 0;

    class a extends e.a {
        a() {
        }
    }

    private static final class b extends a.d {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<f> f47349a;

        @Override // androidx.biometric.a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f47349a.get() == null || this.f47349a.get().J() || !this.f47349a.get().H()) {
                return;
            }
            this.f47349a.get().Q(new androidx.biometric.c(i10, charSequence));
        }

        @Override // androidx.biometric.a.d
        void b() {
            if (this.f47349a.get() == null || !this.f47349a.get().H()) {
                return;
            }
            this.f47349a.get().R(true);
        }

        @Override // androidx.biometric.a.d
        void c(CharSequence charSequence) {
            if (this.f47349a.get() != null) {
                this.f47349a.get().S(charSequence);
            }
        }

        @Override // androidx.biometric.a.d
        void d(e.b bVar) {
            if (this.f47349a.get() == null || !this.f47349a.get().H()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new e.b(bVar.b(), this.f47349a.get().B());
            }
            this.f47349a.get().T(bVar);
        }

        b(f fVar) {
            this.f47349a = new WeakReference<>(fVar);
        }
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f47350a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f47350a.post(runnable);
        }

        c() {
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<f> f47351a;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f47351a.get() != null) {
                this.f47351a.get().h0(true);
            }
        }

        d(f fVar) {
            this.f47351a = new WeakReference<>(fVar);
        }
    }

    AbstractC6127A<Integer> A() {
        if (this.f47346w == null) {
            this.f47346w = new C6130D<>();
        }
        return this.f47346w;
    }

    DialogInterface.OnClickListener C() {
        if (this.f47330g == null) {
            this.f47330g = new d(this);
        }
        return this.f47330g;
    }

    CharSequence D() {
        CharSequence charSequence = this.f47331h;
        if (charSequence != null) {
            return charSequence;
        }
        e.d dVar = this.f47326c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence E() {
        e.d dVar = this.f47326c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence F() {
        e.d dVar = this.f47326c;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    AbstractC6127A<Boolean> G() {
        if (this.f47341r == null) {
            this.f47341r = new C6130D<>();
        }
        return this.f47341r;
    }

    boolean H() {
        return this.f47334k;
    }

    boolean I() {
        e.d dVar = this.f47326c;
        return dVar == null || dVar.f();
    }

    boolean J() {
        return this.f47335l;
    }

    boolean K() {
        return this.f47336m;
    }

    AbstractC6127A<Boolean> L() {
        if (this.f47344u == null) {
            this.f47344u = new C6130D<>();
        }
        return this.f47344u;
    }

    boolean M() {
        return this.f47343t;
    }

    boolean N() {
        return this.f47337n;
    }

    AbstractC6127A<Boolean> O() {
        if (this.f47342s == null) {
            this.f47342s = new C6130D<>();
        }
        return this.f47342s;
    }

    boolean P() {
        return this.f47333j;
    }

    void Q(androidx.biometric.c cVar) {
        if (this.f47339p == null) {
            this.f47339p = new C6130D<>();
        }
        l0(this.f47339p, cVar);
    }

    void R(boolean z10) {
        if (this.f47341r == null) {
            this.f47341r = new C6130D<>();
        }
        l0(this.f47341r, Boolean.valueOf(z10));
    }

    void S(CharSequence charSequence) {
        if (this.f47340q == null) {
            this.f47340q = new C6130D<>();
        }
        l0(this.f47340q, charSequence);
    }

    void T(e.b bVar) {
        if (this.f47338o == null) {
            this.f47338o = new C6130D<>();
        }
        l0(this.f47338o, bVar);
    }

    void U(boolean z10) {
        this.f47334k = z10;
    }

    void V(int i10) {
        this.f47332i = i10;
    }

    void W(e.a aVar) {
        this.f47325b = aVar;
    }

    void X(Executor executor) {
        this.f47324a = executor;
    }

    void Y(boolean z10) {
        this.f47335l = z10;
    }

    void Z(e.c cVar) {
        this.f47327d = cVar;
    }

    void a0(boolean z10) {
        this.f47336m = z10;
    }

    void b0(boolean z10) {
        if (this.f47344u == null) {
            this.f47344u = new C6130D<>();
        }
        l0(this.f47344u, Boolean.valueOf(z10));
    }

    void c0(boolean z10) {
        this.f47343t = z10;
    }

    void d0(CharSequence charSequence) {
        if (this.f47347x == null) {
            this.f47347x = new C6130D<>();
        }
        l0(this.f47347x, charSequence);
    }

    void e0(int i10) {
        this.f47345v = i10;
    }

    void f0(int i10) {
        if (this.f47346w == null) {
            this.f47346w = new C6130D<>();
        }
        l0(this.f47346w, Integer.valueOf(i10));
    }

    void g0(boolean z10) {
        this.f47337n = z10;
    }

    void h0(boolean z10) {
        if (this.f47342s == null) {
            this.f47342s = new C6130D<>();
        }
        l0(this.f47342s, Boolean.valueOf(z10));
    }

    void i0(CharSequence charSequence) {
        this.f47331h = charSequence;
    }

    void j0(e.d dVar) {
        this.f47326c = dVar;
    }

    void k0(boolean z10) {
        this.f47333j = z10;
    }

    int m() {
        e.d dVar = this.f47326c;
        if (dVar != null) {
            return androidx.biometric.b.a(dVar, this.f47327d);
        }
        return 0;
    }

    androidx.biometric.a n() {
        if (this.f47328e == null) {
            this.f47328e = new androidx.biometric.a(new b(this));
        }
        return this.f47328e;
    }

    C6130D<androidx.biometric.c> o() {
        if (this.f47339p == null) {
            this.f47339p = new C6130D<>();
        }
        return this.f47339p;
    }

    AbstractC6127A<CharSequence> p() {
        if (this.f47340q == null) {
            this.f47340q = new C6130D<>();
        }
        return this.f47340q;
    }

    AbstractC6127A<e.b> q() {
        if (this.f47338o == null) {
            this.f47338o = new C6130D<>();
        }
        return this.f47338o;
    }

    int r() {
        return this.f47332i;
    }

    g s() {
        if (this.f47329f == null) {
            this.f47329f = new g();
        }
        return this.f47329f;
    }

    e.a t() {
        if (this.f47325b == null) {
            this.f47325b = new a();
        }
        return this.f47325b;
    }

    Executor u() {
        Executor executor = this.f47324a;
        return executor != null ? executor : new c();
    }

    e.c v() {
        return this.f47327d;
    }

    CharSequence w() {
        e.d dVar = this.f47326c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    AbstractC6127A<CharSequence> x() {
        if (this.f47347x == null) {
            this.f47347x = new C6130D<>();
        }
        return this.f47347x;
    }

    int y() {
        return this.f47345v;
    }

    private static <T> void l0(C6130D<T> c6130d, T t10) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c6130d.o(t10);
        } else {
            c6130d.m(t10);
        }
    }

    int B() {
        int iM = m();
        if (androidx.biometric.b.c(iM) && !androidx.biometric.b.b(iM)) {
            return 2;
        }
        return -1;
    }
}
