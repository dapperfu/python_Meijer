package androidx.compose.runtime;

import M0.SnapshotStateList;
import M0.SnapshotStateMap;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import pv.InterfaceC16561f;

@Metadata(d1 = {"androidx/compose/runtime/p1", "androidx/compose/runtime/q1", "androidx/compose/runtime/r1", "androidx/compose/runtime/s1", "androidx/compose/runtime/t1"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o1 {
    public static final <T extends R, R> z1<R> a(InterfaceC16561f<? extends T> interfaceC16561f, R r10, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        return r1.b(interfaceC16561f, r10, coroutineContext, composer, i10, i11);
    }

    public static final <T> z1<T> b(pv.P<? extends T> p10, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        return r1.c(p10, coroutineContext, composer, i10, i11);
    }

    public static final D0.c<C> c() {
        return p1.b();
    }

    public static final <T> z1<T> d(n1<T> n1Var, Function0<? extends T> function0) {
        return p1.c(n1Var, function0);
    }

    public static final <T> z1<T> e(Function0<? extends T> function0) {
        return p1.d(function0);
    }

    public static final <T> SnapshotStateList<T> f() {
        return t1.a();
    }

    public static final <T> SnapshotStateList<T> g(T... tArr) {
        return t1.b(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> h() {
        return t1.c();
    }

    public static final <T> InterfaceC5872l0<T> i(T t10, n1<T> n1Var) {
        return t1.d(t10, n1Var);
    }

    public static final <T> n1<T> k() {
        return s1.a();
    }

    public static final <T> z1<T> l(T t10, Object obj, Object obj2, Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return q1.a(t10, obj, obj2, function2, composer, i10);
    }

    public static final <T> z1<T> m(T t10, Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return q1.b(t10, function2, composer, i10);
    }

    public static final <T> z1<T> n(T t10, Object[] objArr, Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return q1.c(t10, objArr, function2, composer, i10);
    }

    public static final <T> n1<T> o() {
        return s1.b();
    }

    public static final <T> z1<T> p(T t10, Composer composer, int i10) {
        return t1.f(t10, composer, i10);
    }

    public static final <T> InterfaceC16561f<T> q(Function0<? extends T> function0) {
        return r1.e(function0);
    }

    public static final <T> n1<T> r() {
        return s1.c();
    }

    public static final <T> SnapshotStateList<T> s(Collection<? extends T> collection) {
        return t1.g(collection);
    }
}
