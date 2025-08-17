package Dd;

/* loaded from: classes6.dex */
final class B9 extends F9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5171a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5172b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5173c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F9) {
            F9 f92 = (F9) obj;
            if (this.f5171a.equals(f92.b()) && this.f5172b == f92.c() && this.f5173c == f92.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // Dd.F9
    public final int a() {
        return this.f5173c;
    }

    @Override // Dd.F9
    public final String b() {
        return this.f5171a;
    }

    @Override // Dd.F9
    public final boolean c() {
        return this.f5172b;
    }

    public final int hashCode() {
        return ((((this.f5171a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f5172b ? 1237 : 1231)) * 1000003) ^ this.f5173c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5171a + ", enableFirelog=" + this.f5172b + ", firelogEventType=" + this.f5173c + "}";
    }

    /* synthetic */ B9(String str, boolean z10, int i10, A9 a92) {
        this.f5171a = str;
        this.f5172b = z10;
        this.f5173c = i10;
    }
}
