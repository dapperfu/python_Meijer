package Ru;

import Pu.e;
import Pu.g;
import Pu.h;
import Pu.i;
import Pu.j;
import gv.C14313a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.k;
import iv.C14765b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import pw.c;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final Pu.o<Object, Object> f33000a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f33001b = new q();

    /* renamed from: c, reason: collision with root package name */
    public static final Pu.a f33002c = new n();

    /* renamed from: d, reason: collision with root package name */
    static final g<Object> f33003d = new o();

    /* renamed from: e, reason: collision with root package name */
    public static final g<Throwable> f33004e = new s();

    /* renamed from: f, reason: collision with root package name */
    public static final g<Throwable> f33005f = new F();

    /* renamed from: g, reason: collision with root package name */
    public static final Pu.p f33006g = new p();

    /* renamed from: h, reason: collision with root package name */
    static final Pu.q<Object> f33007h = new K();

    /* renamed from: i, reason: collision with root package name */
    static final Pu.q<Object> f33008i = new t();

    /* renamed from: j, reason: collision with root package name */
    static final Callable<Object> f33009j = new E();

    /* renamed from: k, reason: collision with root package name */
    static final Comparator<Object> f33010k = new A();

    /* renamed from: l, reason: collision with root package name */
    public static final g<c> f33011l = new y();

    static final class A implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }

        A() {
        }
    }

    static final class B<T> implements Pu.a {

        /* renamed from: a, reason: collision with root package name */
        final g<? super k<T>> f33012a;

        @Override // Pu.a
        public void run() throws Exception {
            this.f33012a.accept(k.a());
        }

        B(g<? super k<T>> gVar) {
            this.f33012a = gVar;
        }
    }

    static final class C<T> implements g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final g<? super k<T>> f33013a;

        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f33013a.accept(k.b(th2));
        }

        C(g<? super k<T>> gVar) {
            this.f33013a = gVar;
        }
    }

    static final class D<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        final g<? super k<T>> f33014a;

        @Override // Pu.g
        public void accept(T t10) throws Exception {
            this.f33014a.accept(k.c(t10));
        }

        D(g<? super k<T>> gVar) {
            this.f33014a = gVar;
        }
    }

    static final class F implements g<Throwable> {
        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            C14313a.s(new OnErrorNotImplementedException(th2));
        }

        F() {
        }
    }

    static final class G<T> implements Pu.o<T, C14765b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final TimeUnit f33015a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.t f33016b;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C14765b<T> apply(T t10) throws Exception {
            return new C14765b<>(t10, this.f33016b.c(this.f33015a), this.f33015a);
        }

        G(TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f33015a = timeUnit;
            this.f33016b = tVar;
        }
    }

    static final class H<K, T> implements Pu.b<Map<K, T>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.o<? super T, ? extends K> f33017a;

        @Override // Pu.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f33017a.apply(t10), t10);
        }

        H(Pu.o<? super T, ? extends K> oVar) {
            this.f33017a = oVar;
        }
    }

    static final class I<K, V, T> implements Pu.b<Map<K, V>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.o<? super T, ? extends V> f33018a;

        /* renamed from: b, reason: collision with root package name */
        private final Pu.o<? super T, ? extends K> f33019b;

        @Override // Pu.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f33019b.apply(t10), this.f33018a.apply(t10));
        }

        I(Pu.o<? super T, ? extends V> oVar, Pu.o<? super T, ? extends K> oVar2) {
            this.f33018a = oVar;
            this.f33019b = oVar2;
        }
    }

    static final class J<K, V, T> implements Pu.b<Map<K, Collection<V>>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final Pu.o<? super K, ? extends Collection<? super V>> f33020a;

        /* renamed from: b, reason: collision with root package name */
        private final Pu.o<? super T, ? extends V> f33021b;

        /* renamed from: c, reason: collision with root package name */
        private final Pu.o<? super T, ? extends K> f33022c;

        @Override // Pu.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f33022c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f33020a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f33021b.apply(t10));
        }

        J(Pu.o<? super K, ? extends Collection<? super V>> oVar, Pu.o<? super T, ? extends V> oVar2, Pu.o<? super T, ? extends K> oVar3) {
            this.f33020a = oVar;
            this.f33021b = oVar2;
            this.f33022c = oVar3;
        }
    }

    /* renamed from: Ru.a$a, reason: collision with other inner class name */
    static final class C0738a<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        final Pu.a f33023a;

        @Override // Pu.g
        public void accept(T t10) throws Exception {
            this.f33023a.run();
        }

        C0738a(Pu.a aVar) {
            this.f33023a = aVar;
        }
    }

    /* renamed from: Ru.a$j, reason: case insensitive filesystem */
    static final class CallableC5218j<T> implements Callable<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final int f33027a;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f33027a);
        }

        CallableC5218j(int i10) {
            this.f33027a = i10;
        }
    }

    static final class l<T, U> implements Pu.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f33028a;

        @Override // Pu.o
        public U apply(T t10) throws Exception {
            return this.f33028a.cast(t10);
        }

        l(Class<U> cls) {
            this.f33028a = cls;
        }
    }

    static final class m<T, U> implements Pu.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f33029a;

        @Override // Pu.q
        public boolean test(T t10) throws Exception {
            return this.f33029a.isInstance(t10);
        }

        m(Class<U> cls) {
            this.f33029a = cls;
        }
    }

    static final class n implements Pu.a {
        @Override // Pu.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }

        n() {
        }
    }

    static final class o implements g<Object> {
        @Override // Pu.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        o() {
        }
    }

    static final class q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        q() {
        }
    }

    static final class r<T> implements Pu.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final T f33030a;

        @Override // Pu.q
        public boolean test(T t10) throws Exception {
            return b.c(t10, this.f33030a);
        }

        r(T t10) {
            this.f33030a = t10;
        }
    }

    enum u implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    static final class v implements Pu.o<Object, Object> {
        @Override // Pu.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }

        v() {
        }
    }

    static final class w<T, U> implements Callable<U>, Pu.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final U f33033a;

        @Override // Pu.o
        public U apply(T t10) throws Exception {
            return this.f33033a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f33033a;
        }

        w(U u10) {
            this.f33033a = u10;
        }
    }

    static final class x<T> implements Pu.o<List<T>, List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Comparator<? super T> f33034a;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f33034a);
            return list;
        }

        x(Comparator<? super T> comparator) {
            this.f33034a = comparator;
        }
    }

    enum z implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class E implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }

        E() {
        }
    }

    static final class K implements Pu.q<Object> {
        @Override // Pu.q
        public boolean test(Object obj) {
            return true;
        }

        K() {
        }
    }

    /* renamed from: Ru.a$b, reason: case insensitive filesystem */
    static final class C5210b<T1, T2, R> implements Pu.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final Pu.c<? super T1, ? super T2, ? extends R> f33024a;

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f33024a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }

        C5210b(Pu.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f33024a = cVar;
        }
    }

    /* renamed from: Ru.a$c, reason: case insensitive filesystem */
    static final class C5211c<T1, T2, T3, R> implements Pu.o<Object[], R> {
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            throw null;
        }

        C5211c(h<T1, T2, T3, R> hVar) {
        }
    }

    /* renamed from: Ru.a$d, reason: case insensitive filesystem */
    static final class C5212d<T1, T2, T3, T4, R> implements Pu.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final i<T1, T2, T3, T4, R> f33025a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return (R) this.f33025a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }

        C5212d(i<T1, T2, T3, T4, R> iVar) {
            this.f33025a = iVar;
        }
    }

    /* renamed from: Ru.a$e, reason: case insensitive filesystem */
    static final class C5213e<T1, T2, T3, T4, T5, R> implements Pu.o<Object[], R> {
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            throw null;
        }

        C5213e(j<T1, T2, T3, T4, T5, R> jVar) {
        }
    }

    /* renamed from: Ru.a$f, reason: case insensitive filesystem */
    static final class C5214f<T1, T2, T3, T4, T5, T6, R> implements Pu.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final Pu.k<T1, T2, T3, T4, T5, T6, R> f33026a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return (R) this.f33026a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }

        C5214f(Pu.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f33026a = kVar;
        }
    }

    /* renamed from: Ru.a$g, reason: case insensitive filesystem */
    static final class C5215g<T1, T2, T3, T4, T5, T6, T7, R> implements Pu.o<Object[], R> {
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            Object obj7 = objArr[6];
            throw null;
        }

        C5215g(Pu.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        }
    }

    /* renamed from: Ru.a$h, reason: case insensitive filesystem */
    static final class C5216h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Pu.o<Object[], R> {
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            Object obj7 = objArr[6];
            Object obj8 = objArr[7];
            throw null;
        }

        C5216h(Pu.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        }
    }

    /* renamed from: Ru.a$i, reason: case insensitive filesystem */
    static final class C5217i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Pu.o<Object[], R> {
        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            Object obj7 = objArr[6];
            Object obj8 = objArr[7];
            Object obj9 = objArr[8];
            throw null;
        }

        C5217i(Pu.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        }
    }

    /* renamed from: Ru.a$k, reason: case insensitive filesystem */
    static final class C5219k<T> implements Pu.q<T> {
        @Override // Pu.q
        public boolean test(T t10) throws Exception {
            throw null;
        }

        C5219k(e eVar) {
        }
    }

    static final class p implements Pu.p {
        p() {
        }
    }

    static final class s implements g<Throwable> {
        s() {
        }

        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            C14313a.s(th2);
        }
    }

    static final class t implements Pu.q<Object> {
        @Override // Pu.q
        public boolean test(Object obj) {
            return false;
        }

        t() {
        }
    }

    static final class y implements g<c> {
        y() {
        }

        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(c cVar) throws Exception {
            cVar.t(Long.MAX_VALUE);
        }
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Pu.o<Object[], R> A(Pu.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        b.e(lVar, "f is null");
        return new C5215g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Pu.o<Object[], R> B(Pu.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        b.e(mVar, "f is null");
        return new C5216h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Pu.o<Object[], R> C(Pu.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        b.e(nVar, "f is null");
        return new C5217i(nVar);
    }

    public static <T, K> Pu.b<Map<K, T>, T> D(Pu.o<? super T, ? extends K> oVar) {
        return new H(oVar);
    }

    public static <T, K, V> Pu.b<Map<K, V>, T> E(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2) {
        return new I(oVar2, oVar);
    }

    public static <T, K, V> Pu.b<Map<K, Collection<V>>, T> F(Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, Pu.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new J(oVar3, oVar2, oVar);
    }

    public static <T> g<T> a(Pu.a aVar) {
        return new C0738a(aVar);
    }

    public static <T> Pu.q<T> b() {
        return (Pu.q<T>) f33008i;
    }

    public static <T> Pu.q<T> c() {
        return (Pu.q<T>) f33007h;
    }

    public static <T, U> Pu.o<T, U> d(Class<U> cls) {
        return new l(cls);
    }

    public static <T> Callable<List<T>> e(int i10) {
        return new CallableC5218j(i10);
    }

    public static <T> Callable<Set<T>> f() {
        return u.INSTANCE;
    }

    public static <T> g<T> g() {
        return (g<T>) f33003d;
    }

    public static <T> Pu.q<T> h(T t10) {
        return new r(t10);
    }

    public static <T> Pu.o<T, T> i() {
        return (Pu.o<T, T>) f33000a;
    }

    public static <T, U> Pu.q<T> j(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<T> k(T t10) {
        return new w(t10);
    }

    public static <T, U> Pu.o<T, U> l(U u10) {
        return new w(u10);
    }

    public static <T> Pu.o<List<T>, List<T>> m(Comparator<? super T> comparator) {
        return new x(comparator);
    }

    public static <T> Comparator<T> n() {
        return z.INSTANCE;
    }

    public static <T> Comparator<T> o() {
        return (Comparator<T>) f33010k;
    }

    public static <T> Pu.a p(g<? super k<T>> gVar) {
        return new B(gVar);
    }

    public static <T> g<Throwable> q(g<? super k<T>> gVar) {
        return new C(gVar);
    }

    public static <T> g<T> r(g<? super k<T>> gVar) {
        return new D(gVar);
    }

    public static <T> Callable<T> s() {
        return (Callable<T>) f33009j;
    }

    public static <T> Pu.q<T> t(e eVar) {
        return new C5219k(eVar);
    }

    public static <T> Pu.o<T, C14765b<T>> u(TimeUnit timeUnit, io.reactivex.t tVar) {
        return new G(timeUnit, tVar);
    }

    public static <T1, T2, R> Pu.o<Object[], R> v(Pu.c<? super T1, ? super T2, ? extends R> cVar) {
        b.e(cVar, "f is null");
        return new C5210b(cVar);
    }

    public static <T1, T2, T3, R> Pu.o<Object[], R> w(h<T1, T2, T3, R> hVar) {
        b.e(hVar, "f is null");
        return new C5211c(hVar);
    }

    public static <T1, T2, T3, T4, R> Pu.o<Object[], R> x(i<T1, T2, T3, T4, R> iVar) {
        b.e(iVar, "f is null");
        return new C5212d(iVar);
    }

    public static <T1, T2, T3, T4, T5, R> Pu.o<Object[], R> y(j<T1, T2, T3, T4, T5, R> jVar) {
        b.e(jVar, "f is null");
        return new C5213e(jVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Pu.o<Object[], R> z(Pu.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        b.e(kVar, "f is null");
        return new C5214f(kVar);
    }
}
