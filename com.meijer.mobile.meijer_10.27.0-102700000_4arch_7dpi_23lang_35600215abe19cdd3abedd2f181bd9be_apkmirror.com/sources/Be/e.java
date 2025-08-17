package Be;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class e<T> {
    protected abstract boolean a(T t10, T t11);

    protected abstract int b(T t10);

    static final class a extends e<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final a f2197a = new a();

        a() {
        }

        @Override // Be.e
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // Be.e
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    static final class b extends e<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final b f2198a = new b();

        @Override // Be.e
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        b() {
        }

        @Override // Be.e
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static e<Object> c() {
        return a.f2197a;
    }

    public static e<Object> f() {
        return b.f2198a;
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

    protected e() {
    }
}
