package C;

import F.x0;
import android.graphics.Matrix;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2961d extends N {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f3359a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3360b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3361c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f3362d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            N n10 = (N) obj;
            if (this.f3359a.equals(n10.a()) && this.f3360b == n10.getTimestamp() && this.f3361c == n10.c() && this.f3362d.equals(n10.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // C.N, C.I
    public x0 a() {
        return this.f3359a;
    }

    @Override // C.N, C.I
    public int c() {
        return this.f3361c;
    }

    @Override // C.N
    public Matrix e() {
        return this.f3362d;
    }

    @Override // C.N, C.I
    public long getTimestamp() {
        return this.f3360b;
    }

    public int hashCode() {
        int iHashCode = (this.f3359a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f3360b;
        return ((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f3361c) * 1000003) ^ this.f3362d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f3359a + ", timestamp=" + this.f3360b + ", rotationDegrees=" + this.f3361c + ", sensorToBufferTransformMatrix=" + this.f3362d + "}";
    }

    C2961d(x0 x0Var, long j10, int i10, Matrix matrix) {
        if (x0Var != null) {
            this.f3359a = x0Var;
            this.f3360b = j10;
            this.f3361c = i10;
            if (matrix != null) {
                this.f3362d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }
}
