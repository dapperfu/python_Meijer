package bf;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final C6241A<?> f60195a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60196b;

    /* renamed from: c, reason: collision with root package name */
    private final int f60197c;

    private q(Class<?> cls, int i10, int i11) {
        this((C6241A<?>) C6241A.b(cls), i10, i11);
    }

    private q(C6241A<?> c6241a, int i10, int i11) {
        this.f60195a = (C6241A) z.c(c6241a, "Null dependency anInterface.");
        this.f60196b = i10;
        this.f60197c = i11;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(C6241A<?> c6241a) {
        return new q(c6241a, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q k(C6241A<?> c6241a) {
        return new q(c6241a, 1, 0);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q m(C6241A<?> c6241a) {
        return new q(c6241a, 1, 1);
    }

    public static q n(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public C6241A<?> c() {
        return this.f60195a;
    }

    public boolean d() {
        return this.f60197c == 2;
    }

    public boolean e() {
        return this.f60197c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f60195a.equals(qVar.f60195a) && this.f60196b == qVar.f60196b && this.f60197c == qVar.f60197c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f60196b == 1;
    }

    public boolean g() {
        return this.f60196b == 2;
    }

    public int hashCode() {
        return ((((this.f60195a.hashCode() ^ 1000003) * 1000003) ^ this.f60196b) * 1000003) ^ this.f60197c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f60195a);
        sb2.append(", type=");
        int i10 = this.f60196b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f60197c));
        sb2.append("}");
        return sb2.toString();
    }
}
