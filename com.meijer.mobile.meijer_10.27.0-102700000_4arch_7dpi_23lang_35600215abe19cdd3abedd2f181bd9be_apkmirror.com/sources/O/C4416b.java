package O;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4416b<T> extends B<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f22867a;

    /* renamed from: b, reason: collision with root package name */
    private final G.f f22868b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22869c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f22870d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f22871e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22872f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f22873g;

    /* renamed from: h, reason: collision with root package name */
    private final F.r f22874h;

    public boolean equals(Object obj) {
        G.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b10 = (B) obj;
            if (this.f22867a.equals(b10.c()) && ((fVar = this.f22868b) != null ? fVar.equals(b10.d()) : b10.d() == null) && this.f22869c == b10.e() && this.f22870d.equals(b10.h()) && this.f22871e.equals(b10.b()) && this.f22872f == b10.f() && this.f22873g.equals(b10.g()) && this.f22874h.equals(b10.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // O.B
    public F.r a() {
        return this.f22874h;
    }

    @Override // O.B
    public Rect b() {
        return this.f22871e;
    }

    @Override // O.B
    public T c() {
        return this.f22867a;
    }

    @Override // O.B
    public G.f d() {
        return this.f22868b;
    }

    @Override // O.B
    public int e() {
        return this.f22869c;
    }

    @Override // O.B
    public int f() {
        return this.f22872f;
    }

    @Override // O.B
    public Matrix g() {
        return this.f22873g;
    }

    @Override // O.B
    public Size h() {
        return this.f22870d;
    }

    public int hashCode() {
        int iHashCode = (this.f22867a.hashCode() ^ 1000003) * 1000003;
        G.f fVar = this.f22868b;
        return ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f22869c) * 1000003) ^ this.f22870d.hashCode()) * 1000003) ^ this.f22871e.hashCode()) * 1000003) ^ this.f22872f) * 1000003) ^ this.f22873g.hashCode()) * 1000003) ^ this.f22874h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f22867a + ", exif=" + this.f22868b + ", format=" + this.f22869c + ", size=" + this.f22870d + ", cropRect=" + this.f22871e + ", rotationDegrees=" + this.f22872f + ", sensorToBufferTransform=" + this.f22873g + ", cameraCaptureResult=" + this.f22874h + "}";
    }

    C4416b(T t10, G.f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, F.r rVar) {
        if (t10 != null) {
            this.f22867a = t10;
            this.f22868b = fVar;
            this.f22869c = i10;
            if (size != null) {
                this.f22870d = size;
                if (rect != null) {
                    this.f22871e = rect;
                    this.f22872f = i11;
                    if (matrix != null) {
                        this.f22873g = matrix;
                        if (rVar != null) {
                            this.f22874h = rVar;
                            return;
                        }
                        throw new NullPointerException("Null cameraCaptureResult");
                    }
                    throw new NullPointerException("Null sensorToBufferTransform");
                }
                throw new NullPointerException("Null cropRect");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null data");
    }
}
