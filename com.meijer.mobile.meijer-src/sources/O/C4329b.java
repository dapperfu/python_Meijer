package O;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4329b<T> extends B<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f22860a;

    /* renamed from: b, reason: collision with root package name */
    private final G.f f22861b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22862c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f22863d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f22864e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22865f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f22866g;

    /* renamed from: h, reason: collision with root package name */
    private final F.r f22867h;

    public boolean equals(Object obj) {
        G.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b10 = (B) obj;
            if (this.f22860a.equals(b10.c()) && ((fVar = this.f22861b) != null ? fVar.equals(b10.d()) : b10.d() == null) && this.f22862c == b10.e() && this.f22863d.equals(b10.h()) && this.f22864e.equals(b10.b()) && this.f22865f == b10.f() && this.f22866g.equals(b10.g()) && this.f22867h.equals(b10.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // O.B
    public F.r a() {
        return this.f22867h;
    }

    @Override // O.B
    public Rect b() {
        return this.f22864e;
    }

    @Override // O.B
    public T c() {
        return this.f22860a;
    }

    @Override // O.B
    public G.f d() {
        return this.f22861b;
    }

    @Override // O.B
    public int e() {
        return this.f22862c;
    }

    @Override // O.B
    public int f() {
        return this.f22865f;
    }

    @Override // O.B
    public Matrix g() {
        return this.f22866g;
    }

    @Override // O.B
    public Size h() {
        return this.f22863d;
    }

    public int hashCode() {
        int iHashCode = (this.f22860a.hashCode() ^ 1000003) * 1000003;
        G.f fVar = this.f22861b;
        return ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f22862c) * 1000003) ^ this.f22863d.hashCode()) * 1000003) ^ this.f22864e.hashCode()) * 1000003) ^ this.f22865f) * 1000003) ^ this.f22866g.hashCode()) * 1000003) ^ this.f22867h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f22860a + ", exif=" + this.f22861b + ", format=" + this.f22862c + ", size=" + this.f22863d + ", cropRect=" + this.f22864e + ", rotationDegrees=" + this.f22865f + ", sensorToBufferTransform=" + this.f22866g + ", cameraCaptureResult=" + this.f22867h + "}";
    }

    C4329b(T t10, G.f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, F.r rVar) {
        if (t10 != null) {
            this.f22860a = t10;
            this.f22861b = fVar;
            this.f22862c = i10;
            if (size != null) {
                this.f22863d = size;
                if (rect != null) {
                    this.f22864e = rect;
                    this.f22865f = i11;
                    if (matrix != null) {
                        this.f22866g = matrix;
                        if (rVar != null) {
                            this.f22867h = rVar;
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
