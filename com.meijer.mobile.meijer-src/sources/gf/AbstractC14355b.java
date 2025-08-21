package gf;

import java.io.Serializable;
import java.util.function.BiPredicate;

/* renamed from: gf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC14355b<T> implements BiPredicate<T, T> {
    protected abstract boolean a(T t10, T t11);

    protected abstract int b(T t10);

    /* renamed from: gf.b$a */
    static final class a extends AbstractC14355b<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final a f134175a = new a();

        a() {
        }

        @Override // gf.AbstractC14355b
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // gf.AbstractC14355b
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: gf.b$b, reason: collision with other inner class name */
    static final class C2122b extends AbstractC14355b<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final C2122b f134176a = new C2122b();

        @Override // gf.AbstractC14355b
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        C2122b() {
        }

        @Override // gf.AbstractC14355b
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static AbstractC14355b<Object> c() {
        return a.f134175a;
    }

    public static AbstractC14355b<Object> f() {
        return C2122b.f134176a;
    }

    public final boolean d(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final int e(T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }

    protected AbstractC14355b() {
    }

    @Override // java.util.function.BiPredicate
    @Deprecated
    public final boolean test(T t10, T t11) {
        return d(t10, t11);
    }
}
