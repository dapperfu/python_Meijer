package B;

import C.InterfaceC2971n;
import F.InterfaceC3627y;
import v.H0;
import v.T;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private T f1662a;

    /* renamed from: b, reason: collision with root package name */
    private H0 f1663b;

    public static h a(InterfaceC2971n interfaceC2971n) {
        if (interfaceC2971n instanceof H0) {
            return ((H0) interfaceC2971n).j();
        }
        InterfaceC3627y implementation = ((InterfaceC3627y) interfaceC2971n).getImplementation();
        o2.i.b(implementation instanceof T, "CameraInfo doesn't contain Camera2 implementation.");
        return ((T) implementation).j();
    }

    public String b() {
        H0 h02 = this.f1663b;
        return h02 != null ? h02.b() : this.f1662a.b();
    }

    public h(T t10) {
        this.f1662a = t10;
    }
}
