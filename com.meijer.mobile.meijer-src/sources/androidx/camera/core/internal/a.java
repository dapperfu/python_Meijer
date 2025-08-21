package androidx.camera.core.internal;

import F.Q;
import androidx.camera.core.internal.CameraUseCaseAdapter;

/* loaded from: classes.dex */
final class a extends CameraUseCaseAdapter.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f47745a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f47746b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraUseCaseAdapter.a) {
            CameraUseCaseAdapter.a aVar = (CameraUseCaseAdapter.a) obj;
            if (this.f47745a.equals(aVar.c()) && this.f47746b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.a
    public Q b() {
        return this.f47746b;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.a
    public String c() {
        return this.f47745a;
    }

    public int hashCode() {
        return ((this.f47745a.hashCode() ^ 1000003) * 1000003) ^ this.f47746b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f47745a + ", cameraConfigId=" + this.f47746b + "}";
    }

    a(String str, Q q10) {
        if (str != null) {
            this.f47745a = str;
            if (q10 != null) {
                this.f47746b = q10;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }
}
