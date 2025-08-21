package F;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<EnumC3279n> f8667a = Collections.unmodifiableSet(EnumSet.of(EnumC3279n.PASSIVE_FOCUSED, EnumC3279n.PASSIVE_NOT_FOCUSED, EnumC3279n.LOCKED_FOCUSED, EnumC3279n.LOCKED_NOT_FOCUSED));

    /* renamed from: b, reason: collision with root package name */
    private static final Set<EnumC3281p> f8668b = Collections.unmodifiableSet(EnumSet.of(EnumC3281p.CONVERGED, EnumC3281p.UNKNOWN));

    /* renamed from: c, reason: collision with root package name */
    private static final Set<EnumC3277l> f8669c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<EnumC3277l> f8670d;

    static {
        EnumC3277l enumC3277l = EnumC3277l.CONVERGED;
        EnumC3277l enumC3277l2 = EnumC3277l.FLASH_REQUIRED;
        EnumC3277l enumC3277l3 = EnumC3277l.UNKNOWN;
        Set<EnumC3277l> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC3277l, enumC3277l2, enumC3277l3));
        f8669c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC3277l2);
        enumSetCopyOf.remove(enumC3277l3);
        f8670d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (rVar.i() != EnumC3278m.OFF && rVar.i() != EnumC3278m.UNKNOWN && !f8667a.contains(rVar.g())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (rVar.f() == EnumC3276k.OFF) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 ? !(z12 || f8669c.contains(rVar.j())) : !(z12 || f8670d.contains(rVar.j()))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (rVar.d() == EnumC3280o.OFF || f8668b.contains(rVar.h())) {
            z14 = true;
        } else {
            z14 = false;
        }
        C.P.a("ConvergenceUtils", "checkCaptureResult, AE=" + rVar.j() + " AF =" + rVar.g() + " AWB=" + rVar.h());
        if (z11 && z13 && z14) {
            return true;
        }
        return false;
    }
}
