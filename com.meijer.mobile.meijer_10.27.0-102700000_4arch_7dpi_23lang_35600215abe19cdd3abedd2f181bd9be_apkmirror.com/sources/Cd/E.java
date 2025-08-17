package Cd;

/* loaded from: classes6.dex */
final class E extends I {

    /* renamed from: a, reason: collision with root package name */
    private final String f3772a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3773b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3774c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i10 = (I) obj;
            if (this.f3772a.equals(i10.b()) && this.f3773b == i10.c() && this.f3774c == i10.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // Cd.I
    public final int a() {
        return this.f3774c;
    }

    @Override // Cd.I
    public final String b() {
        return this.f3772a;
    }

    @Override // Cd.I
    public final boolean c() {
        return this.f3773b;
    }

    public final int hashCode() {
        return ((((this.f3772a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f3773b ? 1237 : 1231)) * 1000003) ^ this.f3774c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f3772a + ", enableFirelog=" + this.f3773b + ", firelogEventType=" + this.f3774c + "}";
    }

    /* synthetic */ E(String str, boolean z10, int i10, D d10) {
        this.f3772a = str;
        this.f3773b = z10;
        this.f3774c = i10;
    }
}
