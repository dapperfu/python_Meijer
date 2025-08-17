package F;

import C.InterfaceC2966i;
import C.InterfaceC2971n;
import C.p0;
import androidx.camera.core.impl.CameraControlInternal;
import java.util.Collection;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3628z extends InterfaceC2966i, p0.b {

    /* renamed from: F.z$a */
    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f10075a;

        boolean b() {
            return this.f10075a;
        }

        a(boolean z10) {
            this.f10075a = z10;
        }
    }

    CameraControlInternal c();

    default void f(boolean z10) {
    }

    void g(Collection<C.p0> collection);

    void h(Collection<C.p0> collection);

    InterfaceC3627y i();

    default void m(androidx.camera.core.impl.f fVar) {
    }

    c0<a> n();

    default boolean o() {
        return true;
    }

    default void p(boolean z10) {
    }

    @Override // C.InterfaceC2966i
    default InterfaceC2971n a() {
        return i();
    }

    default androidx.camera.core.impl.f d() {
        return C3624v.a();
    }

    default boolean k() {
        if (a().getLensFacing() == 0) {
            return true;
        }
        return false;
    }
}
