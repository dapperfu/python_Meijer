package Fd;

/* loaded from: classes6.dex */
final class B9 extends F9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9204a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9205b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9206c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F9) {
            F9 f92 = (F9) obj;
            if (this.f9204a.equals(f92.b()) && this.f9205b == f92.c() && this.f9206c == f92.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // Fd.F9
    public final int a() {
        return this.f9206c;
    }

    @Override // Fd.F9
    public final String b() {
        return this.f9204a;
    }

    @Override // Fd.F9
    public final boolean c() {
        return this.f9205b;
    }

    public final int hashCode() {
        return ((((this.f9204a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f9205b ? 1237 : 1231)) * 1000003) ^ this.f9206c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f9204a + ", enableFirelog=" + this.f9205b + ", firelogEventType=" + this.f9206c + "}";
    }

    /* synthetic */ B9(String str, boolean z10, int i10, A9 a92) {
        this.f9204a = str;
        this.f9205b = z10;
        this.f9206c = i10;
    }
}
