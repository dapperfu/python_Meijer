package Yu;

import fv.AbstractC14143a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: Yu.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5479o0 {

    /* renamed from: Yu.o0$a */
    static final class a<T> implements Callable<AbstractC14143a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f41457a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41458b;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC14143a<T> call() {
            return this.f41457a.replay(this.f41458b);
        }

        a(io.reactivex.l<T> lVar, int i10) {
            this.f41457a = lVar;
            this.f41458b = i10;
        }
    }

    /* renamed from: Yu.o0$b */
    static final class b<T> implements Callable<AbstractC14143a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f41459a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41460b;

        /* renamed from: c, reason: collision with root package name */
        private final long f41461c;

        /* renamed from: d, reason: collision with root package name */
        private final TimeUnit f41462d;

        /* renamed from: e, reason: collision with root package name */
        private final io.reactivex.t f41463e;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC14143a<T> call() {
            return this.f41459a.replay(this.f41460b, this.f41461c, this.f41462d, this.f41463e);
        }

        b(io.reactivex.l<T> lVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f41459a = lVar;
            this.f41460b = i10;
            this.f41461c = j10;
            this.f41462d = timeUnit;
            this.f41463e = tVar;
        }
    }

    /* renamed from: Yu.o0$c */
    static final class c<T, U> implements Pu.o<T, io.reactivex.q<U>> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.o<? super T, ? extends Iterable<? extends U>> f41464a;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<U> apply(T t10) throws Exception {
            return new C5452f0((Iterable) Ru.b.e(this.f41464a.apply(t10), "The mapper returned a null Iterable"));
        }

        c(Pu.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f41464a = oVar;
        }
    }

    /* renamed from: Yu.o0$d */
    static final class d<U, R, T> implements Pu.o<U, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.c<? super T, ? super U, ? extends R> f41465a;

        /* renamed from: b, reason: collision with root package name */
        private final T f41466b;

        @Override // Pu.o
        public R apply(U u10) throws Exception {
            return this.f41465a.apply(this.f41466b, u10);
        }

        d(Pu.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f41465a = cVar;
            this.f41466b = t10;
        }
    }

    /* renamed from: Yu.o0$e */
    static final class e<T, R, U> implements Pu.o<T, io.reactivex.q<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.c<? super T, ? super U, ? extends R> f41467a;

        /* renamed from: b, reason: collision with root package name */
        private final Pu.o<? super T, ? extends io.reactivex.q<? extends U>> f41468b;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<R> apply(T t10) throws Exception {
            return new C5496w0((io.reactivex.q) Ru.b.e(this.f41468b.apply(t10), "The mapper returned a null ObservableSource"), new d(this.f41467a, t10));
        }

        e(Pu.c<? super T, ? super U, ? extends R> cVar, Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar) {
            this.f41467a = cVar;
            this.f41468b = oVar;
        }
    }

    /* renamed from: Yu.o0$f */
    static final class f<T, U> implements Pu.o<T, io.reactivex.q<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<U>> f41469a;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<T> apply(T t10) throws Exception {
            return new C5483p1((io.reactivex.q) Ru.b.e(this.f41469a.apply(t10), "The itemDelay returned a null ObservableSource"), 1L).map(Ru.a.l(t10)).defaultIfEmpty(t10);
        }

        f(Pu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
            this.f41469a = oVar;
        }
    }

    /* renamed from: Yu.o0$g */
    static final class g<T> implements Pu.a {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<T> f41470a;

        @Override // Pu.a
        public void run() throws Exception {
            this.f41470a.onComplete();
        }

        g(io.reactivex.s<T> sVar) {
            this.f41470a = sVar;
        }
    }

    /* renamed from: Yu.o0$h */
    static final class h<T> implements Pu.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<T> f41471a;

        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f41471a.onError(th2);
        }

        h(io.reactivex.s<T> sVar) {
            this.f41471a = sVar;
        }
    }

    /* renamed from: Yu.o0$i */
    static final class i<T> implements Pu.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<T> f41472a;

        @Override // Pu.g
        public void accept(T t10) throws Exception {
            this.f41472a.onNext(t10);
        }

        i(io.reactivex.s<T> sVar) {
            this.f41472a = sVar;
        }
    }

    /* renamed from: Yu.o0$j */
    static final class j<T> implements Callable<AbstractC14143a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f41473a;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC14143a<T> call() {
            return this.f41473a.replay();
        }

        j(io.reactivex.l<T> lVar) {
            this.f41473a = lVar;
        }
    }

    /* renamed from: Yu.o0$k */
    static final class k<T, R> implements Pu.o<io.reactivex.l<T>, io.reactivex.q<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> f41474a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.t f41475b;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<R> apply(io.reactivex.l<T> lVar) throws Exception {
            return io.reactivex.l.wrap((io.reactivex.q) Ru.b.e(this.f41474a.apply(lVar), "The selector returned a null ObservableSource")).observeOn(this.f41475b);
        }

        k(Pu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> oVar, io.reactivex.t tVar) {
            this.f41474a = oVar;
            this.f41475b = tVar;
        }
    }

    /* renamed from: Yu.o0$l */
    static final class l<T, S> implements Pu.c<S, io.reactivex.e<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final Pu.b<S, io.reactivex.e<T>> f41476a;

        @Override // Pu.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.e<T> eVar) throws Exception {
            this.f41476a.accept(s10, eVar);
            return s10;
        }

        l(Pu.b<S, io.reactivex.e<T>> bVar) {
            this.f41476a = bVar;
        }
    }

    /* renamed from: Yu.o0$m */
    static final class m<T, S> implements Pu.c<S, io.reactivex.e<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final Pu.g<io.reactivex.e<T>> f41477a;

        @Override // Pu.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.e<T> eVar) throws Exception {
            this.f41477a.accept(eVar);
            return s10;
        }

        m(Pu.g<io.reactivex.e<T>> gVar) {
            this.f41477a = gVar;
        }
    }

    /* renamed from: Yu.o0$n */
    static final class n<T> implements Callable<AbstractC14143a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f41478a;

        /* renamed from: b, reason: collision with root package name */
        private final long f41479b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f41480c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.t f41481d;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC14143a<T> call() {
            return this.f41478a.replay(this.f41479b, this.f41480c, this.f41481d);
        }

        n(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f41478a = lVar;
            this.f41479b = j10;
            this.f41480c = timeUnit;
            this.f41481d = tVar;
        }
    }

    /* renamed from: Yu.o0$o */
    static final class o<T, R> implements Pu.o<List<io.reactivex.q<? extends T>>, io.reactivex.q<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.o<? super Object[], ? extends R> f41482a;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.q<? extends R> apply(List<io.reactivex.q<? extends T>> list) {
            return io.reactivex.l.zipIterable(list, this.f41482a, false, io.reactivex.l.bufferSize());
        }

        o(Pu.o<? super Object[], ? extends R> oVar) {
            this.f41482a = oVar;
        }
    }

    public static <T, U> Pu.o<T, io.reactivex.q<U>> a(Pu.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> Pu.o<T, io.reactivex.q<R>> b(Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> Pu.o<T, io.reactivex.q<T>> c(Pu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
        return new f(oVar);
    }

    public static <T> Pu.a d(io.reactivex.s<T> sVar) {
        return new g(sVar);
    }

    public static <T> Pu.g<Throwable> e(io.reactivex.s<T> sVar) {
        return new h(sVar);
    }

    public static <T> Pu.g<T> f(io.reactivex.s<T> sVar) {
        return new i(sVar);
    }

    public static <T> Callable<AbstractC14143a<T>> g(io.reactivex.l<T> lVar) {
        return new j(lVar);
    }

    public static <T> Callable<AbstractC14143a<T>> h(io.reactivex.l<T> lVar, int i10) {
        return new a(lVar, i10);
    }

    public static <T> Callable<AbstractC14143a<T>> i(io.reactivex.l<T> lVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        return new b(lVar, i10, j10, timeUnit, tVar);
    }

    public static <T> Callable<AbstractC14143a<T>> j(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        return new n(lVar, j10, timeUnit, tVar);
    }

    public static <T, R> Pu.o<io.reactivex.l<T>, io.reactivex.q<R>> k(Pu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> oVar, io.reactivex.t tVar) {
        return new k(oVar, tVar);
    }

    public static <T, S> Pu.c<S, io.reactivex.e<T>, S> l(Pu.b<S, io.reactivex.e<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> Pu.c<S, io.reactivex.e<T>, S> m(Pu.g<io.reactivex.e<T>> gVar) {
        return new m(gVar);
    }

    public static <T, R> Pu.o<List<io.reactivex.q<? extends T>>, io.reactivex.q<? extends R>> n(Pu.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
