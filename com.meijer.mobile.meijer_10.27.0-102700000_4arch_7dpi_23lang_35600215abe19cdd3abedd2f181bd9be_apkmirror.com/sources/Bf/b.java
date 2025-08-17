package Bf;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f2244a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f2245b;

    /* renamed from: Bf.b$b, reason: collision with other inner class name */
    public static final class C0047b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2246a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f2247b = null;

        public b a() {
            return new b(this.f2246a, this.f2247b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f2247b)));
        }

        public <T extends Annotation> C0047b b(T t10) {
            if (this.f2247b == null) {
                this.f2247b = new HashMap();
            }
            this.f2247b.put(t10.annotationType(), t10);
            return this;
        }

        C0047b(String str) {
            this.f2246a = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2244a.equals(bVar.f2244a) && this.f2245b.equals(bVar.f2245b);
    }

    private b(String str, Map<Class<?>, Object> map) {
        this.f2244a = str;
        this.f2245b = map;
    }

    public static C0047b a(String str) {
        return new C0047b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f2244a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f2245b.get(cls);
    }

    public int hashCode() {
        return (this.f2244a.hashCode() * 31) + this.f2245b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f2244a + ", properties=" + this.f2245b.values() + "}";
    }
}
