package C;

import F.x0;
import android.graphics.Matrix;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3019d extends N {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f3817a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3818b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3819c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f3820d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            N n10 = (N) obj;
            if (this.f3817a.equals(n10.a()) && this.f3818b == n10.getTimestamp() && this.f3819c == n10.c() && this.f3820d.equals(n10.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // C.N, C.I
    public x0 a() {
        return this.f3817a;
    }

    @Override // C.N, C.I
    public int c() {
        return this.f3819c;
    }

    @Override // C.N
    public Matrix e() {
        return this.f3820d;
    }

    @Override // C.N, C.I
    public long getTimestamp() {
        return this.f3818b;
    }

    public int hashCode() {
        int iHashCode = (this.f3817a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f3818b;
        return ((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f3819c) * 1000003) ^ this.f3820d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f3817a + ", timestamp=" + this.f3818b + ", rotationDegrees=" + this.f3819c + ", sensorToBufferTransformMatrix=" + this.f3820d + "}";
    }

    C3019d(x0 x0Var, long j10, int i10, Matrix matrix) {
        if (x0Var != null) {
            this.f3817a = x0Var;
            this.f3818b = j10;
            this.f3819c = i10;
            if (matrix != null) {
                this.f3820d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }
}
