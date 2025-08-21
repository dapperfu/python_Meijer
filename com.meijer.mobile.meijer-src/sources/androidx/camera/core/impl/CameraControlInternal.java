package androidx.camera.core.impl;

import C.H;
import E.InterfaceC3170j;
import F.C3275j;
import android.graphics.Rect;
import androidx.camera.core.impl.w;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface CameraControlInternal {

    /* renamed from: a, reason: collision with root package name */
    public static final CameraControlInternal f47538a = new b();

    class a implements InterfaceC3170j {
        @Override // E.InterfaceC3170j
        public com.google.common.util.concurrent.q<Void> a() {
            return I.n.p(null);
        }

        @Override // E.InterfaceC3170j
        public com.google.common.util.concurrent.q<Void> b() {
            return I.n.p(null);
        }

        a() {
        }
    }

    class b implements CameraControlInternal {
        @Override // androidx.camera.core.impl.CameraControlInternal
        public void a(w.b bVar) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void d(int i10) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public k e() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void g(k kVar) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void i() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public com.google.common.util.concurrent.q<List<Void>> b(List<i> list, int i10, int i11) {
            return I.n.p(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Rect c() {
            return new Rect();
        }

        b() {
        }
    }

    public interface c {
        void a();

        void b(List<i> list);
    }

    void a(w.b bVar);

    com.google.common.util.concurrent.q<List<Void>> b(List<i> list, int i10, int i11);

    Rect c();

    void d(int i10);

    k e();

    default void f(H.i iVar) {
    }

    void g(k kVar);

    void i();

    public static final class CameraControlException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private C3275j f47539a;

        public CameraControlException(C3275j c3275j) {
            this.f47539a = c3275j;
        }
    }

    default com.google.common.util.concurrent.q<InterfaceC3170j> h(int i10, int i11) {
        return I.n.p(new a());
    }
}
