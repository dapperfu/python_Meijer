package Q;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f29344a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29345b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29346c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f29347d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f29348e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29349f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f29350g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f29351h;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f29344a.equals(fVar.f()) && this.f29345b == fVar.e() && this.f29346c == fVar.b() && this.f29347d.equals(fVar.a()) && this.f29348e.equals(fVar.d()) && this.f29349f == fVar.c() && this.f29350g == fVar.g() && this.f29351h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // Q.f
    public Rect a() {
        return this.f29347d;
    }

    @Override // Q.f
    public int b() {
        return this.f29346c;
    }

    @Override // Q.f
    public int c() {
        return this.f29349f;
    }

    @Override // Q.f
    public Size d() {
        return this.f29348e;
    }

    @Override // Q.f
    public int e() {
        return this.f29345b;
    }

    @Override // Q.f
    UUID f() {
        return this.f29344a;
    }

    @Override // Q.f
    public boolean g() {
        return this.f29350g;
    }

    public int hashCode() {
        return ((((((((((((((this.f29344a.hashCode() ^ 1000003) * 1000003) ^ this.f29345b) * 1000003) ^ this.f29346c) * 1000003) ^ this.f29347d.hashCode()) * 1000003) ^ this.f29348e.hashCode()) * 1000003) ^ this.f29349f) * 1000003) ^ (this.f29350g ? 1231 : 1237)) * 1000003) ^ (this.f29351h ? 1231 : 1237);
    }

    @Override // Q.f
    public boolean k() {
        return this.f29351h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f29344a + ", getTargets=" + this.f29345b + ", getFormat=" + this.f29346c + ", getCropRect=" + this.f29347d + ", getSize=" + this.f29348e + ", getRotationDegrees=" + this.f29349f + ", isMirroring=" + this.f29350g + ", shouldRespectInputCropRect=" + this.f29351h + "}";
    }

    b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid != null) {
            this.f29344a = uuid;
            this.f29345b = i10;
            this.f29346c = i11;
            if (rect != null) {
                this.f29347d = rect;
                if (size != null) {
                    this.f29348e = size;
                    this.f29349f = i12;
                    this.f29350g = z10;
                    this.f29351h = z11;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }
}
