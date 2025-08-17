package g0;

import H1.n;
import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.InterfaceC15524j;
import m0.InterfaceC15532r;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0003*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm0/j;", "Lf0/z;", "orientation", "", "c", "(Lm0/j;Lf0/z;)I", "b", "Lm0/r;", "a", "(Lm0/r;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14158e {
    public static final int b(InterfaceC15524j interfaceC15524j, EnumC13827z enumC13827z) {
        return enumC13827z == EnumC13827z.f130585a ? n.l(interfaceC15524j.n()) : n.k(interfaceC15524j.n());
    }

    public static final int c(InterfaceC15524j interfaceC15524j, EnumC13827z enumC13827z) {
        return (int) (enumC13827z == EnumC13827z.f130585a ? interfaceC15524j.c() & 4294967295L : interfaceC15524j.c() >> 32);
    }

    public static final int a(InterfaceC15532r interfaceC15532r) {
        long jA;
        if (interfaceC15532r.getOrientation() == EnumC13827z.f130585a) {
            jA = interfaceC15532r.a() & 4294967295L;
        } else {
            jA = interfaceC15532r.a() >> 32;
        }
        return (int) jA;
    }
}
