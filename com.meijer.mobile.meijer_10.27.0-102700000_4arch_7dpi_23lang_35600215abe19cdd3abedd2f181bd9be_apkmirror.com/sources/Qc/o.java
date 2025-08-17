package Qc;

/* loaded from: classes4.dex */
final class o extends x {

    /* renamed from: a, reason: collision with root package name */
    private final int f29966a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29967b;

    /* renamed from: c, reason: collision with root package name */
    private final double f29968c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29969d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f29966a == xVar.c() && this.f29967b == xVar.b() && Double.doubleToLongBits(this.f29968c) == Double.doubleToLongBits(xVar.a()) && this.f29969d == xVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // Qc.x
    public final double a() {
        return this.f29968c;
    }

    @Override // Qc.x
    public final int b() {
        return this.f29967b;
    }

    @Override // Qc.x
    public final int c() {
        return this.f29966a;
    }

    @Override // Qc.x
    public final boolean d() {
        return this.f29969d;
    }

    public final int hashCode() {
        return ((((int) ((Double.doubleToLongBits(this.f29968c) >>> 32) ^ Double.doubleToLongBits(this.f29968c))) ^ ((((this.f29966a ^ 1000003) * 1000003) ^ this.f29967b) * 1000003)) * 1000003) ^ (true != this.f29969d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f29966a + ", initialBackoffMs=" + this.f29967b + ", backoffMultiplier=" + this.f29968c + ", bufferAfterMaxAttempts=" + this.f29969d + "}";
    }

    o(int i10, int i11, double d10, boolean z10) {
        this.f29966a = i10;
        this.f29967b = i11;
        this.f29968c = d10;
        this.f29969d = z10;
    }
}
