package C;

import C.o0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3023h extends o0.h {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f3834a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3835b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3836c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3837d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f3838e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3839f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0.h) {
            o0.h hVar = (o0.h) obj;
            if (this.f3834a.equals(hVar.a()) && this.f3835b == hVar.b() && this.f3836c == hVar.d() && this.f3837d == hVar.e() && this.f3838e.equals(hVar.c()) && this.f3839f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // C.o0.h
    public Rect a() {
        return this.f3834a;
    }

    @Override // C.o0.h
    public int b() {
        return this.f3835b;
    }

    @Override // C.o0.h
    public Matrix c() {
        return this.f3838e;
    }

    @Override // C.o0.h
    public int d() {
        return this.f3836c;
    }

    @Override // C.o0.h
    public boolean e() {
        return this.f3837d;
    }

    @Override // C.o0.h
    public boolean f() {
        return this.f3839f;
    }

    public int hashCode() {
        return ((((((((((this.f3834a.hashCode() ^ 1000003) * 1000003) ^ this.f3835b) * 1000003) ^ this.f3836c) * 1000003) ^ (this.f3837d ? 1231 : 1237)) * 1000003) ^ this.f3838e.hashCode()) * 1000003) ^ (this.f3839f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f3834a + ", getRotationDegrees=" + this.f3835b + ", getTargetRotation=" + this.f3836c + ", hasCameraTransform=" + this.f3837d + ", getSensorToBufferTransform=" + this.f3838e + ", isMirroring=" + this.f3839f + "}";
    }

    C3023h(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect != null) {
            this.f3834a = rect;
            this.f3835b = i10;
            this.f3836c = i11;
            this.f3837d = z10;
            if (matrix != null) {
                this.f3838e = matrix;
                this.f3839f = z11;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }
}
