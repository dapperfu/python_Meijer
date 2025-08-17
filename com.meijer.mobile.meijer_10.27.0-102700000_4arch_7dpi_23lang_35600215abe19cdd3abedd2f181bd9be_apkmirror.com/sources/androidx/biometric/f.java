package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.a;
import androidx.biometric.e;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import androidx.view.c0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f extends c0 {

    /* renamed from: a, reason: collision with root package name */
    private Executor f47100a;

    /* renamed from: b, reason: collision with root package name */
    private e.a f47101b;

    /* renamed from: c, reason: collision with root package name */
    private e.d f47102c;

    /* renamed from: d, reason: collision with root package name */
    private e.c f47103d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.biometric.a f47104e;

    /* renamed from: f, reason: collision with root package name */
    private g f47105f;

    /* renamed from: g, reason: collision with root package name */
    private DialogInterface.OnClickListener f47106g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f47107h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47109j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f47110k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f47111l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f47112m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f47113n;

    /* renamed from: o, reason: collision with root package name */
    private C5988D<e.b> f47114o;

    /* renamed from: p, reason: collision with root package name */
    private C5988D<androidx.biometric.c> f47115p;

    /* renamed from: q, reason: collision with root package name */
    private C5988D<CharSequence> f47116q;

    /* renamed from: r, reason: collision with root package name */
    private C5988D<Boolean> f47117r;

    /* renamed from: s, reason: collision with root package name */
    private C5988D<Boolean> f47118s;

    /* renamed from: u, reason: collision with root package name */
    private C5988D<Boolean> f47120u;

    /* renamed from: w, reason: collision with root package name */
    private C5988D<Integer> f47122w;

    /* renamed from: x, reason: collision with root package name */
    private C5988D<CharSequence> f47123x;

    /* renamed from: i, reason: collision with root package name */
    private int f47108i = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f47119t = true;

    /* renamed from: v, reason: collision with root package name */
    private int f47121v = 0;

    class a extends e.a {
        a() {
        }
    }

    private static final class b extends a.d {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<f> f47125a;

        @Override // androidx.biometric.a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f47125a.get() == null || this.f47125a.get().J() || !this.f47125a.get().H()) {
                return;
            }
            this.f47125a.get().Q(new androidx.biometric.c(i10, charSequence));
        }

        @Override // androidx.biometric.a.d
        void b() {
            if (this.f47125a.get() == null || !this.f47125a.get().H()) {
                return;
            }
            this.f47125a.get().R(true);
        }

        @Override // androidx.biometric.a.d
        void c(CharSequence charSequence) {
            if (this.f47125a.get() != null) {
                this.f47125a.get().S(charSequence);
            }
        }

        @Override // androidx.biometric.a.d
        void d(e.b bVar) {
            if (this.f47125a.get() == null || !this.f47125a.get().H()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new e.b(bVar.b(), this.f47125a.get().B());
            }
            this.f47125a.get().T(bVar);
        }

        b(f fVar) {
            this.f47125a = new WeakReference<>(fVar);
        }
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f47126a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f47126a.post(runnable);
        }

        c() {
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<f> f47127a;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f47127a.get() != null) {
                this.f47127a.get().h0(true);
            }
        }

        d(f fVar) {
            this.f47127a = new WeakReference<>(fVar);
        }
    }

    AbstractC5985A<Integer> A() {
        if (this.f47122w == null) {
            this.f47122w = new C5988D<>();
        }
        return this.f47122w;
    }

    DialogInterface.OnClickListener C() {
        if (this.f47106g == null) {
            this.f47106g = new d(this);
        }
        return this.f47106g;
    }

    CharSequence D() {
        CharSequence charSequence = this.f47107h;
        if (charSequence != null) {
            return charSequence;
        }
        e.d dVar = this.f47102c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence E() {
        e.d dVar = this.f47102c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence F() {
        e.d dVar = this.f47102c;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    AbstractC5985A<Boolean> G() {
        if (this.f47117r == null) {
            this.f47117r = new C5988D<>();
        }
        return this.f47117r;
    }

    boolean H() {
        return this.f47110k;
    }

    boolean I() {
        e.d dVar = this.f47102c;
        return dVar == null || dVar.f();
    }

    boolean J() {
        return this.f47111l;
    }

    boolean K() {
        return this.f47112m;
    }

    AbstractC5985A<Boolean> L() {
        if (this.f47120u == null) {
            this.f47120u = new C5988D<>();
        }
        return this.f47120u;
    }

    boolean M() {
        return this.f47119t;
    }

    boolean N() {
        return this.f47113n;
    }

    AbstractC5985A<Boolean> O() {
        if (this.f47118s == null) {
            this.f47118s = new C5988D<>();
        }
        return this.f47118s;
    }

    boolean P() {
        return this.f47109j;
    }

    void Q(androidx.biometric.c cVar) {
        if (this.f47115p == null) {
            this.f47115p = new C5988D<>();
        }
        l0(this.f47115p, cVar);
    }

    void R(boolean z10) {
        if (this.f47117r == null) {
            this.f47117r = new C5988D<>();
        }
        l0(this.f47117r, Boolean.valueOf(z10));
    }

    void S(CharSequence charSequence) {
        if (this.f47116q == null) {
            this.f47116q = new C5988D<>();
        }
        l0(this.f47116q, charSequence);
    }

    void T(e.b bVar) {
        if (this.f47114o == null) {
            this.f47114o = new C5988D<>();
        }
        l0(this.f47114o, bVar);
    }

    void U(boolean z10) {
        this.f47110k = z10;
    }

    void V(int i10) {
        this.f47108i = i10;
    }

    void W(e.a aVar) {
        this.f47101b = aVar;
    }

    void X(Executor executor) {
        this.f47100a = executor;
    }

    void Y(boolean z10) {
        this.f47111l = z10;
    }

    void Z(e.c cVar) {
        this.f47103d = cVar;
    }

    void a0(boolean z10) {
        this.f47112m = z10;
    }

    void b0(boolean z10) {
        if (this.f47120u == null) {
            this.f47120u = new C5988D<>();
        }
        l0(this.f47120u, Boolean.valueOf(z10));
    }

    void c0(boolean z10) {
        this.f47119t = z10;
    }

    void d0(CharSequence charSequence) {
        if (this.f47123x == null) {
            this.f47123x = new C5988D<>();
        }
        l0(this.f47123x, charSequence);
    }

    void e0(int i10) {
        this.f47121v = i10;
    }

    void f0(int i10) {
        if (this.f47122w == null) {
            this.f47122w = new C5988D<>();
        }
        l0(this.f47122w, Integer.valueOf(i10));
    }

    void g0(boolean z10) {
        this.f47113n = z10;
    }

    void h0(boolean z10) {
        if (this.f47118s == null) {
            this.f47118s = new C5988D<>();
        }
        l0(this.f47118s, Boolean.valueOf(z10));
    }

    void i0(CharSequence charSequence) {
        this.f47107h = charSequence;
    }

    void j0(e.d dVar) {
        this.f47102c = dVar;
    }

    void k0(boolean z10) {
        this.f47109j = z10;
    }

    int m() {
        e.d dVar = this.f47102c;
        if (dVar != null) {
            return androidx.biometric.b.a(dVar, this.f47103d);
        }
        return 0;
    }

    androidx.biometric.a n() {
        if (this.f47104e == null) {
            this.f47104e = new androidx.biometric.a(new b(this));
        }
        return this.f47104e;
    }

    C5988D<androidx.biometric.c> o() {
        if (this.f47115p == null) {
            this.f47115p = new C5988D<>();
        }
        return this.f47115p;
    }

    AbstractC5985A<CharSequence> p() {
        if (this.f47116q == null) {
            this.f47116q = new C5988D<>();
        }
        return this.f47116q;
    }

    AbstractC5985A<e.b> q() {
        if (this.f47114o == null) {
            this.f47114o = new C5988D<>();
        }
        return this.f47114o;
    }

    int r() {
        return this.f47108i;
    }

    g s() {
        if (this.f47105f == null) {
            this.f47105f = new g();
        }
        return this.f47105f;
    }

    e.a t() {
        if (this.f47101b == null) {
            this.f47101b = new a();
        }
        return this.f47101b;
    }

    Executor u() {
        Executor executor = this.f47100a;
        return executor != null ? executor : new c();
    }

    e.c v() {
        return this.f47103d;
    }

    CharSequence w() {
        e.d dVar = this.f47102c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    AbstractC5985A<CharSequence> x() {
        if (this.f47123x == null) {
            this.f47123x = new C5988D<>();
        }
        return this.f47123x;
    }

    int y() {
        return this.f47121v;
    }

    private static <T> void l0(C5988D<T> c5988d, T t10) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c5988d.o(t10);
        } else {
            c5988d.m(t10);
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
