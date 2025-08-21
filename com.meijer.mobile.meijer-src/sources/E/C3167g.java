package E;

import E.Y;
import androidx.camera.core.ImageCaptureException;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3167g extends Y.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f6925a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageCaptureException f6926b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y.b) {
            Y.b bVar = (Y.b) obj;
            if (this.f6925a == bVar.b() && this.f6926b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.Y.b
    ImageCaptureException a() {
        return this.f6926b;
    }

    @Override // E.Y.b
    int b() {
        return this.f6925a;
    }

    public int hashCode() {
        return ((this.f6925a ^ 1000003) * 1000003) ^ this.f6926b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f6925a + ", imageCaptureException=" + this.f6926b + "}";
    }

    C3167g(int i10, ImageCaptureException imageCaptureException) {
        this.f6925a = i10;
        if (imageCaptureException != null) {
            this.f6926b = imageCaptureException;
            return;
        }
        throw new NullPointerException("Null imageCaptureException");
    }
}
