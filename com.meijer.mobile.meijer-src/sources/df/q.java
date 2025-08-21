package df;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final C13672A<?> f128430a;

    /* renamed from: b, reason: collision with root package name */
    private final int f128431b;

    /* renamed from: c, reason: collision with root package name */
    private final int f128432c;

    private q(Class<?> cls, int i10, int i11) {
        this((C13672A<?>) C13672A.b(cls), i10, i11);
    }

    private q(C13672A<?> c13672a, int i10, int i11) {
        this.f128430a = (C13672A) z.c(c13672a, "Null dependency anInterface.");
        this.f128431b = i10;
        this.f128432c = i11;
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

    public static q i(C13672A<?> c13672a) {
        return new q(c13672a, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q k(C13672A<?> c13672a) {
        return new q(c13672a, 1, 0);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q m(C13672A<?> c13672a) {
        return new q(c13672a, 1, 1);
    }

    public static q n(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public C13672A<?> c() {
        return this.f128430a;
    }

    public boolean d() {
        return this.f128432c == 2;
    }

    public boolean e() {
        return this.f128432c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f128430a.equals(qVar.f128430a) && this.f128431b == qVar.f128431b && this.f128432c == qVar.f128432c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f128431b == 1;
    }

    public boolean g() {
        return this.f128431b == 2;
    }

    public int hashCode() {
        return ((((this.f128430a.hashCode() ^ 1000003) * 1000003) ^ this.f128431b) * 1000003) ^ this.f128432c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f128430a);
        sb2.append(", type=");
        int i10 = this.f128431b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f128432c));
        sb2.append("}");
        return sb2.toString();
    }
}
