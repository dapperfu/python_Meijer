package x3;

import androidx.media3.common.ParserException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f170343a;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f170355i;
    }

    private static boolean g(int i10, y yVar) {
        return i10 <= 7 ? i10 == yVar.f170353g - 1 : i10 <= 10 && yVar.f170353g == 2;
    }

    public static boolean d(d3.D d10, y yVar, int i10, a aVar) {
        int iF = d10.f();
        long J10 = d10.J();
        long j10 = J10 >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((J10 >> 4) & 15), yVar) && f((int) ((J10 >> 1) & 7), yVar) && !(((J10 & 1) > 1L ? 1 : ((J10 & 1) == 1L ? 0 : -1)) == 0) && c(d10, yVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(d10, yVar, (int) ((J10 >> 12) & 15)) && e(d10, yVar, (int) ((J10 >> 8) & 15)) && b(d10, iF);
    }

    private static boolean e(d3.D d10, y yVar, int i10) {
        int i11 = yVar.f170351e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f170352f;
        }
        if (i10 == 12) {
            return d10.H() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iP = d10.P();
            if (i10 == 14) {
                iP *= 10;
            }
            if (iP == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(d3.D d10, y yVar, int i10) {
        int iJ = j(d10, i10);
        if (iJ != -1 && iJ <= yVar.f170348b) {
            return true;
        }
        return false;
    }

    private static boolean b(d3.D d10, int i10) {
        if (d10.H() == d3.P.x(d10.e(), i10, d10.f() - 1, 0)) {
            return true;
        }
        return false;
    }

    private static boolean c(d3.D d10, y yVar, boolean z10, a aVar) {
        try {
            long jQ = d10.Q();
            if (!z10) {
                jQ *= yVar.f170348b;
            }
            aVar.f170343a = jQ;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean h(InterfaceC18078q interfaceC18078q, y yVar, int i10, a aVar) throws IOException {
        long jG = interfaceC18078q.g();
        byte[] bArr = new byte[2];
        interfaceC18078q.m(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC18078q.d();
            interfaceC18078q.i((int) (jG - interfaceC18078q.getPosition()));
            return false;
        }
        d3.D d10 = new d3.D(16);
        System.arraycopy(bArr, 0, d10.e(), 0, 2);
        d10.V(C18079s.c(interfaceC18078q, d10.e(), 2, 14));
        interfaceC18078q.d();
        interfaceC18078q.i((int) (jG - interfaceC18078q.getPosition()));
        return d(d10, yVar, i10, aVar);
    }

    public static long i(InterfaceC18078q interfaceC18078q, y yVar) throws IOException {
        int i10;
        interfaceC18078q.d();
        boolean z10 = true;
        interfaceC18078q.i(1);
        byte[] bArr = new byte[1];
        interfaceC18078q.m(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        interfaceC18078q.i(2);
        if (z10) {
            i10 = 7;
        } else {
            i10 = 6;
        }
        d3.D d10 = new d3.D(i10);
        d10.V(C18079s.c(interfaceC18078q, d10.e(), 0, i10));
        interfaceC18078q.d();
        a aVar = new a();
        if (c(d10, yVar, z10, aVar)) {
            return aVar.f170343a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(d3.D d10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return d10.H() + 1;
            case 7:
                return d10.P() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
