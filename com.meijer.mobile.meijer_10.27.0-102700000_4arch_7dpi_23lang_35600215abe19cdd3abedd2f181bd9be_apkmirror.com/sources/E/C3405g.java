package E;

import E.Y;
import androidx.camera.core.ImageCaptureException;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3405g extends Y.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f7518a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageCaptureException f7519b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y.b) {
            Y.b bVar = (Y.b) obj;
            if (this.f7518a == bVar.b() && this.f7519b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.Y.b
    ImageCaptureException a() {
        return this.f7519b;
    }

    @Override // E.Y.b
    int b() {
        return this.f7518a;
    }

    public int hashCode() {
        return ((this.f7518a ^ 1000003) * 1000003) ^ this.f7519b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f7518a + ", imageCaptureException=" + this.f7519b + "}";
    }

    C3405g(int i10, ImageCaptureException imageCaptureException) {
        this.f7518a = i10;
        if (imageCaptureException != null) {
            this.f7519b = imageCaptureException;
            return;
        }
        throw new NullPointerException("Null imageCaptureException");
    }
}
