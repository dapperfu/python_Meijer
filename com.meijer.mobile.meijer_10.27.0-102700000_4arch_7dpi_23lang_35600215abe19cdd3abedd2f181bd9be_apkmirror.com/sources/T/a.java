package T;

import T.c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.view.InterfaceC6030s;

/* loaded from: classes.dex */
final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6030s f34742a;

    /* renamed from: b, reason: collision with root package name */
    private final CameraUseCaseAdapter.a f34743b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.a) {
            c.a aVar = (c.a) obj;
            if (this.f34742a.equals(aVar.c()) && this.f34743b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // T.c.a
    public CameraUseCaseAdapter.a b() {
        return this.f34743b;
    }

    @Override // T.c.a
    public InterfaceC6030s c() {
        return this.f34742a;
    }

    public int hashCode() {
        return ((this.f34742a.hashCode() ^ 1000003) * 1000003) ^ this.f34743b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f34742a + ", cameraId=" + this.f34743b + "}";
    }

    a(InterfaceC6030s interfaceC6030s, CameraUseCaseAdapter.a aVar) {
        if (interfaceC6030s != null) {
            this.f34742a = interfaceC6030s;
            if (aVar != null) {
                this.f34743b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }
}
