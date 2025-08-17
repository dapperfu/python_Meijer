package Yu;

import com.google.android.gms.common.api.a;
import fv.AbstractC14143a;
import gv.C14313a;
import iv.C14765b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class T0<T> extends AbstractC14143a<T> implements Qu.g {

    /* renamed from: e, reason: collision with root package name */
    static final b f40989e = new o();

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40990a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<j<T>> f40991b;

    /* renamed from: c, reason: collision with root package name */
    final b<T> f40992c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.q<T> f40993d;

    static abstract class a<T> extends AtomicReference<f> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        f f40994a;

        /* renamed from: b, reason: collision with root package name */
        int f40995b;

        Object b(Object obj) {
            return obj;
        }

        Object d(Object obj) {
            return obj;
        }

        abstract void h();

        final void a(f fVar) {
            this.f40994a.set(fVar);
            this.f40994a = fVar;
            this.f40995b++;
        }

        a() {
            f fVar = new f(null);
            this.f40994a = fVar;
            set(fVar);
        }

        f c() {
            return get();
        }

        final void e() {
            this.f40995b--;
            f(get().get());
        }

        final void f(f fVar) {
            set(fVar);
        }

        final void g() {
            f fVar = get();
            if (fVar.f41003a != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        void i() {
            g();
        }

        @Override // Yu.T0.h
        public final void l() {
            a(new f(b(ev.m.e())));
            i();
        }

        @Override // Yu.T0.h
        public final void m(Throwable th2) {
            a(new f(b(ev.m.m(th2))));
            i();
        }

        @Override // Yu.T0.h
        public final void n(T t10) {
            a(new f(b(ev.m.z(t10))));
            h();
        }

        @Override // Yu.T0.h
        public final void o(d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    f fVarC = (f) dVar.a();
                    if (fVarC == null) {
                        fVarC = c();
                        dVar.f40999c = fVarC;
                    }
                    while (!dVar.isDisposed()) {
                        f fVar = fVarC.get();
                        if (fVar != null) {
                            if (ev.m.a(d(fVar.f41003a), dVar.f40998b)) {
                                dVar.f40999c = null;
                                return;
                            }
                            fVarC = fVar;
                        } else {
                            dVar.f40999c = fVarC;
                            iAddAndGet = dVar.addAndGet(-iAddAndGet);
                        }
                    }
                    dVar.f40999c = null;
                    return;
                } while (iAddAndGet != 0);
            }
        }
    }

    interface b<T> {
        h<T> call();
    }

    static final class c<R> implements Pu.g<Nu.b> {

        /* renamed from: a, reason: collision with root package name */
        private final P1<R> f40996a;

        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Nu.b bVar) {
            this.f40996a.a(bVar);
        }

        c(P1<R> p12) {
            this.f40996a = p12;
        }
    }

    static final class d<T> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final j<T> f40997a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.s<? super T> f40998b;

        /* renamed from: c, reason: collision with root package name */
        Object f40999c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f41000d;

        <U> U a() {
            return (U) this.f40999c;
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41000d) {
                return;
            }
            this.f41000d = true;
            this.f40997a.b(this);
            this.f40999c = null;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41000d;
        }

        d(j<T> jVar, io.reactivex.s<? super T> sVar) {
            this.f40997a = jVar;
            this.f40998b = sVar;
        }
    }

    static final class e<R, U> extends io.reactivex.l<R> {

        /* renamed from: a, reason: collision with root package name */
        private final Callable<? extends AbstractC14143a<U>> f41001a;

        /* renamed from: b, reason: collision with root package name */
        private final Pu.o<? super io.reactivex.l<U>, ? extends io.reactivex.q<R>> f41002b;

        @Override // io.reactivex.l
        protected void subscribeActual(io.reactivex.s<? super R> sVar) {
            try {
                AbstractC14143a abstractC14143a = (AbstractC14143a) Ru.b.e(this.f41001a.call(), "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41002b.apply(abstractC14143a), "The selector returned a null ObservableSource");
                P1 p12 = new P1(sVar);
                qVar.subscribe(p12);
                abstractC14143a.c(new c(p12));
            } catch (Throwable th2) {
                Ou.a.b(th2);
                Qu.e.m(th2, sVar);
            }
        }

        e(Callable<? extends AbstractC14143a<U>> callable, Pu.o<? super io.reactivex.l<U>, ? extends io.reactivex.q<R>> oVar) {
            this.f41001a = callable;
            this.f41002b = oVar;
        }
    }

    static final class g<T> extends AbstractC14143a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC14143a<T> f41004a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.l<T> f41005b;

        @Override // fv.AbstractC14143a
        public void c(Pu.g<? super Nu.b> gVar) {
            this.f41004a.c(gVar);
        }

        @Override // io.reactivex.l
        protected void subscribeActual(io.reactivex.s<? super T> sVar) {
            this.f41005b.subscribe(sVar);
        }

        g(AbstractC14143a<T> abstractC14143a, io.reactivex.l<T> lVar) {
            this.f41004a = abstractC14143a;
            this.f41005b = lVar;
        }
    }

    interface h<T> {
        void l();

        void m(Throwable th2);

        void n(T t10);

        void o(d<T> dVar);
    }

    static final class i<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f41006a;

        @Override // Yu.T0.b
        public h<T> call() {
            return new n(this.f41006a);
        }

        i(int i10) {
            this.f41006a = i10;
        }
    }

    static final class j<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: e, reason: collision with root package name */
        static final d[] f41007e = new d[0];

        /* renamed from: f, reason: collision with root package name */
        static final d[] f41008f = new d[0];

        /* renamed from: a, reason: collision with root package name */
        final h<T> f41009a;

        /* renamed from: b, reason: collision with root package name */
        boolean f41010b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<d[]> f41011c = new AtomicReference<>(f41007e);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f41012d = new AtomicBoolean();

        boolean a(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f41011c.get();
                if (dVarArr == f41008f) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!U.d.a(this.f41011c, dVarArr, dVarArr2));
            return true;
        }

        void b(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f41011c.get();
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
                    dVarArr2 = f41007e;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i10);
                    System.arraycopy(dVarArr, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!U.d.a(this.f41011c, dVarArr, dVarArr2));
        }

        void c() {
            for (d<T> dVar : this.f41011c.get()) {
                this.f41009a.o(dVar);
            }
        }

        void d() {
            for (d<T> dVar : this.f41011c.getAndSet(f41008f)) {
                this.f41009a.o(dVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f41011c.set(f41008f);
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41011c.get() == f41008f;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41010b) {
                return;
            }
            this.f41010b = true;
            this.f41009a.l();
            d();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41010b) {
                C14313a.s(th2);
                return;
            }
            this.f41010b = true;
            this.f41009a.m(th2);
            d();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41010b) {
                return;
            }
            this.f41009a.n(t10);
            c();
        }

        j(h<T> hVar) {
            this.f41009a = hVar;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar)) {
                c();
            }
        }
    }

    static final class k<T> implements io.reactivex.q<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<j<T>> f41013a;

        /* renamed from: b, reason: collision with root package name */
        private final b<T> f41014b;

        @Override // io.reactivex.q
        public void subscribe(io.reactivex.s<? super T> sVar) {
            j<T> jVar;
            while (true) {
                jVar = this.f41013a.get();
                if (jVar != null) {
                    break;
                }
                j<T> jVar2 = new j<>(this.f41014b.call());
                if (U.d.a(this.f41013a, null, jVar2)) {
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
                jVar.f41009a.o(dVar);
            }
        }

        k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.f41013a = atomicReference;
            this.f41014b = bVar;
        }
    }

    static final class l<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f41015a;

        /* renamed from: b, reason: collision with root package name */
        private final long f41016b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f41017c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.t f41018d;

        @Override // Yu.T0.b
        public h<T> call() {
            return new m(this.f41015a, this.f41016b, this.f41017c, this.f41018d);
        }

        l(int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f41015a = i10;
            this.f41016b = j10;
            this.f41017c = timeUnit;
            this.f41018d = tVar;
        }
    }

    static final class m<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.t f41019c;

        /* renamed from: d, reason: collision with root package name */
        final long f41020d;

        /* renamed from: e, reason: collision with root package name */
        final TimeUnit f41021e;

        /* renamed from: f, reason: collision with root package name */
        final int f41022f;

        @Override // Yu.T0.a
        Object b(Object obj) {
            return new C14765b(obj, this.f41019c.c(this.f41021e), this.f41021e);
        }

        @Override // Yu.T0.a
        f c() {
            f fVar;
            long jC = this.f41019c.c(this.f41021e) - this.f41020d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                C14765b c14765b = (C14765b) fVar2.f41003a;
                if (ev.m.t(c14765b.b()) || ev.m.u(c14765b.b()) || c14765b.a() > jC) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // Yu.T0.a
        Object d(Object obj) {
            return ((C14765b) obj).b();
        }

        @Override // Yu.T0.a
        void h() {
            f fVar;
            long jC = this.f41019c.c(this.f41021e) - this.f41020d;
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
                int i11 = this.f40995b;
                if (i11 > this.f41022f && i11 > 1) {
                    i10++;
                    this.f40995b = i11 - 1;
                    fVar3 = fVar2.get();
                } else {
                    if (((C14765b) fVar2.f41003a).a() > jC) {
                        break;
                    }
                    i10++;
                    this.f40995b--;
                    fVar3 = fVar2.get();
                }
            }
            if (i10 != 0) {
                f(fVar);
            }
        }

        @Override // Yu.T0.a
        void i() {
            f fVar;
            long jC = this.f41019c.c(this.f41021e) - this.f41020d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.f40995b <= 1 || ((C14765b) fVar2.f41003a).a() > jC) {
                    break;
                }
                i10++;
                this.f40995b--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                f(fVar);
            }
        }

        m(int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f41019c = tVar;
            this.f41022f = i10;
            this.f41020d = j10;
            this.f41021e = timeUnit;
        }
    }

    static final class n<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        final int f41023c;

        @Override // Yu.T0.a
        void h() {
            if (this.f40995b > this.f41023c) {
                e();
            }
        }

        n(int i10) {
            this.f41023c = i10;
        }
    }

    static final class o implements b<Object> {
        @Override // Yu.T0.b
        public h<Object> call() {
            return new p(16);
        }

        o() {
        }
    }

    static final class f extends AtomicReference<f> {

        /* renamed from: a, reason: collision with root package name */
        final Object f41003a;

        f(Object obj) {
            this.f41003a = obj;
        }
    }

    static final class p<T> extends ArrayList<Object> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        volatile int f41024a;

        p(int i10) {
            super(i10);
        }

        @Override // Yu.T0.h
        public void l() {
            add(ev.m.e());
            this.f41024a++;
        }

        @Override // Yu.T0.h
        public void m(Throwable th2) {
            add(ev.m.m(th2));
            this.f41024a++;
        }

        @Override // Yu.T0.h
        public void n(T t10) {
            add(ev.m.z(t10));
            this.f41024a++;
        }

        @Override // Yu.T0.h
        public void o(d<T> dVar) {
            int iIntValue;
            if (dVar.getAndIncrement() == 0) {
                io.reactivex.s<? super T> sVar = dVar.f40998b;
                int iAddAndGet = 1;
                while (!dVar.isDisposed()) {
                    int i10 = this.f41024a;
                    Integer num = (Integer) dVar.a();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    while (iIntValue < i10) {
                        if (!ev.m.a(get(iIntValue), sVar) && !dVar.isDisposed()) {
                            iIntValue++;
                        } else {
                            return;
                        }
                    }
                    dVar.f40999c = Integer.valueOf(iIntValue);
                    iAddAndGet = dVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    public static <T> AbstractC14143a<T> h(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10) {
        return i(qVar, new l(i10, j10, timeUnit, tVar));
    }

    static <T> AbstractC14143a<T> i(io.reactivex.q<T> qVar, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C14313a.k(new T0(new k(atomicReference, bVar), qVar, atomicReference, bVar));
    }

    public static <T> AbstractC14143a<T> j(io.reactivex.q<? extends T> qVar) {
        return i(qVar, f40989e);
    }

    public static <U, R> io.reactivex.l<R> k(Callable<? extends AbstractC14143a<U>> callable, Pu.o<? super io.reactivex.l<U>, ? extends io.reactivex.q<R>> oVar) {
        return C14313a.o(new e(callable, oVar));
    }

    @Override // Qu.g
    public void b(Nu.b bVar) {
        U.d.a(this.f40991b, (j) bVar, null);
    }

    @Override // fv.AbstractC14143a
    public void c(Pu.g<? super Nu.b> gVar) {
        j<T> jVar;
        while (true) {
            jVar = this.f40991b.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            j<T> jVar2 = new j<>(this.f40992c.call());
            if (U.d.a(this.f40991b, jVar, jVar2)) {
                jVar = jVar2;
                break;
            }
        }
        boolean z10 = !jVar.f41012d.get() && jVar.f41012d.compareAndSet(false, true);
        try {
            gVar.accept(jVar);
            if (z10) {
                this.f40990a.subscribe(jVar);
            }
        } catch (Throwable th2) {
            if (z10) {
                jVar.f41012d.compareAndSet(true, false);
            }
            Ou.a.b(th2);
            throw ev.j.d(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f40993d.subscribe(sVar);
    }

    private T0(io.reactivex.q<T> qVar, io.reactivex.q<T> qVar2, AtomicReference<j<T>> atomicReference, b<T> bVar) {
        this.f40993d = qVar;
        this.f40990a = qVar2;
        this.f40991b = atomicReference;
        this.f40992c = bVar;
    }

    public static <T> AbstractC14143a<T> f(io.reactivex.q<T> qVar, int i10) {
        if (i10 == Integer.MAX_VALUE) {
            return j(qVar);
        }
        return i(qVar, new i(i10));
    }

    public static <T> AbstractC14143a<T> g(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        return h(qVar, j10, timeUnit, tVar, a.e.API_PRIORITY_OTHER);
    }

    public static <T> AbstractC14143a<T> l(AbstractC14143a<T> abstractC14143a, io.reactivex.t tVar) {
        return C14313a.k(new g(abstractC14143a, abstractC14143a.observeOn(tVar)));
    }
}
