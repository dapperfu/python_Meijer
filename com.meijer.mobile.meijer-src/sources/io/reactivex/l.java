package io.reactivex;

import Uu.A;
import Uu.A0;
import Uu.A1;
import Uu.B;
import Uu.B0;
import Uu.B1;
import Uu.C;
import Uu.C0;
import Uu.C1;
import Uu.C5376a0;
import Uu.C5377a1;
import Uu.C5378b;
import Uu.C5379b0;
import Uu.C5380b1;
import Uu.C5381c;
import Uu.C5382c0;
import Uu.C5384d;
import Uu.C5386d1;
import Uu.C5387e;
import Uu.C5388e0;
import Uu.C5389e1;
import Uu.C5391f0;
import Uu.C5392f1;
import Uu.C5393g;
import Uu.C5394g0;
import Uu.C5395g1;
import Uu.C5396h;
import Uu.C5397h0;
import Uu.C5398h1;
import Uu.C5400i0;
import Uu.C5401i1;
import Uu.C5402j;
import Uu.C5403j0;
import Uu.C5404j1;
import Uu.C5405k;
import Uu.C5406k0;
import Uu.C5407k1;
import Uu.C5408l;
import Uu.C5409l0;
import Uu.C5410l1;
import Uu.C5411m;
import Uu.C5412m0;
import Uu.C5413m1;
import Uu.C5414n;
import Uu.C5415n0;
import Uu.C5416n1;
import Uu.C5417o;
import Uu.C5418o0;
import Uu.C5419o1;
import Uu.C5420p;
import Uu.C5421p0;
import Uu.C5422p1;
import Uu.C5423q;
import Uu.C5424q0;
import Uu.C5425r0;
import Uu.C5426s;
import Uu.C5427s0;
import Uu.C5428t;
import Uu.C5429t0;
import Uu.C5430u;
import Uu.C5431u0;
import Uu.C5432v;
import Uu.C5433v0;
import Uu.C5434w;
import Uu.C5435w0;
import Uu.C5436x;
import Uu.C5437x0;
import Uu.C5438y;
import Uu.C5439y0;
import Uu.C5441z0;
import Uu.CallableC5385d0;
import Uu.D;
import Uu.D0;
import Uu.D1;
import Uu.E;
import Uu.E0;
import Uu.E1;
import Uu.F;
import Uu.F0;
import Uu.F1;
import Uu.G;
import Uu.G0;
import Uu.G1;
import Uu.H;
import Uu.H1;
import Uu.I;
import Uu.I1;
import Uu.J;
import Uu.J0;
import Uu.J1;
import Uu.K;
import Uu.K0;
import Uu.K1;
import Uu.L;
import Uu.L0;
import Uu.L1;
import Uu.M;
import Uu.M0;
import Uu.M1;
import Uu.N;
import Uu.N0;
import Uu.N1;
import Uu.O;
import Uu.O0;
import Uu.O1;
import Uu.Q;
import Uu.Q0;
import Uu.R0;
import Uu.S;
import Uu.S0;
import Uu.T;
import Uu.T0;
import Uu.U;
import Uu.U0;
import Uu.V;
import Uu.V0;
import Uu.W;
import Uu.W0;
import Uu.X0;
import Uu.Y;
import Uu.Y0;
import Uu.Z;
import Uu.Z0;
import Uu.q1;
import Uu.r1;
import Uu.s1;
import Uu.t1;
import Uu.u1;
import Uu.v1;
import Uu.w1;
import Uu.x1;
import Uu.y1;
import Uu.z1;
import bv.AbstractC6411a;
import bv.AbstractC6412b;
import com.google.android.gms.common.api.a;
import cv.C13558a;
import ev.C13889a;
import ev.C13890b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class l<T> implements q<T> {
    public static <T, R> l<R> combineLatest(Lu.o<? super Object[], ? extends R> oVar, int i10, q<? extends T>... qVarArr) {
        return combineLatest(qVarArr, oVar, i10);
    }

    public static <T, R> l<R> combineLatestDelayError(q<? extends T>[] qVarArr, Lu.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(qVarArr, oVar, bufferSize());
    }

    public static <T> l<T> concat(Iterable<? extends q<? extends T>> iterable) {
        Nu.b.e(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Nu.a.i(), bufferSize(), false);
    }

    public static <T> l<T> concatArray(q<? extends T>... qVarArr) {
        return qVarArr.length == 0 ? empty() : qVarArr.length == 1 ? wrap(qVarArr[0]) : C13558a.o(new C5430u(fromArray(qVarArr), Nu.a.i(), bufferSize(), av.i.BOUNDARY));
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
        Nu.b.e(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> l<T> concatEager(q<? extends q<? extends T>> qVar) {
        return concatEager(qVar, bufferSize(), bufferSize());
    }

    private l<T> doOnEach(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar, Lu.a aVar2) {
        Nu.b.e(gVar, "onNext is null");
        Nu.b.e(gVar2, "onError is null");
        Nu.b.e(aVar, "onComplete is null");
        Nu.b.e(aVar2, "onAfterTerminate is null");
        return C13558a.o(new N(this, gVar, gVar2, aVar, aVar2));
    }

    public static <T> l<T> error(Callable<? extends Throwable> callable) {
        Nu.b.e(callable, "errorSupplier is null");
        return C13558a.o(new U(callable));
    }

    public static <T> l<T> fromFuture(Future<? extends T> future) {
        Nu.b.e(future, "future is null");
        return C13558a.o(new C5388e0(future, 0L, null));
    }

    public static <T> l<T> generate(Lu.g<e<T>> gVar) {
        Nu.b.e(gVar, "generator is null");
        return generate(Nu.a.s(), C5418o0.m(gVar), Nu.a.g());
    }

    public static l<Long> interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, C13889a.a());
    }

    public static l<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, C13889a.a());
    }

    public static <T> l<T> just(T t10) {
        Nu.b.e(t10, "item is null");
        return C13558a.o(new C5427s0(t10));
    }

    public static <T> l<T> merge(Iterable<? extends q<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Nu.a.i(), false, i10, i11);
    }

    public static <T> l<T> mergeArray(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Nu.a.i(), false, i10, i11);
    }

    public static <T> l<T> mergeArrayDelayError(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Nu.a.i(), true, i10, i11);
    }

    public static <T> l<T> mergeDelayError(Iterable<? extends q<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Nu.a.i(), true);
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2) {
        return sequenceEqual(qVar, qVar2, Nu.b.d(), bufferSize());
    }

    public static <T> l<T> switchOnNext(q<? extends q<? extends T>> qVar, int i10) {
        Nu.b.e(qVar, "sources is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new C5419o1(qVar, Nu.a.i(), i10, false));
    }

    public static <T> l<T> switchOnNextDelayError(q<? extends q<? extends T>> qVar) {
        return switchOnNextDelayError(qVar, bufferSize());
    }

    private l<T> timeout0(long j10, TimeUnit timeUnit, q<? extends T> qVar, t tVar) {
        Nu.b.e(timeUnit, "timeUnit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new A1(this, j10, timeUnit, tVar, qVar));
    }

    public static l<Long> timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, C13889a.a());
    }

    public static <T, D> l<T> using(Callable<? extends D> callable, Lu.o<? super D, ? extends q<? extends T>> oVar, Lu.g<? super D> gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T, R> l<R> zip(Iterable<? extends q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar) {
        Nu.b.e(oVar, "zipper is null");
        Nu.b.e(iterable, "sources is null");
        return C13558a.o(new N1(null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> l<R> zipArray(Lu.o<? super Object[], ? extends R> oVar, boolean z10, int i10, q<? extends T>... qVarArr) {
        if (qVarArr.length == 0) {
            return empty();
        }
        Nu.b.e(oVar, "zipper is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new N1(qVarArr, null, oVar, i10, z10));
    }

    public final T blockingFirst() throws InterruptedException {
        Pu.e eVar = new Pu.e();
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
        Pu.f fVar = new Pu.f();
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
        C5405k.a(this);
    }

    public final l<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    public final <R> l<R> concatMap(Lu.o<? super T, ? extends q<? extends R>> oVar) {
        return concatMap(oVar, 2);
    }

    public final b concatMapCompletable(Lu.o<? super T, ? extends d> oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final b concatMapCompletableDelayError(Lu.o<? super T, ? extends d> oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> l<R> concatMapDelayError(Lu.o<? super T, ? extends q<? extends R>> oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> l<R> concatMapEager(Lu.o<? super T, ? extends q<? extends R>> oVar) {
        return concatMapEager(oVar, a.e.API_PRIORITY_OTHER, bufferSize());
    }

    public final <R> l<R> concatMapEagerDelayError(Lu.o<? super T, ? extends q<? extends R>> oVar, boolean z10) {
        return concatMapEagerDelayError(oVar, a.e.API_PRIORITY_OTHER, bufferSize(), z10);
    }

    public final <U> l<U> concatMapIterable(Lu.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new C5379b0(this, oVar));
    }

    public final <R> l<R> concatMapMaybe(Lu.o<? super T, ? extends j<? extends R>> oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> l<R> concatMapMaybeDelayError(Lu.o<? super T, ? extends j<? extends R>> oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> l<R> concatMapSingle(Lu.o<? super T, ? extends y<? extends R>> oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> l<R> concatMapSingleDelayError(Lu.o<? super T, ? extends y<? extends R>> oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final l<T> concatWith(q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return concat(this, qVar);
    }

    public final <U> l<T> debounce(Lu.o<? super T, ? extends q<U>> oVar) {
        Nu.b.e(oVar, "debounceSelector is null");
        return C13558a.o(new C(this, oVar));
    }

    public final <U> l<T> delay(Lu.o<? super T, ? extends q<U>> oVar) {
        Nu.b.e(oVar, "itemDelay is null");
        return (l<T>) flatMap(C5418o0.c(oVar));
    }

    public final <U> l<T> delaySubscription(q<U> qVar) {
        Nu.b.e(qVar, "other is null");
        return C13558a.o(new G(this, qVar));
    }

    @Deprecated
    public final <T2> l<T2> dematerialize() {
        return C13558a.o(new H(this, Nu.a.i()));
    }

    public final l<T> distinct() {
        return distinct(Nu.a.i(), Nu.a.f());
    }

    public final l<T> distinctUntilChanged() {
        return distinctUntilChanged(Nu.a.i());
    }

    public final h<T> elementAt(long j10) {
        if (j10 >= 0) {
            return C13558a.n(new Q(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar) {
        return flatMap((Lu.o) oVar, false);
    }

    public final b flatMapCompletable(Lu.o<? super T, ? extends d> oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> l<U> flatMapIterable(Lu.o<? super T, ? extends Iterable<? extends U>> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new C5379b0(this, oVar));
    }

    public final <R> l<R> flatMapMaybe(Lu.o<? super T, ? extends j<? extends R>> oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> l<R> flatMapSingle(Lu.o<? super T, ? extends y<? extends R>> oVar) {
        return flatMapSingle(oVar, false);
    }

    public final Ju.b forEachWhile(Lu.q<? super T> qVar) {
        return forEachWhile(qVar, Nu.a.f22739f, Nu.a.f22736c);
    }

    public final <K> l<AbstractC6412b<K, T>> groupBy(Lu.o<? super T, ? extends K> oVar) {
        return (l<AbstractC6412b<K, T>>) groupBy(oVar, Nu.a.i(), false, bufferSize());
    }

    public final l<T> mergeWith(q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return merge(this, qVar);
    }

    public final l<T> observeOn(t tVar) {
        return observeOn(tVar, false, bufferSize());
    }

    public final l<T> onErrorResumeNext(Lu.o<? super Throwable, ? extends q<? extends T>> oVar) {
        Nu.b.e(oVar, "resumeFunction is null");
        return C13558a.o(new E0(this, oVar, false));
    }

    public final AbstractC6411a<T> publish() {
        return G0.f(this);
    }

    public final h<T> reduce(Lu.c<T, T, T> cVar) {
        Nu.b.e(cVar, "reducer is null");
        return C13558a.n(new M0(this, cVar));
    }

    public final l<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final AbstractC6411a<T> replay() {
        return T0.j(this);
    }

    public final l<T> retry() {
        return retry(Long.MAX_VALUE, Nu.a.c());
    }

    public final l<T> sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, C13889a.a());
    }

    public final l<T> scan(Lu.c<T, T, T> cVar) {
        Nu.b.e(cVar, "accumulator is null");
        return C13558a.o(new C5377a1(this, cVar));
    }

    public final l<T> skip(long j10) {
        return j10 <= 0 ? C13558a.o(this) : C13558a.o(new C5398h1(this, j10));
    }

    public final l<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? C13558a.o(this) : C13558a.o(new C5401i1(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final l<T> sorted() {
        return toList().r().map(Nu.a.m(Nu.a.n())).flatMapIterable(Nu.a.i());
    }

    public final l<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final Ju.b subscribe() {
        return subscribe(Nu.a.g(), Nu.a.f22739f, Nu.a.f22736c, Nu.a.g());
    }

    protected abstract void subscribeActual(s<? super T> sVar);

    public final <R> l<R> switchMap(Lu.o<? super T, ? extends q<? extends R>> oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final <R> l<R> switchMapDelayError(Lu.o<? super T, ? extends q<? extends R>> oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final l<T> take(long j10) {
        if (j10 >= 0) {
            return C13558a.o(new C5422p1(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final l<T> takeLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? C13558a.o(new C5412m0(this)) : i10 == 1 ? C13558a.o(new r1(this)) : C13558a.o(new q1(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    public final <U> l<T> takeUntil(q<U> qVar) {
        Nu.b.e(qVar, "other is null");
        return C13558a.o(new t1(this, qVar));
    }

    public final io.reactivex.observers.g<T> test() {
        io.reactivex.observers.g<T> gVar = new io.reactivex.observers.g<>();
        subscribe(gVar);
        return gVar;
    }

    public final l<T> throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, C13889a.a());
    }

    public final l<T> throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, C13889a.a(), false);
    }

    public final l<T> throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    public final l<C13890b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, C13889a.a());
    }

    public final <V> l<T> timeout(Lu.o<? super T, ? extends q<V>> oVar) {
        return timeout0(null, oVar, null);
    }

    public final l<C13890b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, C13889a.a());
    }

    public final u<List<T>> toList() {
        return toList(16);
    }

    public final <K> u<Map<K, T>> toMap(Lu.o<? super T, ? extends K> oVar) {
        Nu.b.e(oVar, "keySelector is null");
        return (u<Map<K, T>>) collect(av.l.a(), Nu.a.D(oVar));
    }

    public final <K> u<Map<K, Collection<T>>> toMultimap(Lu.o<? super T, ? extends K> oVar) {
        return (u<Map<K, Collection<T>>>) toMultimap(oVar, Nu.a.i(), av.l.a(), av.b.e());
    }

    public final u<List<T>> toSortedList() {
        return toSortedList(Nu.a.o());
    }

    public final l<l<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    public final <U, R> l<R> withLatestFrom(q<? extends U> qVar, Lu.c<? super T, ? super U, ? extends R> cVar) {
        Nu.b.e(qVar, "other is null");
        Nu.b.e(cVar, "combiner is null");
        return C13558a.o(new L1(this, cVar, qVar));
    }

    public final <U, R> l<R> zipWith(Iterable<U> iterable, Lu.c<? super T, ? super U, ? extends R> cVar) {
        Nu.b.e(iterable, "other is null");
        Nu.b.e(cVar, "zipper is null");
        return C13558a.o(new O1(this, iterable, cVar));
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f138880a;

        static {
            int[] iArr = new int[io.reactivex.a.values().length];
            f138880a = iArr;
            try {
                iArr[io.reactivex.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138880a[io.reactivex.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138880a[io.reactivex.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138880a[io.reactivex.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> l<T> amb(Iterable<? extends q<? extends T>> iterable) {
        Nu.b.e(iterable, "sources is null");
        return C13558a.o(new C5396h(null, iterable));
    }

    public static <T> l<T> ambArray(q<? extends T>... qVarArr) {
        Nu.b.e(qVarArr, "sources is null");
        int length = qVarArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(qVarArr[0]) : C13558a.o(new C5396h(qVarArr, null));
    }

    public static <T, R> l<R> combineLatest(Iterable<? extends q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> l<R> combineLatestDelayError(Lu.o<? super Object[], ? extends R> oVar, int i10, q<? extends T>... qVarArr) {
        return combineLatestDelayError(qVarArr, oVar, i10);
    }

    public static <T> l<T> concatArrayEager(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).concatMapEagerDelayError(Nu.a.i(), i10, i11, false);
    }

    public static <T> l<T> concatArrayEagerDelayError(int i10, int i11, q<? extends T>... qVarArr) {
        return fromArray(qVarArr).concatMapEagerDelayError(Nu.a.i(), i10, i11, true);
    }

    public static <T> l<T> concatEager(q<? extends q<? extends T>> qVar, int i10, int i11) {
        return wrap(qVar).concatMapEager(Nu.a.i(), i10, i11);
    }

    public static <T> l<T> create(o<T> oVar) {
        Nu.b.e(oVar, "source is null");
        return C13558a.o(new B(oVar));
    }

    public static <T> l<T> defer(Callable<? extends q<? extends T>> callable) {
        Nu.b.e(callable, "supplier is null");
        return C13558a.o(new E(callable));
    }

    public static <T> l<T> empty() {
        return C13558a.o(T.f38213a);
    }

    public static <T> l<T> fromArray(T... tArr) {
        Nu.b.e(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : C13558a.o(new C5382c0(tArr));
    }

    public static <T> l<T> fromCallable(Callable<? extends T> callable) {
        Nu.b.e(callable, "supplier is null");
        return C13558a.o(new CallableC5385d0(callable));
    }

    public static <T> l<T> fromIterable(Iterable<? extends T> iterable) {
        Nu.b.e(iterable, "source is null");
        return C13558a.o(new C5391f0(iterable));
    }

    public static <T> l<T> fromPublisher(lw.a<? extends T> aVar) {
        Nu.b.e(aVar, "publisher is null");
        return C13558a.o(new C5394g0(aVar));
    }

    public static l<Long> interval(long j10, long j11, TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new C5421p0(Math.max(0L, j10), Math.max(0L, j11), timeUnit, tVar));
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
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new C5424q0(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, tVar));
    }

    public static <T> l<T> merge(Iterable<? extends q<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Nu.a.i());
    }

    public static <T> l<T> mergeArray(q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Nu.a.i(), qVarArr.length);
    }

    public static <T> l<T> mergeArrayDelayError(q<? extends T>... qVarArr) {
        return fromArray(qVarArr).flatMap(Nu.a.i(), true, qVarArr.length);
    }

    public static <T> l<T> mergeDelayError(Iterable<? extends q<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Nu.a.i(), true, i10, i11);
    }

    public static <T> l<T> never() {
        return C13558a.o(C0.f37813a);
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
            return C13558a.o(new K0(i10, i11));
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
            return C13558a.o(new L0(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2, Lu.d<? super T, ? super T> dVar) {
        return sequenceEqual(qVar, qVar2, dVar, bufferSize());
    }

    public static <T> l<T> switchOnNextDelayError(q<? extends q<? extends T>> qVar, int i10) {
        Nu.b.e(qVar, "sources is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.o(new C5419o1(qVar, Nu.a.i(), i10, true));
    }

    public static l<Long> timer(long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new B1(Math.max(j10, 0L), timeUnit, tVar));
    }

    public static <T> l<T> unsafeCreate(q<T> qVar) {
        Nu.b.e(qVar, "onSubscribe is null");
        if (qVar instanceof l) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return C13558a.o(new C5397h0(qVar));
    }

    public static <T, D> l<T> using(Callable<? extends D> callable, Lu.o<? super D, ? extends q<? extends T>> oVar, Lu.g<? super D> gVar, boolean z10) {
        Nu.b.e(callable, "resourceSupplier is null");
        Nu.b.e(oVar, "sourceSupplier is null");
        Nu.b.e(gVar, "disposer is null");
        return C13558a.o(new F1(callable, oVar, gVar, z10));
    }

    public static <T> l<T> wrap(q<T> qVar) {
        Nu.b.e(qVar, "source is null");
        return qVar instanceof l ? C13558a.o((l) qVar) : C13558a.o(new C5397h0(qVar));
    }

    public static <T, R> l<R> zipIterable(Iterable<? extends q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        Nu.b.e(oVar, "zipper is null");
        Nu.b.e(iterable, "sources is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new N1(null, iterable, oVar, i10, z10));
    }

    public final u<Boolean> all(Lu.q<? super T> qVar) {
        Nu.b.e(qVar, "predicate is null");
        return C13558a.p(new C5393g(this, qVar));
    }

    public final l<T> ambWith(q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return ambArray(this, qVar);
    }

    public final u<Boolean> any(Lu.q<? super T> qVar) {
        Nu.b.e(qVar, "predicate is null");
        return C13558a.p(new C5402j(this, qVar));
    }

    public final <R> R as(m<T, ? extends R> mVar) {
        return (R) ((m) Nu.b.e(mVar, "converter is null")).a(this);
    }

    public final Iterable<T> blockingIterable(int i10) {
        Nu.b.f(i10, "bufferSize");
        return new C5378b(this, i10);
    }

    public final Iterable<T> blockingLatest() {
        return new C5381c(this);
    }

    public final Iterable<T> blockingMostRecent(T t10) {
        return new C5384d(this, t10);
    }

    public final Iterable<T> blockingNext() {
        return new C5387e(this);
    }

    public final void blockingSubscribe(Lu.g<? super T> gVar) {
        C5405k.b(this, gVar, Nu.a.f22739f, Nu.a.f22736c);
    }

    public final l<List<T>> buffer(int i10, int i11) {
        return (l<List<T>>) buffer(i10, i11, av.b.b());
    }

    public final l<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final l<T> cacheWithInitialCapacity(int i10) {
        Nu.b.f(i10, "initialCapacity");
        return C13558a.o(new C5423q(this, i10));
    }

    public final <U> l<U> cast(Class<U> cls) {
        Nu.b.e(cls, "clazz is null");
        return (l<U>) map(Nu.a.d(cls));
    }

    public final <U> u<U> collect(Callable<? extends U> callable, Lu.b<? super U, ? super T> bVar) {
        Nu.b.e(callable, "initialValueSupplier is null");
        Nu.b.e(bVar, "collector is null");
        return C13558a.p(new C5426s(this, callable, bVar));
    }

    public final <U> u<U> collectInto(U u10, Lu.b<? super U, ? super T> bVar) {
        Nu.b.e(u10, "initialValue is null");
        return collect(Nu.a.k(u10), bVar);
    }

    public final <R> l<R> compose(r<? super T, ? extends R> rVar) {
        return wrap(((r) Nu.b.e(rVar, "composer is null")).a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> concatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        if (!(this instanceof Ou.d)) {
            return C13558a.o(new C5430u(this, oVar, i10, av.i.IMMEDIATE));
        }
        Object objCall = ((Ou.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final b concatMapCompletable(Lu.o<? super T, ? extends d> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "capacityHint");
        return C13558a.l(new Tu.a(this, oVar, av.i.IMMEDIATE, i10));
    }

    public final b concatMapCompletableDelayError(Lu.o<? super T, ? extends d> oVar, boolean z10) {
        return concatMapCompletableDelayError(oVar, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> concatMapDelayError(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10, boolean z10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        if (!(this instanceof Ou.d)) {
            return C13558a.o(new C5430u(this, oVar, i10, z10 ? av.i.END : av.i.BOUNDARY));
        }
        Object objCall = ((Ou.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final <R> l<R> concatMapEager(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10, int i11) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "maxConcurrency");
        Nu.b.f(i11, "prefetch");
        return C13558a.o(new C5432v(this, oVar, av.i.IMMEDIATE, i10, i11));
    }

    public final <R> l<R> concatMapEagerDelayError(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10, int i11, boolean z10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "maxConcurrency");
        Nu.b.f(i11, "prefetch");
        return C13558a.o(new C5432v(this, oVar, z10 ? av.i.END : av.i.BOUNDARY, i10, i11));
    }

    public final <R> l<R> concatMapMaybe(Lu.o<? super T, ? extends j<? extends R>> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.o(new Tu.b(this, oVar, av.i.IMMEDIATE, i10));
    }

    public final <R> l<R> concatMapMaybeDelayError(Lu.o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
        return concatMapMaybeDelayError(oVar, z10, 2);
    }

    public final <R> l<R> concatMapSingle(Lu.o<? super T, ? extends y<? extends R>> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.o(new Tu.c(this, oVar, av.i.IMMEDIATE, i10));
    }

    public final <R> l<R> concatMapSingleDelayError(Lu.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        return concatMapSingleDelayError(oVar, z10, 2);
    }

    public final u<Boolean> contains(Object obj) {
        Nu.b.e(obj, "element is null");
        return any(Nu.a.h(obj));
    }

    public final u<Long> count() {
        return C13558a.p(new A(this));
    }

    public final l<T> defaultIfEmpty(T t10) {
        Nu.b.e(t10, "defaultItem is null");
        return switchIfEmpty(just(t10));
    }

    public final <R> l<R> dematerialize(Lu.o<? super T, k<R>> oVar) {
        Nu.b.e(oVar, "selector is null");
        return C13558a.o(new H(this, oVar));
    }

    public final <K> l<T> distinct(Lu.o<? super T, K> oVar) {
        return distinct(oVar, Nu.a.f());
    }

    public final <K> l<T> distinctUntilChanged(Lu.o<? super T, K> oVar) {
        Nu.b.e(oVar, "keySelector is null");
        return C13558a.o(new K(this, oVar, Nu.b.d()));
    }

    public final l<T> doAfterNext(Lu.g<? super T> gVar) {
        Nu.b.e(gVar, "onAfterNext is null");
        return C13558a.o(new L(this, gVar));
    }

    public final l<T> doAfterTerminate(Lu.a aVar) {
        Nu.b.e(aVar, "onFinally is null");
        return doOnEach(Nu.a.g(), Nu.a.g(), Nu.a.f22736c, aVar);
    }

    public final l<T> doFinally(Lu.a aVar) {
        Nu.b.e(aVar, "onFinally is null");
        return C13558a.o(new M(this, aVar));
    }

    public final l<T> doOnLifecycle(Lu.g<? super Ju.b> gVar, Lu.a aVar) {
        Nu.b.e(gVar, "onSubscribe is null");
        Nu.b.e(aVar, "onDispose is null");
        return C13558a.o(new O(this, gVar, aVar));
    }

    public final l<T> doOnSubscribe(Lu.g<? super Ju.b> gVar) {
        return doOnLifecycle(gVar, Nu.a.f22736c);
    }

    public final l<T> doOnTerminate(Lu.a aVar) {
        Nu.b.e(aVar, "onTerminate is null");
        return doOnEach(Nu.a.g(), Nu.a.a(aVar), aVar, Nu.a.f22736c);
    }

    public final u<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return C13558a.p(new S(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final l<T> filter(Lu.q<? super T> qVar) {
        Nu.b.e(qVar, "predicate is null");
        return C13558a.o(new V(this, qVar));
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

    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, boolean z10) {
        return flatMap(oVar, z10, a.e.API_PRIORITY_OTHER);
    }

    public final b flatMapCompletable(Lu.o<? super T, ? extends d> oVar, boolean z10) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.l(new Y(this, oVar, z10));
    }

    public final <R> l<R> flatMapMaybe(Lu.o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new Z(this, oVar, z10));
    }

    public final <R> l<R> flatMapSingle(Lu.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new C5376a0(this, oVar, z10));
    }

    public final Ju.b forEachWhile(Lu.q<? super T> qVar, Lu.g<? super Throwable> gVar) {
        return forEachWhile(qVar, gVar, Nu.a.f22736c);
    }

    public final <K> l<AbstractC6412b<K, T>> groupBy(Lu.o<? super T, ? extends K> oVar, boolean z10) {
        return (l<AbstractC6412b<K, T>>) groupBy(oVar, Nu.a.i(), z10, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l<R> groupJoin(q<? extends TRight> qVar, Lu.o<? super T, ? extends q<TLeftEnd>> oVar, Lu.o<? super TRight, ? extends q<TRightEnd>> oVar2, Lu.c<? super T, ? super l<TRight>, ? extends R> cVar) {
        Nu.b.e(qVar, "other is null");
        Nu.b.e(oVar, "leftEnd is null");
        Nu.b.e(oVar2, "rightEnd is null");
        Nu.b.e(cVar, "resultSelector is null");
        return C13558a.o(new C5406k0(this, qVar, oVar, oVar2, cVar));
    }

    public final l<T> hide() {
        return C13558a.o(new C5409l0(this));
    }

    public final b ignoreElements() {
        return C13558a.l(new C5415n0(this));
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l<R> join(q<? extends TRight> qVar, Lu.o<? super T, ? extends q<TLeftEnd>> oVar, Lu.o<? super TRight, ? extends q<TRightEnd>> oVar2, Lu.c<? super T, ? super TRight, ? extends R> cVar) {
        Nu.b.e(qVar, "other is null");
        Nu.b.e(oVar, "leftEnd is null");
        Nu.b.e(oVar2, "rightEnd is null");
        Nu.b.e(cVar, "resultSelector is null");
        return C13558a.o(new C5425r0(this, qVar, oVar, oVar2, cVar));
    }

    public final u<T> last(T t10) {
        Nu.b.e(t10, "defaultItem is null");
        return C13558a.p(new C5431u0(this, t10));
    }

    public final h<T> lastElement() {
        return C13558a.n(new C5429t0(this));
    }

    public final u<T> lastOrError() {
        return C13558a.p(new C5431u0(this, null));
    }

    public final <R> l<R> lift(p<? extends R, ? super T> pVar) {
        Nu.b.e(pVar, "lifter is null");
        return C13558a.o(new C5433v0(this, pVar));
    }

    public final <R> l<R> map(Lu.o<? super T, ? extends R> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new C5435w0(this, oVar));
    }

    public final l<k<T>> materialize() {
        return C13558a.o(new C5439y0(this));
    }

    public final l<T> observeOn(t tVar, boolean z10) {
        return observeOn(tVar, z10, bufferSize());
    }

    public final <U> l<U> ofType(Class<U> cls) {
        Nu.b.e(cls, "clazz is null");
        return filter(Nu.a.j(cls)).cast(cls);
    }

    public final l<T> onErrorReturn(Lu.o<? super Throwable, ? extends T> oVar) {
        Nu.b.e(oVar, "valueSupplier is null");
        return C13558a.o(new F0(this, oVar));
    }

    public final l<T> onErrorReturnItem(T t10) {
        Nu.b.e(t10, "item is null");
        return onErrorReturn(Nu.a.l(t10));
    }

    public final l<T> onExceptionResumeNext(q<? extends T> qVar) {
        Nu.b.e(qVar, "next is null");
        return C13558a.o(new E0(this, Nu.a.l(qVar), true));
    }

    public final l<T> onTerminateDetach() {
        return C13558a.o(new I(this));
    }

    public final <R> l<R> publish(Lu.o<? super l<T>, ? extends q<R>> oVar) {
        Nu.b.e(oVar, "selector is null");
        return C13558a.o(new J0(this, oVar));
    }

    public final <R> u<R> reduceWith(Callable<R> callable, Lu.c<R, ? super T, R> cVar) {
        Nu.b.e(callable, "seedSupplier is null");
        Nu.b.e(cVar, "reducer is null");
        return C13558a.p(new O0(this, callable, cVar));
    }

    public final l<T> repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : C13558a.o(new Q0(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final l<T> repeatUntil(Lu.e eVar) {
        Nu.b.e(eVar, "stop is null");
        return C13558a.o(new R0(this, eVar));
    }

    public final l<T> repeatWhen(Lu.o<? super l<Object>, ? extends q<?>> oVar) {
        Nu.b.e(oVar, "handler is null");
        return C13558a.o(new S0(this, oVar));
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar) {
        Nu.b.e(oVar, "selector is null");
        return T0.k(C5418o0.g(this), oVar);
    }

    public final l<T> retry(Lu.d<? super Integer, ? super Throwable> dVar) {
        Nu.b.e(dVar, "predicate is null");
        return C13558a.o(new U0(this, dVar));
    }

    public final l<T> retryUntil(Lu.e eVar) {
        Nu.b.e(eVar, "stop is null");
        return retry(Long.MAX_VALUE, Nu.a.t(eVar));
    }

    public final l<T> retryWhen(Lu.o<? super l<Throwable>, ? extends q<?>> oVar) {
        Nu.b.e(oVar, "handler is null");
        return C13558a.o(new W0(this, oVar));
    }

    public final void safeSubscribe(s<? super T> sVar) {
        Nu.b.e(sVar, "observer is null");
        if (sVar instanceof io.reactivex.observers.e) {
            subscribe(sVar);
        } else {
            subscribe(new io.reactivex.observers.e(sVar));
        }
    }

    public final l<T> sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, C13889a.a(), z10);
    }

    public final <R> l<R> scanWith(Callable<R> callable, Lu.c<R, ? super T, R> cVar) {
        Nu.b.e(callable, "seedSupplier is null");
        Nu.b.e(cVar, "accumulator is null");
        return C13558a.o(new C5380b1(this, callable, cVar));
    }

    public final l<T> serialize() {
        return C13558a.o(new C5389e1(this));
    }

    public final u<T> single(T t10) {
        Nu.b.e(t10, "defaultItem is null");
        return C13558a.p(new C5395g1(this, t10));
    }

    public final h<T> singleElement() {
        return C13558a.n(new C5392f1(this));
    }

    public final u<T> singleOrError() {
        return C13558a.p(new C5395g1(this, null));
    }

    public final <U> l<T> skipUntil(q<U> qVar) {
        Nu.b.e(qVar, "other is null");
        return C13558a.o(new C5407k1(this, qVar));
    }

    public final l<T> skipWhile(Lu.q<? super T> qVar) {
        Nu.b.e(qVar, "predicate is null");
        return C13558a.o(new C5410l1(this, qVar));
    }

    public final l<T> sorted(Comparator<? super T> comparator) {
        Nu.b.e(comparator, "sortFunction is null");
        return toList().r().map(Nu.a.m(comparator)).flatMapIterable(Nu.a.i());
    }

    public final l<T> startWith(q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return concatArray(qVar, this);
    }

    public final Ju.b subscribe(Lu.g<? super T> gVar) {
        return subscribe(gVar, Nu.a.f22739f, Nu.a.f22736c, Nu.a.g());
    }

    public final l<T> subscribeOn(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new C5413m1(this, tVar));
    }

    public final l<T> switchIfEmpty(q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return C13558a.o(new C5416n1(this, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> switchMap(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "bufferSize");
        if (!(this instanceof Ou.d)) {
            return C13558a.o(new C5419o1(this, oVar, i10, false));
        }
        Object objCall = ((Ou.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final b switchMapCompletable(Lu.o<? super T, ? extends d> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.l(new Tu.d(this, oVar, false));
    }

    public final b switchMapCompletableDelayError(Lu.o<? super T, ? extends d> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.l(new Tu.d(this, oVar, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> switchMapDelayError(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "bufferSize");
        if (!(this instanceof Ou.d)) {
            return C13558a.o(new C5419o1(this, oVar, i10, true));
        }
        Object objCall = ((Ou.d) this).call();
        return objCall == null ? empty() : Z0.a(objCall, oVar);
    }

    public final <R> l<R> switchMapMaybe(Lu.o<? super T, ? extends j<? extends R>> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new Tu.e(this, oVar, false));
    }

    public final <R> l<R> switchMapMaybeDelayError(Lu.o<? super T, ? extends j<? extends R>> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new Tu.e(this, oVar, true));
    }

    public final <R> l<R> switchMapSingle(Lu.o<? super T, ? extends y<? extends R>> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new Tu.f(this, oVar, false));
    }

    public final <R> l<R> switchMapSingleDelayError(Lu.o<? super T, ? extends y<? extends R>> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.o(new Tu.f(this, oVar, true));
    }

    public final l<T> takeWhile(Lu.q<? super T> qVar) {
        Nu.b.e(qVar, "predicate is null");
        return C13558a.o(new v1(this, qVar));
    }

    public final l<T> throttleFirst(long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new w1(this, j10, timeUnit, tVar));
    }

    public final l<T> throttleLast(long j10, TimeUnit timeUnit, t tVar) {
        return sample(j10, timeUnit, tVar);
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, C13889a.a(), z10);
    }

    public final l<T> throttleWithTimeout(long j10, TimeUnit timeUnit, t tVar) {
        return debounce(j10, timeUnit, tVar);
    }

    public final l<C13890b<T>> timeInterval(t tVar) {
        return timeInterval(TimeUnit.MILLISECONDS, tVar);
    }

    public final <V> l<T> timeout(Lu.o<? super T, ? extends q<V>> oVar, q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return timeout0(null, oVar, qVar);
    }

    public final l<C13890b<T>> timestamp(t tVar) {
        return timestamp(TimeUnit.MILLISECONDS, tVar);
    }

    public final <R> R to(Lu.o<? super l<T>, R> oVar) {
        try {
            return (R) ((Lu.o) Nu.b.e(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            Ku.a.b(th2);
            throw av.j.d(th2);
        }
    }

    public final f<T> toFlowable(io.reactivex.a aVar) {
        Ru.b bVar = new Ru.b(this);
        int i10 = a.f138880a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? bVar.c() : C13558a.m(new Ru.e(bVar)) : bVar : bVar.f() : bVar.e();
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new Pu.n());
    }

    public final u<List<T>> toList(int i10) {
        Nu.b.f(i10, "capacityHint");
        return C13558a.p(new D1(this, i10));
    }

    public final u<List<T>> toSortedList(Comparator<? super T> comparator) {
        Nu.b.e(comparator, "comparator is null");
        return (u<List<T>>) toList().j(Nu.a.m(comparator));
    }

    public final l<T> unsubscribeOn(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new E1(this, tVar));
    }

    public final l<l<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    public static int bufferSize() {
        return f.b();
    }

    public static <T, R> l<R> combineLatest(Iterable<? extends q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar, int i10) {
        Nu.b.e(iterable, "sources is null");
        Nu.b.e(oVar, "combiner is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new C5428t(null, iterable, oVar, i10 << 1, false));
    }

    public static <T, R> l<R> combineLatestDelayError(q<? extends T>[] qVarArr, Lu.o<? super Object[], ? extends R> oVar, int i10) {
        Nu.b.f(i10, "bufferSize");
        Nu.b.e(oVar, "combiner is null");
        if (qVarArr.length == 0) {
            return empty();
        }
        return C13558a.o(new C5428t(qVarArr, null, oVar, i10 << 1, true));
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
        Nu.b.e(th2, "exception is null");
        return error((Callable<? extends Throwable>) Nu.a.k(th2));
    }

    public static <T> l<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        Nu.b.e(future, "future is null");
        Nu.b.e(timeUnit, "unit is null");
        return C13558a.o(new C5388e0(future, j10, timeUnit));
    }

    public static <T> l<T> just(T t10, T t11) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        return fromArray(t10, t11);
    }

    public static <T> l<T> merge(Iterable<? extends q<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Nu.a.i(), i10);
    }

    public static <T> l<T> mergeDelayError(Iterable<? extends q<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Nu.a.i(), true, i10);
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2, Lu.d<? super T, ? super T> dVar, int i10) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(dVar, "isEqual is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.p(new C5386d1(qVar, qVar2, dVar, i10));
    }

    public final void blockingForEach(Lu.g<? super T> gVar) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                Ku.a.b(th2);
                ((Ju.b) it).dispose();
                throw av.j.d(th2);
            }
        }
    }

    public final T blockingSingle(T t10) {
        return single(t10).c();
    }

    public final void blockingSubscribe(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2) {
        C5405k.b(this, gVar, gVar2, Nu.a.f22736c);
    }

    public final <U extends Collection<? super T>> l<U> buffer(int i10, int i11, Callable<U> callable) {
        Nu.b.f(i10, "count");
        Nu.b.f(i11, "skip");
        Nu.b.e(callable, "bufferSupplier is null");
        return C13558a.o(new C5408l(this, i10, i11, callable));
    }

    public final b concatMapCompletableDelayError(Lu.o<? super T, ? extends d> oVar, boolean z10, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.l(new Tu.a(this, oVar, z10 ? av.i.END : av.i.BOUNDARY, i10));
    }

    public final <U> l<U> concatMapIterable(Lu.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        return (l<U>) concatMap(C5418o0.a(oVar), i10);
    }

    public final <R> l<R> concatMapMaybeDelayError(Lu.o<? super T, ? extends j<? extends R>> oVar, boolean z10, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.o(new Tu.b(this, oVar, z10 ? av.i.END : av.i.BOUNDARY, i10));
    }

    public final <R> l<R> concatMapSingleDelayError(Lu.o<? super T, ? extends y<? extends R>> oVar, boolean z10, int i10) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.o(new Tu.c(this, oVar, z10 ? av.i.END : av.i.BOUNDARY, i10));
    }

    public final l<T> concatWith(y<? extends T> yVar) {
        Nu.b.e(yVar, "other is null");
        return C13558a.o(new C5438y(this, yVar));
    }

    public final l<T> debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, C13889a.a());
    }

    public final l<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, C13889a.a(), false);
    }

    public final l<T> delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, C13889a.a());
    }

    public final <K> l<T> distinct(Lu.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        Nu.b.e(oVar, "keySelector is null");
        Nu.b.e(callable, "collectionSupplier is null");
        return C13558a.o(new J(this, oVar, callable));
    }

    public final l<T> doOnComplete(Lu.a aVar) {
        return doOnEach(Nu.a.g(), Nu.a.g(), aVar, Nu.a.f22736c);
    }

    public final l<T> doOnDispose(Lu.a aVar) {
        return doOnLifecycle(Nu.a.g(), aVar);
    }

    public final l<T> doOnError(Lu.g<? super Throwable> gVar) {
        Lu.g<? super T> gVarG = Nu.a.g();
        Lu.a aVar = Nu.a.f22736c;
        return doOnEach(gVarG, gVar, aVar, aVar);
    }

    public final l<T> doOnNext(Lu.g<? super T> gVar) {
        Lu.g<? super Throwable> gVarG = Nu.a.g();
        Lu.a aVar = Nu.a.f22736c;
        return doOnEach(gVar, gVarG, aVar, aVar);
    }

    public final u<T> elementAt(long j10, T t10) {
        if (j10 >= 0) {
            Nu.b.e(t10, "defaultItem is null");
            return C13558a.p(new S(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> l<V> flatMapIterable(Lu.o<? super T, ? extends Iterable<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends V> cVar) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.e(cVar, "resultSelector is null");
        return (l<V>) flatMap(C5418o0.a(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final Ju.b forEach(Lu.g<? super T> gVar) {
        return subscribe(gVar);
    }

    public final Ju.b forEachWhile(Lu.q<? super T> qVar, Lu.g<? super Throwable> gVar, Lu.a aVar) {
        Nu.b.e(qVar, "onNext is null");
        Nu.b.e(gVar, "onError is null");
        Nu.b.e(aVar, "onComplete is null");
        Pu.m mVar = new Pu.m(qVar, gVar, aVar);
        subscribe(mVar);
        return mVar;
    }

    public final <K, V> l<AbstractC6412b<K, V>> groupBy(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final u<Boolean> isEmpty() {
        return all(Nu.a.b());
    }

    public final l<T> mergeWith(y<? extends T> yVar) {
        Nu.b.e(yVar, "other is null");
        return C13558a.o(new B0(this, yVar));
    }

    public final l<T> observeOn(t tVar, boolean z10, int i10) {
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new D0(this, tVar, z10, i10));
    }

    public final l<T> onErrorResumeNext(q<? extends T> qVar) {
        Nu.b.e(qVar, "next is null");
        return onErrorResumeNext(Nu.a.l(qVar));
    }

    public final <R> u<R> reduce(R r10, Lu.c<R, ? super T, R> cVar) {
        Nu.b.e(r10, "seed is null");
        Nu.b.e(cVar, "reducer is null");
        return C13558a.p(new N0(this, r10, cVar));
    }

    public final l<T> sample(long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new X0(this, j10, timeUnit, tVar, false));
    }

    public final <R> l<R> scan(R r10, Lu.c<R, ? super T, R> cVar) {
        Nu.b.e(r10, "initialValue is null");
        return scanWith(Nu.a.k(r10), cVar);
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
            return C13558a.o(this);
        }
        return concatArray(lVarFromArray, this);
    }

    public final Ju.b subscribe(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Nu.a.f22736c, Nu.a.g());
    }

    public final <E extends s<? super T>> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final l<T> take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    public final l<T> takeUntil(Lu.q<? super T> qVar) {
        Nu.b.e(qVar, "stopPredicate is null");
        return C13558a.o(new u1(this, qVar));
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

    public final l<C13890b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, C13889a.a());
    }

    public final l<C13890b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, C13889a.a());
    }

    public final <K, V> u<Map<K, V>> toMap(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2) {
        Nu.b.e(oVar, "keySelector is null");
        Nu.b.e(oVar2, "valueSelector is null");
        return (u<Map<K, V>>) collect(av.l.a(), Nu.a.E(oVar, oVar2));
    }

    public final l<l<T>> window(long j10, long j11, int i10) {
        Nu.b.g(j10, "count");
        Nu.b.g(j11, "skip");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new G1(this, j10, j11, i10));
    }

    public static <T> l<T> concat(q<? extends q<? extends T>> qVar, int i10) {
        Nu.b.e(qVar, "sources is null");
        Nu.b.f(i10, "prefetch");
        return C13558a.o(new C5430u(qVar, Nu.a.i(), i10, av.i.IMMEDIATE));
    }

    public static <T> l<T> concatDelayError(q<? extends q<? extends T>> qVar, int i10, boolean z10) {
        Nu.b.e(qVar, "sources is null");
        Nu.b.f(i10, "prefetch is null");
        return C13558a.o(new C5430u(qVar, Nu.a.i(), i10, z10 ? av.i.END : av.i.BOUNDARY));
    }

    public static <T> l<T> concatEager(Iterable<? extends q<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(Nu.a.i(), i10, i11, false);
    }

    public static <T> l<T> merge(q<? extends q<? extends T>> qVar) {
        Nu.b.e(qVar, "sources is null");
        return C13558a.o(new W(qVar, Nu.a.i(), false, a.e.API_PRIORITY_OTHER, bufferSize()));
    }

    public static <T> l<T> mergeDelayError(q<? extends q<? extends T>> qVar) {
        Nu.b.e(qVar, "sources is null");
        return C13558a.o(new W(qVar, Nu.a.i(), true, a.e.API_PRIORITY_OTHER, bufferSize()));
    }

    public static <T> l<T> switchOnNext(q<? extends q<? extends T>> qVar) {
        return switchOnNext(qVar, bufferSize());
    }

    private <U, V> l<T> timeout0(q<U> qVar, Lu.o<? super T, ? extends q<V>> oVar, q<? extends T> qVar2) {
        Nu.b.e(oVar, "itemTimeoutIndicator is null");
        return C13558a.o(new z1(this, qVar, oVar, qVar2));
    }

    public static <T, R> l<R> zip(q<? extends q<? extends T>> qVar, Lu.o<? super Object[], ? extends R> oVar) {
        Nu.b.e(oVar, "zipper is null");
        Nu.b.e(qVar, "sources is null");
        return C13558a.o(new C1(qVar, 16).flatMap(C5418o0.n(oVar)));
    }

    public final void blockingSubscribe(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar) {
        C5405k.b(this, gVar, gVar2, aVar);
    }

    public final l<T> debounce(long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new D(this, j10, timeUnit, tVar));
    }

    public final l<T> delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, C13889a.a(), z10);
    }

    public final l<T> delaySubscription(long j10, TimeUnit timeUnit, t tVar) {
        return delaySubscription(timer(j10, timeUnit, tVar));
    }

    public final l<T> distinctUntilChanged(Lu.d<? super T, ? super T> dVar) {
        Nu.b.e(dVar, "comparer is null");
        return C13558a.o(new K(this, Nu.a.i(), dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, boolean z10, int i10, int i11) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.f(i10, "maxConcurrency");
        Nu.b.f(i11, "bufferSize");
        if (this instanceof Ou.d) {
            Object objCall = ((Ou.d) this).call();
            if (objCall == null) {
                return empty();
            }
            return Z0.a(objCall, oVar);
        }
        return C13558a.o(new W(this, oVar, z10, i10, i11));
    }

    public final <K, V> l<AbstractC6412b<K, V>> groupBy(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, boolean z10) {
        return groupBy(oVar, oVar2, z10, bufferSize());
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, int i10) {
        Nu.b.e(oVar, "selector is null");
        Nu.b.f(i10, "bufferSize");
        return T0.k(C5418o0.h(this, i10), oVar);
    }

    public final l<T> retry(long j10) {
        return retry(j10, Nu.a.c());
    }

    public final l<T> skip(long j10, TimeUnit timeUnit, t tVar) {
        return skipUntil(timer(j10, timeUnit, tVar));
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, C13889a.d(), false, bufferSize());
    }

    public final l<T> startWith(T t10) {
        Nu.b.e(t10, "item is null");
        return concatArray(just(t10), this);
    }

    public final Ju.b subscribe(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar) {
        return subscribe(gVar, gVar2, aVar, Nu.a.g());
    }

    public final l<T> take(long j10, TimeUnit timeUnit, t tVar) {
        return takeUntil(timer(j10, timeUnit, tVar));
    }

    public final l<T> throttleLatest(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new x1(this, j10, timeUnit, tVar, z10));
    }

    public final l<C13890b<T>> timeInterval(TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new y1(this, timeUnit, tVar));
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit) {
        return timeout0(j10, timeUnit, null, C13889a.a());
    }

    public final l<C13890b<T>> timestamp(TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return (l<C13890b<T>>) map(Nu.a.u(timeUnit, tVar));
    }

    public final <U extends Collection<? super T>> u<U> toList(Callable<U> callable) {
        Nu.b.e(callable, "collectionSupplier is null");
        return C13558a.p(new D1(this, callable));
    }

    public final u<List<T>> toSortedList(Comparator<? super T> comparator, int i10) {
        Nu.b.e(comparator, "comparator is null");
        return (u<List<T>>) toList(i10).j(Nu.a.m(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> l<R> withLatestFrom(q<T1> qVar, q<T2> qVar2, Lu.h<? super T, ? super T1, ? super T2, R> hVar) {
        Nu.b.e(qVar, "o1 is null");
        Nu.b.e(qVar2, "o2 is null");
        Nu.b.e(hVar, "combiner is null");
        return withLatestFrom((q<?>[]) new q[]{qVar, qVar2}, Nu.a.w(hVar));
    }

    public final <U, R> l<R> zipWith(q<? extends U> qVar, Lu.c<? super T, ? super U, ? extends R> cVar) {
        Nu.b.e(qVar, "other is null");
        return zip(this, qVar, cVar);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Lu.b<S, e<T>> bVar) {
        Nu.b.e(bVar, "generator is null");
        return generate(callable, C5418o0.l(bVar), Nu.a.g());
    }

    public static l<Long> interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, C13889a.a());
    }

    public final T blockingFirst(T t10) throws InterruptedException {
        Pu.e eVar = new Pu.e();
        subscribe(eVar);
        T tA = eVar.a();
        return tA != null ? tA : t10;
    }

    public final T blockingLast(T t10) throws InterruptedException {
        Pu.f fVar = new Pu.f();
        subscribe(fVar);
        T tA = fVar.a();
        return tA != null ? tA : t10;
    }

    public final void blockingSubscribe(s<? super T> sVar) {
        C5405k.c(this, sVar);
    }

    public final l<T> concatWith(j<? extends T> jVar) {
        Nu.b.e(jVar, "other is null");
        return C13558a.o(new C5436x(this, jVar));
    }

    public final l<T> delay(long j10, TimeUnit timeUnit, t tVar) {
        return delay(j10, timeUnit, tVar, false);
    }

    public final <K, V> l<AbstractC6412b<K, V>> groupBy(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        Nu.b.e(oVar, "keySelector is null");
        Nu.b.e(oVar2, "valueSelector is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new C5403j0(this, oVar, oVar2, i10, z10));
    }

    public final l<T> mergeWith(j<? extends T> jVar) {
        Nu.b.e(jVar, "other is null");
        return C13558a.o(new A0(this, jVar));
    }

    public final l<T> retry(long j10, Lu.q<? super Throwable> qVar) {
        if (j10 >= 0) {
            Nu.b.e(qVar, "predicate is null");
            return C13558a.o(new V0(this, j10, qVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, C13889a.d(), z10, bufferSize());
    }

    public final Ju.b subscribe(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar, Lu.g<? super Ju.b> gVar3) {
        Nu.b.e(gVar, "onNext is null");
        Nu.b.e(gVar2, "onError is null");
        Nu.b.e(aVar, "onComplete is null");
        Nu.b.e(gVar3, "onSubscribe is null");
        Pu.q qVar = new Pu.q(gVar, gVar2, aVar, gVar3);
        subscribe(qVar);
        return qVar;
    }

    public final l<T> takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, C13889a.d(), false, bufferSize());
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit, q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return timeout0(j10, timeUnit, qVar, C13889a.a());
    }

    public final <K, V> u<Map<K, Collection<V>>> toMultimap(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2) {
        return toMultimap(oVar, oVar2, av.l.a(), av.b.e());
    }

    public static <T> l<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(tVar);
    }

    public static l<Long> interval(long j10, TimeUnit timeUnit, t tVar) {
        return interval(j10, j10, timeUnit, tVar);
    }

    public static <T> l<T> just(T t10, T t11, T t12) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        return fromArray(t10, t11, t12);
    }

    public static <T> l<T> merge(q<? extends q<? extends T>> qVar, int i10) {
        Nu.b.e(qVar, "sources is null");
        Nu.b.f(i10, "maxConcurrency");
        return C13558a.o(new W(qVar, Nu.a.i(), false, i10, bufferSize()));
    }

    public static <T> l<T> mergeDelayError(q<? extends q<? extends T>> qVar, int i10) {
        Nu.b.e(qVar, "sources is null");
        Nu.b.f(i10, "maxConcurrency");
        return C13558a.o(new W(qVar, Nu.a.i(), true, i10, bufferSize()));
    }

    public final l<T> delay(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new F(this, j10, timeUnit, tVar, z10));
    }

    public final l<T> doOnEach(Lu.g<? super k<T>> gVar) {
        Nu.b.e(gVar, "onNotification is null");
        return doOnEach(Nu.a.r(gVar), Nu.a.q(gVar), Nu.a.p(gVar), Nu.a.f22736c);
    }

    public final l<T> sample(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.o(new X0(this, j10, timeUnit, tVar, z10));
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, t tVar) {
        return skipLast(j10, timeUnit, tVar, false, bufferSize());
    }

    public final l<T> takeLast(long j10, long j11, TimeUnit timeUnit, t tVar) {
        return takeLast(j10, j11, timeUnit, tVar, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> u<Map<K, V>> toMap(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        Nu.b.e(oVar, "keySelector is null");
        Nu.b.e(oVar2, "valueSelector is null");
        Nu.b.e(callable, "mapSupplier is null");
        return (u<Map<K, V>>) collect(callable, Nu.a.E(oVar, oVar2));
    }

    public final u<List<T>> toSortedList(int i10) {
        return toSortedList(Nu.a.o(), i10);
    }

    public final <U, R> l<R> zipWith(q<? extends U> qVar, Lu.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return zip(this, qVar, cVar, z10);
    }

    public static <T, R> l<R> combineLatest(q<? extends T>[] qVarArr, Lu.o<? super Object[], ? extends R> oVar) {
        return combineLatest(qVarArr, oVar, bufferSize());
    }

    public static <T> l<T> concat(q<? extends T> qVar, q<? extends T> qVar2) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return concatArray(qVar, qVar2);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Lu.b<S, e<T>> bVar, Lu.g<? super S> gVar) {
        Nu.b.e(bVar, "generator is null");
        return generate(callable, C5418o0.l(bVar), gVar);
    }

    public final <U extends Collection<? super T>> l<U> buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    public final l<T> concatWith(d dVar) {
        Nu.b.e(dVar, "other is null");
        return C13558a.o(new C5434w(this, dVar));
    }

    public final l<T> mergeWith(d dVar) {
        Nu.b.e(dVar, "other is null");
        return C13558a.o(new C5441z0(this, dVar));
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return replay(oVar, i10, j10, timeUnit, C13889a.a());
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        return skipLast(j10, timeUnit, tVar, z10, bufferSize());
    }

    public final l<T> takeLast(long j10, long j11, TimeUnit timeUnit, t tVar, boolean z10, int i10) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.f(i10, "bufferSize");
        if (j10 >= 0) {
            return C13558a.o(new s1(this, j10, j11, timeUnit, tVar, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit, t tVar, q<? extends T> qVar) {
        Nu.b.e(qVar, "other is null");
        return timeout0(j10, timeUnit, qVar, tVar);
    }

    public final l<l<T>> window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, C13889a.a(), bufferSize());
    }

    public final <U, R> l<R> zipWith(q<? extends U> qVar, Lu.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return zip(this, qVar, cVar, z10, i10);
    }

    public static <T, R> l<R> combineLatest(q<? extends T>[] qVarArr, Lu.o<? super Object[], ? extends R> oVar, int i10) {
        Nu.b.e(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            return empty();
        }
        Nu.b.e(oVar, "combiner is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new C5428t(qVarArr, null, oVar, i10 << 1, false));
    }

    public static <T, R> l<R> combineLatestDelayError(Iterable<? extends q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> u<Boolean> sequenceEqual(q<? extends T> qVar, q<? extends T> qVar2, int i10) {
        return sequenceEqual(qVar, qVar2, Nu.b.d(), i10);
    }

    public final l<List<T>> buffer(long j10, long j11, TimeUnit timeUnit) {
        return (l<List<T>>) buffer(j10, j11, timeUnit, C13889a.a(), av.b.b());
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, int i10, long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(oVar, "selector is null");
        Nu.b.f(i10, "bufferSize");
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return T0.k(C5418o0.i(this, i10, j10, timeUnit, tVar), oVar);
    }

    public final l<T> retry(Lu.q<? super Throwable> qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final l<T> skipLast(long j10, TimeUnit timeUnit, t tVar, boolean z10, int i10) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new C5404j1(this, j10, timeUnit, tVar, i10 << 1, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> u<Map<K, Collection<V>>> toMultimap(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, Lu.o<? super K, ? extends Collection<? super V>> oVar3) {
        Nu.b.e(oVar, "keySelector is null");
        Nu.b.e(oVar2, "valueSelector is null");
        Nu.b.e(callable, "mapSupplier is null");
        Nu.b.e(oVar3, "collectionFactory is null");
        return (u<Map<K, Collection<V>>>) collect(callable, Nu.a.F(oVar, oVar2, oVar3));
    }

    public final l<l<T>> window(long j10, long j11, TimeUnit timeUnit, t tVar) {
        return window(j10, j11, timeUnit, tVar, bufferSize());
    }

    public static <T, R> l<R> combineLatestDelayError(Iterable<? extends q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar, int i10) {
        Nu.b.e(iterable, "sources is null");
        Nu.b.e(oVar, "combiner is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new C5428t(null, iterable, oVar, i10 << 1, true));
    }

    public static <T> l<T> fromFuture(Future<? extends T> future, t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return fromFuture(future).subscribeOn(tVar);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Lu.c<S, e<T>, S> cVar) {
        return generate(callable, cVar, Nu.a.g());
    }

    public static <T> l<T> merge(q<? extends T> qVar, q<? extends T> qVar2) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return fromArray(qVar, qVar2).flatMap(Nu.a.i(), false, 2);
    }

    public static <T> l<T> mergeDelayError(q<? extends T> qVar, q<? extends T> qVar2) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return fromArray(qVar, qVar2).flatMap(Nu.a.i(), true, 2);
    }

    public static <T1, T2, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, Lu.c<? super T1, ? super T2, ? extends R> cVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return zipArray(Nu.a.v(cVar), false, bufferSize(), qVar, qVar2);
    }

    public final l<List<T>> buffer(long j10, long j11, TimeUnit timeUnit, t tVar) {
        return (l<List<T>>) buffer(j10, j11, timeUnit, tVar, av.b.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> l<T> delay(q<U> qVar, Lu.o<? super T, ? extends q<V>> oVar) {
        return delaySubscription(qVar).delay(oVar);
    }

    public final <U> l<T> sample(q<U> qVar) {
        Nu.b.e(qVar, "sampler is null");
        return C13558a.o(new Y0(this, qVar, false));
    }

    public final l<T> timeout(long j10, TimeUnit timeUnit, t tVar) {
        return timeout0(j10, timeUnit, null, tVar);
    }

    public final l<l<T>> window(long j10, long j11, TimeUnit timeUnit, t tVar, int i10) {
        Nu.b.g(j10, "timespan");
        Nu.b.g(j11, "timeskip");
        Nu.b.f(i10, "bufferSize");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.e(timeUnit, "unit is null");
        return C13558a.o(new K1(this, j10, j11, timeUnit, tVar, Long.MAX_VALUE, i10, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, R> l<R> withLatestFrom(q<T1> qVar, q<T2> qVar2, q<T3> qVar3, Lu.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        Nu.b.e(qVar, "o1 is null");
        Nu.b.e(qVar2, "o2 is null");
        Nu.b.e(qVar3, "o3 is null");
        Nu.b.e(iVar, "combiner is null");
        return withLatestFrom((q<?>[]) new q[]{qVar, qVar2, qVar3}, Nu.a.x(iVar));
    }

    public static <T> l<T> concat(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        return concatArray(qVar, qVar2, qVar3);
    }

    public static <T, S> l<T> generate(Callable<S> callable, Lu.c<S, e<T>, S> cVar, Lu.g<? super S> gVar) {
        Nu.b.e(callable, "initialState is null");
        Nu.b.e(cVar, "generator is null");
        Nu.b.e(gVar, "disposeState is null");
        return C13558a.o(new C5400i0(callable, cVar, gVar));
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        return fromArray(t10, t11, t12, t13);
    }

    public final <U extends Collection<? super T>> l<U> buffer(long j10, long j11, TimeUnit timeUnit, t tVar, Callable<U> callable) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.e(callable, "bufferSupplier is null");
        return C13558a.o(new C5420p(this, j10, j11, timeUnit, tVar, callable, a.e.API_PRIORITY_OTHER, false));
    }

    public final <U, V> l<T> timeout(q<U> qVar, Lu.o<? super T, ? extends q<V>> oVar) {
        Nu.b.e(qVar, "firstTimeoutIndicator is null");
        return timeout0(qVar, oVar, null);
    }

    public final l<T> doOnEach(s<? super T> sVar) {
        Nu.b.e(sVar, "observer is null");
        return doOnEach(C5418o0.f(sVar), C5418o0.e(sVar), C5418o0.d(sVar), Nu.a.f22736c);
    }

    public final <U> l<T> sample(q<U> qVar, boolean z10) {
        Nu.b.e(qVar, "sampler is null");
        return C13558a.o(new Y0(this, qVar, z10));
    }

    @Override // io.reactivex.q
    public final void subscribe(s<? super T> sVar) {
        Nu.b.e(sVar, "observer is null");
        try {
            s<? super T> sVarY = C13558a.y(this, sVar);
            Nu.b.e(sVarY, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(sVarY);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static <T> l<T> merge(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        return fromArray(qVar, qVar2, qVar3).flatMap(Nu.a.i(), false, 3);
    }

    public static <T> l<T> mergeDelayError(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        return fromArray(qVar, qVar2, qVar3).flatMap(Nu.a.i(), true, 3);
    }

    public static <T1, T2, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, Lu.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return zipArray(Nu.a.v(cVar), z10, bufferSize(), qVar, qVar2);
    }

    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, Lu.o<? super Throwable, ? extends q<? extends R>> oVar2, Callable<? extends q<? extends R>> callable) {
        Nu.b.e(oVar, "onNextMapper is null");
        Nu.b.e(oVar2, "onErrorMapper is null");
        Nu.b.e(callable, "onCompleteSupplier is null");
        return merge(new C5437x0(this, oVar, oVar2, callable));
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, C13889a.d(), false, bufferSize());
    }

    public final <U, V> l<T> timeout(q<U> qVar, Lu.o<? super T, ? extends q<V>> oVar, q<? extends T> qVar2) {
        Nu.b.e(qVar, "firstTimeoutIndicator is null");
        Nu.b.e(qVar2, "other is null");
        return timeout0(qVar, oVar, qVar2);
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, C13889a.d(), z10, bufferSize());
    }

    public final <K, V> u<Map<K, Collection<V>>> toMultimap(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, av.b.e());
    }

    public static <T1, T2, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, Lu.c<? super T1, ? super T2, ? extends R> cVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return combineLatest(Nu.a.v(cVar), bufferSize(), qVar, qVar2);
    }

    public static <T> l<T> concat(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3, q<? extends T> qVar4) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        return concatArray(qVar, qVar2, qVar3, qVar4);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, C13889a.a(), a.e.API_PRIORITY_OTHER);
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, int i10, t tVar) {
        Nu.b.e(oVar, "selector is null");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.f(i10, "bufferSize");
        return T0.k(C5418o0.h(this, i10), C5418o0.k(oVar, tVar));
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, t tVar) {
        return takeLast(j10, timeUnit, tVar, false, bufferSize());
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        Nu.b.e(t14, "item5 is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    public static <T1, T2, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, Lu.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        return zipArray(Nu.a.v(cVar), z10, i10, qVar, qVar2);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, C13889a.a(), i10);
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, t tVar, boolean z10) {
        return takeLast(j10, timeUnit, tVar, z10, bufferSize());
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, C13889a.a(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, T4, R> l<R> withLatestFrom(q<T1> qVar, q<T2> qVar2, q<T3> qVar3, q<T4> qVar4, Lu.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        Nu.b.e(qVar, "o1 is null");
        Nu.b.e(qVar2, "o2 is null");
        Nu.b.e(qVar3, "o3 is null");
        Nu.b.e(qVar4, "o4 is null");
        Nu.b.e(jVar, "combiner is null");
        return withLatestFrom((q<?>[]) new q[]{qVar, qVar2, qVar3, qVar4}, Nu.a.y(jVar));
    }

    public static <T> l<T> merge(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3, q<? extends T> qVar4) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        return fromArray(qVar, qVar2, qVar3, qVar4).flatMap(Nu.a.i(), false, 4);
    }

    public static <T> l<T> mergeDelayError(q<? extends T> qVar, q<? extends T> qVar2, q<? extends T> qVar3, q<? extends T> qVar4) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        return fromArray(qVar, qVar2, qVar3, qVar4).flatMap(Nu.a.i(), true, 4);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit, t tVar, int i10) {
        return (l<List<T>>) buffer(j10, timeUnit, tVar, i10, av.b.b(), false);
    }

    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, Lu.o<Throwable, ? extends q<? extends R>> oVar2, Callable<? extends q<? extends R>> callable, int i10) {
        Nu.b.e(oVar, "onNextMapper is null");
        Nu.b.e(oVar2, "onErrorMapper is null");
        Nu.b.e(callable, "onCompleteSupplier is null");
        return merge(new C5437x0(this, oVar, oVar2, callable), i10);
    }

    public final l<T> takeLast(long j10, TimeUnit timeUnit, t tVar, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, tVar, z10, i10);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, C13889a.a(), j11, false);
    }

    public static <T1, T2, T3, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, Lu.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        return combineLatest(Nu.a.w(hVar), bufferSize(), qVar, qVar2, qVar3);
    }

    public final <U extends Collection<? super T>> l<U> buffer(long j10, TimeUnit timeUnit, t tVar, int i10, Callable<U> callable, boolean z10) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.e(callable, "bufferSupplier is null");
        Nu.b.f(i10, "count");
        return C13558a.o(new C5420p(this, j10, j10, timeUnit, tVar, callable, i10, z10));
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, C13889a.a(), j11, z10);
    }

    public static <T1, T2, T3, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, Lu.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        return zipArray(Nu.a.w(hVar), false, bufferSize(), qVar, qVar2, qVar3);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar) {
        return window(j10, timeUnit, tVar, Long.MAX_VALUE, false);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar, long j11) {
        return window(j10, timeUnit, tVar, j11, false);
    }

    public final <R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends R>> oVar, int i10) {
        return flatMap((Lu.o) oVar, false, i10, bufferSize());
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, long j10, TimeUnit timeUnit) {
        return replay(oVar, j10, timeUnit, C13889a.a());
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar, long j11, boolean z10) {
        return window(j10, timeUnit, tVar, j11, z10, bufferSize());
    }

    public static <T1, T2, T3, T4, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, Lu.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        return combineLatest(Nu.a.x(iVar), bufferSize(), qVar, qVar2, qVar3, qVar4);
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        Nu.b.e(t14, "item5 is null");
        Nu.b.e(t15, "item6 is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    public final <U, R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends R> cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(oVar, "selector is null");
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return T0.k(C5418o0.j(this, j10, timeUnit, tVar), oVar);
    }

    public final l<l<T>> window(long j10, TimeUnit timeUnit, t tVar, long j11, boolean z10, int i10) {
        Nu.b.f(i10, "bufferSize");
        Nu.b.e(tVar, "scheduler is null");
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.g(j11, "count");
        return C13558a.o(new K1(this, j10, j10, timeUnit, tVar, j11, i10, z10));
    }

    public static <T1, T2, T3, T4, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, Lu.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        return zipArray(Nu.a.x(iVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4);
    }

    public final l<List<T>> buffer(long j10, TimeUnit timeUnit, t tVar) {
        return (l<List<T>>) buffer(j10, timeUnit, tVar, a.e.API_PRIORITY_OTHER, av.b.b(), false);
    }

    public final <U, R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return flatMap(oVar, cVar, z10, bufferSize(), bufferSize());
    }

    public final <R> l<R> withLatestFrom(q<?>[] qVarArr, Lu.o<? super Object[], R> oVar) {
        Nu.b.e(qVarArr, "others is null");
        Nu.b.e(oVar, "combiner is null");
        return C13558a.o(new M1(this, qVarArr, oVar));
    }

    public final <TOpening, TClosing> l<List<T>> buffer(q<? extends TOpening> qVar, Lu.o<? super TOpening, ? extends q<? extends TClosing>> oVar) {
        return (l<List<T>>) buffer(qVar, oVar, av.b.b());
    }

    public final <U, R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return flatMap(oVar, cVar, z10, i10, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> l<U> buffer(q<? extends TOpening> qVar, Lu.o<? super TOpening, ? extends q<? extends TClosing>> oVar, Callable<U> callable) {
        Nu.b.e(qVar, "openingIndicator is null");
        Nu.b.e(oVar, "closingIndicator is null");
        Nu.b.e(callable, "bufferSupplier is null");
        return C13558a.o(new C5411m(this, qVar, oVar, callable));
    }

    public final <U, R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        Nu.b.e(oVar, "mapper is null");
        Nu.b.e(cVar, "combiner is null");
        return flatMap(C5418o0.b(oVar, cVar), z10, i10, i11);
    }

    public final <R> l<R> replay(Lu.o<? super l<T>, ? extends q<R>> oVar, t tVar) {
        Nu.b.e(oVar, "selector is null");
        Nu.b.e(tVar, "scheduler is null");
        return T0.k(C5418o0.g(this), C5418o0.k(oVar, tVar));
    }

    public final <R> l<R> withLatestFrom(Iterable<? extends q<?>> iterable, Lu.o<? super Object[], R> oVar) {
        Nu.b.e(iterable, "others is null");
        Nu.b.e(oVar, "combiner is null");
        return C13558a.o(new M1(this, iterable, oVar));
    }

    public static <T1, T2, T3, T4, T5, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, Lu.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        return combineLatest(Nu.a.y(jVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5);
    }

    public final <B> l<l<T>> window(q<B> qVar) {
        return window(qVar, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, Lu.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        return zipArray(Nu.a.y(jVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5);
    }

    public final <U, R> l<R> flatMap(Lu.o<? super T, ? extends q<? extends U>> oVar, Lu.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return flatMap(oVar, cVar, false, i10, bufferSize());
    }

    public final <B> l<l<T>> window(q<B> qVar, int i10) {
        Nu.b.e(qVar, "boundary is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new H1(this, qVar, i10));
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        Nu.b.e(t14, "item5 is null");
        Nu.b.e(t15, "item6 is null");
        Nu.b.e(t16, "item7 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    public final <B> l<List<T>> buffer(q<B> qVar) {
        return (l<List<T>>) buffer(qVar, av.b.b());
    }

    public final <B> l<List<T>> buffer(q<B> qVar, int i10) {
        Nu.b.f(i10, "initialCapacity");
        return (l<List<T>>) buffer(qVar, Nu.a.e(i10));
    }

    public final AbstractC6411a<T> replay(int i10) {
        Nu.b.f(i10, "bufferSize");
        return T0.f(this, i10);
    }

    public final <U, V> l<l<T>> window(q<U> qVar, Lu.o<? super U, ? extends q<V>> oVar) {
        return window(qVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<? super T>> l<U> buffer(q<B> qVar, Callable<U> callable) {
        Nu.b.e(qVar, "boundary is null");
        Nu.b.e(callable, "bufferSupplier is null");
        return C13558a.o(new C5417o(this, qVar, callable));
    }

    public final <U, V> l<l<T>> window(q<U> qVar, Lu.o<? super U, ? extends q<V>> oVar, int i10) {
        Nu.b.e(qVar, "openingIndicator is null");
        Nu.b.e(oVar, "closingIndicator is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new I1(this, qVar, oVar, i10));
    }

    public static <T1, T2, T3, T4, T5, T6, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, Lu.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        return combineLatest(Nu.a.z(kVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6);
    }

    public final AbstractC6411a<T> replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, C13889a.a());
    }

    public static <T1, T2, T3, T4, T5, T6, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, Lu.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        return zipArray(Nu.a.z(kVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6);
    }

    public final AbstractC6411a<T> replay(int i10, long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.f(i10, "bufferSize");
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return T0.h(this, j10, timeUnit, tVar, i10);
    }

    public final <B> l<List<T>> buffer(Callable<? extends q<B>> callable) {
        return (l<List<T>>) buffer(callable, av.b.b());
    }

    public final <B, U extends Collection<? super T>> l<U> buffer(Callable<? extends q<B>> callable, Callable<U> callable2) {
        Nu.b.e(callable, "boundarySupplier is null");
        Nu.b.e(callable2, "bufferSupplier is null");
        return C13558a.o(new C5414n(this, callable, callable2));
    }

    public final <B> l<l<T>> window(Callable<? extends q<B>> callable) {
        return window(callable, bufferSize());
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        Nu.b.e(t14, "item5 is null");
        Nu.b.e(t15, "item6 is null");
        Nu.b.e(t16, "item7 is null");
        Nu.b.e(t17, "item8 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    public final <B> l<l<T>> window(Callable<? extends q<B>> callable, int i10) {
        Nu.b.e(callable, "boundary is null");
        Nu.b.f(i10, "bufferSize");
        return C13558a.o(new J1(this, callable, i10));
    }

    public final AbstractC6411a<T> replay(int i10, t tVar) {
        Nu.b.f(i10, "bufferSize");
        return T0.l(replay(i10), tVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, Lu.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        Nu.b.e(qVar7, "source7 is null");
        return combineLatest(Nu.a.A(lVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7);
    }

    public final AbstractC6411a<T> replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, C13889a.a());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, Lu.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        Nu.b.e(qVar7, "source7 is null");
        return zipArray(Nu.a.A(lVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7);
    }

    public final AbstractC6411a<T> replay(long j10, TimeUnit timeUnit, t tVar) {
        Nu.b.e(timeUnit, "unit is null");
        Nu.b.e(tVar, "scheduler is null");
        return T0.g(this, j10, timeUnit, tVar);
    }

    public final AbstractC6411a<T> replay(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return T0.l(replay(), tVar);
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        Nu.b.e(t14, "item5 is null");
        Nu.b.e(t15, "item6 is null");
        Nu.b.e(t16, "item7 is null");
        Nu.b.e(t17, "item8 is null");
        Nu.b.e(t18, "item9 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, Lu.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        Nu.b.e(qVar7, "source7 is null");
        Nu.b.e(qVar8, "source8 is null");
        return combineLatest(Nu.a.B(mVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, Lu.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        Nu.b.e(qVar7, "source7 is null");
        Nu.b.e(qVar8, "source8 is null");
        return zipArray(Nu.a.B(mVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8);
    }

    public static <T> l<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        Nu.b.e(t10, "item1 is null");
        Nu.b.e(t11, "item2 is null");
        Nu.b.e(t12, "item3 is null");
        Nu.b.e(t13, "item4 is null");
        Nu.b.e(t14, "item5 is null");
        Nu.b.e(t15, "item6 is null");
        Nu.b.e(t16, "item7 is null");
        Nu.b.e(t17, "item8 is null");
        Nu.b.e(t18, "item9 is null");
        Nu.b.e(t19, "item10 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> combineLatest(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, q<? extends T9> qVar9, Lu.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        Nu.b.e(qVar7, "source7 is null");
        Nu.b.e(qVar8, "source8 is null");
        Nu.b.e(qVar9, "source9 is null");
        return combineLatest(Nu.a.C(nVar), bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> zip(q<? extends T1> qVar, q<? extends T2> qVar2, q<? extends T3> qVar3, q<? extends T4> qVar4, q<? extends T5> qVar5, q<? extends T6> qVar6, q<? extends T7> qVar7, q<? extends T8> qVar8, q<? extends T9> qVar9, Lu.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        Nu.b.e(qVar, "source1 is null");
        Nu.b.e(qVar2, "source2 is null");
        Nu.b.e(qVar3, "source3 is null");
        Nu.b.e(qVar4, "source4 is null");
        Nu.b.e(qVar5, "source5 is null");
        Nu.b.e(qVar6, "source6 is null");
        Nu.b.e(qVar7, "source7 is null");
        Nu.b.e(qVar8, "source8 is null");
        Nu.b.e(qVar9, "source9 is null");
        return zipArray(Nu.a.C(nVar), false, bufferSize(), qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9);
    }
}
