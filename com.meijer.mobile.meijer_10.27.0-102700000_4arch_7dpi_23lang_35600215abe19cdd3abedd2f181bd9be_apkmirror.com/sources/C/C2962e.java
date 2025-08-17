package C;

import C.d0;
import F.InterfaceC3628z;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2962e extends d0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Size f3363a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f3364b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3628z f3365c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3366d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3367e;

    public boolean equals(Object obj) {
        InterfaceC3628z interfaceC3628z;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.a) {
            d0.a aVar = (d0.a) obj;
            if (this.f3363a.equals(aVar.c()) && this.f3364b.equals(aVar.b()) && ((interfaceC3628z = this.f3365c) != null ? interfaceC3628z.equals(aVar.a()) : aVar.a() == null) && this.f3366d == aVar.e() && this.f3367e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // C.d0.a
    public InterfaceC3628z a() {
        return this.f3365c;
    }

    @Override // C.d0.a
    public Rect b() {
        return this.f3364b;
    }

    @Override // C.d0.a
    public Size c() {
        return this.f3363a;
    }

    @Override // C.d0.a
    public boolean d() {
        return this.f3367e;
    }

    @Override // C.d0.a
    public int e() {
        return this.f3366d;
    }

    public int hashCode() {
        int iHashCode = (((this.f3363a.hashCode() ^ 1000003) * 1000003) ^ this.f3364b.hashCode()) * 1000003;
        InterfaceC3628z interfaceC3628z = this.f3365c;
        return ((((iHashCode ^ (interfaceC3628z == null ? 0 : interfaceC3628z.hashCode())) * 1000003) ^ this.f3366d) * 1000003) ^ (this.f3367e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f3363a + ", inputCropRect=" + this.f3364b + ", cameraInternal=" + this.f3365c + ", rotationDegrees=" + this.f3366d + ", mirroring=" + this.f3367e + "}";
    }

    C2962e(Size size, Rect rect, InterfaceC3628z interfaceC3628z, int i10, boolean z10) {
        if (size != null) {
            this.f3363a = size;
            if (rect != null) {
                this.f3364b = rect;
                this.f3365c = interfaceC3628z;
                this.f3366d = i10;
                this.f3367e = z10;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }
}
