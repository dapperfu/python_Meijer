package De;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class m<T> implements Serializable {
    public abstract T b();

    public abstract boolean c();

    public abstract T e(T t10);

    public static <T> m<T> d(T t10) {
        return new s(p.q(t10));
    }

    m() {
    }

    public static <T> m<T> a() {
        return C3104a.f();
    }
}
