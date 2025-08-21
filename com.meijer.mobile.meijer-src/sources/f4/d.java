package f4;

import android.util.Pair;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.D;
import d3.P;
import d3.r;
import java.io.IOException;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class d {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f131578a;

        /* renamed from: b, reason: collision with root package name */
        public final long f131579b;

        private a(int i10, long j10) {
            this.f131578a = i10;
            this.f131579b = j10;
        }

        public static a a(InterfaceC18078q interfaceC18078q, D d10) throws IOException {
            interfaceC18078q.m(d10.e(), 0, 8);
            d10.W(0);
            return new a(d10.q(), d10.x());
        }
    }

    public static boolean a(InterfaceC18078q interfaceC18078q) throws IOException {
        D d10 = new D(8);
        int i10 = a.a(interfaceC18078q, d10).f131578a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC18078q.m(d10.e(), 0, 4);
        d10.W(0);
        int iQ = d10.q();
        if (iQ == 1463899717) {
            return true;
        }
        r.d("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static c b(InterfaceC18078q interfaceC18078q) throws IOException {
        byte[] bArr;
        D d10 = new D(16);
        a aVarD = d(1718449184, interfaceC18078q, d10);
        C13599a.g(aVarD.f131579b >= 16);
        interfaceC18078q.m(d10.e(), 0, 16);
        d10.W(0);
        int iZ = d10.z();
        int iZ2 = d10.z();
        int iY = d10.y();
        int iY2 = d10.y();
        int iZ3 = d10.z();
        int iZ4 = d10.z();
        int i10 = ((int) aVarD.f131579b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC18078q.m(bArr, 0, i10);
        } else {
            bArr = P.f127893f;
        }
        byte[] bArr2 = bArr;
        interfaceC18078q.k((int) (interfaceC18078q.g() - interfaceC18078q.getPosition()));
        return new c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr2);
    }

    public static long c(InterfaceC18078q interfaceC18078q) throws IOException {
        D d10 = new D(8);
        a aVarA = a.a(interfaceC18078q, d10);
        if (aVarA.f131578a != 1685272116) {
            interfaceC18078q.d();
            return -1L;
        }
        interfaceC18078q.i(8);
        d10.W(0);
        interfaceC18078q.m(d10.e(), 0, 8);
        long jV = d10.v();
        interfaceC18078q.k(((int) aVarA.f131579b) + 8);
        return jV;
    }

    private static a d(int i10, InterfaceC18078q interfaceC18078q, D d10) throws IOException {
        a aVarA = a.a(interfaceC18078q, d10);
        while (aVarA.f131578a != i10) {
            r.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f131578a);
            long j10 = aVarA.f131579b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 <= 2147483647L) {
                interfaceC18078q.k((int) j11);
                aVarA = a.a(interfaceC18078q, d10);
            } else {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + aVarA.f131578a);
            }
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.d();
        a aVarD = d(1684108385, interfaceC18078q, new D(8));
        interfaceC18078q.k(8);
        return Pair.create(Long.valueOf(interfaceC18078q.getPosition()), Long.valueOf(aVarD.f131579b));
    }
}
