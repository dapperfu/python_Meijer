package androidx.camera.core.internal;

import F.Q;
import androidx.camera.core.internal.CameraUseCaseAdapter;

/* loaded from: classes.dex */
final class a extends CameraUseCaseAdapter.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f47521a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f47522b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraUseCaseAdapter.a) {
            CameraUseCaseAdapter.a aVar = (CameraUseCaseAdapter.a) obj;
            if (this.f47521a.equals(aVar.c()) && this.f47522b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.a
    public Q b() {
        return this.f47522b;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.a
    public String c() {
        return this.f47521a;
    }

    public int hashCode() {
        return ((this.f47521a.hashCode() ^ 1000003) * 1000003) ^ this.f47522b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f47521a + ", cameraConfigId=" + this.f47522b + "}";
    }

    a(String str, Q q10) {
        if (str != null) {
            this.f47521a = str;
            if (q10 != null) {
                this.f47522b = q10;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }
}
