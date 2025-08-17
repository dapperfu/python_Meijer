package F;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<EnumC3617n> f9900a = Collections.unmodifiableSet(EnumSet.of(EnumC3617n.PASSIVE_FOCUSED, EnumC3617n.PASSIVE_NOT_FOCUSED, EnumC3617n.LOCKED_FOCUSED, EnumC3617n.LOCKED_NOT_FOCUSED));

    /* renamed from: b, reason: collision with root package name */
    private static final Set<EnumC3619p> f9901b = Collections.unmodifiableSet(EnumSet.of(EnumC3619p.CONVERGED, EnumC3619p.UNKNOWN));

    /* renamed from: c, reason: collision with root package name */
    private static final Set<EnumC3615l> f9902c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<EnumC3615l> f9903d;

    static {
        EnumC3615l enumC3615l = EnumC3615l.CONVERGED;
        EnumC3615l enumC3615l2 = EnumC3615l.FLASH_REQUIRED;
        EnumC3615l enumC3615l3 = EnumC3615l.UNKNOWN;
        Set<EnumC3615l> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC3615l, enumC3615l2, enumC3615l3));
        f9902c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC3615l2);
        enumSetCopyOf.remove(enumC3615l3);
        f9903d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (rVar.i() != EnumC3616m.OFF && rVar.i() != EnumC3616m.UNKNOWN && !f9900a.contains(rVar.g())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (rVar.f() == EnumC3614k.OFF) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 ? !(z12 || f9902c.contains(rVar.j())) : !(z12 || f9903d.contains(rVar.j()))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (rVar.d() == EnumC3618o.OFF || f9901b.contains(rVar.h())) {
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
