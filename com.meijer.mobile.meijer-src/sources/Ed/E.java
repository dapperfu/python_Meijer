package Ed;

/* loaded from: classes6.dex */
final class E extends I {

    /* renamed from: a, reason: collision with root package name */
    private final String f7084a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7085b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7086c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i10 = (I) obj;
            if (this.f7084a.equals(i10.b()) && this.f7085b == i10.c() && this.f7086c == i10.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // Ed.I
    public final int a() {
        return this.f7086c;
    }

    @Override // Ed.I
    public final String b() {
        return this.f7084a;
    }

    @Override // Ed.I
    public final boolean c() {
        return this.f7085b;
    }

    public final int hashCode() {
        return ((((this.f7084a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f7085b ? 1237 : 1231)) * 1000003) ^ this.f7086c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f7084a + ", enableFirelog=" + this.f7085b + ", firelogEventType=" + this.f7086c + "}";
    }

    /* synthetic */ E(String str, boolean z10, int i10, D d10) {
        this.f7084a = str;
        this.f7085b = z10;
        this.f7086c = i10;
    }
}
