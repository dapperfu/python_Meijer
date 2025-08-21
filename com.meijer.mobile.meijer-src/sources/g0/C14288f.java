package g0;

import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.n;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LH1/d;", "", "velocity", "Lg0/d;", "a", "(LH1/d;F)I", "Ll0/n;", "", "b", "(Ll0/n;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14288f {
    public static final int a(H1.d dVar, float f10) {
        if (Math.abs(f10) < dVar.I1(C14291i.k())) {
            return C14286d.INSTANCE.a();
        }
        if (f10 > 0.0f) {
            return C14286d.INSTANCE.b();
        }
        return C14286d.INSTANCE.c();
    }

    public static final int b(n nVar) {
        long jA;
        if (nVar.getOrientation() == EnumC13937z.f131419a) {
            jA = nVar.a() & 4294967295L;
        } else {
            jA = nVar.a() >> 32;
        }
        return (int) jA;
    }
}
