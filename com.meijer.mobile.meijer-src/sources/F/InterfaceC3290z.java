package F;

import C.InterfaceC3024i;
import C.InterfaceC3029n;
import C.p0;
import androidx.camera.core.impl.CameraControlInternal;
import java.util.Collection;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3290z extends InterfaceC3024i, p0.b {

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
        private final boolean f8842a;

        boolean b() {
            return this.f8842a;
        }

        a(boolean z10) {
            this.f8842a = z10;
        }
    }

    CameraControlInternal c();

    default void f(boolean z10) {
    }

    void g(Collection<C.p0> collection);

    void h(Collection<C.p0> collection);

    InterfaceC3289y i();

    default void m(androidx.camera.core.impl.f fVar) {
    }

    c0<a> n();

    default boolean o() {
        return true;
    }

    default void p(boolean z10) {
    }

    @Override // C.InterfaceC3024i
    default InterfaceC3029n a() {
        return i();
    }

    default androidx.camera.core.impl.f d() {
        return C3286v.a();
    }

    default boolean k() {
        if (a().getLensFacing() == 0) {
            return true;
        }
        return false;
    }
}
