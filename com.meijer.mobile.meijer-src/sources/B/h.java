package B;

import C.InterfaceC3029n;
import F.InterfaceC3289y;
import v.H0;
import v.T;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private T f2141a;

    /* renamed from: b, reason: collision with root package name */
    private H0 f2142b;

    public static h a(InterfaceC3029n interfaceC3029n) {
        if (interfaceC3029n instanceof H0) {
            return ((H0) interfaceC3029n).j();
        }
        InterfaceC3289y implementation = ((InterfaceC3289y) interfaceC3029n).getImplementation();
        o2.i.b(implementation instanceof T, "CameraInfo doesn't contain Camera2 implementation.");
        return ((T) implementation).j();
    }

    public String b() {
        H0 h02 = this.f2142b;
        return h02 != null ? h02.b() : this.f2141a.b();
    }

    public h(T t10) {
        this.f2141a = t10;
    }
}
