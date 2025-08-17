package V6;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class f<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f36935e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f36936a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f36937b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36938c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f36939d;

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    class a implements b<Object> {
        @Override // V6.f.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }

        a() {
        }
    }

    public static <T> f<T> a(String str, T t10, b<T> bVar) {
        return new f<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f36935e;
    }

    private byte[] d() {
        if (this.f36939d == null) {
            this.f36939d = this.f36938c.getBytes(e.f36934a);
        }
        return this.f36939d;
    }

    public static <T> f<T> e(String str) {
        return new f<>(str, null, b());
    }

    public static <T> f<T> f(String str, T t10) {
        return new f<>(str, t10, b());
    }

    public T c() {
        return this.f36936a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f36938c.equals(((f) obj).f36938c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f36937b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f36938c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f36938c + "'}";
    }

    private f(String str, T t10, b<T> bVar) {
        this.f36938c = p7.k.b(str);
        this.f36936a = t10;
        this.f36937b = (b) p7.k.d(bVar);
    }
}
