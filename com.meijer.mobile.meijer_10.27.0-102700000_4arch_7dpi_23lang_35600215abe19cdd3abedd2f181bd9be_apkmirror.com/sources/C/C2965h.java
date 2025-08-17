package C;

import C.o0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2965h extends o0.h {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f3376a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3377b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3378c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3379d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f3380e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3381f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0.h) {
            o0.h hVar = (o0.h) obj;
            if (this.f3376a.equals(hVar.a()) && this.f3377b == hVar.b() && this.f3378c == hVar.d() && this.f3379d == hVar.e() && this.f3380e.equals(hVar.c()) && this.f3381f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // C.o0.h
    public Rect a() {
        return this.f3376a;
    }

    @Override // C.o0.h
    public int b() {
        return this.f3377b;
    }

    @Override // C.o0.h
    public Matrix c() {
        return this.f3380e;
    }

    @Override // C.o0.h
    public int d() {
        return this.f3378c;
    }

    @Override // C.o0.h
    public boolean e() {
        return this.f3379d;
    }

    @Override // C.o0.h
    public boolean f() {
        return this.f3381f;
    }

    public int hashCode() {
        return ((((((((((this.f3376a.hashCode() ^ 1000003) * 1000003) ^ this.f3377b) * 1000003) ^ this.f3378c) * 1000003) ^ (this.f3379d ? 1231 : 1237)) * 1000003) ^ this.f3380e.hashCode()) * 1000003) ^ (this.f3381f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f3376a + ", getRotationDegrees=" + this.f3377b + ", getTargetRotation=" + this.f3378c + ", hasCameraTransform=" + this.f3379d + ", getSensorToBufferTransform=" + this.f3380e + ", isMirroring=" + this.f3381f + "}";
    }

    C2965h(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect != null) {
            this.f3376a = rect;
            this.f3377b = i10;
            this.f3378c = i11;
            this.f3379d = z10;
            if (matrix != null) {
                this.f3380e = matrix;
                this.f3381f = z11;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }
}
