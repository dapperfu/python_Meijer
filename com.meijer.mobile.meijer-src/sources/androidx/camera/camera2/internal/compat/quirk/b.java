package androidx.camera.camera2.internal.compat.quirk;

import C.P;
import F.g0;
import F.h0;
import F.i0;
import F.l0;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile l0 f47461a;

    public static /* synthetic */ void a(h0 h0Var) {
        f47461a = new l0(c.a(h0Var));
        P.a("DeviceQuirks", "camera2 DeviceQuirks = " + l0.d(f47461a));
    }

    public static <T extends g0> T b(Class<T> cls) {
        return (T) f47461a.b(cls);
    }

    public static l0 c() {
        return f47461a;
    }

    static {
        i0.b().c(H.a.a(), new InterfaceC16068a() { // from class: y.a
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                androidx.camera.camera2.internal.compat.quirk.b.a((h0) obj);
            }
        });
    }
}
