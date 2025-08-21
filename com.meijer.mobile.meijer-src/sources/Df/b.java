package Df;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f6189a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f6190b;

    /* renamed from: Df.b$b, reason: collision with other inner class name */
    public static final class C0116b {

        /* renamed from: a, reason: collision with root package name */
        private final String f6191a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f6192b = null;

        public b a() {
            return new b(this.f6191a, this.f6192b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f6192b)));
        }

        public <T extends Annotation> C0116b b(T t10) {
            if (this.f6192b == null) {
                this.f6192b = new HashMap();
            }
            this.f6192b.put(t10.annotationType(), t10);
            return this;
        }

        C0116b(String str) {
            this.f6191a = str;
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
        return this.f6189a.equals(bVar.f6189a) && this.f6190b.equals(bVar.f6190b);
    }

    private b(String str, Map<Class<?>, Object> map) {
        this.f6189a = str;
        this.f6190b = map;
    }

    public static C0116b a(String str) {
        return new C0116b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f6189a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f6190b.get(cls);
    }

    public int hashCode() {
        return (this.f6189a.hashCode() * 31) + this.f6190b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f6189a + ", properties=" + this.f6190b.values() + "}";
    }
}
