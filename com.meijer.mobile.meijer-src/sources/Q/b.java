package Q;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f27357a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27358b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27359c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f27360d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f27361e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27362f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f27363g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f27364h;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f27357a.equals(fVar.f()) && this.f27358b == fVar.e() && this.f27359c == fVar.b() && this.f27360d.equals(fVar.a()) && this.f27361e.equals(fVar.d()) && this.f27362f == fVar.c() && this.f27363g == fVar.g() && this.f27364h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // Q.f
    public Rect a() {
        return this.f27360d;
    }

    @Override // Q.f
    public int b() {
        return this.f27359c;
    }

    @Override // Q.f
    public int c() {
        return this.f27362f;
    }

    @Override // Q.f
    public Size d() {
        return this.f27361e;
    }

    @Override // Q.f
    public int e() {
        return this.f27358b;
    }

    @Override // Q.f
    UUID f() {
        return this.f27357a;
    }

    @Override // Q.f
    public boolean g() {
        return this.f27363g;
    }

    public int hashCode() {
        return ((((((((((((((this.f27357a.hashCode() ^ 1000003) * 1000003) ^ this.f27358b) * 1000003) ^ this.f27359c) * 1000003) ^ this.f27360d.hashCode()) * 1000003) ^ this.f27361e.hashCode()) * 1000003) ^ this.f27362f) * 1000003) ^ (this.f27363g ? 1231 : 1237)) * 1000003) ^ (this.f27364h ? 1231 : 1237);
    }

    @Override // Q.f
    public boolean k() {
        return this.f27364h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f27357a + ", getTargets=" + this.f27358b + ", getFormat=" + this.f27359c + ", getCropRect=" + this.f27360d + ", getSize=" + this.f27361e + ", getRotationDegrees=" + this.f27362f + ", isMirroring=" + this.f27363g + ", shouldRespectInputCropRect=" + this.f27364h + "}";
    }

    b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid != null) {
            this.f27357a = uuid;
            this.f27358b = i10;
            this.f27359c = i11;
            if (rect != null) {
                this.f27360d = rect;
                if (size != null) {
                    this.f27361e = size;
                    this.f27362f = i12;
                    this.f27363g = z10;
                    this.f27364h = z11;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }
}
