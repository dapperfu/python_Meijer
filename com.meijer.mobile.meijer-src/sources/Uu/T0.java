package Uu;

import bv.AbstractC6411a;
import com.google.android.gms.common.api.a;
import cv.C13558a;
import ev.C13890b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class T0<T> extends AbstractC6411a<T> implements Mu.g {

    /* renamed from: e, reason: collision with root package name */
    static final b f38214e = new o();

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38215a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<j<T>> f38216b;

    /* renamed from: c, reason: collision with root package name */
    final b<T> f38217c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.q<T> f38218d;

    static abstract class a<T> extends AtomicReference<f> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        f f38219a;

        /* renamed from: b, reason: collision with root package name */
        int f38220b;

        Object b(Object obj) {
            return obj;
        }

        Object d(Object obj) {
            return obj;
        }

        abstract void h();

        final void a(f fVar) {
            this.f38219a.set(fVar);
            this.f38219a = fVar;
            this.f38220b++;
        }

        a() {
            f fVar = new f(null);
            this.f38219a = fVar;
            set(fVar);
        }

        f c() {
            return get();
        }

        final void e() {
            this.f38220b--;
            f(get().get());
        }

        final void f(f fVar) {
            set(fVar);
        }

        final void g() {
            f fVar = get();
            if (fVar.f38228a != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        void i() {
            g();
        }

        @Override // Uu.T0.h
        public final void l() {
            a(new f(b(av.m.e())));
            i();
        }

        @Override // Uu.T0.h
        public final void m(d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    f fVarC = (f) dVar.a();
                    if (fVarC == null) {
                        fVarC = c();
                        dVar.f38224c = fVarC;
                    }
                    while (!dVar.isDisposed()) {
                        f fVar = fVarC.get();
                        if (fVar != null) {
                            if (av.m.a(d(fVar.f38228a), dVar.f38223b)) {
                                dVar.f38224c = null;
                                return;
                            }
                            fVarC = fVar;
                        } else {
                            dVar.f38224c = fVarC;
                            iAddAndGet = dVar.addAndGet(-iAddAndGet);
                        }
                    }
                    dVar.f38224c = null;
                    return;
                } while (iAddAndGet != 0);
            }
        }

        @Override // Uu.T0.h
        public final void n(Throwable th2) {
            a(new f(b(av.m.m(th2))));
            i();
        }

        @Override // Uu.T0.h
        public final void o(T t10) {
            a(new f(b(av.m.z(t10))));
            h();
        }
    }

    interface b<T> {
        h<T> call();
    }

    static final class c<R> implements Lu.g<Ju.b> {

        /* renamed from: a, reason: collision with root package name */
        private final P1<R> f38221a;

        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Ju.b bVar) {
            this.f38221a.a(bVar);
        }

        c(P1<R> p12) {
            this.f38221a = p12;
        }
    }

    static final class d<T> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final j<T> f38222a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.s<? super T> f38223b;

        /* renamed from: c, reason: collision with root package name */
        Object f38224c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f38225d;

        <U> U a() {
            return (U) this.f38224c;
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38225d) {
                return;
            }
            this.f38225d = true;
            this.f38222a.b(this);
            this.f38224c = null;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38225d;
        }

        d(j<T> jVar, io.reactivex.s<? super T> sVar) {
            this.f38222a = jVar;
            this.f38223b = sVar;
        }
    }

    static final class e<R, U> extends io.reactivex.l<R> {

        /* renamed from: a, reason: collision with root package name */
        private final Callable<? extends AbstractC6411a<U>> f38226a;

        /* renamed from: b, reason: collision with root package name */
        private final Lu.o<? super io.reactivex.l<U>, ? extends io.reactivex.q<R>> f38227b;

        @Override // io.reactivex.l
        protected void subscribeActual(io.reactivex.s<? super R> sVar) {
            try {
                AbstractC6411a abstractC6411a = (AbstractC6411a) Nu.b.e(this.f38226a.call(), "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38227b.apply(abstractC6411a), "The selector returned a null ObservableSource");
                P1 p12 = new P1(sVar);
                qVar.subscribe(p12);
                abstractC6411a.c(new c(p12));
            } catch (Throwable th2) {
                Ku.a.b(th2);
                Mu.e.m(th2, sVar);
            }
        }

        e(Callable<? extends AbstractC6411a<U>> callable, Lu.o<? super io.reactivex.l<U>, ? extends io.reactivex.q<R>> oVar) {
            this.f38226a = callable;
            this.f38227b = oVar;
        }
    }

    static final class g<T> extends AbstractC6411a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6411a<T> f38229a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.l<T> f38230b;

        @Override // bv.AbstractC6411a
        public void c(Lu.g<? super Ju.b> gVar) {
            this.f38229a.c(gVar);
        }

        @Override // io.reactivex.l
        protected void subscribeActual(io.reactivex.s<? super T> sVar) {
            this.f38230b.subscribe(sVar);
        }

        g(AbstractC6411a<T> abstractC6411a, io.reactivex.l<T> lVar) {
            this.f38229a = abstractC6411a;
            this.f38230b = lVar;
        }
    }

    interface h<T> {
        void l();

        void m(d<T> dVar);

        void n(Throwable th2);

        void o(T t10);
    }

    static final class i<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f38231a;

        @Override // Uu.T0.b
        public h<T> call() {
            return new n(this.f38231a);
        }

        i(int i10) {
            this.f38231a = i10;
        }
    }

    static final class j<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: e, reason: collision with root package name */
        static final d[] f38232e = new d[0];

        /* renamed from: f, reason: collision with root package name */
        static final d[] f38233f = new d[0];

        /* renamed from: a, reason: collision with root package name */
        final h<T> f38234a;

        /* renamed from: b, reason: collision with root package name */
        boolean f38235b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<d[]> f38236c = new AtomicReference<>(f38232e);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f38237d = new AtomicBoolean();

        boolean a(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f38236c.get();
                if (dVarArr == f38233f) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!U.d.a(this.f38236c, dVarArr, dVarArr2));
            return true;
        }

        void b(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f38236c.get();
                int length = dVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (dVarArr[i10].equals(dVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr2 = f38232e;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i10);
                    System.arraycopy(dVarArr, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!U.d.a(this.f38236c, dVarArr, dVarArr2));
        }

        void c() {
            for (d<T> dVar : this.f38236c.get()) {
                this.f38234a.m(dVar);
            }
        }

        void d() {
            for (d<T> dVar : this.f38236c.getAndSet(f38233f)) {
                this.f38234a.m(dVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38236c.set(f38233f);
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38236c.get() == f38233f;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38235b) {
                return;
            }
            this.f38235b = true;
            this.f38234a.l();
            d();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38235b) {
                C13558a.s(th2);
                return;
            }
            this.f38235b = true;
            this.f38234a.n(th2);
            d();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38235b) {
                return;
            }
            this.f38234a.o(t10);
            c();
        }

        j(h<T> hVar) {
            this.f38234a = hVar;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar)) {
                c();
            }
        }
    }

    static final class k<T> implements io.reactivex.q<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<j<T>> f38238a;

        /* renamed from: b, reason: collision with root package name */
        private final b<T> f38239b;

        @Override // io.reactivex.q
        public void subscribe(io.reactivex.s<? super T> sVar) {
            j<T> jVar;
            while (true) {
                jVar = this.f38238a.get();
                if (jVar != null) {
                    break;
                }
                j<T> jVar2 = new j<>(this.f38239b.call());
                if (U.d.a(this.f38238a, null, jVar2)) {
                    jVar = jVar2;
                    break;
                }
            }
            d<T> dVar = new d<>(jVar, sVar);
            sVar.onSubscribe(dVar);
            jVar.a(dVar);
            if (dVar.isDisposed()) {
                jVar.b(dVar);
            } else {
                jVar.f38234a.m(dVar);
            }
        }

        k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.f38238a = atomicReference;
            this.f38239b = bVar;
        }
    }

    static final class l<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f38240a;

        /* renamed from: b, reason: collision with root package name */
        private final long f38241b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f38242c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.t f38243d;

        @Override // Uu.T0.b
        public h<T> call() {
            return new m(this.f38240a, this.f38241b, this.f38242c, this.f38243d);
        }

        l(int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f38240a = i10;
            this.f38241b = j10;
            this.f38242c = timeUnit;
            this.f38243d = tVar;
        }
    }

    static final class m<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.t f38244c;

        /* renamed from: d, reason: collision with root package name */
        final long f38245d;

        /* renamed from: e, reason: collision with root package name */
        final TimeUnit f38246e;

        /* renamed from: f, reason: collision with root package name */
        final int f38247f;

        @Override // Uu.T0.a
        Object b(Object obj) {
            return new C13890b(obj, this.f38244c.c(this.f38246e), this.f38246e);
        }

        @Override // Uu.T0.a
        f c() {
            f fVar;
            long jC = this.f38244c.c(this.f38246e) - this.f38245d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                C13890b c13890b = (C13890b) fVar2.f38228a;
                if (av.m.t(c13890b.b()) || av.m.u(c13890b.b()) || c13890b.a() > jC) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // Uu.T0.a
        Object d(Object obj) {
            return ((C13890b) obj).b();
        }

        @Override // Uu.T0.a
        void h() {
            f fVar;
            long jC = this.f38244c.c(this.f38246e) - this.f38245d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i11 = this.f38220b;
                if (i11 > this.f38247f && i11 > 1) {
                    i10++;
                    this.f38220b = i11 - 1;
                    fVar3 = fVar2.get();
                } else {
                    if (((C13890b) fVar2.f38228a).a() > jC) {
                        break;
                    }
                    i10++;
                    this.f38220b--;
                    fVar3 = fVar2.get();
                }
            }
            if (i10 != 0) {
                f(fVar);
            }
        }

        @Override // Uu.T0.a
        void i() {
            f fVar;
            long jC = this.f38244c.c(this.f38246e) - this.f38245d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.f38220b <= 1 || ((C13890b) fVar2.f38228a).a() > jC) {
                    break;
                }
                i10++;
                this.f38220b--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                f(fVar);
            }
        }

        m(int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f38244c = tVar;
            this.f38247f = i10;
            this.f38245d = j10;
            this.f38246e = timeUnit;
        }
    }

    static final class n<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        final int f38248c;

        @Override // Uu.T0.a
        void h() {
            if (this.f38220b > this.f38248c) {
                e();
            }
        }

        n(int i10) {
            this.f38248c = i10;
        }
    }

    static final class o implements b<Object> {
        @Override // Uu.T0.b
        public h<Object> call() {
            return new p(16);
        }

        o() {
        }
    }

    static final class f extends AtomicReference<f> {

        /* renamed from: a, reason: collision with root package name */
        final Object f38228a;

        f(Object obj) {
            this.f38228a = obj;
        }
    }

    static final class p<T> extends ArrayList<Object> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        volatile int f38249a;

        p(int i10) {
            super(i10);
        }

        @Override // Uu.T0.h
        public void l() {
            add(av.m.e());
            this.f38249a++;
        }

        @Override // Uu.T0.h
        public void m(d<T> dVar) {
            int iIntValue;
            if (dVar.getAndIncrement() == 0) {
                io.reactivex.s<? super T> sVar = dVar.f38223b;
                int iAddAndGet = 1;
                while (!dVar.isDisposed()) {
                    int i10 = this.f38249a;
                    Integer num = (Integer) dVar.a();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    while (iIntValue < i10) {
                        if (!av.m.a(get(iIntValue), sVar) && !dVar.isDisposed()) {
                            iIntValue++;
                        } else {
                            return;
                        }
                    }
                    dVar.f38224c = Integer.valueOf(iIntValue);
                    iAddAndGet = dVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Uu.T0.h
        public void n(Throwable th2) {
            add(av.m.m(th2));
            this.f38249a++;
        }

        @Override // Uu.T0.h
        public void o(T t10) {
            add(av.m.z(t10));
            this.f38249a++;
        }
    }

    public static <T> AbstractC6411a<T> h(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10) {
        return i(qVar, new l(i10, j10, timeUnit, tVar));
    }

    static <T> AbstractC6411a<T> i(io.reactivex.q<T> qVar, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C13558a.k(new T0(new k(atomicReference, bVar), qVar, atomicReference, bVar));
    }

    public static <T> AbstractC6411a<T> j(io.reactivex.q<? extends T> qVar) {
        return i(qVar, f38214e);
    }

    public static <U, R> io.reactivex.l<R> k(Callable<? extends AbstractC6411a<U>> callable, Lu.o<? super io.reactivex.l<U>, ? extends io.reactivex.q<R>> oVar) {
        return C13558a.o(new e(callable, oVar));
    }

    @Override // Mu.g
    public void a(Ju.b bVar) {
        U.d.a(this.f38216b, (j) bVar, null);
    }

    @Override // bv.AbstractC6411a
    public void c(Lu.g<? super Ju.b> gVar) {
        j<T> jVar;
        while (true) {
            jVar = this.f38216b.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            j<T> jVar2 = new j<>(this.f38217c.call());
            if (U.d.a(this.f38216b, jVar, jVar2)) {
                jVar = jVar2;
                break;
            }
        }
        boolean z10 = !jVar.f38237d.get() && jVar.f38237d.compareAndSet(false, true);
        try {
            gVar.accept(jVar);
            if (z10) {
                this.f38215a.subscribe(jVar);
            }
        } catch (Throwable th2) {
            if (z10) {
                jVar.f38237d.compareAndSet(true, false);
            }
            Ku.a.b(th2);
            throw av.j.d(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38218d.subscribe(sVar);
    }

    private T0(io.reactivex.q<T> qVar, io.reactivex.q<T> qVar2, AtomicReference<j<T>> atomicReference, b<T> bVar) {
        this.f38218d = qVar;
        this.f38215a = qVar2;
        this.f38216b = atomicReference;
        this.f38217c = bVar;
    }

    public static <T> AbstractC6411a<T> f(io.reactivex.q<T> qVar, int i10) {
        if (i10 == Integer.MAX_VALUE) {
            return j(qVar);
        }
        return i(qVar, new i(i10));
    }

    public static <T> AbstractC6411a<T> g(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        return h(qVar, j10, timeUnit, tVar, a.e.API_PRIORITY_OTHER);
    }

    public static <T> AbstractC6411a<T> l(AbstractC6411a<T> abstractC6411a, io.reactivex.t tVar) {
        return C13558a.k(new g(abstractC6411a, abstractC6411a.observeOn(tVar)));
    }
}
