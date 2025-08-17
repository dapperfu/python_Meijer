package io.reactivex;

import Yu.A;
import Yu.A0;
import Yu.A1;
import Yu.B;
import Yu.B0;
import Yu.B1;
import Yu.C;
import Yu.C0;
import Yu.C1;
import Yu.C5437a0;
import Yu.C5438a1;
import Yu.C5439b;
import Yu.C5440b0;
import Yu.C5441b1;
import Yu.C5442c;
import Yu.C5443c0;
import Yu.C5445d;
import Yu.C5447d1;
import Yu.C5448e;
import Yu.C5449e0;
import Yu.C5450e1;
import Yu.C5452f0;
import Yu.C5453f1;
import Yu.C5454g;
import Yu.C5455g0;
import Yu.C5456g1;
import Yu.C5457h;
import Yu.C5458h0;
import Yu.C5459h1;
import Yu.C5461i0;
import Yu.C5462i1;
import Yu.C5463j;
import Yu.C5464j0;
import Yu.C5465j1;
import Yu.C5466k;
import Yu.C5467k0;
import Yu.C5468k1;
import Yu.C5469l;
import Yu.C5470l0;
import Yu.C5471l1;
import Yu.C5472m;
import Yu.C5473m0;
import Yu.C5474m1;
import Yu.C5475n;
import Yu.C5476n0;
import Yu.C5477n1;
import Yu.C5478o;
import Yu.C5479o0;
import Yu.C5480o1;
import Yu.C5481p;
import Yu.C5482p0;
import Yu.C5483p1;
import Yu.C5484q;
import Yu.C5485q0;
import Yu.C5486r0;
import Yu.C5487s;
import Yu.C5488s0;
import Yu.C5489t;
import Yu.C5490t0;
import Yu.C5491u;
import Yu.C5492u0;
import Yu.C5493v;
import Yu.C5494v0;
import Yu.C5495w;
import Yu.C5496w0;
import Yu.C5497x;
import Yu.C5498x0;
import Yu.C5499y;
import Yu.C5500y0;
import Yu.C5502z0;
import Yu.CallableC5446d0;
import Yu.D;
import Yu.D0;
import Yu.D1;
import Yu.E;
import Yu.E0;
import Yu.E1;
import Yu.F;
import Yu.F0;
import Yu.F1;
import Yu.G;
import Yu.G0;
import Yu.G1;
import Yu.H;
import Yu.H1;
import Yu.I;
import Yu.I1;
import Yu.J;
import Yu.J0;
import Yu.J1;
import Yu.K;
import Yu.K0;
import Yu.K1;
import Yu.L;
import Yu.L0;
import Yu.L1;
import Yu.M;
import Yu.M0;
import Yu.M1;
import Yu.N;
import Yu.N0;
import Yu.N1;
import Yu.O;
import Yu.O0;
import Yu.O1;
import Yu.Q;
import Yu.Q0;
import Yu.R0;
import Yu.S;
import Yu.S0;
import Yu.T;
import Yu.T0;
import Yu.U;
import Yu.U0;
import Yu.V;
import Yu.V0;
import Yu.W;
import Yu.W0;
import Yu.X0;
import Yu.Y;
import Yu.Y0;
import Yu.Z;
import Yu.Z0;
import Yu.q1;
import Yu.r1;
import Yu.s1;
import Yu.t1;
import Yu.u1;
import Yu.v1;
import Yu.w1;
import Yu.x1;
import Yu.y1;
import Yu.z1;
import com.google.android.gms.common.api.a;
import fv.AbstractC14143a;
import fv.AbstractC14144b;
import gv.C14313a;
import iv.C14764a;
import iv.C14765b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class l<T> implements q<T> {
    public static <T, R> l<R> combineLatest(Pu.o<? super Object[], ? extends R> oVar, int i10, q<? extends T>... qVarArr) {
        return combineLatest(qVarArr, oVar, i10);
    }

    public static <T, R> l<R> combineLatestDelayError(q<? extends T>[] qVarArr, Pu.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(qVarArr, oVar, bufferSize());
    }

    public static <T> l<T> concat(Iterable<? extends q<? extends T>> iterable) {
        Ru.b.e(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Ru.a.i(), bufferSize(), false);
    }

    public static <T> l<T> concatArray(q<? extends T>... qVarArr) {
        return qVarArr.length == 0 ? empty() : qVarArr.length == 1 ? wrap(qVarArr[0]) : C14313a.o(new C5491u(fromArray(qVarArr), Ru.a.i(), bufferSize(), ev.i.BOUNDARY));
    }

    public static <T> l<T> concatArrayDelayError(q<? extends T>... qVarArr) {
        return qVarArr.length == 0 ? empty() : qVarArr.length == 1 ? wrap(qVarArr[0]) : concatDelayError(fromArray(qVarArr));
    }

    public static <T> l<T> concatArrayEager(q<? extends T>... qVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), qVarArr);
    }

    public static <T> l<T> concatArrayEagerDelayError(q<? extends T>... qVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), qVarArr);
    }

    public static <T> l<T> concatDelayError(Iterable<? extends q<? extends T>> iterable) {
        Ru.b.e(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> l<T> concatEager(q<? extends q<? extends T>> qVar) {
        return concatEager(qVar, bufferSize(), bufferSize());
    }

    private l<T> doOnEach(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar, Pu.a aVar2) {
        Ru.b.e(gVar, "onNext is null");
        Ru.b.e(gVar2, "onError is null");
        Ru.b.e(aVar, "onComplete is null");
        Ru.b.e(aVar2, "onAfterTerminate is null");
        return C14313a.o(new N(this, gVar, gVar2, aVar, aVar2));
    }

    public static <T> l<T> error(Callable<? extends Throwable> callable) {
        Ru.b.e(callable, "errorSupplier is null");
        return C14313a.o(new U(callable));
    }

    public static <T> l<T> fromFuture(Future<? extends T> future) {
        Ru.b.e(future, "future is null");
        return C14313a.o(new C5449e0(future, 0L, null));
    }

    public static <T> l<T> generate(Pu.g<e<T>> gVar) {
        Ru.b.e(gVar, "generator is null");
        return generate(Ru.a.s(), C5479o0.m(gVar), Ru.a.g());
    }

    public static l<Long> interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, C14764a.a());
    }

    public static l<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, C14764a.a());
    }

    public static <T> l<T> just(T t10) {
        Ru.b.e(t10, "item is null");
        return C14313a.o(new C5488s0(t10));
    }

    public static <T> l<T> merge(Iterable<? extends q<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Ru.a.i(), false, i10, i11);
    }

    public static <T> l<T> mergeArray(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Ru.a.i(), false, i10, i11);
    }

    public static <T> l<T> mergeArrayDelayError(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Ru.a.i(), true, i10, i11);
    }

    public static <T> l<T> mergeDelayError(Iterable<? extends q<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Ru.a.i(), true);
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2) {
        return sequenceEqual(qVar, qVar2, Ru.b.d(), bufferSize());
    }

    public static <T> l<T> switchOnNext(q<? extends q<? extends T>> qVar, int i10) {
        Ru.b.e(qVar, "sources is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new C5480o1(qVar, Ru.a.i(), i10, false));
    }

    public static <T> l<T> switchOnNextDelayError(q<? extends q<? extends T>> qVar) {
        return switchOnNextDelayError(qVar, bufferSize());
    }

    private l<T> timeout0(long j10, TimeUnit timeUnit, q<? extends T> qVar, t tVar) {
        Ru.b.e(timeUnit, "timeUnit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new A1(this, j10, timeUnit, tVar, qVar));
    }

    public static l<Long> timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, C14764a.a());
    }

    public static <T, D> l<T> using(Callable<? extends D> callable, Pu.o<? super D, ? extends q<? extends T>> oVar, Pu.g<? super D> gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T, R> l<R> zip(Iterable<? extends q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar) {
        Ru.b.e(oVar, "zipper is null");
        Ru.b.e(iterable, "sources is null");
        return C14313a.o(new N1(null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> l<R> zipArray(Pu.o<? super Object[], ? extends R> oVar, boolean z10, int i10, q<? extends T>... qVarArr) {
        if (qVarArr.length == 0) {
            return empty();
        }
        Ru.b.e(oVar, "zipper is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new N1(qVarArr, null, oVar, i10, z10));
    }

    public final T blockingFirst() throws InterruptedException {
        Tu.e eVar = new Tu.e();
        subscribe(eVar);
        T tA = eVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final T blockingLast() throws InterruptedException {
        Tu.f fVar = new Tu.f();
        subscribe(fVar);
        T tA = fVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    public final T blockingSingle() {
        T tC = singleElement().c();
        if (tC != null) {
            return tC;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        C5466k.a(this);
    }

    public final l<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    public final <R> l<R> concatMap(Pu.o<? super T, ? extends q<? extends R>> oVar) {
        return concatMap(oVar, 2);
    }

    public final b concatMapCompletable(Pu.o<? super T, ? extends d> oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final b concatMapCompletableDelayError(Pu.o<? super T, ? extends d> oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> l<R> concatMapDelayError(Pu.o<? super T, ? extends q<? extends R>> oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> l<R> concatMapEager(Pu.o<? super T, ? extends q<? extends R>> oVar) {
        return concatMapEager(oVar, a.e.API_PRIORITY_OTHER, bufferSize());
    }

    public final <R> l<R> concatMapEagerDelayError(Pu.o<? super T, ? extends q<? extends R>> oVar, boolean z10) {
        return concatMapEagerDelayError(oVar, a.e.API_PRIORITY_OTHER, bufferSize(), z10);
    }

    public final <U> l<U> concatMapIterable(Pu.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new C5440b0(this, oVar));
    }

    public final <R> l<R> concatMapMaybe(Pu.o<? super T, ? extends j<? extends R>> oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> l<R> concatMapMaybeDelayError(Pu.o<? super T, ? extends j<? extends R>> oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> l<R> concatMapSingle(Pu.o<? super T, ? extends y<? extends R>> oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> l<R> concatMapSingleDelayError(Pu.o<? super T, ? extends y<? extends R>> oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final l<T> concatWith(q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return concat(this, qVar);
    }

    public final <U> l<T> debounce(Pu.o<? super T, ? extends q<U>> oVar) {
        Ru.b.e(oVar, "debounceSelector is null");
        return C14313a.o(new C(this, oVar));
    }

    public final <U> l<T> delay(Pu.o<? super T, ? extends q<U>> oVar) {
        Ru.b.e(oVar, "itemDelay is null");
        return (l<T>) flatMap(C5479o0.c(oVar));
    }

    public final <U> l<T> delaySubscription(q<U> qVar) {
        Ru.b.e(qVar, "other is null");
        return C14313a.o(new G(this, qVar));
    }

    @Deprecated
    public final <T2> l<T2> dematerialize() {
        return C14313a.o(new H(this, Ru.a.i()));
    }

    public final l<T> distinct() {
        return distinct(Ru.a.i(), Ru.a.f());
    }

    public final l<T> distinctUntilChanged() {
        return distinctUntilChanged(Ru.a.i());
    }

    public final h<T> elementAt(long j10) {
        if (j10 >= 0) {
            return C14313a.n(new Q(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar) {
        return flatMap((Pu.o) oVar, false);
    }

    public final b flatMapCompletable(Pu.o<? super T, ? extends d> oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> l<U> flatMapIterable(Pu.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new C5440b0(this, oVar));
    }

    public final <R> l<R> flatMapMaybe(Pu.o<? super T, ? extends j<? extends R>> oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> l<R> flatMapSingle(Pu.o<? super T, ? extends y<? extends R>> oVar) {
        return flatMapSingle(oVar, false);
    }

    public final Nu.b forEachWhile(Pu.q<? super T> qVar) {
        return forEachWhile(qVar, Ru.a.f33005f, Ru.a.f33002c);
    }

    public final <K> l<AbstractC14144b<K, T>> groupBy(Pu.o<? super T, ? extends K> oVar) {
        return (l<AbstractC14144b<K, T>>) groupBy(oVar, Ru.a.i(), false, bufferSize());
    }

    public final l<T> mergeWith(q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return merge(this, qVar);
    }

    public final l<T> observeOn(t tVar) {
        return observeOn(tVar, false, bufferSize());
    }

    public final l<T> onErrorResumeNext(Pu.o<? super Throwable, ? extends q<? extends T>> oVar) {
        Ru.b.e(oVar, "resumeFunction is null");
        return C14313a.o(new E0(this, oVar, false));
    }

    public final AbstractC14143a<T> publish() {
        return G0.f(this);
    }

    public final h<T> reduce(Pu.c<T, T, T> cVar) {
        Ru.b.e(cVar, "reducer is null");
        return C14313a.n(new M0(this, cVar));
    }

    public final l<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final AbstractC14143a<T> replay() {
        return T0.j(this);
    }

    public final l<T> retry() {
        return retry(Long.MAX_VALUE, Ru.a.c());
    }

    public final l<T> sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, C14764a.a());
    }

    public final l<T> scan(Pu.c<T, T, T> cVar) {
        Ru.b.e(cVar, "accumulator is null");
        return C14313a.o(new C5438a1(this, cVar));
    }

    public final l<T> skip(long j10) {
        return j10 <= 0 ? C14313a.o(this) : C14313a.o(new C5459h1(this, j10));
    }

    public final l<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? C14313a.o(this) : C14313a.o(new C5462i1(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final l<T> sorted() {
        return toList().r().map(Ru.a.m(Ru.a.n())).flatMapIterable(Ru.a.i());
    }

    public final l<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final Nu.b subscribe() {
        return subscribe(Ru.a.g(), Ru.a.f33005f, Ru.a.f33002c, Ru.a.g());
    }

    protected abstract void subscribeActual(s<? super T> sVar);

    public final <R> l<R> switchMap(Pu.o<? super T, ? extends q<? extends R>> oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final <R> l<R> switchMapDelayError(Pu.o<? super T, ? extends q<? extends R>> oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final l<T> take(long j10) {
        if (j10 >= 0) {
            return C14313a.o(new C5483p1(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final l<T> takeLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? C14313a.o(new C5473m0(this)) : i10 == 1 ? C14313a.o(new r1(this)) : C14313a.o(new q1(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final <U> l<T> takeUntil(q<U> qVar) {
        Ru.b.e(qVar, "other is null");
        return C14313a.o(new t1(this, qVar));
    }

    public final io.reactivex.observers.g<T> test() {
        io.reactivex.observers.g<T> gVar = new io.reactivex.observers.g<>();
        subscribe(gVar);
        return gVar;
    }

    public final l<T> throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, C14764a.a());
    }

    public final l<T> throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, C14764a.a(), false);
    }

    public final l<T> throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    public final l<C14765b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, C14764a.a());
    }

    public final <V> l<T> timeout(Pu.o<? super T, ? extends q<V>> oVar) {
        return timeout0(null, oVar, null);
    }

    public final l<C14765b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, C14764a.a());
    }

    public final u<List<T>> toList() {
        return toList(16);
    }

    public final <K> u<Map<K, T>> toMap(Pu.o<? super T, ? extends K> oVar) {
        Ru.b.e(oVar, "keySelector is null");
        return (u<Map<K, T>>) collect(ev.l.a(), Ru.a.D(oVar));
    }

    public final <K> u<Map<K, Collection<T>>> toMultimap(Pu.o<? super T, ? extends K> oVar) {
        return (u<Map<K, Collection<T>>>) toMultimap(oVar, Ru.a.i(), ev.l.a(), ev.b.e());
    }

    public final u<List<T>> toSortedList() {
        return toSortedList(Ru.a.o());
    }

    public final l<l<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    public final <U, R> l<R> withLatestFrom(q<? extends U> qVar, Pu.c<? super T, ? super U, ? extends R> cVar) {
        Ru.b.e(qVar, "other is null");
        Ru.b.e(cVar, "combiner is null");
        return C14313a.o(new L1(this, cVar, qVar));
    }

    public final <U, R> l<R> zipWith(Iterable<U> iterable, Pu.c<? super T, ? super U, ? extends R> cVar) {
        Ru.b.e(iterable, "other is null");
        Ru.b.e(cVar, "zipper is null");
        return C14313a.o(new O1(this, iterable, cVar));
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f138238a;

        static {
            int[] iArr = new int[io.reactivex.a.values().length];
            f138238a = iArr;
            try {
                iArr[io.reactivex.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138238a[io.reactivex.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138238a[io.reactivex.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138238a[io.reactivex.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> l<T> amb(Iterable<? extends q<? extends T>> iterable) {
        Ru.b.e(iterable, "sources is null");
        return C14313a.o(new C5457h(null, iterable));
    }

    public static <T> l<T> ambArray(q<? extends T>... qVarArr) {
        Ru.b.e(qVarArr, "sources is null");
        int length = qVarArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(qVarArr[0]) : C14313a.o(new C5457h(qVarArr, null));
    }

    public static <T, R> l<R> combineLatest(Iterable<? extends q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> l<R> combineLatestDelayError(Pu.o<? super Object[], ? extends R> oVar, int i10, q<? extends T>... qVarArr) {
        return combineLatestDelayError(qVarArr, oVar, i10);
    }

    public static <T> l<T> concatArrayEager(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).concatMapEagerDelayError(Ru.a.i(), i10, i11, false);
    }

    public static <T> l<T> concatArrayEagerDelayError(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).concatMapEagerDelayError(Ru.a.i(), i10, i11, true);
    }

    public static <T> l<T> concatEager(q<? extends q<? extends T>> qVar, int i10, int i11) {
        return wrap(qVar).concatMapEager(Ru.a.i(), i10, i11);
    }

    public static <T> l<T> create(o<T> oVar) {
        Ru.b.e(oVar, "source is null");
        return C14313a.o(new B(oVar));
    }

    public static <T> l<T> defer(Callable<? extends q<? extends T>> callable) {
        Ru.b.e(callable, "supplier is null");
        return C14313a.o(new E(callable));
    }

    public static <T> l<T> empty() {
        return C14313a.o(T.f40988a);
    }

    public static <T> l<T> fromArray(T... tArr) {
        Ru.b.e(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : C14313a.o(new C5443c0(tArr));
    }

    public static <T> l<T> fromCallable(Callable<? extends T> callable) {
        Ru.b.e(callable, "supplier is null");
        return C14313a.o(new CallableC5446d0(callable));
    }

    public static <T> l<T> fromIterable(Iterable<? extends T> iterable) {
        Ru.b.e(iterable, "source is null");
        return C14313a.o(new C5452f0(iterable));
    }

    public static <T> l<T> fromPublisher(pw.a<? extends T> aVar) {
        Ru.b.e(aVar, "publisher is null");
        return C14313a.o(new C5455g0(aVar));
    }

    public static l<Long> interval(long j10, long j11, TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new C5482p0(Math.max(0L, j10), Math.max(0L, j11), timeUnit, tVar));
    }

    public static l<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, t tVar) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return empty().delay(j12, timeUnit, tVar);
        }
        long j14 = (j11 - 1) + j10;
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new C5485q0(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, tVar));
    }

    public static <T> l<T> merge(Iterable<? extends q<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Ru.a.i());
    }

    public static <T> l<T> mergeArray(q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Ru.a.i(), qVarArr.length);
    }

    public static <T> l<T> mergeArrayDelayError(q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Ru.a.i(), true, qVarArr.length);
    }

    public static <T> l<T> mergeDelayError(Iterable<? extends q<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Ru.a.i(), true, i10, i11);
    }

    public static <T> l<T> never() {
        return C14313a.o(C0.f40588a);
    }

    public static l<Integer> range(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return empty();
        }
        if (i11 == 1) {
            return just(Integer.valueOf(i10));
        }
        if (i10 + (i11 - 1) <= 2147483647L) {
            return C14313a.o(new K0(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static l<Long> rangeLong(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return empty();
        }
        if (j11 == 1) {
            return just(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return C14313a.o(new L0(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2, Pu.d<? super T, ? super T> dVar) {
        return sequenceEqual(qVar, qVar2, dVar, bufferSize());
    }

    public static <T> l<T> switchOnNextDelayError(q<? extends q<? extends T>> qVar, int i10) {
        Ru.b.e(qVar, "sources is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.o(new C5480o1(qVar, Ru.a.i(), i10, true));
    }

    public static l<Long> timer(long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new B1(Math.max(j10, 0L), timeUnit, tVar));
    }

    public static <T> l<T> unsafeCreate(q<T> qVar) {
        Ru.b.e(qVar, "onSubscribe is null");
        if (qVar instanceof l) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return C14313a.o(new C5458h0(qVar));
    }

    public static <T, D> l<T> using(Callable<? extends D> callable, Pu.o<? super D, ? extends q<? extends T>> oVar, Pu.g<? super D> gVar, boolean z10) {
        Ru.b.e(callable, "resourceSupplier is null");
        Ru.b.e(oVar, "sourceSupplier is null");
        Ru.b.e(gVar, "disposer is null");
        return C14313a.o(new F1(callable, oVar, gVar, z10));
    }

    public static <T> l<T> wrap(q<T> qVar) {
        Ru.b.e(qVar, "source is null");
        return qVar instanceof l ? C14313a.o((l) qVar) : C14313a.o(new C5458h0(qVar));
    }

    public static <T, R> l<R> zipIterable(Iterable<? extends q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        Ru.b.e(oVar, "zipper is null");
        Ru.b.e(iterable, "sources is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new N1(null, iterable, oVar, i10, z10));
    }

    public final u<Boolean> all(Pu.q<? super T> qVar) {
        Ru.b.e(qVar, "predicate is null");
        return C14313a.p(new C5454g(this, qVar));
    }

    public final l<T> ambWith(q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return ambArray(this, qVar);
    }

    public final u<Boolean> any(Pu.q<? super T> qVar) {
        Ru.b.e(qVar, "predicate is null");
        return C14313a.p(new C5463j(this, qVar));
    }

    public final <R> R as(m<T, ? extends R> mVar) {
        return (R) ((m) Ru.b.e(mVar, "converter is null")).a(this);
    }

    public final Iterable<T> blockingIterable(int i10) {
        Ru.b.f(i10, "bufferSize");
        return new C5439b(this, i10);
    }

    public final Iterable<T> blockingLatest() {
        return new C5442c(this);
    }

    public final Iterable<T> blockingMostRecent(T t10) {
        return new C5445d(this, t10);
    }

    public final Iterable<T> blockingNext() {
        return new C5448e(this);
    }

    public final void blockingSubscribe(Pu.g<? super T> gVar) {
        C5466k.b(this, gVar, Ru.a.f33005f, Ru.a.f33002c);
    }

    public final l<List<T>> buffer(int i10, int i11) {
        return (l<List<T>>) buffer(i10, i11, ev.b.b());
    }

    public final l<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final l<T> cacheWithInitialCapacity(int i10) {
        Ru.b.f(i10, "initialCapacity");
        return C14313a.o(new C5484q(this, i10));
    }

    public final <U> l<U> cast(Class<U> cls) {
        Ru.b.e(cls, "clazz is null");
        return (l<U>) map(Ru.a.d(cls));
    }

    public final <U> u<U> collect(Callable<? extends U> callable, Pu.b<? super U, ? super T> bVar) {
        Ru.b.e(callable, "initialValueSupplier is null");
        Ru.b.e(bVar, "collector is null");
        return C14313a.p(new C5487s(this, callable, bVar));
    }

    public final <U> u<U> collectInto(U u10, Pu.b<? super U, ? super T> bVar) {
        Ru.b.e(u10, "initialValue is null");
        return collect(Ru.a.k(u10), bVar);
    }

    public final <R> l<R> compose(r<? super T, ? extends R> rVar) {
        return wrap(((r) Ru.b.e(rVar, "composer is null")).a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> concatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        if (!(this instanceof Su.d)) {
            return C14313a.o(new C5491u(this, oVar, i10, ev.i.IMMEDIATE));
        }
        Object objCall = ((Su.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final b concatMapCompletable(Pu.o<? super T, ? extends d> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "capacityHint");
        return C14313a.l(new Xu.a(this, oVar, ev.i.IMMEDIATE, i10));
    }

    public final b concatMapCompletableDelayError(Pu.o<? super T, ? extends d> oVar, boolean z10) {
        return concatMapCompletableDelayError(oVar, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> concatMapDelayError(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10, boolean z10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        if (!(this instanceof Su.d)) {
            return C14313a.o(new C5491u(this, oVar, i10, z10 ? ev.i.END : ev.i.BOUNDARY));
        }
        Object objCall = ((Su.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final <R> l<R> concatMapEager(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10, int i11) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "maxConcurrency");
        Ru.b.f(i11, "prefetch");
        return C14313a.o(new C5493v(this, oVar, ev.i.IMMEDIATE, i10, i11));
    }

    public final <R> l<R> concatMapEagerDelayError(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10, int i11, boolean z10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "maxConcurrency");
        Ru.b.f(i11, "prefetch");
        return C14313a.o(new C5493v(this, oVar, z10 ? ev.i.END : ev.i.BOUNDARY, i10, i11));
    }

    public final <R> l<R> concatMapMaybe(Pu.o<? super T, ? extends j<? extends R>> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.o(new Xu.b(this, oVar, ev.i.IMMEDIATE, i10));
    }

    public final <R> l<R> concatMapMaybeDelayError(Pu.o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
        return concatMapMaybeDelayError(oVar, z10, 2);
    }

    public final <R> l<R> concatMapSingle(Pu.o<? super T, ? extends y<? extends R>> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.o(new Xu.c(this, oVar, ev.i.IMMEDIATE, i10));
    }

    public final <R> l<R> concatMapSingleDelayError(Pu.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        return concatMapSingleDelayError(oVar, z10, 2);
    }

    public final u<Boolean> contains(Object obj) {
        Ru.b.e(obj, "element is null");
        return any(Ru.a.h(obj));
    }

    public final u<Long> count() {
        return C14313a.p(new A(this));
    }

    public final l<T> defaultIfEmpty(T t10) {
        Ru.b.e(t10, "defaultItem is null");
        return switchIfEmpty(just(t10));
    }

    public final <R> l<R> dematerialize(Pu.o<? super T, k<R>> oVar) {
        Ru.b.e(oVar, "selector is null");
        return C14313a.o(new H(this, oVar));
    }

    public final <K> l<T> distinct(Pu.o<? super T, K> oVar) {
        return distinct(oVar, Ru.a.f());
    }

    public final <K> l<T> distinctUntilChanged(Pu.o<? super T, K> oVar) {
        Ru.b.e(oVar, "keySelector is null");
        return C14313a.o(new K(this, oVar, Ru.b.d()));
    }

    public final l<T> doAfterNext(Pu.g<? super T> gVar) {
        Ru.b.e(gVar, "onAfterNext is null");
        return C14313a.o(new L(this, gVar));
    }

    public final l<T> doAfterTerminate(Pu.a aVar) {
        Ru.b.e(aVar, "onFinally is null");
        return doOnEach(Ru.a.g(), Ru.a.g(), Ru.a.f33002c, aVar);
    }

    public final l<T> doFinally(Pu.a aVar) {
        Ru.b.e(aVar, "onFinally is null");
        return C14313a.o(new M(this, aVar));
    }

    public final l<T> doOnLifecycle(Pu.g<? super Nu.b> gVar, Pu.a aVar) {
        Ru.b.e(gVar, "onSubscribe is null");
        Ru.b.e(aVar, "onDispose is null");
        return C14313a.o(new O(this, gVar, aVar));
    }

    public final l<T> doOnSubscribe(Pu.g<? super Nu.b> gVar) {
        return doOnLifecycle(gVar, Ru.a.f33002c);
    }

    public final l<T> doOnTerminate(Pu.a aVar) {
        Ru.b.e(aVar, "onTerminate is null");
        return doOnEach(Ru.a.g(), Ru.a.a(aVar), aVar, Ru.a.f33002c);
    }

    public final u<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return C14313a.p(new S(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final l<T> filter(Pu.q<? super T> qVar) {
        Ru.b.e(qVar, "predicate is null");
        return C14313a.o(new V(this, qVar));
    }

    public final u<T> first(T t10) {
        return elementAt(0L, t10);
    }

    public final h<T> firstElement() {
        return elementAt(0L);
    }

    public final u<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, boolean z10) {
        return flatMap(oVar, z10, a.e.API_PRIORITY_OTHER);
    }

    public final b flatMapCompletable(Pu.o<? super T, ? extends d> oVar, boolean z10) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.l(new Y(this, oVar, z10));
    }

    public final <R> l<R> flatMapMaybe(Pu.o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new Z(this, oVar, z10));
    }

    public final <R> l<R> flatMapSingle(Pu.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new C5437a0(this, oVar, z10));
    }

    public final Nu.b forEachWhile(Pu.q<? super T> qVar, Pu.g<? super Throwable> gVar) {
        return forEachWhile(qVar, gVar, Ru.a.f33002c);
    }

    public final <K> l<AbstractC14144b<K, T>> groupBy(Pu.o<? super T, ? extends K> oVar, boolean z10) {
        return (l<AbstractC14144b<K, T>>) groupBy(oVar, Ru.a.i(), z10, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l<R> groupJoin(q<? extends TRight> qVar, Pu.o<? super T, ? extends q<TLeftEnd>> oVar, Pu.o<? super TRight, ? extends q<TRightEnd>> oVar2, Pu.c<? super T, ? super l<TRight>, ? extends R> cVar) {
        Ru.b.e(qVar, "other is null");
        Ru.b.e(oVar, "leftEnd is null");
        Ru.b.e(oVar2, "rightEnd is null");
        Ru.b.e(cVar, "resultSelector is null");
        return C14313a.o(new C5467k0(this, qVar, oVar, oVar2, cVar));
    }

    public final l<T> hide() {
        return C14313a.o(new C5470l0(this));
    }

    public final b ignoreElements() {
        return C14313a.l(new C5476n0(this));
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l<R> join(q<? extends TRight> qVar, Pu.o<? super T, ? extends q<TLeftEnd>> oVar, Pu.o<? super TRight, ? extends q<TRightEnd>> oVar2, Pu.c<? super T, ? super TRight, ? extends R> cVar) {
        Ru.b.e(qVar, "other is null");
        Ru.b.e(oVar, "leftEnd is null");
        Ru.b.e(oVar2, "rightEnd is null");
        Ru.b.e(cVar, "resultSelector is null");
        return C14313a.o(new C5486r0(this, qVar, oVar, oVar2, cVar));
    }

    public final u<T> last(T t10) {
        Ru.b.e(t10, "defaultItem is null");
        return C14313a.p(new C5492u0(this, t10));
    }

    public final h<T> lastElement() {
        return C14313a.n(new C5490t0(this));
    }

    public final u<T> lastOrError() {
        return C14313a.p(new C5492u0(this, null));
    }

    public final <R> l<R> lift(p<? extends R, ? super T> pVar) {
        Ru.b.e(pVar, "lifter is null");
        return C14313a.o(new C5494v0(this, pVar));
    }

    public final <R> l<R> map(Pu.o<? super T, ? extends R> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new C5496w0(this, oVar));
    }

    public final l<k<T>> materialize() {
        return C14313a.o(new C5500y0(this));
    }

    public final l<T> observeOn(t tVar, boolean z10) {
        return observeOn(tVar, z10, bufferSize());
    }

    public final <U> l<U> ofType(Class<U> cls) {
        Ru.b.e(cls, "clazz is null");
        return filter(Ru.a.j(cls)).cast(cls);
    }

    public final l<T> onErrorReturn(Pu.o<? super Throwable, ? extends T> oVar) {
        Ru.b.e(oVar, "valueSupplier is null");
        return C14313a.o(new F0(this, oVar));
    }

    public final l<T> onErrorReturnItem(T t10) {
        Ru.b.e(t10, "item is null");
        return onErrorReturn(Ru.a.l(t10));
    }

    public final l<T> onExceptionResumeNext(q<? extends T> qVar) {
        Ru.b.e(qVar, "next is null");
        return C14313a.o(new E0(this, Ru.a.l(qVar), true));
    }

    public final l<T> onTerminateDetach() {
        return C14313a.o(new I(this));
    }

    public final <R> l<R> publish(Pu.o<? super l<T>, ? extends q<R>> oVar) {
        Ru.b.e(oVar, "selector is null");
        return C14313a.o(new J0(this, oVar));
    }

    public final <R> u<R> reduceWith(Callable<R> callable, Pu.c<R, ? super T, R> cVar) {
        Ru.b.e(callable, "seedSupplier is null");
        Ru.b.e(cVar, "reducer is null");
        return C14313a.p(new O0(this, callable, cVar));
    }

    public final l<T> repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : C14313a.o(new Q0(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final l<T> repeatUntil(Pu.e eVar) {
        Ru.b.e(eVar, "stop is null");
        return C14313a.o(new R0(this, eVar));
    }

    public final l<T> repeatWhen(Pu.o<? super l<Object>, ? extends q<?>> oVar) {
        Ru.b.e(oVar, "handler is null");
        return C14313a.o(new S0(this, oVar));
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar) {
        Ru.b.e(oVar, "selector is null");
        return T0.k(C5479o0.g(this), oVar);
    }

    public final l<T> retry(Pu.d<? super Integer, ? super Throwable> dVar) {
        Ru.b.e(dVar, "predicate is null");
        return C14313a.o(new U0(this, dVar));
    }

    public final l<T> retryUntil(Pu.e eVar) {
        Ru.b.e(eVar, "stop is null");
        return retry(Long.MAX_VALUE, Ru.a.t(eVar));
    }

    public final l<T> retryWhen(Pu.o<? super l<Throwable>, ? extends q<?>> oVar) {
        Ru.b.e(oVar, "handler is null");
        return C14313a.o(new W0(this, oVar));
    }

    public final void safeSubscribe(s<? super T> sVar) {
        Ru.b.e(sVar, "observer is null");
        if (sVar instanceof io.reactivex.observers.e) {
            subscribe(sVar);
        } else {
            subscribe(new io.reactivex.observers.e(sVar));
        }
    }

    public final l<T> sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, C14764a.a(), z10);
    }

    public final <R> l<R> scanWith(Callable<R> callable, Pu.c<R, ? super T, R> cVar) {
        Ru.b.e(callable, "seedSupplier is null");
        Ru.b.e(cVar, "accumulator is null");
        return C14313a.o(new C5441b1(this, callable, cVar));
    }

    public final l<T> serialize() {
        return C14313a.o(new C5450e1(this));
    }

    public final u<T> single(T t10) {
        Ru.b.e(t10, "defaultItem is null");
        return C14313a.p(new C5456g1(this, t10));
    }

    public final h<T> singleElement() {
        return C14313a.n(new C5453f1(this));
    }

    public final u<T> singleOrError() {
        return C14313a.p(new C5456g1(this, null));
    }

    public final <U> l<T> skipUntil(q<U> qVar) {
        Ru.b.e(qVar, "other is null");
        return C14313a.o(new C5468k1(this, qVar));
    }

    public final l<T> skipWhile(Pu.q<? super T> qVar) {
        Ru.b.e(qVar, "predicate is null");
        return C14313a.o(new C5471l1(this, qVar));
    }

    public final l<T> sorted(Comparator<? super T> comparator) {
        Ru.b.e(comparator, "sortFunction is null");
        return toList().r().map(Ru.a.m(comparator)).flatMapIterable(Ru.a.i());
    }

    public final l<T> startWith(q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return concatArray(qVar, this);
    }

    public final Nu.b subscribe(Pu.g<? super T> gVar) {
        return subscribe(gVar, Ru.a.f33005f, Ru.a.f33002c, Ru.a.g());
    }

    public final l<T> subscribeOn(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new C5474m1(this, tVar));
    }

    public final l<T> switchIfEmpty(q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return C14313a.o(new C5477n1(this, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> switchMap(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "bufferSize");
        if (!(this instanceof Su.d)) {
            return C14313a.o(new C5480o1(this, oVar, i10, false));
        }
        Object objCall = ((Su.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final b switchMapCompletable(Pu.o<? super T, ? extends d> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.l(new Xu.d(this, oVar, false));
    }

    public final b switchMapCompletableDelayError(Pu.o<? super T, ? extends d> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.l(new Xu.d(this, oVar, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> switchMapDelayError(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "bufferSize");
        if (!(this instanceof Su.d)) {
            return C14313a.o(new C5480o1(this, oVar, i10, true));
        }
        Object objCall = ((Su.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final <R> l<R> switchMapMaybe(Pu.o<? super T, ? extends j<? extends R>> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new Xu.e(this, oVar, false));
    }

    public final <R> l<R> switchMapMaybeDelayError(Pu.o<? super T, ? extends j<? extends R>> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new Xu.e(this, oVar, true));
    }

    public final <R> l<R> switchMapSingle(Pu.o<? super T, ? extends y<? extends R>> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new Xu.f(this, oVar, false));
    }

    public final <R> l<R> switchMapSingleDelayError(Pu.o<? super T, ? extends y<? extends R>> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.o(new Xu.f(this, oVar, true));
    }

    public final l<T> takeWhile(Pu.q<? super T> qVar) {
        Ru.b.e(qVar, "predicate is null");
        return C14313a.o(new v1(this, qVar));
    }

    public final l<T> throttleFirst(long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new w1(this, j10, timeUnit, tVar));
    }

    public final l<T> throttleLast(long j10, TimeUnit timeUnit, t tVar) {
        return sample(j10, timeUnit, tVar);
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, C14764a.a(), z10);
    }

    public final l<T> throttleWithTimeout(long j10, TimeUnit timeUnit, t tVar) {
        return debounce(j10, timeUnit, tVar);
    }

    public final l<C14765b<T>> timeInterval(t tVar) {
        return timeInterval(TimeUnit.MILLISECONDS, tVar);
    }

    public final <V> l<T> timeout(Pu.o<? super T, ? extends q<V>> oVar, q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return timeout0(null, oVar, qVar);
    }

    public final l<C14765b<T>> timestamp(t tVar) {
        return timestamp(TimeUnit.MILLISECONDS, tVar);
    }

    public final <R> R to(Pu.o<? super l<T>, R> oVar) {
        try {
            return (R) ((Pu.o) Ru.b.e(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            Ou.a.b(th2);
            throw ev.j.d(th2);
        }
    }

    public final f<T> toFlowable(io.reactivex.a aVar) {
        Vu.b bVar = new Vu.b(this);
        int i10 = a.f138238a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? bVar.c() : C14313a.m(new Vu.e(bVar)) : bVar : bVar.f() : bVar.e();
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new Tu.n());
    }

    public final u<List<T>> toList(int i10) {
        Ru.b.f(i10, "capacityHint");
        return C14313a.p(new D1(this, i10));
    }

    public final u<List<T>> toSortedList(Comparator<? super T> comparator) {
        Ru.b.e(comparator, "comparator is null");
        return (u<List<T>>) toList().j(Ru.a.m(comparator));
    }

    public final l<T> unsubscribeOn(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new E1(this, tVar));
    }

    public final l<l<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    public static int bufferSize() {
        return f.b();
    }

    public static <T, R> l<R> combineLatest(Iterable<? extends q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar, int i10) {
        Ru.b.e(iterable, "sources is null");
        Ru.b.e(oVar, "combiner is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new C5489t(null, iterable, oVar, i10 << 1, false));
    }

    public static <T, R> l<R> combineLatestDelayError(q<? extends T>[] qVarArr, Pu.o<? super Object[], ? extends R> oVar, int i10) {
        Ru.b.f(i10, "bufferSize");
        Ru.b.e(oVar, "combiner is null");
        if (qVarArr.length == 0) {
            return empty();
        }
        return C14313a.o(new C5489t(qVarArr, null, oVar, i10 << 1, true));
    }

    public static <T> l<T> concat(q<? extends q<? extends T>> qVar) {
        return concat(qVar, bufferSize());
    }

    public static <T> l<T> concatDelayError(q<? extends q<? extends T>> qVar) {
        return concatDelayError(qVar, bufferSize(), true);
    }

    public static <T> l<T> concatEager(Iterable<? extends q<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> l<T> error(Throwable th2) {
        Ru.b.e(th2, "exception is null");
        return error((Callable<? extends Throwable>) Ru.a.k(th2));
    }

    public static <T> l<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        Ru.b.e(future, "future is null");
        Ru.b.e(timeUnit, "unit is null");
        return C14313a.o(new C5449e0(future, j10, timeUnit));
    }

    public static <T> l<T> just(T t10, T t11) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        return fromArray(t10, t11);
    }

    public static <T> l<T> merge(Iterable<? extends q<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Ru.a.i(), i10);
    }

    public static <T> l<T> mergeDelayError(Iterable<? extends q<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Ru.a.i(), true, i10);
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2, Pu.d<? super T, ? super T> dVar, int i10) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(dVar, "isEqual is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.p(new C5447d1(qVar, qVar2, dVar, i10));
    }

    public final void blockingForEach(Pu.g<? super T> gVar) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                Ou.a.b(th2);
                ((Nu.b) it).dispose();
                throw ev.j.d(th2);
            }
        }
    }

    public final T blockingSingle(T t10) {
        return single(t10).c();
    }

    public final void blockingSubscribe(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2) {
        C5466k.b(this, gVar, gVar2, Ru.a.f33002c);
    }

    public final <U extends Collection<? super T>> l<U> buffer(int i10, int i11, Callable<U> callable) {
        Ru.b.f(i10, "count");
        Ru.b.f(i11, "skip");
        Ru.b.e(callable, "bufferSupplier is null");
        return C14313a.o(new C5469l(this, i10, i11, callable));
    }

    public final b concatMapCompletableDelayError(Pu.o<? super T, ? extends d> oVar, boolean z10, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.l(new Xu.a(this, oVar, z10 ? ev.i.END : ev.i.BOUNDARY, i10));
    }

    public final <U> l<U> concatMapIterable(Pu.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        return (l<U>) concatMap(C5479o0.a(oVar), i10);
    }

    public final <R> l<R> concatMapMaybeDelayError(Pu.o<? super T, ? extends j<? extends R>> oVar, boolean z10, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.o(new Xu.b(this, oVar, z10 ? ev.i.END : ev.i.BOUNDARY, i10));
    }

    public final <R> l<R> concatMapSingleDelayError(Pu.o<? super T, ? extends y<? extends R>> oVar, boolean z10, int i10) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.o(new Xu.c(this, oVar, z10 ? ev.i.END : ev.i.BOUNDARY, i10));
    }

    public final l<T> concatWith(y<? extends T> yVar) {
        Ru.b.e(yVar, "other is null");
        return C14313a.o(new C5499y(this, yVar));
    }

    public final l<T> debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, C14764a.a());
    }

    public final l<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, C14764a.a(), false);
    }

    public final l<T> delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, C14764a.a());
    }

    public final <K> l<T> distinct(Pu.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        Ru.b.e(oVar, "keySelector is null");
        Ru.b.e(callable, "collectionSupplier is null");
        return C14313a.o(new J(this, oVar, callable));
    }

    public final l<T> doOnComplete(Pu.a aVar) {
        return doOnEach(Ru.a.g(), Ru.a.g(), aVar, Ru.a.f33002c);
    }

    public final l<T> doOnDispose(Pu.a aVar) {
        return doOnLifecycle(Ru.a.g(), aVar);
    }

    public final l<T> doOnError(Pu.g<? super Throwable> gVar) {
        Pu.g<? super T> gVarG = Ru.a.g();
        Pu.a aVar = Ru.a.f33002c;
        return doOnEach(gVarG, gVar, aVar, aVar);
    }

    public final l<T> doOnNext(Pu.g<? super T> gVar) {
        Pu.g<? super Throwable> gVarG = Ru.a.g();
        Pu.a aVar = Ru.a.f33002c;
        return doOnEach(gVar, gVarG, aVar, aVar);
    }

    public final u<T> elementAt(long j10, T t10) {
        if (j10 >= 0) {
            Ru.b.e(t10, "defaultItem is null");
            return C14313a.p(new S(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> l<V> flatMapIterable(Pu.o<? super T, ? extends Iterable<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends V> cVar) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.e(cVar, "resultSelector is null");
        return (l<V>) flatMap(C5479o0.a(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final Nu.b forEach(Pu.g<? super T> gVar) {
        return subscribe(gVar);
    }

    public final Nu.b forEachWhile(Pu.q<? super T> qVar, Pu.g<? super Throwable> gVar, Pu.a aVar) {
        Ru.b.e(qVar, "onNext is null");
        Ru.b.e(gVar, "onError is null");
        Ru.b.e(aVar, "onComplete is null");
        Tu.m mVar = new Tu.m(qVar, gVar, aVar);
        subscribe(mVar);
        return mVar;
    }

    public final <K, V> l<AbstractC14144b<K, V>> groupBy(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final u<Boolean> isEmpty() {
        return all(Ru.a.b());
    }

    public final l<T> mergeWith(y<? extends T> yVar) {
        Ru.b.e(yVar, "other is null");
        return C14313a.o(new B0(this, yVar));
    }

    public final l<T> observeOn(t tVar, boolean z10, int i10) {
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new D0(this, tVar, z10, i10));
    }

    public final l<T> onErrorResumeNext(q<? extends T> qVar) {
        Ru.b.e(qVar, "next is null");
        return onErrorResumeNext(Ru.a.l(qVar));
    }

    public final <R> u<R> reduce(R r10, Pu.c<R, ? super T, R> cVar) {
        Ru.b.e(r10, "seed is null");
        Ru.b.e(cVar, "reducer is null");
        return C14313a.p(new N0(this, r10, cVar));
    }

    public final l<T> sample(long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new X0(this, j10, timeUnit, tVar, false));
    }

    public final <R> l<R> scan(R r10, Pu.c<R, ? super T, R> cVar) {
        Ru.b.e(r10, "initialValue is null");
        return scanWith(Ru.a.k(r10), cVar);
    }

    public final l<T> share() {
        return publish().e();
    }

    public final l<T> skip(long j10, TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    public final l<T> startWithArray(T... tArr) {
        l lVarFromArray = fromArray(tArr);
        if (lVarFromArray == empty()) {
            return C14313a.o(this);
        }
        return concatArray(lVarFromArray, this);
    }

    public final Nu.b subscribe(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Ru.a.f33002c, Ru.a.g());
    }

    public final <E extends s<? super T>> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final l<T> take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    public final l<T> takeUntil(Pu.q<? super T> qVar) {
        Ru.b.e(qVar, "stopPredicate is null");
        return C14313a.o(new u1(this, qVar));
    }

    public final io.reactivex.observers.g<T> test(boolean z10) {
        io.reactivex.observers.g<T> gVar = new io.reactivex.observers.g<>();
        if (z10) {
            gVar.dispose();
        }
        subscribe(gVar);
        return gVar;
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit, t tVar) {
        return throttleLatest(j10, timeUnit, tVar, false);
    }

    public final l<C14765b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, C14764a.a());
    }

    public final l<C14765b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, C14764a.a());
    }

    public final <K, V> u<Map<K, V>> toMap(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2) {
        Ru.b.e(oVar, "keySelector is null");
        Ru.b.e(oVar2, "valueSelector is null");
        return (u<Map<K, V>>) collect(ev.l.a(), Ru.a.E(oVar, oVar2));
    }

    public final l<l<T>> window(long j10, long j11, int i10) {
        Ru.b.g(j10, "count");
        Ru.b.g(j11, "skip");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new G1(this, j10, j11, i10));
    }

    public static <T> l<T> concat(q<? extends q<? extends T>> qVar, int i10) {
        Ru.b.e(qVar, "sources is null");
        Ru.b.f(i10, "prefetch");
        return C14313a.o(new C5491u(qVar, Ru.a.i(), i10, ev.i.IMMEDIATE));
    }

    public static <T> l<T> concatDelayError(q<? extends q<? extends T>> qVar, int i10, boolean z10) {
        Ru.b.e(qVar, "sources is null");
        Ru.b.f(i10, "prefetch is null");
        return C14313a.o(new C5491u(qVar, Ru.a.i(), i10, z10 ? ev.i.END : ev.i.BOUNDARY));
    }

    public static <T> l<T> concatEager(Iterable<? extends q<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(Ru.a.i(), i10, i11, false);
    }

    public static <T> l<T> merge(q<? extends q<? extends T>> qVar) {
        Ru.b.e(qVar, "sources is null");
        return C14313a.o(new W(qVar, Ru.a.i(), false, a.e.API_PRIORITY_OTHER, bufferSize()));
    }

    public static <T> l<T> mergeDelayError(q<? extends q<? extends T>> qVar) {
        Ru.b.e(qVar, "sources is null");
        return C14313a.o(new W(qVar, Ru.a.i(), true, a.e.API_PRIORITY_OTHER, bufferSize()));
    }

    public static <T> l<T> switchOnNext(q<? extends q<? extends T>> qVar) {
        return switchOnNext(qVar, bufferSize());
    }

    private <U, V> l<T> timeout0(q<U> qVar, Pu.o<? super T, ? extends q<V>> oVar, q<? extends T> qVar2) {
        Ru.b.e(oVar, "itemTimeoutIndicator is null");
        return C14313a.o(new z1(this, qVar, oVar, qVar2));
    }

    public static <T, R> l<R> zip(q<? extends q<? extends T>> qVar, Pu.o<? super Object[], ? extends R> oVar) {
        Ru.b.e(oVar, "zipper is null");
        Ru.b.e(qVar, "sources is null");
        return C14313a.o(new C1(qVar, 16).flatMap(C5479o0.n(oVar)));
    }

    public final void blockingSubscribe(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar) {
        C5466k.b(this, gVar, gVar2, aVar);
    }

    public final l<T> debounce(long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new D(this, j10, timeUnit, tVar));
    }

    public final l<T> delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, C14764a.a(), z10);
    }

    public final l<T> delaySubscription(long j10, TimeUnit timeUnit, t tVar) {
        return delaySubscription(timer(j10, timeUnit, tVar));
    }

    public final l<T> distinctUntilChanged(Pu.d<? super T, ? super T> dVar) {
        Ru.b.e(dVar, "comparer is null");
        return C14313a.o(new K(this, Ru.a.i(), dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, boolean z10, int i10, int i11) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.f(i10, "maxConcurrency");
        Ru.b.f(i11, "bufferSize");
        if (this instanceof Su.d) {
            Object objCall = ((Su.d) this).call();
            if (objCall == null) {
                return empty();
            }
            return Z0.a(objCall, oVar);
        }
        return C14313a.o(new W(this, oVar, z10, i10, i11));
    }

    public final <K, V> l<AbstractC14144b<K, V>> groupBy(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, boolean z10) {
        return groupBy(oVar, oVar2, z10, bufferSize());
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, int i10) {
        Ru.b.e(oVar, "selector is null");
        Ru.b.f(i10, "bufferSize");
        return T0.k(C5479o0.h(this, i10), oVar);
    }

    public final l<T> retry(long j10) {
        return retry(j10, Ru.a.c());
    }

    public final l<T> skip(long j10, TimeUnit timeUnit, t tVar) {
        return skipUntil(timer(j10, timeUnit, tVar));
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, C14764a.d(), false, bufferSize());
    }

    public final l<T> startWith(T t10) {
        Ru.b.e(t10, "item is null");
        return concatArray(just(t10), this);
    }

    public final Nu.b subscribe(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar) {
        return subscribe(gVar, gVar2, aVar, Ru.a.g());
    }

    public final l<T> take(long j10, TimeUnit timeUnit, t tVar) {
        return takeUntil(timer(j10, timeUnit, tVar));
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new x1(this, j10, timeUnit, tVar, z10));
    }

    public final l<C14765b<T>> timeInterval(TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new y1(this, timeUnit, tVar));
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit) {
        return timeout0(j10, timeUnit, null, C14764a.a());
    }

    public final l<C14765b<T>> timestamp(TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return (l<C14765b<T>>) map(Ru.a.u(timeUnit, tVar));
    }

    public final <U extends Collection<? super T>> u<U> toList(Callable<U> callable) {
        Ru.b.e(callable, "collectionSupplier is null");
        return C14313a.p(new D1(this, callable));
    }

    public final u<List<T>> toSortedList(Comparator<? super T> comparator, int i10) {
        Ru.b.e(comparator, "comparator is null");
        return (u<List<T>>) toList(i10).j(Ru.a.m(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> l<R> withLatestFrom(q<T1> qVar, q<T2> qVar2, Pu.h<? super T, ? super T1, ? super T2, R> hVar) {
        Ru.b.e(qVar, "o1 is null");
        Ru.b.e(qVar2, "o2 is null");
        Ru.b.e(hVar, "combiner is null");
        return withLatestFrom((q<?>[]) new q[]{qVar, qVar2}, Ru.a.w(hVar));
    }

    public final <U, R> l<R> zipWith(q<? extends U> qVar, Pu.c<? super T, ? super U, ? extends R> cVar) {
        Ru.b.e(qVar, "other is null");
        return zip(this, qVar, cVar);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Pu.b<S, e<T>> bVar) {
        Ru.b.e(bVar, "generator is null");
        return generate(callable, C5479o0.l(bVar), Ru.a.g());
    }

    public static l<Long> interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, C14764a.a());
    }

    public final T blockingFirst(T t10) throws InterruptedException {
        Tu.e eVar = new Tu.e();
        subscribe(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    public final T blockingLast(T t10) throws InterruptedException {
        Tu.f fVar = new Tu.f();
        subscribe(fVar);
        T tA = fVar.a();
        return tA != null ? tA : t10;
    }

    public final void blockingSubscribe(s<? super T> sVar) {
        C5466k.c(this, sVar);
    }

    public final l<T> concatWith(j<? extends T> jVar) {
        Ru.b.e(jVar, "other is null");
        return C14313a.o(new C5497x(this, jVar));
    }

    public final l<T> delay(long j10, TimeUnit timeUnit, t tVar) {
        return delay(j10, timeUnit, tVar, false);
    }

    public final <K, V> l<AbstractC14144b<K, V>> groupBy(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        Ru.b.e(oVar, "keySelector is null");
        Ru.b.e(oVar2, "valueSelector is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new C5464j0(this, oVar, oVar2, i10, z10));
    }

    public final l<T> mergeWith(j<? extends T> jVar) {
        Ru.b.e(jVar, "other is null");
        return C14313a.o(new A0(this, jVar));
    }

    public final l<T> retry(long j10, Pu.q<? super Throwable> qVar) {
        if (j10 >= 0) {
            Ru.b.e(qVar, "predicate is null");
            return C14313a.o(new V0(this, j10, qVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, C14764a.d(), z10, bufferSize());
    }

    public final Nu.b subscribe(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar, Pu.g<? super Nu.b> gVar3) {
        Ru.b.e(gVar, "onNext is null");
        Ru.b.e(gVar2, "onError is null");
        Ru.b.e(aVar, "onComplete is null");
        Ru.b.e(gVar3, "onSubscribe is null");
        Tu.q qVar = new Tu.q(gVar, gVar2, aVar, gVar3);
        subscribe(qVar);
        return qVar;
    }

    public final l<T> takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, C14764a.d(), false, bufferSize());
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit, q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return timeout0(j10, timeUnit, qVar, C14764a.a());
    }

    public final <K, V> u<Map<K, Collection<V>>> toMultimap(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2) {
        return toMultimap(oVar, oVar2, ev.l.a(), ev.b.e());
    }

    public static <T> l<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(tVar);
    }

    public static l<Long> interval(long j10, TimeUnit timeUnit, t tVar) {
        return interval(j10, j10, timeUnit, tVar);
    }

    public static <T> l<T> just(T t10, T t11, T t12) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        return fromArray(t10, t11, t12);
    }

    public static <T> l<T> merge(q<? extends q<? extends T>> qVar, int i10) {
        Ru.b.e(qVar, "sources is null");
        Ru.b.f(i10, "maxConcurrency");
        return C14313a.o(new W(qVar, Ru.a.i(), false, i10, bufferSize()));
    }

    public static <T> l<T> mergeDelayError(q<? extends q<? extends T>> qVar, int i10) {
        Ru.b.e(qVar, "sources is null");
        Ru.b.f(i10, "maxConcurrency");
        return C14313a.o(new W(qVar, Ru.a.i(), true, i10, bufferSize()));
    }

    public final l<T> delay(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new F(this, j10, timeUnit, tVar, z10));
    }

    public final l<T> doOnEach(Pu.g<? super k<T>> gVar) {
        Ru.b.e(gVar, "onNotification is null");
        return doOnEach(Ru.a.r(gVar), Ru.a.q(gVar), Ru.a.p(gVar), Ru.a.f33002c);
    }

    public final l<T> sample(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.o(new X0(this, j10, timeUnit, tVar, z10));
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, t tVar) {
        return skipLast(j10, timeUnit, tVar, false, bufferSize());
    }

    public final l<T> takeLast(long j10, long j11, TimeUnit timeUnit, t tVar) {
        return takeLast(j10, j11, timeUnit, tVar, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> u<Map<K, V>> toMap(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        Ru.b.e(oVar, "keySelector is null");
        Ru.b.e(oVar2, "valueSelector is null");
        Ru.b.e(callable, "mapSupplier is null");
        return (u<Map<K, V>>) collect(callable, Ru.a.E(oVar, oVar2));
    }

    public final u<List<T>> toSortedList(int i10) {
        return toSortedList(Ru.a.o(), i10);
    }

    public final <U, R> l<R> zipWith(q<? extends U> qVar, Pu.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return zip(this, qVar, cVar, z10);
    }

    public static <T, R> l<R> combineLatest(q<? extends T>[] qVarArr, Pu.o<? super Object[], ? extends R> oVar) {
        return combineLatest(qVarArr, oVar, bufferSize());
    }

    public static <T> l<T> concat(q<? extends T> qVar, q<? extends T> qVar2) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return concatArray(qVar, qVar2);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Pu.b<S, e<T>> bVar, Pu.g<? super S> gVar) {
        Ru.b.e(bVar, "generator is null");
        return generate(callable, C5479o0.l(bVar), gVar);
    }

    public final <U extends Collection<? super T>> l<U> buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    public final l<T> concatWith(d dVar) {
        Ru.b.e(dVar, "other is null");
        return C14313a.o(new C5495w(this, dVar));
    }

    public final l<T> mergeWith(d dVar) {
        Ru.b.e(dVar, "other is null");
        return C14313a.o(new C5502z0(this, dVar));
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return replay(oVar, i10, j10, timeUnit, C14764a.a());
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        return skipLast(j10, timeUnit, tVar, z10, bufferSize());
    }

    public final l<T> takeLast(long j10, long j11, TimeUnit timeUnit, t tVar, boolean z10, int i10) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.f(i10, "bufferSize");
        if (j10 >= 0) {
            return C14313a.o(new s1(this, j10, j11, timeUnit, tVar, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit, t tVar, q<? extends T> qVar) {
        Ru.b.e(qVar, "other is null");
        return timeout0(j10, timeUnit, qVar, tVar);
    }

    public final l<l<T>> window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, C14764a.a(), bufferSize());
    }

    public final <U, R> l<R> zipWith(q<? extends U> qVar, Pu.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return zip(this, qVar, cVar, z10, i10);
    }

    public static <T, R> l<R> combineLatest(q<? extends T>[] qVarArr, Pu.o<? super Object[], ? extends R> oVar, int i10) {
        Ru.b.e(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            return empty();
        }
        Ru.b.e(oVar, "combiner is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new C5489t(qVarArr, null, oVar, i10 << 1, false));
    }

    public static <T, R> l<R> combineLatestDelayError(Iterable<? extends q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2, int i10) {
        return sequenceEqual(qVar, qVar2, Ru.b.d(), i10);
    }

    public final l<List<T>> buffer(long j10, long j11, TimeUnit timeUnit) {
        return (l<List<T>>) buffer(j10, j11, timeUnit, C14764a.a(), ev.b.b());
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, int i10, long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(oVar, "selector is null");
        Ru.b.f(i10, "bufferSize");
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return T0.k(C5479o0.i(this, i10, j10, timeUnit, tVar), oVar);
    }

    public final l<T> retry(Pu.q<? super Throwable> qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, t tVar, boolean z10, int i10) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new C5465j1(this, j10, timeUnit, tVar, i10 << 1, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> u<Map<K, Collection<V>>> toMultimap(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, Pu.o<? super K, ? extends Collection<? super V>> oVar3) {
        Ru.b.e(oVar, "keySelector is null");
        Ru.b.e(oVar2, "valueSelector is null");
        Ru.b.e(callable, "mapSupplier is null");
        Ru.b.e(oVar3, "collectionFactory is null");
        return (u<Map<K, Collection<V>>>) collect(callable, Ru.a.F(oVar, oVar2, oVar3));
    }

    public final l<l<T>> window(long j10, long j11, TimeUnit timeUnit, t tVar) {
        return window(j10, j11, timeUnit, tVar, bufferSize());
    }

    public static <T, R> l<R> combineLatestDelayError(Iterable<? extends q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar, int i10) {
        Ru.b.e(iterable, "sources is null");
        Ru.b.e(oVar, "combiner is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new C5489t(null, iterable, oVar, i10 << 1, true));
    }

    public static <T> l<T> fromFuture(Future<? extends T> future, t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return fromFuture(future).subscribeOn(tVar);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Pu.c<S, e<T>, S> cVar) {
        return generate(callable, cVar, Ru.a.g());
    }

    public static <T> l<T> merge(q<? extends T> qVar, q<? extends T> qVar2) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return fromArray(qVar, qVar2).flatMap(Ru.a.i(), false, 2);
    }

    public static <T> l<T> mergeDelayError(q<? extends T> qVar, q<? extends T> qVar2) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return fromArray(qVar, qVar2).flatMap(Ru.a.i(), true, 2);
    }

    public static <T1, T2, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, Pu.c<? super T1, ? super T2, ? extends R> cVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return zipArray(Ru.a.v(cVar), false, bufferSize(), qVar, qVar2);
    }

    public final l<List<T>> buffer(long j10, long j11, TimeUnit timeUnit, t tVar) {
        return (l<List<T>>) buffer(j10, j11, timeUnit, tVar, ev.b.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> l<T> delay(q<U> qVar, Pu.o<? super T, ? extends q<V>> oVar) {
        return delaySubscription(qVar).delay(oVar);
    }

    public final <U> l<T> sample(q<U> qVar) {
        Ru.b.e(qVar, "sampler is null");
        return C14313a.o(new Y0(this, qVar, false));
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit, t tVar) {
        return timeout0(j10, timeUnit, null, tVar);
    }

    public final l<l<T>> window(long j10, long j11, TimeUnit timeUnit, t tVar, int i10) {
        Ru.b.g(j10, "timespan");
        Ru.b.g(j11, "timeskip");
        Ru.b.f(i10, "bufferSize");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.e(timeUnit, "unit is null");
        return C14313a.o(new K1(this, j10, j11, timeUnit, tVar, Long.MAX_VALUE, i10, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, R> l<R> withLatestFrom(q<T1> qVar, q<T2> qVar2, q<T3> qVar3, Pu.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        Ru.b.e(qVar, "o1 is null");
        Ru.b.e(qVar2, "o2 is null");
        Ru.b.e(qVar3, "o3 is null");
        Ru.b.e(iVar, "combiner is null");
        return withLatestFrom((q<?>[]) new q[]{qVar, qVar2, qVar3}, Ru.a.x(iVar));
    }

    public static <T> l<T> concat(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        return concatArray(qVar, qVar2, qVar3);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Pu.c<S, e<T>, S> cVar, Pu.g<? super S> gVar) {
        Ru.b.e(callable, "initialState is null");
        Ru.b.e(cVar, "generator is null");
        Ru.b.e(gVar, "disposeState is null");
        return C14313a.o(new C5461i0(callable, cVar, gVar));
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        return fromArray(t10, t11, t12, t13);
    }

    public final <U extends Collection<? super T>> l<U> buffer(long j10, long j11, TimeUnit timeUnit, t tVar, Callable<U> callable) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.e(callable, "bufferSupplier is null");
        return C14313a.o(new C5481p(this, j10, j11, timeUnit, tVar, callable, a.e.API_PRIORITY_OTHER, false));
    }

    public final <U, V> l<T> timeout(q<U> qVar, Pu.o<? super T, ? extends q<V>> oVar) {
        Ru.b.e(qVar, "firstTimeoutIndicator is null");
        return timeout0(qVar, oVar, null);
    }

    public final l<T> doOnEach(s<? super T> sVar) {
        Ru.b.e(sVar, "observer is null");
        return doOnEach(C5479o0.f(sVar), C5479o0.e(sVar), C5479o0.d(sVar), Ru.a.f33002c);
    }

    public final <U> l<T> sample(q<U> qVar, boolean z10) {
        Ru.b.e(qVar, "sampler is null");
        return C14313a.o(new Y0(this, qVar, z10));
    }

    @Override // io.reactivex.q
    public final void subscribe(s<? super T> sVar) {
        Ru.b.e(sVar, "observer is null");
        try {
            s<? super T> sVarY = C14313a.y(this, sVar);
            Ru.b.e(sVarY, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(sVarY);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static <T> l<T> merge(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        return fromArray(qVar, qVar2, qVar3).flatMap(Ru.a.i(), false, 3);
    }

    public static <T> l<T> mergeDelayError(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        return fromArray(qVar, qVar2, qVar3).flatMap(Ru.a.i(), true, 3);
    }

    public static <T1, T2, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, Pu.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return zipArray(Ru.a.v(cVar), z10, bufferSize(), qVar, qVar2);
    }

    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, Pu.o<? super Throwable, ? extends q<? extends R>> oVar2, Callable<? extends q<? extends R>> callable) {
        Ru.b.e(oVar, "onNextMapper is null");
        Ru.b.e(oVar2, "onErrorMapper is null");
        Ru.b.e(callable, "onCompleteSupplier is null");
        return merge(new C5498x0(this, oVar, oVar2, callable));
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, C14764a.d(), false, bufferSize());
    }

    public final <U, V> l<T> timeout(q<U> qVar, Pu.o<? super T, ? extends q<V>> oVar, q<? extends T> qVar2) {
        Ru.b.e(qVar, "firstTimeoutIndicator is null");
        Ru.b.e(qVar2, "other is null");
        return timeout0(qVar, oVar, qVar2);
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, C14764a.d(), z10, bufferSize());
    }

    public final <K, V> u<Map<K, Collection<V>>> toMultimap(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, ev.b.e());
    }

    public static <T1, T2, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, Pu.c<? super T1, ? super T2, ? extends R> cVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return combineLatest(Ru.a.v(cVar), bufferSize(), qVar, qVar2);
    }

    public static <T> l<T> concat(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3, q<? extends T> qVar4) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        return concatArray(qVar, qVar2, qVar3, qVar4);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, C14764a.a(), a.e.API_PRIORITY_OTHER);
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, int i10, t tVar) {
        Ru.b.e(oVar, "selector is null");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.f(i10, "bufferSize");
        return T0.k(C5479o0.h(this, i10), C5479o0.k(oVar, tVar));
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, t tVar) {
        return takeLast(j10, timeUnit, tVar, false, bufferSize());
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        Ru.b.e(t14, "item5 is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    public static <T1, T2, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, Pu.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        return zipArray(Ru.a.v(cVar), z10, i10, qVar, qVar2);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, C14764a.a(), i10);
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        return takeLast(j10, timeUnit, tVar, z10, bufferSize());
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, C14764a.a(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, T4, R> l<R> withLatestFrom(q<T1> qVar, q<T2> qVar2, q<T3> qVar3, q<T4> qVar4, Pu.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        Ru.b.e(qVar, "o1 is null");
        Ru.b.e(qVar2, "o2 is null");
        Ru.b.e(qVar3, "o3 is null");
        Ru.b.e(qVar4, "o4 is null");
        Ru.b.e(jVar, "combiner is null");
        return withLatestFrom((q<?>[]) new q[]{qVar, qVar2, qVar3, qVar4}, Ru.a.y(jVar));
    }

    public static <T> l<T> merge(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3, q<? extends T> qVar4) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        return fromArray(qVar, qVar2, qVar3, qVar4).flatMap(Ru.a.i(), false, 4);
    }

    public static <T> l<T> mergeDelayError(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3, q<? extends T> qVar4) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        return fromArray(qVar, qVar2, qVar3, qVar4).flatMap(Ru.a.i(), true, 4);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit, t tVar, int i10) {
        return (l<List<T>>) buffer(j10, timeUnit, tVar, i10, ev.b.b(), false);
    }

    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, Pu.o<Throwable, ? extends q<? extends R>> oVar2, Callable<? extends q<? extends R>> callable, int i10) {
        Ru.b.e(oVar, "onNextMapper is null");
        Ru.b.e(oVar2, "onErrorMapper is null");
        Ru.b.e(callable, "onCompleteSupplier is null");
        return merge(new C5498x0(this, oVar, oVar2, callable), i10);
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, t tVar, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, tVar, z10, i10);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, C14764a.a(), j11, false);
    }

    public static <T1, T2, T3, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, Pu.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        return combineLatest(Ru.a.w(hVar), bufferSize(), qVar, qVar2, qVar3);
    }

    public final <U extends Collection<? super T>> l<U> buffer(long j10, TimeUnit timeUnit, t tVar, int i10, Callable<U> callable, boolean z10) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.e(callable, "bufferSupplier is null");
        Ru.b.f(i10, "count");
        return C14313a.o(new C5481p(this, j10, j10, timeUnit, tVar, callable, i10, z10));
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, C14764a.a(), j11, z10);
    }

    public static <T1, T2, T3, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, Pu.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        return zipArray(Ru.a.w(hVar), false, bufferSize(), qVar, qVar2, qVar3);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar) {
        return window(j10, timeUnit, tVar, Long.MAX_VALUE, false);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar, long j11) {
        return window(j10, timeUnit, tVar, j11, false);
    }

    public final <R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        return flatMap((Pu.o) oVar, false, i10, bufferSize());
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, long j10, TimeUnit timeUnit) {
        return replay(oVar, j10, timeUnit, C14764a.a());
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar, long j11, boolean z10) {
        return window(j10, timeUnit, tVar, j11, z10, bufferSize());
    }

    public static <T1, T2, T3, T4, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, Pu.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        return combineLatest(Ru.a.x(iVar), bufferSize(), qVar, qVar2, qVar3, qVar4);
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        Ru.b.e(t14, "item5 is null");
        Ru.b.e(t15, "item6 is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    public final <U, R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends R> cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(oVar, "selector is null");
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return T0.k(C5479o0.j(this, j10, timeUnit, tVar), oVar);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar, long j11, boolean z10, int i10) {
        Ru.b.f(i10, "bufferSize");
        Ru.b.e(tVar, "scheduler is null");
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.g(j11, "count");
        return C14313a.o(new K1(this, j10, j10, timeUnit, tVar, j11, i10, z10));
    }

    public static <T1, T2, T3, T4, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, Pu.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        return zipArray(Ru.a.x(iVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit, t tVar) {
        return (l<List<T>>) buffer(j10, timeUnit, tVar, a.e.API_PRIORITY_OTHER, ev.b.b(), false);
    }

    public final <U, R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return flatMap(oVar, cVar, z10, bufferSize(), bufferSize());
    }

    public final <R> l<R> withLatestFrom(q<?>[] qVarArr, Pu.o<? super Object[], R> oVar) {
        Ru.b.e(qVarArr, "others is null");
        Ru.b.e(oVar, "combiner is null");
        return C14313a.o(new M1(this, qVarArr, oVar));
    }

    public final <TOpening, TClosing> l<List<T>> buffer(q<? extends TOpening> qVar, Pu.o<? super TOpening, ? extends q<? extends TClosing>> oVar) {
        return (l<List<T>>) buffer(qVar, oVar, ev.b.b());
    }

    public final <U, R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return flatMap(oVar, cVar, z10, i10, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> l<U> buffer(q<? extends TOpening> qVar, Pu.o<? super TOpening, ? extends q<? extends TClosing>> oVar, Callable<U> callable) {
        Ru.b.e(qVar, "openingIndicator is null");
        Ru.b.e(oVar, "closingIndicator is null");
        Ru.b.e(callable, "bufferSupplier is null");
        return C14313a.o(new C5472m(this, qVar, oVar, callable));
    }

    public final <U, R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        Ru.b.e(oVar, "mapper is null");
        Ru.b.e(cVar, "combiner is null");
        return flatMap(C5479o0.b(oVar, cVar), z10, i10, i11);
    }

    public final <R> l<R> replay(Pu.o<? super l<T>, ? extends q<R>> oVar, t tVar) {
        Ru.b.e(oVar, "selector is null");
        Ru.b.e(tVar, "scheduler is null");
        return T0.k(C5479o0.g(this), C5479o0.k(oVar, tVar));
    }

    public final <R> l<R> withLatestFrom(Iterable<? extends q<?>> iterable, Pu.o<? super Object[], R> oVar) {
        Ru.b.e(iterable, "others is null");
        Ru.b.e(oVar, "combiner is null");
        return C14313a.o(new M1(this, iterable, oVar));
    }

    public static <T1, T2, T3, T4, T5, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, Pu.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        return combineLatest(Ru.a.y(jVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5);
    }

    public final <B> l<l<T>> window(q<B> qVar) {
        return window(qVar, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, Pu.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        return zipArray(Ru.a.y(jVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5);
    }

    public final <U, R> l<R> flatMap(Pu.o<? super T, ? extends q<? extends U>> oVar, Pu.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return flatMap(oVar, cVar, false, i10, bufferSize());
    }

    public final <B> l<l<T>> window(q<B> qVar, int i10) {
        Ru.b.e(qVar, "boundary is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new H1(this, qVar, i10));
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        Ru.b.e(t14, "item5 is null");
        Ru.b.e(t15, "item6 is null");
        Ru.b.e(t16, "item7 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    public final <B> l<List<T>> buffer(q<B> qVar) {
        return (l<List<T>>) buffer(qVar, ev.b.b());
    }

    public final <B> l<List<T>> buffer(q<B> qVar, int i10) {
        Ru.b.f(i10, "initialCapacity");
        return (l<List<T>>) buffer(qVar, Ru.a.e(i10));
    }

    public final AbstractC14143a<T> replay(int i10) {
        Ru.b.f(i10, "bufferSize");
        return T0.f(this, i10);
    }

    public final <U, V> l<l<T>> window(q<U> qVar, Pu.o<? super U, ? extends q<V>> oVar) {
        return window(qVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<? super T>> l<U> buffer(q<B> qVar, Callable<U> callable) {
        Ru.b.e(qVar, "boundary is null");
        Ru.b.e(callable, "bufferSupplier is null");
        return C14313a.o(new C5478o(this, qVar, callable));
    }

    public final <U, V> l<l<T>> window(q<U> qVar, Pu.o<? super U, ? extends q<V>> oVar, int i10) {
        Ru.b.e(qVar, "openingIndicator is null");
        Ru.b.e(oVar, "closingIndicator is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new I1(this, qVar, oVar, i10));
    }

    public static <T1, T2, T3, T4, T5, T6, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, Pu.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        return combineLatest(Ru.a.z(kVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6);
    }

    public final AbstractC14143a<T> replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, C14764a.a());
    }

    public static <T1, T2, T3, T4, T5, T6, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, Pu.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        return zipArray(Ru.a.z(kVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6);
    }

    public final AbstractC14143a<T> replay(int i10, long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.f(i10, "bufferSize");
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return T0.h(this, j10, timeUnit, tVar, i10);
    }

    public final <B> l<List<T>> buffer(Callable<? extends q<B>> callable) {
        return (l<List<T>>) buffer(callable, ev.b.b());
    }

    public final <B, U extends Collection<? super T>> l<U> buffer(Callable<? extends q<B>> callable, Callable<U> callable2) {
        Ru.b.e(callable, "boundarySupplier is null");
        Ru.b.e(callable2, "bufferSupplier is null");
        return C14313a.o(new C5475n(this, callable, callable2));
    }

    public final <B> l<l<T>> window(Callable<? extends q<B>> callable) {
        return window(callable, bufferSize());
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        Ru.b.e(t14, "item5 is null");
        Ru.b.e(t15, "item6 is null");
        Ru.b.e(t16, "item7 is null");
        Ru.b.e(t17, "item8 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    public final <B> l<l<T>> window(Callable<? extends q<B>> callable, int i10) {
        Ru.b.e(callable, "boundary is null");
        Ru.b.f(i10, "bufferSize");
        return C14313a.o(new J1(this, callable, i10));
    }

    public final AbstractC14143a<T> replay(int i10, t tVar) {
        Ru.b.f(i10, "bufferSize");
        return T0.l(replay(i10), tVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, Pu.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        Ru.b.e(qVar7, "source7 is null");
        return combineLatest(Ru.a.A(lVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7);
    }

    public final AbstractC14143a<T> replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, C14764a.a());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, Pu.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        Ru.b.e(qVar7, "source7 is null");
        return zipArray(Ru.a.A(lVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7);
    }

    public final AbstractC14143a<T> replay(long j10, TimeUnit timeUnit, t tVar) {
        Ru.b.e(timeUnit, "unit is null");
        Ru.b.e(tVar, "scheduler is null");
        return T0.g(this, j10, timeUnit, tVar);
    }

    public final AbstractC14143a<T> replay(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return T0.l(replay(), tVar);
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        Ru.b.e(t14, "item5 is null");
        Ru.b.e(t15, "item6 is null");
        Ru.b.e(t16, "item7 is null");
        Ru.b.e(t17, "item8 is null");
        Ru.b.e(t18, "item9 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, Pu.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        Ru.b.e(qVar7, "source7 is null");
        Ru.b.e(qVar8, "source8 is null");
        return combineLatest(Ru.a.B(mVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, Pu.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        Ru.b.e(qVar7, "source7 is null");
        Ru.b.e(qVar8, "source8 is null");
        return zipArray(Ru.a.B(mVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8);
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        Ru.b.e(t10, "item1 is null");
        Ru.b.e(t11, "item2 is null");
        Ru.b.e(t12, "item3 is null");
        Ru.b.e(t13, "item4 is null");
        Ru.b.e(t14, "item5 is null");
        Ru.b.e(t15, "item6 is null");
        Ru.b.e(t16, "item7 is null");
        Ru.b.e(t17, "item8 is null");
        Ru.b.e(t18, "item9 is null");
        Ru.b.e(t19, "item10 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, q<? extends T9> qVar9, Pu.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        Ru.b.e(qVar7, "source7 is null");
        Ru.b.e(qVar8, "source8 is null");
        Ru.b.e(qVar9, "source9 is null");
        return combineLatest(Ru.a.C(nVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, q<? extends T9> qVar9, Pu.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        Ru.b.e(qVar, "source1 is null");
        Ru.b.e(qVar2, "source2 is null");
        Ru.b.e(qVar3, "source3 is null");
        Ru.b.e(qVar4, "source4 is null");
        Ru.b.e(qVar5, "source5 is null");
        Ru.b.e(qVar6, "source6 is null");
        Ru.b.e(qVar7, "source7 is null");
        Ru.b.e(qVar8, "source8 is null");
        Ru.b.e(qVar9, "source9 is null");
        return zipArray(Ru.a.C(nVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9);
    }
}
