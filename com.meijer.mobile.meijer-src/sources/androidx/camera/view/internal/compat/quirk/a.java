package androidx.camera.view.internal.compat.quirk;

import C.P;
import F.g0;
import F.h0;
import F.i0;
import F.l0;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile l0 f47874a;

    public static /* synthetic */ void a(h0 h0Var) {
        f47874a = new l0(b.a(h0Var));
        P.a("DeviceQuirks", "view DeviceQuirks = " + l0.d(f47874a));
    }

    public static <T extends g0> T b(Class<T> cls) {
        return (T) f47874a.b(cls);
    }

    static {
        i0.b().c(H.a.a(), new InterfaceC16068a() { // from class: W.a
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                androidx.camera.view.internal.compat.quirk.a.a((h0) obj);
            }
        });
    }
}
