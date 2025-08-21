package h6;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class E<V> {

    /* renamed from: a, reason: collision with root package name */
    private final V f135049a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f135050b;

    public E(V v10) {
        this.f135049a = v10;
        this.f135050b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (b() != null && b().equals(e10.b())) {
            return true;
        }
        if (a() == null || e10.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public Throwable a() {
        return this.f135050b;
    }

    public V b() {
        return this.f135049a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public E(Throwable th2) {
        this.f135050b = th2;
        this.f135049a = null;
    }
}
