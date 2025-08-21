package Sc;

/* loaded from: classes4.dex */
final class o extends x {

    /* renamed from: a, reason: collision with root package name */
    private final int f34516a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34517b;

    /* renamed from: c, reason: collision with root package name */
    private final double f34518c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34519d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f34516a == xVar.c() && this.f34517b == xVar.b() && Double.doubleToLongBits(this.f34518c) == Double.doubleToLongBits(xVar.a()) && this.f34519d == xVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // Sc.x
    public final double a() {
        return this.f34518c;
    }

    @Override // Sc.x
    public final int b() {
        return this.f34517b;
    }

    @Override // Sc.x
    public final int c() {
        return this.f34516a;
    }

    @Override // Sc.x
    public final boolean d() {
        return this.f34519d;
    }

    public final int hashCode() {
        return ((((int) ((Double.doubleToLongBits(this.f34518c) >>> 32) ^ Double.doubleToLongBits(this.f34518c))) ^ ((((this.f34516a ^ 1000003) * 1000003) ^ this.f34517b) * 1000003)) * 1000003) ^ (true != this.f34519d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f34516a + ", initialBackoffMs=" + this.f34517b + ", backoffMultiplier=" + this.f34518c + ", bufferAfterMaxAttempts=" + this.f34519d + "}";
    }

    o(int i10, int i11, double d10, boolean z10) {
        this.f34516a = i10;
        this.f34517b = i11;
        this.f34518c = d10;
        this.f34519d = z10;
    }
}
