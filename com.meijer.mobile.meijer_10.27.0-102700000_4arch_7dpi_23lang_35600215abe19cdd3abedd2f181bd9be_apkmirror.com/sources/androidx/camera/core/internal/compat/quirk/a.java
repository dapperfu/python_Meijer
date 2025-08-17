package androidx.camera.core.internal.compat.quirk;

import C.P;
import F.g0;
import F.h0;
import F.i0;
import F.l0;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile l0 f47528a;

    public static /* synthetic */ void a(h0 h0Var) {
        f47528a = new l0(b.a(h0Var));
        P.a("DeviceQuirks", "core DeviceQuirks = " + l0.d(f47528a));
    }

    public static <T extends g0> T b(Class<T> cls) {
        return (T) f47528a.b(cls);
    }

    public static l0 c() {
        return f47528a;
    }

    static {
        i0.b().c(H.a.a(), new InterfaceC15993a() { // from class: L.a
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                androidx.camera.core.internal.compat.quirk.a.a((h0) obj);
            }
        });
    }
}
