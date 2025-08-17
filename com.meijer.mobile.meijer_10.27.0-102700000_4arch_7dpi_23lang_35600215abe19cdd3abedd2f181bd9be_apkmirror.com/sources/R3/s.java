package R3;

import java.io.IOException;
import x3.InterfaceC18012q;
import x3.N;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f31814a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static N b(InterfaceC18012q interfaceC18012q) throws IOException {
        return c(interfaceC18012q, true, false);
    }

    public static N d(InterfaceC18012q interfaceC18012q, boolean z10) throws IOException {
        return c(interfaceC18012q, false, z10);
    }

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f31814a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static x3.N c(x3.InterfaceC18012q r25, boolean r26, boolean r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.s.c(x3.q, boolean, boolean):x3.N");
    }
}
