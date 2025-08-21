package z3;

import Ee.L;
import a3.t;
import d3.D;
import d3.P;
import d3.r;

/* loaded from: classes2.dex */
final class g implements InterfaceC18441a {

    /* renamed from: a, reason: collision with root package name */
    public final t f172340a;

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static InterfaceC18441a c(D d10) {
        d10.X(4);
        int iU = d10.u();
        int iU2 = d10.u();
        d10.X(4);
        int iU3 = d10.u();
        String strA = a(iU3);
        if (strA != null) {
            t.b bVar = new t.b();
            bVar.z0(iU).d0(iU2).u0(strA);
            return new g(bVar.N());
        }
        r.i("StreamFormatChunk", "Ignoring track with unsupported compression " + iU3);
        return null;
    }

    public static InterfaceC18441a d(int i10, D d10) {
        if (i10 == 2) {
            return c(d10);
        }
        if (i10 == 1) {
            return e(d10);
        }
        r.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + P.p0(i10));
        return null;
    }

    public g(t tVar) {
        this.f172340a = tVar;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static InterfaceC18441a e(D d10) {
        int iZ;
        int iZ2 = d10.z();
        String strB = b(iZ2);
        if (strB == null) {
            r.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZ2);
            return null;
        }
        int iZ3 = d10.z();
        int iU = d10.u();
        d10.X(6);
        int iE0 = P.e0(d10.z());
        if (d10.a() > 0) {
            iZ = d10.z();
        } else {
            iZ = 0;
        }
        t.b bVar = new t.b();
        bVar.u0(strB).R(iZ3).v0(iU);
        if (strB.equals("audio/raw") && iE0 != 0) {
            bVar.o0(iE0);
        }
        if (strB.equals("audio/mp4a-latm") && iZ > 0) {
            byte[] bArr = new byte[iZ];
            d10.l(bArr, 0, iZ);
            bVar.g0(L.y(bArr));
        }
        return new g(bVar.N());
    }

    @Override // z3.InterfaceC18441a
    public int getType() {
        return 1718776947;
    }
}
