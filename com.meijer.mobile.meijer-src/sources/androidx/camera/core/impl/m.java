package androidx.camera.core.impl;

import C.H;
import E.InterfaceC3170j;
import android.graphics.Rect;
import androidx.camera.core.impl.w;
import java.util.List;

/* loaded from: classes.dex */
public class m implements CameraControlInternal {

    /* renamed from: b, reason: collision with root package name */
    private final CameraControlInternal f47651b;

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void a(w.b bVar) {
        this.f47651b.a(bVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.q<List<Void>> b(List<i> list, int i10, int i11) {
        return this.f47651b.b(list, i10, i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect c() {
        return this.f47651b.c();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void d(int i10) {
        this.f47651b.d(i10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public k e() {
        return this.f47651b.e();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void f(H.i iVar) {
        this.f47651b.f(iVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void g(k kVar) {
        this.f47651b.g(kVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.q<InterfaceC3170j> h(int i10, int i11) {
        return this.f47651b.h(i10, i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void i() {
        this.f47651b.i();
    }

    public m(CameraControlInternal cameraControlInternal) {
        this.f47651b = cameraControlInternal;
    }
}
