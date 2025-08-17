package g6;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class E<V> {

    /* renamed from: a, reason: collision with root package name */
    private final V f132873a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f132874b;

    public E(V v10) {
        this.f132873a = v10;
        this.f132874b = null;
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
        return this.f132874b;
    }

    public V b() {
        return this.f132873a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public E(Throwable th2) {
        this.f132874b = th2;
        this.f132873a = null;
    }
}
