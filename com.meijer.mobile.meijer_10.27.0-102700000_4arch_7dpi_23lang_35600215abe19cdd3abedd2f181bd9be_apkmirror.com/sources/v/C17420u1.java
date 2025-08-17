package v;

import androidx.camera.core.impl.i;
import u.C17169a;
import z.C18331k;

/* renamed from: v.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17420u1 extends V {

    /* renamed from: c, reason: collision with root package name */
    static final C17420u1 f164190c = new C17420u1(new C18331k());

    /* renamed from: b, reason: collision with root package name */
    private final C18331k f164191b;

    private C17420u1(C18331k c18331k) {
        this.f164191b = c18331k;
    }

    @Override // v.V, androidx.camera.core.impl.i.b
    public void a(androidx.camera.core.impl.D<?> d10, i.a aVar) {
        super.a(d10, aVar);
        if (d10 instanceof androidx.camera.core.impl.o) {
            androidx.camera.core.impl.o oVar = (androidx.camera.core.impl.o) d10;
            C17169a.C2558a c2558a = new C17169a.C2558a();
            if (oVar.f0()) {
                this.f164191b.a(oVar.Z(), c2558a);
            }
            aVar.e(c2558a.c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
