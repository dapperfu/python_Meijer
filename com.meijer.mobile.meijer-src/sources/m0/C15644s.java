package m0;

import java.util.List;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm0/r;", "", "a", "(Lm0/r;)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15644s {
    private static final int b(boolean z10, InterfaceC15643r interfaceC15643r, int i10) {
        return z10 ? interfaceC15643r.h().get(i10).f() : interfaceC15643r.h().get(i10).g();
    }

    public static final int a(InterfaceC15643r interfaceC15643r) {
        boolean z10;
        long jC;
        if (interfaceC15643r.getOrientation() == EnumC13937z.f131419a) {
            z10 = true;
        } else {
            z10 = false;
        }
        List<InterfaceC15635j> listH = interfaceC15643r.h();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < listH.size()) {
            int iB = b(z10, interfaceC15643r, i10);
            if (iB == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < listH.size() && b(z10, interfaceC15643r, i10) == iB) {
                    if (z10) {
                        jC = listH.get(i10).c() & 4294967295L;
                    } else {
                        jC = listH.get(i10).c() >> 32;
                    }
                    iMax = Math.max(iMax, (int) jC);
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return (i11 / i12) + interfaceC15643r.g();
    }
}
