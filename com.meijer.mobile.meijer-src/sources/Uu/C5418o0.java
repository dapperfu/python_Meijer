package Uu;

import bv.AbstractC6411a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: Uu.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5418o0 {

    /* renamed from: Uu.o0$a */
    static final class a<T> implements Callable<AbstractC6411a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f38682a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38683b;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6411a<T> call() {
            return this.f38682a.replay(this.f38683b);
        }

        a(io.reactivex.l<T> lVar, int i10) {
            this.f38682a = lVar;
            this.f38683b = i10;
        }
    }

    /* renamed from: Uu.o0$b */
    static final class b<T> implements Callable<AbstractC6411a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f38684a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38685b;

        /* renamed from: c, reason: collision with root package name */
        private final long f38686c;

        /* renamed from: d, reason: collision with root package name */
        private final TimeUnit f38687d;

        /* renamed from: e, reason: collision with root package name */
        private final io.reactivex.t f38688e;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6411a<T> call() {
            return this.f38684a.replay(this.f38685b, this.f38686c, this.f38687d, this.f38688e);
        }

        b(io.reactivex.l<T> lVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f38684a = lVar;
            this.f38685b = i10;
            this.f38686c = j10;
            this.f38687d = timeUnit;
            this.f38688e = tVar;
        }
    }

    /* renamed from: Uu.o0$c */
    static final class c<T, U> implements Lu.o<T, io.reactivex.q<U>> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.o<? super T, ? extends Iterable<? extends U>> f38689a;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<U> apply(T t10) throws Exception {
            return new C5391f0((Iterable) Nu.b.e(this.f38689a.apply(t10), "The mapper returned a null Iterable"));
        }

        c(Lu.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f38689a = oVar;
        }
    }

    /* renamed from: Uu.o0$d */
    static final class d<U, R, T> implements Lu.o<U, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.c<? super T, ? super U, ? extends R> f38690a;

        /* renamed from: b, reason: collision with root package name */
        private final T f38691b;

        @Override // Lu.o
        public R apply(U u10) throws Exception {
            return this.f38690a.apply(this.f38691b, u10);
        }

        d(Lu.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f38690a = cVar;
            this.f38691b = t10;
        }
    }

    /* renamed from: Uu.o0$e */
    static final class e<T, R, U> implements Lu.o<T, io.reactivex.q<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.c<? super T, ? super U, ? extends R> f38692a;

        /* renamed from: b, reason: collision with root package name */
        private final Lu.o<? super T, ? extends io.reactivex.q<? extends U>> f38693b;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<R> apply(T t10) throws Exception {
            return new C5435w0((io.reactivex.q) Nu.b.e(this.f38693b.apply(t10), "The mapper returned a null ObservableSource"), new d(this.f38692a, t10));
        }

        e(Lu.c<? super T, ? super U, ? extends R> cVar, Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar) {
            this.f38692a = cVar;
            this.f38693b = oVar;
        }
    }

    /* renamed from: Uu.o0$f */
    static final class f<T, U> implements Lu.o<T, io.reactivex.q<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<U>> f38694a;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<T> apply(T t10) throws Exception {
            return new C5422p1((io.reactivex.q) Nu.b.e(this.f38694a.apply(t10), "The itemDelay returned a null ObservableSource"), 1L).map(Nu.a.l(t10)).defaultIfEmpty(t10);
        }

        f(Lu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
            this.f38694a = oVar;
        }
    }

    /* renamed from: Uu.o0$g */
    static final class g<T> implements Lu.a {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<T> f38695a;

        @Override // Lu.a
        public void run() throws Exception {
            this.f38695a.onComplete();
        }

        g(io.reactivex.s<T> sVar) {
            this.f38695a = sVar;
        }
    }

    /* renamed from: Uu.o0$h */
    static final class h<T> implements Lu.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<T> f38696a;

        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f38696a.onError(th2);
        }

        h(io.reactivex.s<T> sVar) {
            this.f38696a = sVar;
        }
    }

    /* renamed from: Uu.o0$i */
    static final class i<T> implements Lu.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<T> f38697a;

        @Override // Lu.g
        public void accept(T t10) throws Exception {
            this.f38697a.onNext(t10);
        }

        i(io.reactivex.s<T> sVar) {
            this.f38697a = sVar;
        }
    }

    /* renamed from: Uu.o0$j */
    static final class j<T> implements Callable<AbstractC6411a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f38698a;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6411a<T> call() {
            return this.f38698a.replay();
        }

        j(io.reactivex.l<T> lVar) {
            this.f38698a = lVar;
        }
    }

    /* renamed from: Uu.o0$k */
    static final class k<T, R> implements Lu.o<io.reactivex.l<T>, io.reactivex.q<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> f38699a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.t f38700b;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<R> apply(io.reactivex.l<T> lVar) throws Exception {
            return io.reactivex.l.wrap((io.reactivex.q) Nu.b.e(this.f38699a.apply(lVar), "The selector returned a null ObservableSource")).observeOn(this.f38700b);
        }

        k(Lu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> oVar, io.reactivex.t tVar) {
            this.f38699a = oVar;
            this.f38700b = tVar;
        }
    }

    /* renamed from: Uu.o0$l */
    static final class l<T, S> implements Lu.c<S, io.reactivex.e<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final Lu.b<S, io.reactivex.e<T>> f38701a;

        @Override // Lu.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.e<T> eVar) throws Exception {
            this.f38701a.accept(s10, eVar);
            return s10;
        }

        l(Lu.b<S, io.reactivex.e<T>> bVar) {
            this.f38701a = bVar;
        }
    }

    /* renamed from: Uu.o0$m */
    static final class m<T, S> implements Lu.c<S, io.reactivex.e<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final Lu.g<io.reactivex.e<T>> f38702a;

        @Override // Lu.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.e<T> eVar) throws Exception {
            this.f38702a.accept(eVar);
            return s10;
        }

        m(Lu.g<io.reactivex.e<T>> gVar) {
            this.f38702a = gVar;
        }
    }

    /* renamed from: Uu.o0$n */
    static final class n<T> implements Callable<AbstractC6411a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f38703a;

        /* renamed from: b, reason: collision with root package name */
        private final long f38704b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f38705c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.t f38706d;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6411a<T> call() {
            return this.f38703a.replay(this.f38704b, this.f38705c, this.f38706d);
        }

        n(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f38703a = lVar;
            this.f38704b = j10;
            this.f38705c = timeUnit;
            this.f38706d = tVar;
        }
    }

    /* renamed from: Uu.o0$o */
    static final class o<T, R> implements Lu.o<List<io.reactivex.q<? extends T>>, io.reactivex.q<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.o<? super Object[], ? extends R> f38707a;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<? extends R> apply(List<io.reactivex.q<? extends T>> list) {
            return io.reactivex.l.zipIterable(list, this.f38707a, false, io.reactivex.l.bufferSize());
        }

        o(Lu.o<? super Object[], ? extends R> oVar) {
            this.f38707a = oVar;
        }
    }

    public static <T, U> Lu.o<T, io.reactivex.q<U>> a(Lu.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> Lu.o<T, io.reactivex.q<R>> b(Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> Lu.o<T, io.reactivex.q<T>> c(Lu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
        return new f(oVar);
    }

    public static <T> Lu.a d(io.reactivex.s<T> sVar) {
        return new g(sVar);
    }

    public static <T> Lu.g<Throwable> e(io.reactivex.s<T> sVar) {
        return new h(sVar);
    }

    public static <T> Lu.g<T> f(io.reactivex.s<T> sVar) {
        return new i(sVar);
    }

    public static <T> Callable<AbstractC6411a<T>> g(io.reactivex.l<T> lVar) {
        return new j(lVar);
    }

    public static <T> Callable<AbstractC6411a<T>> h(io.reactivex.l<T> lVar, int i10) {
        return new a(lVar, i10);
    }

    public static <T> Callable<AbstractC6411a<T>> i(io.reactivex.l<T> lVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        return new b(lVar, i10, j10, timeUnit, tVar);
    }

    public static <T> Callable<AbstractC6411a<T>> j(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        return new n(lVar, j10, timeUnit, tVar);
    }

    public static <T, R> Lu.o<io.reactivex.l<T>, io.reactivex.q<R>> k(Lu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> oVar, io.reactivex.t tVar) {
        return new k(oVar, tVar);
    }

    public static <T, S> Lu.c<S, io.reactivex.e<T>, S> l(Lu.b<S, io.reactivex.e<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> Lu.c<S, io.reactivex.e<T>, S> m(Lu.g<io.reactivex.e<T>> gVar) {
        return new m(gVar);
    }

    public static <T, R> Lu.o<List<io.reactivex.q<? extends T>>, io.reactivex.q<? extends R>> n(Lu.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
