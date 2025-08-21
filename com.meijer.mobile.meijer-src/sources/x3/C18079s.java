package x3;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: x3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18079s {
    public static int c(InterfaceC18078q interfaceC18078q, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iJ = interfaceC18078q.j(bArr, i10 + i12, i11 - i12);
            if (iJ == -1) {
                break;
            }
            i12 += iJ;
        }
        return i12;
    }

    public static void a(boolean z10, String str) throws ParserException {
        if (!z10) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(InterfaceC18078q interfaceC18078q, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return interfaceC18078q.b(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean d(InterfaceC18078q interfaceC18078q, byte[] bArr, int i10, int i11) throws IOException {
        try {
            interfaceC18078q.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        try {
            interfaceC18078q.k(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
