package Nu;

import Lu.e;
import Lu.g;
import Lu.h;
import Lu.i;
import Lu.j;
import cv.C13558a;
import ev.C13890b;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.k;
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
import lw.c;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final Lu.o<Object, Object> f22734a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f22735b = new q();

    /* renamed from: c, reason: collision with root package name */
    public static final Lu.a f22736c = new n();

    /* renamed from: d, reason: collision with root package name */
    static final g<Object> f22737d = new o();

    /* renamed from: e, reason: collision with root package name */
    public static final g<Throwable> f22738e = new s();

    /* renamed from: f, reason: collision with root package name */
    public static final g<Throwable> f22739f = new F();

    /* renamed from: g, reason: collision with root package name */
    public static final Lu.p f22740g = new p();

    /* renamed from: h, reason: collision with root package name */
    static final Lu.q<Object> f22741h = new K();

    /* renamed from: i, reason: collision with root package name */
    static final Lu.q<Object> f22742i = new t();

    /* renamed from: j, reason: collision with root package name */
    static final Callable<Object> f22743j = new E();

    /* renamed from: k, reason: collision with root package name */
    static final Comparator<Object> f22744k = new A();

    /* renamed from: l, reason: collision with root package name */
    public static final g<c> f22745l = new y();

    static final class A implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }

        A() {
        }
    }

    static final class B<T> implements Lu.a {

        /* renamed from: a, reason: collision with root package name */
        final g<? super k<T>> f22746a;

        @Override // Lu.a
        public void run() throws Exception {
            this.f22746a.accept(k.a());
        }

        B(g<? super k<T>> gVar) {
            this.f22746a = gVar;
        }
    }

    static final class C<T> implements g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final g<? super k<T>> f22747a;

        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f22747a.accept(k.b(th2));
        }

        C(g<? super k<T>> gVar) {
            this.f22747a = gVar;
        }
    }

    static final class D<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        final g<? super k<T>> f22748a;

        @Override // Lu.g
        public void accept(T t10) throws Exception {
            this.f22748a.accept(k.c(t10));
        }

        D(g<? super k<T>> gVar) {
            this.f22748a = gVar;
        }
    }

    static final class F implements g<Throwable> {
        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            C13558a.s(new OnErrorNotImplementedException(th2));
        }

        F() {
        }
    }

    static final class G<T> implements Lu.o<T, C13890b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final TimeUnit f22749a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.t f22750b;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C13890b<T> apply(T t10) throws Exception {
            return new C13890b<>(t10, this.f22750b.c(this.f22749a), this.f22749a);
        }

        G(TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f22749a = timeUnit;
            this.f22750b = tVar;
        }
    }

    static final class H<K, T> implements Lu.b<Map<K, T>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.o<? super T, ? extends K> f22751a;

        @Override // Lu.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f22751a.apply(t10), t10);
        }

        H(Lu.o<? super T, ? extends K> oVar) {
            this.f22751a = oVar;
        }
    }

    static final class I<K, V, T> implements Lu.b<Map<K, V>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.o<? super T, ? extends V> f22752a;

        /* renamed from: b, reason: collision with root package name */
        private final Lu.o<? super T, ? extends K> f22753b;

        @Override // Lu.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f22753b.apply(t10), this.f22752a.apply(t10));
        }

        I(Lu.o<? super T, ? extends V> oVar, Lu.o<? super T, ? extends K> oVar2) {
            this.f22752a = oVar;
            this.f22753b = oVar2;
        }
    }

    static final class J<K, V, T> implements Lu.b<Map<K, Collection<V>>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final Lu.o<? super K, ? extends Collection<? super V>> f22754a;

        /* renamed from: b, reason: collision with root package name */
        private final Lu.o<? super T, ? extends V> f22755b;

        /* renamed from: c, reason: collision with root package name */
        private final Lu.o<? super T, ? extends K> f22756c;

        @Override // Lu.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f22756c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f22754a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f22755b.apply(t10));
        }

        J(Lu.o<? super K, ? extends Collection<? super V>> oVar, Lu.o<? super T, ? extends V> oVar2, Lu.o<? super T, ? extends K> oVar3) {
            this.f22754a = oVar;
            this.f22755b = oVar2;
            this.f22756c = oVar3;
        }
    }

    /* renamed from: Nu.a$a, reason: collision with other inner class name */
    static final class C0376a<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        final Lu.a f22757a;

        @Override // Lu.g
        public void accept(T t10) throws Exception {
            this.f22757a.run();
        }

        C0376a(Lu.a aVar) {
            this.f22757a = aVar;
        }
    }

    /* renamed from: Nu.a$j, reason: case insensitive filesystem */
    static final class CallableC4326j<T> implements Callable<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final int f22761a;

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f22761a);
        }

        CallableC4326j(int i10) {
            this.f22761a = i10;
        }
    }

    static final class l<T, U> implements Lu.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f22762a;

        @Override // Lu.o
        public U apply(T t10) throws Exception {
            return this.f22762a.cast(t10);
        }

        l(Class<U> cls) {
            this.f22762a = cls;
        }
    }

    static final class m<T, U> implements Lu.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f22763a;

        @Override // Lu.q
        public boolean test(T t10) throws Exception {
            return this.f22763a.isInstance(t10);
        }

        m(Class<U> cls) {
            this.f22763a = cls;
        }
    }

    static final class n implements Lu.a {
        @Override // Lu.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }

        n() {
        }
    }

    static final class o implements g<Object> {
        @Override // Lu.g
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

    static final class r<T> implements Lu.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final T f22764a;

        @Override // Lu.q
        public boolean test(T t10) throws Exception {
            return b.c(t10, this.f22764a);
        }

        r(T t10) {
            this.f22764a = t10;
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

    static final class v implements Lu.o<Object, Object> {
        @Override // Lu.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }

        v() {
        }
    }

    static final class w<T, U> implements Callable<U>, Lu.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final U f22767a;

        @Override // Lu.o
        public U apply(T t10) throws Exception {
            return this.f22767a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f22767a;
        }

        w(U u10) {
            this.f22767a = u10;
        }
    }

    static final class x<T> implements Lu.o<List<T>, List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Comparator<? super T> f22768a;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f22768a);
            return list;
        }

        x(Comparator<? super T> comparator) {
            this.f22768a = comparator;
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

    static final class K implements Lu.q<Object> {
        @Override // Lu.q
        public boolean test(Object obj) {
            return true;
        }

        K() {
        }
    }

    /* renamed from: Nu.a$b, reason: case insensitive filesystem */
    static final class C4318b<T1, T2, R> implements Lu.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final Lu.c<? super T1, ? super T2, ? extends R> f22758a;

        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f22758a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }

        C4318b(Lu.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f22758a = cVar;
        }
    }

    /* renamed from: Nu.a$c, reason: case insensitive filesystem */
    static final class C4319c<T1, T2, T3, R> implements Lu.o<Object[], R> {
        @Override // Lu.o
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

        C4319c(h<T1, T2, T3, R> hVar) {
        }
    }

    /* renamed from: Nu.a$d, reason: case insensitive filesystem */
    static final class C4320d<T1, T2, T3, T4, R> implements Lu.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final i<T1, T2, T3, T4, R> f22759a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return (R) this.f22759a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }

        C4320d(i<T1, T2, T3, T4, R> iVar) {
            this.f22759a = iVar;
        }
    }

    /* renamed from: Nu.a$e, reason: case insensitive filesystem */
    static final class C4321e<T1, T2, T3, T4, T5, R> implements Lu.o<Object[], R> {
        @Override // Lu.o
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

        C4321e(j<T1, T2, T3, T4, T5, R> jVar) {
        }
    }

    /* renamed from: Nu.a$f, reason: case insensitive filesystem */
    static final class C4322f<T1, T2, T3, T4, T5, T6, R> implements Lu.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final Lu.k<T1, T2, T3, T4, T5, T6, R> f22760a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Lu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return (R) this.f22760a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }

        C4322f(Lu.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f22760a = kVar;
        }
    }

    /* renamed from: Nu.a$g, reason: case insensitive filesystem */
    static final class C4323g<T1, T2, T3, T4, T5, T6, T7, R> implements Lu.o<Object[], R> {
        @Override // Lu.o
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

        C4323g(Lu.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        }
    }

    /* renamed from: Nu.a$h, reason: case insensitive filesystem */
    static final class C4324h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Lu.o<Object[], R> {
        @Override // Lu.o
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

        C4324h(Lu.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        }
    }

    /* renamed from: Nu.a$i, reason: case insensitive filesystem */
    static final class C4325i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Lu.o<Object[], R> {
        @Override // Lu.o
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

        C4325i(Lu.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        }
    }

    /* renamed from: Nu.a$k, reason: case insensitive filesystem */
    static final class C4327k<T> implements Lu.q<T> {
        @Override // Lu.q
        public boolean test(T t10) throws Exception {
            throw null;
        }

        C4327k(e eVar) {
        }
    }

    static final class p implements Lu.p {
        p() {
        }
    }

    static final class s implements g<Throwable> {
        s() {
        }

        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            C13558a.s(th2);
        }
    }

    static final class t implements Lu.q<Object> {
        @Override // Lu.q
        public boolean test(Object obj) {
            return false;
        }

        t() {
        }
    }

    static final class y implements g<c> {
        y() {
        }

        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(c cVar) throws Exception {
            cVar.t(Long.MAX_VALUE);
        }
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Lu.o<Object[], R> A(Lu.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        b.e(lVar, "f is null");
        return new C4323g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Lu.o<Object[], R> B(Lu.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        b.e(mVar, "f is null");
        return new C4324h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Lu.o<Object[], R> C(Lu.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        b.e(nVar, "f is null");
        return new C4325i(nVar);
    }

    public static <T, K> Lu.b<Map<K, T>, T> D(Lu.o<? super T, ? extends K> oVar) {
        return new H(oVar);
    }

    public static <T, K, V> Lu.b<Map<K, V>, T> E(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2) {
        return new I(oVar2, oVar);
    }

    public static <T, K, V> Lu.b<Map<K, Collection<V>>, T> F(Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, Lu.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new J(oVar3, oVar2, oVar);
    }

    public static <T> g<T> a(Lu.a aVar) {
        return new C0376a(aVar);
    }

    public static <T> Lu.q<T> b() {
        return (Lu.q<T>) f22742i;
    }

    public static <T> Lu.q<T> c() {
        return (Lu.q<T>) f22741h;
    }

    public static <T, U> Lu.o<T, U> d(Class<U> cls) {
        return new l(cls);
    }

    public static <T> Callable<List<T>> e(int i10) {
        return new CallableC4326j(i10);
    }

    public static <T> Callable<Set<T>> f() {
        return u.INSTANCE;
    }

    public static <T> g<T> g() {
        return (g<T>) f22737d;
    }

    public static <T> Lu.q<T> h(T t10) {
        return new r(t10);
    }

    public static <T> Lu.o<T, T> i() {
        return (Lu.o<T, T>) f22734a;
    }

    public static <T, U> Lu.q<T> j(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<T> k(T t10) {
        return new w(t10);
    }

    public static <T, U> Lu.o<T, U> l(U u10) {
        return new w(u10);
    }

    public static <T> Lu.o<List<T>, List<T>> m(Comparator<? super T> comparator) {
        return new x(comparator);
    }

    public static <T> Comparator<T> n() {
        return z.INSTANCE;
    }

    public static <T> Comparator<T> o() {
        return (Comparator<T>) f22744k;
    }

    public static <T> Lu.a p(g<? super k<T>> gVar) {
        return new B(gVar);
    }

    public static <T> g<Throwable> q(g<? super k<T>> gVar) {
        return new C(gVar);
    }

    public static <T> g<T> r(g<? super k<T>> gVar) {
        return new D(gVar);
    }

    public static <T> Callable<T> s() {
        return (Callable<T>) f22743j;
    }

    public static <T> Lu.q<T> t(e eVar) {
        return new C4327k(eVar);
    }

    public static <T> Lu.o<T, C13890b<T>> u(TimeUnit timeUnit, io.reactivex.t tVar) {
        return new G(timeUnit, tVar);
    }

    public static <T1, T2, R> Lu.o<Object[], R> v(Lu.c<? super T1, ? super T2, ? extends R> cVar) {
        b.e(cVar, "f is null");
        return new C4318b(cVar);
    }

    public static <T1, T2, T3, R> Lu.o<Object[], R> w(h<T1, T2, T3, R> hVar) {
        b.e(hVar, "f is null");
        return new C4319c(hVar);
    }

    public static <T1, T2, T3, T4, R> Lu.o<Object[], R> x(i<T1, T2, T3, T4, R> iVar) {
        b.e(iVar, "f is null");
        return new C4320d(iVar);
    }

    public static <T1, T2, T3, T4, T5, R> Lu.o<Object[], R> y(j<T1, T2, T3, T4, T5, R> jVar) {
        b.e(jVar, "f is null");
        return new C4321e(jVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Lu.o<Object[], R> z(Lu.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        b.e(kVar, "f is null");
        return new C4322f(kVar);
    }
}
