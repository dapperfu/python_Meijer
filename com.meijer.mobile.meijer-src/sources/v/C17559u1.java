package v;

import androidx.camera.core.impl.i;
import u.C17296a;
import z.C18394k;

/* renamed from: v.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17559u1 extends V {

    /* renamed from: c, reason: collision with root package name */
    static final C17559u1 f165224c = new C17559u1(new C18394k());

    /* renamed from: b, reason: collision with root package name */
    private final C18394k f165225b;

    private C17559u1(C18394k c18394k) {
        this.f165225b = c18394k;
    }

    @Override // v.V, androidx.camera.core.impl.i.b
    public void a(androidx.camera.core.impl.D<?> d10, i.a aVar) {
        super.a(d10, aVar);
        if (d10 instanceof androidx.camera.core.impl.o) {
            androidx.camera.core.impl.o oVar = (androidx.camera.core.impl.o) d10;
            C17296a.C2582a c2582a = new C17296a.C2582a();
            if (oVar.f0()) {
                this.f165225b.a(oVar.Z(), c2582a);
            }
            aVar.e(c2582a.c());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
