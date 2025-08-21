package g0;

import H1.n;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.InterfaceC15635j;
import m0.InterfaceC15643r;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0003*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm0/j;", "Lf0/z;", "orientation", "", "c", "(Lm0/j;Lf0/z;)I", "b", "Lm0/r;", "a", "(Lm0/r;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14287e {
    public static final int b(InterfaceC15635j interfaceC15635j, EnumC13937z enumC13937z) {
        return enumC13937z == EnumC13937z.f131419a ? n.l(interfaceC15635j.n()) : n.k(interfaceC15635j.n());
    }

    public static final int c(InterfaceC15635j interfaceC15635j, EnumC13937z enumC13937z) {
        return (int) (enumC13937z == EnumC13937z.f131419a ? interfaceC15635j.c() & 4294967295L : interfaceC15635j.c() >> 32);
    }

    public static final int a(InterfaceC15643r interfaceC15643r) {
        long jA;
        if (interfaceC15643r.getOrientation() == EnumC13937z.f131419a) {
            jA = interfaceC15643r.a() & 4294967295L;
        } else {
            jA = interfaceC15643r.a() >> 32;
        }
        return (int) jA;
    }
}
