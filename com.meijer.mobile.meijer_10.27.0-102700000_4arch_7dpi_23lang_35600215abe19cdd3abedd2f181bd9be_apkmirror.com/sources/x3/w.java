package x3;

import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import x3.y;

/* loaded from: classes.dex */
public final class w {
    public static a3.y c(InterfaceC18012q interfaceC18012q, boolean z10) throws Throwable {
        a3.y yVarA = new D().a(interfaceC18012q, z10 ? null : L3.h.f17849b);
        if (yVarA == null || yVarA.e() == 0) {
            return null;
        }
        return yVarA;
    }

    public static y.a f(d3.D d10) {
        d10.X(1);
        int iK = d10.K();
        long jF = d10.f() + iK;
        int i10 = iK / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jA = d10.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jA;
            jArrCopyOf2[i11] = d10.A();
            d10.X(2);
            i11++;
        }
        d10.X((int) (jF - d10.f()));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y f169256a;

        public a(y yVar) {
            this.f169256a = yVar;
        }
    }

    public static boolean a(InterfaceC18012q interfaceC18012q) throws IOException {
        d3.D d10 = new d3.D(4);
        interfaceC18012q.m(d10.e(), 0, 4);
        return d10.J() == 1716281667;
    }

    private static y.a g(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        d3.D d10 = new d3.D(i10);
        interfaceC18012q.readFully(d10.e(), 0, i10);
        return f(d10);
    }

    private static y h(InterfaceC18012q interfaceC18012q) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC18012q.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(InterfaceC18012q interfaceC18012q) throws IOException {
        d3.D d10 = new d3.D(4);
        interfaceC18012q.readFully(d10.e(), 0, 4);
        if (d10.J() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        d3.D d10 = new d3.D(i10);
        interfaceC18012q.readFully(d10.e(), 0, i10);
        d10.X(4);
        return Arrays.asList(S.k(d10, false, false).f169110b);
    }

    public static int b(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.d();
        d3.D d10 = new d3.D(2);
        interfaceC18012q.m(d10.e(), 0, 2);
        int iP = d10.P();
        if ((iP >> 2) == 16382) {
            interfaceC18012q.d();
            return iP;
        }
        interfaceC18012q.d();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static a3.y d(InterfaceC18012q interfaceC18012q, boolean z10) throws Throwable {
        interfaceC18012q.d();
        long jG = interfaceC18012q.g();
        a3.y yVarC = c(interfaceC18012q, z10);
        interfaceC18012q.k((int) (interfaceC18012q.g() - jG));
        return yVarC;
    }

    public static boolean e(InterfaceC18012q interfaceC18012q, a aVar) throws IOException {
        interfaceC18012q.d();
        d3.C c10 = new d3.C(new byte[4]);
        interfaceC18012q.m(c10.f127058a, 0, 4);
        boolean zG = c10.g();
        int iH = c10.h(7);
        int iH2 = c10.h(24) + 4;
        if (iH == 0) {
            aVar.f169256a = h(interfaceC18012q);
            return zG;
        }
        y yVar = aVar.f169256a;
        if (yVar != null) {
            if (iH == 3) {
                aVar.f169256a = yVar.b(g(interfaceC18012q, iH2));
                return zG;
            }
            if (iH == 4) {
                aVar.f169256a = yVar.c(j(interfaceC18012q, iH2));
                return zG;
            }
            if (iH == 6) {
                d3.D d10 = new d3.D(iH2);
                interfaceC18012q.readFully(d10.e(), 0, iH2);
                d10.X(4);
                aVar.f169256a = yVar.a(Ce.L.y(J3.a.d(d10)));
                return zG;
            }
            interfaceC18012q.k(iH2);
            return zG;
        }
        throw new IllegalArgumentException();
    }
}
