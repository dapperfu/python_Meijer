package ef;

import java.io.Serializable;
import java.util.function.BiPredicate;

/* renamed from: ef.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC13651b<T> implements BiPredicate<T, T> {
    protected abstract boolean a(T t10, T t11);

    protected abstract int b(T t10);

    /* renamed from: ef.b$a */
    static final class a extends AbstractC13651b<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final a f128707a = new a();

        a() {
        }

        @Override // ef.AbstractC13651b
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // ef.AbstractC13651b
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: ef.b$b, reason: collision with other inner class name */
    static final class C2024b extends AbstractC13651b<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final C2024b f128708a = new C2024b();

        @Override // ef.AbstractC13651b
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        C2024b() {
        }

        @Override // ef.AbstractC13651b
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static AbstractC13651b<Object> c() {
        return a.f128707a;
    }

    public static AbstractC13651b<Object> f() {
        return C2024b.f128708a;
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

    protected AbstractC13651b() {
    }

    @Override // java.util.function.BiPredicate
    @Deprecated
    public final boolean test(T t10, T t11) {
        return d(t10, t11);
    }
}
