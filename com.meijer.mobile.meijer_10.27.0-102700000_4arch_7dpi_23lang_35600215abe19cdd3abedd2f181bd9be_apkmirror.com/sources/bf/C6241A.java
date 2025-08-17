package bf;

import java.lang.annotation.Annotation;

/* renamed from: bf.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6241A<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f60138a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f60139b;

    /* renamed from: bf.A$a */
    private @interface a {
    }

    public static <T> C6241A<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C6241A<>(cls, cls2);
    }

    public static <T> C6241A<T> b(Class<T> cls) {
        return new C6241A<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6241A.class != obj.getClass()) {
            return false;
        }
        C6241A c6241a = (C6241A) obj;
        if (this.f60139b.equals(c6241a.f60139b)) {
            return this.f60138a.equals(c6241a.f60138a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f60139b.hashCode() * 31) + this.f60138a.hashCode();
    }

    public String toString() {
        if (this.f60138a == a.class) {
            return this.f60139b.getName();
        }
        return "@" + this.f60138a.getName() + " " + this.f60139b.getName();
    }

    public C6241A(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f60138a = cls;
        this.f60139b = cls2;
    }
}
