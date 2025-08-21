package f3;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13951f {
    public static void a(InterfaceC13949d interfaceC13949d) {
        if (interfaceC13949d != null) {
            try {
                interfaceC13949d.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(InterfaceC13949d interfaceC13949d) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i10 = interfaceC13949d.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i11);
    }
}
