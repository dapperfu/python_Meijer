package df;

import java.lang.annotation.Annotation;

/* renamed from: df.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13672A<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f128373a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f128374b;

    /* renamed from: df.A$a */
    private @interface a {
    }

    public static <T> C13672A<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C13672A<>(cls, cls2);
    }

    public static <T> C13672A<T> b(Class<T> cls) {
        return new C13672A<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13672A.class != obj.getClass()) {
            return false;
        }
        C13672A c13672a = (C13672A) obj;
        if (this.f128374b.equals(c13672a.f128374b)) {
            return this.f128373a.equals(c13672a.f128373a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f128374b.hashCode() * 31) + this.f128373a.hashCode();
    }

    public String toString() {
        if (this.f128373a == a.class) {
            return this.f128374b.getName();
        }
        return "@" + this.f128373a.getName() + " " + this.f128374b.getName();
    }

    public C13672A(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f128373a = cls;
        this.f128374b = cls2;
    }
}
