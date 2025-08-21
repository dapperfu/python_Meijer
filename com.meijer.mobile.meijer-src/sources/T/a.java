package T;

import T.c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.view.InterfaceC6172s;

/* loaded from: classes.dex */
final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6172s f35837a;

    /* renamed from: b, reason: collision with root package name */
    private final CameraUseCaseAdapter.a f35838b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.a) {
            c.a aVar = (c.a) obj;
            if (this.f35837a.equals(aVar.c()) && this.f35838b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // T.c.a
    public CameraUseCaseAdapter.a b() {
        return this.f35838b;
    }

    @Override // T.c.a
    public InterfaceC6172s c() {
        return this.f35837a;
    }

    public int hashCode() {
        return ((this.f35837a.hashCode() ^ 1000003) * 1000003) ^ this.f35838b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f35837a + ", cameraId=" + this.f35838b + "}";
    }

    a(InterfaceC6172s interfaceC6172s, CameraUseCaseAdapter.a aVar) {
        if (interfaceC6172s != null) {
            this.f35837a = interfaceC6172s;
            if (aVar != null) {
                this.f35838b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }
}
