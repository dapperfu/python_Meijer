package X6;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class f<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f41647e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f41648a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f41649b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41650c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f41651d;

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    class a implements b<Object> {
        @Override // X6.f.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }

        a() {
        }
    }

    public static <T> f<T> a(String str, T t10, b<T> bVar) {
        return new f<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f41647e;
    }

    private byte[] d() {
        if (this.f41651d == null) {
            this.f41651d = this.f41650c.getBytes(e.f41646a);
        }
        return this.f41651d;
    }

    public static <T> f<T> e(String str) {
        return new f<>(str, null, b());
    }

    public static <T> f<T> f(String str, T t10) {
        return new f<>(str, t10, b());
    }

    public T c() {
        return this.f41648a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f41650c.equals(((f) obj).f41650c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f41649b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f41650c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f41650c + "'}";
    }

    private f(String str, T t10, b<T> bVar) {
        this.f41650c = r7.k.b(str);
        this.f41648a = t10;
        this.f41649b = (b) r7.k.d(bVar);
    }
}
