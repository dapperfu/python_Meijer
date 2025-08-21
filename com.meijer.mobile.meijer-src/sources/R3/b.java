package R3;

import Ee.L;
import a3.C5653j;
import a3.t;
import a3.y;
import a3.z;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import d3.C13607i;
import d3.D;
import d3.P;
import e3.c;
import e3.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x3.B;
import x3.C;
import x3.C18065d;
import x3.C18075n;
import x3.C18079s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f31656a = P.q0("OpusHead");

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31657a;

        /* renamed from: b, reason: collision with root package name */
        public int f31658b;

        /* renamed from: c, reason: collision with root package name */
        public int f31659c;

        /* renamed from: d, reason: collision with root package name */
        public long f31660d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f31661e;

        /* renamed from: f, reason: collision with root package name */
        private final D f31662f;

        /* renamed from: g, reason: collision with root package name */
        private final D f31663g;

        /* renamed from: h, reason: collision with root package name */
        private int f31664h;

        /* renamed from: i, reason: collision with root package name */
        private int f31665i;

        public boolean a() {
            int i10 = this.f31658b + 1;
            this.f31658b = i10;
            if (i10 == this.f31657a) {
                return false;
            }
            this.f31660d = this.f31661e ? this.f31662f.O() : this.f31662f.J();
            if (this.f31658b == this.f31664h) {
                this.f31659c = this.f31663g.L();
                this.f31663g.X(4);
                int i11 = this.f31665i - 1;
                this.f31665i = i11;
                this.f31664h = i11 > 0 ? this.f31663g.L() - 1 : -1;
            }
            return true;
        }

        public a(D d10, D d11, boolean z10) throws ParserException {
            this.f31663g = d10;
            this.f31662f = d11;
            this.f31661e = z10;
            d11.W(12);
            this.f31657a = d11.L();
            d10.W(12);
            this.f31665i = d10.L();
            C18079s.a(d10.q() == 1, "first_chunk must be 1");
            this.f31658b = -1;
        }
    }

    /* renamed from: R3.b$b, reason: collision with other inner class name */
    private static final class C0734b {

        /* renamed from: a, reason: collision with root package name */
        private final String f31666a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f31667b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31668c;

        /* renamed from: d, reason: collision with root package name */
        private final long f31669d;

        public C0734b(String str, byte[] bArr, long j10, long j11) {
            this.f31666a = str;
            this.f31667b = bArr;
            this.f31668c = j10;
            this.f31669d = j11;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final f f31670a;

        public c(f fVar) {
            this.f31670a = fVar;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f31671a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31672b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31673c;

        public d(long j10, long j11, String str) {
            this.f31671a = j10;
            this.f31672b = j11;
            this.f31673c = str;
        }
    }

    private interface e {
        int a();

        int b();

        int c();
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f31674a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f31675b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f31676c;

        public f(boolean z10, boolean z11, boolean z12) {
            this.f31674a = z10;
            this.f31675b = z11;
            this.f31676c = z12;
        }
    }

    static final class h implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f31681a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31682b;

        /* renamed from: c, reason: collision with root package name */
        private final D f31683c;

        @Override // R3.b.e
        public int a() {
            int i10 = this.f31681a;
            return i10 == -1 ? this.f31683c.L() : i10;
        }

        @Override // R3.b.e
        public int b() {
            return this.f31681a;
        }

        @Override // R3.b.e
        public int c() {
            return this.f31682b;
        }

        public h(c.C2039c c2039c, a3.t tVar) {
            D d10 = c2039c.f129414b;
            this.f31683c = d10;
            d10.W(12);
            int iL = d10.L();
            if ("audio/raw".equals(tVar.f44767o)) {
                int iG0 = P.g0(tVar.f44744G, tVar.f44742E);
                if (iL == 0 || iL % iG0 != 0) {
                    d3.r.i("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iG0 + ", stsz sample size: " + iL);
                    iL = iG0;
                }
            }
            this.f31681a = iL == 0 ? -1 : iL;
            this.f31682b = d10.L();
        }
    }

    static final class i implements e {

        /* renamed from: a, reason: collision with root package name */
        private final D f31684a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31685b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31686c;

        /* renamed from: d, reason: collision with root package name */
        private int f31687d;

        /* renamed from: e, reason: collision with root package name */
        private int f31688e;

        @Override // R3.b.e
        public int b() {
            return -1;
        }

        @Override // R3.b.e
        public int a() {
            int i10 = this.f31686c;
            if (i10 == 8) {
                return this.f31684a.H();
            }
            if (i10 == 16) {
                return this.f31684a.P();
            }
            int i11 = this.f31687d;
            this.f31687d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f31688e & 15;
            }
            int iH = this.f31684a.H();
            this.f31688e = iH;
            return (iH & 240) >> 4;
        }

        @Override // R3.b.e
        public int c() {
            return this.f31685b;
        }

        public i(c.C2039c c2039c) {
            D d10 = c2039c.f129414b;
            this.f31684a = d10;
            d10.W(12);
            this.f31686c = d10.L() & l3.f93323c;
            this.f31685b = d10.L();
        }
    }

    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        private final int f31689a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31690b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31691c;

        public j(int i10, long j10, int i11) {
            this.f31689a = i10;
            this.f31690b = j10;
            this.f31691c = i11;
        }
    }

    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final c f31692a;

        public boolean b() {
            c cVar = this.f31692a;
            return cVar != null && cVar.f31670a.f31674a && this.f31692a.f31670a.f31675b;
        }

        public k(c cVar) {
            this.f31692a = cVar;
        }
    }

    private static void I(D d10, int i10, int i11, int i12, int i13, int i14, a3.o oVar, g gVar, int i15) throws ParserException {
        int i16;
        String str;
        int i17;
        a3.o oVar2;
        List<byte[]> list;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        f.k kVar;
        int i24;
        int i25;
        int i26;
        int i27 = i11;
        int i28 = i12;
        a3.o oVarB = oVar;
        g gVar2 = gVar;
        d10.W(i27 + 16);
        d10.X(16);
        int iP = d10.P();
        int iP2 = d10.P();
        d10.X(50);
        int iF = d10.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, u> pairW = w(d10, i27, i28);
            if (pairW != null) {
                iIntValue = ((Integer) pairW.first).intValue();
                oVarB = oVarB == null ? null : oVarB.b(((u) pairW.second).f31830b);
                gVar2.f31677a[i15] = (u) pairW.second;
            }
            d10.W(iF);
        }
        String str2 = "video/3gpp";
        String str3 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fU = 1.0f;
        int i29 = 8;
        int i30 = 8;
        List<byte[]> listY = null;
        String str4 = null;
        byte[] bArrV = null;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int iJ = -1;
        int i34 = -1;
        int iK = -1;
        ByteBuffer byteBufferA = null;
        C0734b c0734bK = null;
        f.k kVar2 = null;
        boolean z10 = false;
        while (iF - i27 < i28) {
            d10.W(iF);
            int iF2 = d10.f();
            int iQ = d10.q();
            if (iQ == 0 && d10.f() - i11 == i28) {
                break;
            }
            C18079s.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = d10.q();
            if (iQ2 == 1635148611) {
                C18079s.a(str3 == null, null);
                d10.W(iF2 + 8);
                C18065d c18065dB = C18065d.b(d10);
                List<byte[]> list2 = c18065dB.f170244a;
                gVar2.f31679c = c18065dB.f170245b;
                if (!z10) {
                    fU = c18065dB.f170254k;
                }
                String str5 = c18065dB.f170255l;
                int i35 = c18065dB.f170253j;
                int i36 = c18065dB.f170250g;
                int i37 = c18065dB.f170251h;
                listY = list2;
                int i38 = c18065dB.f170252i;
                int i39 = c18065dB.f170248e;
                f.k kVar3 = kVar2;
                oVar2 = oVarB;
                kVar = kVar3;
                i16 = iF;
                i18 = iIntValue;
                str = str2;
                iJ = i36;
                i17 = i37;
                iK = i38;
                i30 = c18065dB.f170249f;
                i29 = i39;
                str4 = str5;
                str3 = "video/avc";
                i32 = i35;
            } else {
                i16 = iF;
                if (iQ2 == 1752589123) {
                    C18079s.a(str3 == null, null);
                    d10.W(iF2 + 8);
                    C cA = C.a(d10);
                    List<byte[]> list3 = cA.f170132a;
                    gVar2.f31679c = cA.f170133b;
                    if (!z10) {
                        fU = cA.f170143l;
                    }
                    int i40 = cA.f170144m;
                    int i41 = cA.f170134c;
                    String str6 = cA.f170145n;
                    int i42 = cA.f170142k;
                    listY = list3;
                    if (i42 != -1) {
                        i31 = i42;
                    }
                    int i43 = cA.f170139h;
                    int i44 = cA.f170140i;
                    int i45 = cA.f170141j;
                    int i46 = cA.f170137f;
                    int i47 = cA.f170138g;
                    oVar2 = oVarB;
                    i18 = iIntValue;
                    str = str2;
                    i17 = i44;
                    iJ = i43;
                    iK = i45;
                    i29 = i46;
                    kVar = cA.f170146o;
                    i32 = i40;
                    i33 = i41;
                    str4 = str6;
                    i30 = i47;
                    str3 = "video/hevc";
                } else {
                    str = str2;
                    if (iQ2 == 1818785347) {
                        C18079s.a("video/hevc".equals(str3), "lhvC must follow hvcC atom");
                        f.k kVar4 = kVar2;
                        C18079s.a(kVar4 != null && kVar4.f129473b.size() >= 2, "must have at least two layers");
                        d10.W(iF2 + 8);
                        C c10 = C.c(d10, (f.k) C13599a.e(kVar4));
                        C18079s.a(gVar2.f31679c == c10.f170133b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i48 = c10.f170139h;
                        int i49 = iJ;
                        if (i48 != -1) {
                            C18079s.a(i49 == i48, "colorSpace must be the same for both views");
                        }
                        int i50 = c10.f170140i;
                        int i51 = i34;
                        if (i50 != -1) {
                            C18079s.a(i51 == i50, "colorRange must be the same for both views");
                        }
                        int i52 = c10.f170141j;
                        if (i52 != -1) {
                            int i53 = iK;
                            i25 = i53;
                            C18079s.a(i53 == i52, "colorTransfer must be the same for both views");
                        } else {
                            i25 = iK;
                        }
                        C18079s.a(i29 == c10.f170137f, "bitdepthLuma must be the same for both views");
                        C18079s.a(i30 == c10.f170138g, "bitdepthChroma must be the same for both views");
                        List<byte[]> listK = listY;
                        if (listK != null) {
                            listK = L.p().j(listK).j(c10.f170132a).k();
                            i26 = i49;
                        } else {
                            i26 = i49;
                            C18079s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str3 = "video/mv-hevc";
                        oVar2 = oVarB;
                        i18 = iIntValue;
                        i17 = i51;
                        iJ = i26;
                        iK = i25;
                        str4 = c10.f170145n;
                        kVar = kVar4;
                        listY = listK;
                    } else {
                        List<byte[]> listH = listY;
                        int i54 = iJ;
                        i17 = i34;
                        int i55 = iK;
                        f.k kVar5 = kVar2;
                        if (iQ2 == 1986361461) {
                            k kVarH = H(d10, iF2, iQ);
                            if (kVarH == null || kVarH.f31692a == null) {
                                i24 = i31;
                                i31 = i24;
                                oVar2 = oVarB;
                                listY = listH;
                                i18 = iIntValue;
                                iJ = i54;
                                iK = i55;
                                kVar = kVar5;
                            } else if (kVar5 == null || kVar5.f129473b.size() < 2) {
                                i24 = i31;
                                if (i24 == -1) {
                                    i31 = kVarH.f31692a.f31670a.f31676c ? 5 : 4;
                                } else {
                                    i31 = i24;
                                }
                                oVar2 = oVarB;
                                listY = listH;
                                i18 = iIntValue;
                                iJ = i54;
                                iK = i55;
                                kVar = kVar5;
                            } else {
                                C18079s.a(kVarH.b(), "both eye views must be marked as available");
                                C18079s.a(!kVarH.f31692a.f31670a.f31676c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i24 = i31;
                                i31 = i24;
                                oVar2 = oVarB;
                                listY = listH;
                                i18 = iIntValue;
                                iJ = i54;
                                iK = i55;
                                kVar = kVar5;
                            }
                        } else {
                            int i56 = i31;
                            if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                                oVar2 = oVarB;
                                list = listH;
                                i18 = iIntValue;
                                i19 = i56;
                                i20 = i30;
                                i21 = i29;
                                i22 = i54;
                                i23 = i55;
                                C18075n c18075nA = C18075n.a(d10);
                                if (c18075nA != null) {
                                    str3 = "video/dolby-vision";
                                    str4 = c18075nA.f170325c;
                                }
                            } else if (iQ2 == 1987076931) {
                                C18079s.a(str3 == null, null);
                                String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                d10.W(iF2 + 12);
                                byte bH = (byte) d10.H();
                                byte bH2 = (byte) d10.H();
                                int iH = d10.H();
                                i29 = iH >> 4;
                                i18 = iIntValue;
                                byte b10 = (byte) ((iH >> 1) & 7);
                                if (str7.equals("video/x-vnd.on2.vp9")) {
                                    listH = C13607i.h(bH, bH2, (byte) i29, b10);
                                }
                                boolean z11 = (iH & 1) != 0;
                                int iH2 = d10.H();
                                int iH3 = d10.H();
                                iJ = C5653j.j(iH2);
                                int i57 = z11 ? 1 : 2;
                                iK = C5653j.k(iH3);
                                str3 = str7;
                                oVar2 = oVarB;
                                i30 = i29;
                                i17 = i57;
                                kVar = kVar5;
                                listY = listH;
                                i31 = i56;
                            } else {
                                i18 = iIntValue;
                                if (iQ2 == 1635135811) {
                                    int i58 = iQ - 8;
                                    byte[] bArr = new byte[i58];
                                    d10.l(bArr, 0, i58);
                                    listY = L.y(bArr);
                                    d10.W(iF2 + 8);
                                    C5653j c5653jH = h(d10);
                                    int i59 = c5653jH.f44667e;
                                    int i60 = c5653jH.f44668f;
                                    int i61 = c5653jH.f44663a;
                                    int i62 = c5653jH.f44664b;
                                    iK = c5653jH.f44665c;
                                    i29 = i59;
                                    oVar2 = oVarB;
                                    i30 = i60;
                                    iJ = i61;
                                    i17 = i62;
                                    str3 = "video/av01";
                                    kVar = kVar5;
                                } else if (iQ2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(d10.D());
                                    byteBuffer.putShort(d10.D());
                                    byteBufferA = byteBuffer;
                                    oVar2 = oVarB;
                                    listY = listH;
                                    kVar = kVar5;
                                    iJ = i54;
                                    iK = i55;
                                } else if (iQ2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sD = d10.D();
                                    short sD2 = d10.D();
                                    short sD3 = d10.D();
                                    short sD4 = d10.D();
                                    int i63 = i30;
                                    short sD5 = d10.D();
                                    int i64 = i29;
                                    short sD6 = d10.D();
                                    oVar2 = oVarB;
                                    short sD7 = d10.D();
                                    short sD8 = d10.D();
                                    long J10 = d10.J();
                                    long J11 = d10.J();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sD5);
                                    byteBuffer2.putShort(sD6);
                                    byteBuffer2.putShort(sD);
                                    byteBuffer2.putShort(sD2);
                                    byteBuffer2.putShort(sD3);
                                    byteBuffer2.putShort(sD4);
                                    byteBuffer2.putShort(sD7);
                                    byteBuffer2.putShort(sD8);
                                    byteBuffer2.putShort((short) (J10 / 10000));
                                    byteBuffer2.putShort((short) (J11 / 10000));
                                    byteBufferA = byteBuffer2;
                                    kVar = kVar5;
                                    i30 = i63;
                                    i29 = i64;
                                    iJ = i54;
                                    iK = i55;
                                    listY = listH;
                                    i31 = i56;
                                } else {
                                    oVar2 = oVarB;
                                    list = listH;
                                    i19 = i56;
                                    i20 = i30;
                                    i21 = i29;
                                    if (iQ2 == 1681012275) {
                                        C18079s.a(str3 == null, null);
                                        kVar = kVar5;
                                        i30 = i20;
                                        i29 = i21;
                                        str3 = str;
                                    } else if (iQ2 == 1702061171) {
                                        C18079s.a(str3 == null, null);
                                        c0734bK = k(d10, iF2);
                                        String str8 = c0734bK.f31666a;
                                        byte[] bArr2 = c0734bK.f31667b;
                                        listY = bArr2 != null ? L.y(bArr2) : list;
                                        str3 = str8;
                                        kVar = kVar5;
                                        i30 = i20;
                                        i29 = i21;
                                        iJ = i54;
                                        iK = i55;
                                        i31 = i19;
                                    } else if (iQ2 == 1885434736) {
                                        fU = u(d10, iF2);
                                        kVar = kVar5;
                                        i30 = i20;
                                        i29 = i21;
                                        iJ = i54;
                                        iK = i55;
                                        listY = list;
                                        i31 = i19;
                                        z10 = true;
                                    } else {
                                        if (iQ2 == 1937126244) {
                                            bArrV = v(d10, iF2, iQ);
                                        } else if (iQ2 == 1936995172) {
                                            int iH4 = d10.H();
                                            d10.X(3);
                                            if (iH4 == 0) {
                                                int iH5 = d10.H();
                                                if (iH5 == 0) {
                                                    i19 = 0;
                                                } else if (iH5 == 1) {
                                                    i19 = 1;
                                                } else if (iH5 == 2) {
                                                    i19 = 2;
                                                } else if (iH5 == 3) {
                                                    i19 = 3;
                                                }
                                            }
                                        } else {
                                            if (iQ2 == 1634760259) {
                                                int i65 = iQ - 12;
                                                byte[] bArr3 = new byte[i65];
                                                d10.W(iF2 + 12);
                                                d10.l(bArr3, 0, i65);
                                                listY = L.y(bArr3);
                                                C5653j c5653jF = f(new D(bArr3));
                                                int i66 = c5653jF.f44667e;
                                                int i67 = c5653jF.f44668f;
                                                int i68 = c5653jF.f44663a;
                                                int i69 = c5653jF.f44664b;
                                                iK = c5653jF.f44665c;
                                                i29 = i66;
                                                i30 = i67;
                                                iJ = i68;
                                                i17 = i69;
                                                str3 = "video/apv";
                                                kVar = kVar5;
                                                i31 = i19;
                                            } else {
                                                i22 = i54;
                                                if (iQ2 == 1668246642) {
                                                    i23 = i55;
                                                    if (i22 == -1 && i23 == -1) {
                                                        int iQ3 = d10.q();
                                                        if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                                            int iP3 = d10.P();
                                                            int iP4 = d10.P();
                                                            d10.X(2);
                                                            boolean z12 = iQ == 19 && (d10.H() & 128) != 0;
                                                            int iJ2 = C5653j.j(iP3);
                                                            i17 = z12 ? 1 : 2;
                                                            i30 = i20;
                                                            i29 = i21;
                                                            listY = list;
                                                            iJ = iJ2;
                                                            iK = C5653j.k(iP4);
                                                            kVar = kVar5;
                                                            i31 = i19;
                                                        } else {
                                                            d3.r.i("BoxParsers", "Unsupported color type: " + e3.c.a(iQ3));
                                                        }
                                                    }
                                                } else {
                                                    i23 = i55;
                                                }
                                            }
                                        }
                                        kVar = kVar5;
                                        i30 = i20;
                                        i29 = i21;
                                    }
                                    iJ = i54;
                                    iK = i55;
                                    listY = list;
                                    i31 = i19;
                                }
                                i31 = i56;
                            }
                            i30 = i20;
                            i29 = i21;
                            listY = list;
                            iK = i23;
                            iJ = i22;
                            kVar = kVar5;
                            i31 = i19;
                        }
                    }
                }
            }
            a3.o oVar3 = oVar2;
            kVar2 = kVar;
            oVarB = oVar3;
            i27 = i11;
            i28 = i12;
            iF = i16 + iQ;
            iIntValue = i18;
            str2 = str;
            i34 = i17;
            gVar2 = gVar;
        }
        a3.o oVar4 = oVarB;
        List<byte[]> list4 = listY;
        int i70 = i31;
        int i71 = iJ;
        int i72 = i34;
        int i73 = iK;
        int i74 = i30;
        int i75 = i29;
        if (str3 == null) {
            return;
        }
        t.b bVarT = new t.b().e0(i13).u0(str3).S(str4).z0(iP).d0(iP2).q0(fU).t0(i14).r0(bArrV).x0(i70).g0(list4).l0(i32).m0(i33).Y(oVar4).T(new C5653j.b().d(i71).c(i72).e(i73).f(byteBufferA != null ? byteBufferA.array() : null).g(i75).b(i74).a());
        if (c0734bK != null) {
            bVarT.Q(Je.f.k(c0734bK.f31668c)).p0(Je.f.k(c0734bK.f31669d));
        }
        gVar.f31678b = bVarT.N();
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[P.o(4, 0, length)] && jArr[P.o(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static R3.w y(R3.t r34, e3.c.b r35, x3.B r36) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.y(R3.t, e3.c$b, x3.B):R3.w");
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final u[] f31677a;

        /* renamed from: b, reason: collision with root package name */
        public a3.t f31678b;

        /* renamed from: c, reason: collision with root package name */
        public int f31679c;

        /* renamed from: d, reason: collision with root package name */
        public int f31680d = 0;

        public g(int i10) {
            this.f31677a = new u[i10];
        }
    }

    private static g A(D d10, int i10, int i11, String str, a3.o oVar, boolean z10) throws ParserException {
        d10.W(12);
        int iQ = d10.q();
        g gVar = new g(iQ);
        int i12 = 0;
        while (i12 < iQ) {
            int iF = d10.f();
            int iQ2 = d10.q();
            C18079s.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = d10.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1748121139 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521 || iQ3 == 1634760241) {
                g gVar2 = gVar;
                int i13 = i12;
                I(d10, iQ3, iF, iQ2, i10, i11, oVar, gVar2, i13);
                gVar = gVar2;
                i12 = i13;
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667 || iQ3 == 1767992678) {
                g gVar3 = gVar;
                g(d10, iQ3, iF, iQ2, i10, str, z10, oVar, gVar3, i12);
                gVar = gVar3;
            } else if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                B(d10, iQ3, iF, iQ2, i10, str, gVar);
            } else if (iQ3 == 1835365492) {
                s(d10, iQ3, iF, i10, gVar);
            } else if (iQ3 == 1667329389) {
                gVar.f31678b = new t.b().e0(i10).u0("application/x-camera-motion").N();
            }
            d10.W(iF + iQ2);
            i12++;
        }
        return gVar;
    }

    private static void B(D d10, int i10, int i11, int i12, int i13, String str, g gVar) {
        d10.W(i11 + 16);
        String str2 = "application/ttml+xml";
        L lY = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                d10.l(bArr, 0, i14);
                lY = L.y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                gVar.f31680d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        gVar.f31678b = new t.b().e0(i13).u0(str2).j0(str).y0(j10).g0(lY).N();
    }

    private static j C(D d10) {
        long j10;
        d10.W(8);
        int iN = n(d10.q());
        d10.X(iN == 0 ? 8 : 16);
        int iQ = d10.q();
        d10.X(4);
        int iF = d10.f();
        int i10 = iN == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i12 >= i10) {
                d10.X(i10);
                break;
            }
            if (d10.e()[iF + i12] != -1) {
                long J10 = iN == 0 ? d10.J() : d10.O();
                if (J10 != 0) {
                    j10 = J10;
                }
            } else {
                i12++;
            }
        }
        d10.X(16);
        int iQ2 = d10.q();
        int iQ3 = d10.q();
        d10.X(4);
        int iQ4 = d10.q();
        int iQ5 = d10.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i11 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i11 = 270;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i11 = 180;
        }
        return new j(iQ, j10, i11);
    }

    public static t D(c.b bVar, c.C2039c c2039c, long j10, a3.o oVar, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        c.b bVarD;
        Pair<long[], long[]> pairJ;
        c.b bVar2 = (c.b) C13599a.e(bVar.d(1835297121));
        int iD = d(o(((c.C2039c) C13599a.e(bVar2.e(1751411826))).f129414b));
        if (iD == -1) {
            return null;
        }
        j jVarC = C(((c.C2039c) C13599a.e(bVar.e(1953196132))).f129414b);
        long j11 = j10 == -9223372036854775807L ? jVarC.f31690b : j10;
        long j12 = t(c2039c.f129414b).f129419c;
        long jV0 = j11 != -9223372036854775807L ? P.V0(j11, 1000000L, j12) : -9223372036854775807L;
        c.b bVar3 = (c.b) C13599a.e(((c.b) C13599a.e(bVar2.d(1835626086))).d(1937007212));
        d dVarQ = q(((c.C2039c) C13599a.e(bVar2.e(1835296868))).f129414b);
        c.C2039c c2039cE = bVar3.e(1937011556);
        if (c2039cE == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        g gVarA = A(c2039cE.f129414b, jVarC.f31689a, jVarC.f31691c, dVarQ.f31673c, oVar, z11);
        if (z10 || (bVarD = bVar.d(1701082227)) == null || (pairJ = j(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairJ.first;
            jArr2 = (long[]) pairJ.second;
            jArr = jArr3;
        }
        if (gVarA.f31678b == null) {
            return null;
        }
        return new t(jVarC.f31689a, iD, dVarQ.f31671a, j12, jV0, dVarQ.f31672b, gVarA.f31678b, gVarA.f31680d, gVarA.f31677a, gVarA.f31679c, jArr, jArr2);
    }

    public static List<w> E(c.b bVar, B b10, long j10, a3.o oVar, boolean z10, boolean z11, De.g<t, t> gVar) throws ParserException {
        t tVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f129413d.size(); i10++) {
            c.b bVar2 = bVar.f129413d.get(i10);
            if (bVar2.f129410a == 1953653099 && (tVarApply = gVar.apply(D(bVar2, (c.C2039c) C13599a.e(bVar.e(1836476516)), j10, oVar, z10, z11))) != null) {
                arrayList.add(y(tVarApply, (c.b) C13599a.e(((c.b) C13599a.e(((c.b) C13599a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b10));
            }
        }
        return arrayList;
    }

    public static y F(c.C2039c c2039c) {
        D d10 = c2039c.f129414b;
        d10.W(8);
        y yVar = new y(new y.a[0]);
        while (d10.a() >= 8) {
            int iF = d10.f();
            int iQ = d10.q();
            int iQ2 = d10.q();
            if (iQ2 == 1835365473) {
                d10.W(iF);
                yVar = yVar.b(G(d10, iF + iQ));
            } else if (iQ2 == 1936553057) {
                d10.W(iF);
                yVar = yVar.b(r.b(d10, iF + iQ));
            } else if (iQ2 == -1451722374) {
                yVar = yVar.b(J(d10));
            }
            d10.W(iF + iQ);
        }
        return yVar;
    }

    private static y G(D d10, int i10) {
        d10.X(8);
        e(d10);
        while (d10.f() < i10) {
            int iF = d10.f();
            int iQ = d10.q();
            if (d10.q() == 1768715124) {
                d10.W(iF);
                return p(d10, iF + iQ);
            }
            d10.W(iF + iQ);
        }
        return null;
    }

    static k H(D d10, int i10, int i11) throws ParserException {
        d10.W(i10 + 8);
        int iF = d10.f();
        c cVarZ = null;
        while (iF - i10 < i11) {
            d10.W(iF);
            int iQ = d10.q();
            C18079s.a(iQ > 0, "childAtomSize must be positive");
            if (d10.q() == 1702454643) {
                cVarZ = z(d10, iF, iQ);
            }
            iF += iQ;
        }
        if (cVarZ == null) {
            return null;
        }
        return new k(cVarZ);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static C5653j f(D d10) {
        C5653j.b bVar = new C5653j.b();
        d3.C c10 = new d3.C(d10.e());
        c10.p(d10.f() * 8);
        c10.s(1);
        int iH = c10.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            c10.s(1);
            int iH2 = c10.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                c10.r(6);
                boolean zG = c10.g();
                c10.q();
                c10.s(11);
                c10.r(4);
                int iH3 = c10.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                c10.s(1);
                if (zG) {
                    int iH4 = c10.h(8);
                    int iH5 = c10.h(8);
                    c10.s(1);
                    bVar.d(C5653j.j(iH4)).c(c10.g() ? 1 : 2).e(C5653j.k(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(d3.D r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, a3.o r31, R3.b.g r32, int r33) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.g(d3.D, int, int, int, int, java.lang.String, boolean, a3.o, R3.b$g, int):void");
    }

    private static C5653j h(D d10) {
        C5653j.b bVar = new C5653j.b();
        d3.C c10 = new d3.C(d10.e());
        c10.p(d10.f() * 8);
        c10.s(1);
        int iH = c10.h(3);
        c10.r(6);
        boolean zG = c10.g();
        boolean zG2 = c10.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        c10.r(13);
        c10.q();
        int iH2 = c10.h(4);
        if (iH2 != 1) {
            d3.r.g("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (c10.g()) {
            d3.r.g("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = c10.g();
        c10.q();
        if (zG3 && c10.h(8) > 127) {
            d3.r.g("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = c10.h(3);
        c10.q();
        if (c10.g()) {
            d3.r.g("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (c10.g()) {
            d3.r.g("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (c10.g()) {
            d3.r.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = c10.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            c10.r(12);
            if (c10.h(5) > 7) {
                c10.q();
            }
        }
        int iH5 = c10.h(4);
        int iH6 = c10.h(4);
        c10.r(iH5 + 1);
        c10.r(iH6 + 1);
        if (c10.g()) {
            c10.r(7);
        }
        c10.r(7);
        boolean zG4 = c10.g();
        if (zG4) {
            c10.r(2);
        }
        if ((c10.g() ? 2 : c10.h(1)) > 0 && !c10.g()) {
            c10.r(1);
        }
        if (zG4) {
            c10.r(3);
        }
        c10.r(3);
        boolean zG5 = c10.g();
        if (iH3 == 2 && zG5) {
            c10.q();
        }
        if (iH3 != 1 && c10.g()) {
            z10 = true;
        }
        if (c10.g()) {
            int iH7 = c10.h(8);
            int iH8 = c10.h(8);
            bVar.d(C5653j.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || c10.h(8) != 0) ? c10.h(1) : 1) != 1 ? 2 : 1).e(C5653j.k(iH8));
        }
        return bVar.a();
    }

    static Pair<Integer, u> i(D d10, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strE = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            d10.W(i12);
            int iQ = d10.q();
            int iQ2 = d10.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(d10.q());
            } else if (iQ2 == 1935894637) {
                d10.X(4);
                strE = d10.E(4);
            } else if (iQ2 == 1935894633) {
                i13 = i12;
                i14 = iQ;
            }
            i12 += iQ;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        C18079s.a(numValueOf != null, "frma atom is mandatory");
        C18079s.a(i13 != -1, "schi atom is mandatory");
        u uVarX = x(d10, i13, i14, strE);
        C18079s.a(uVarX != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) P.h(uVarX));
    }

    private static C0734b k(D d10, int i10) {
        d10.W(i10 + 12);
        d10.X(1);
        l(d10);
        d10.X(2);
        int iH = d10.H();
        if ((iH & 128) != 0) {
            d10.X(2);
        }
        if ((iH & 64) != 0) {
            d10.X(d10.H());
        }
        if ((iH & 32) != 0) {
            d10.X(2);
        }
        d10.X(1);
        l(d10);
        String strH = z.h(d10.H());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new C0734b(strH, null, -1L, -1L);
        }
        d10.X(4);
        long J10 = d10.J();
        long J11 = d10.J();
        d10.X(1);
        int iL = l(d10);
        long j10 = J11;
        byte[] bArr = new byte[iL];
        d10.l(bArr, 0, iL);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new C0734b(strH, bArr, j10, J10 > 0 ? J10 : -1L);
    }

    public static int n(int i10) {
        return (i10 >> 24) & l3.f93323c;
    }

    private static int o(D d10) {
        d10.W(16);
        return d10.q();
    }

    private static y p(D d10, int i10) {
        d10.X(8);
        ArrayList arrayList = new ArrayList();
        while (d10.f() < i10) {
            y.a aVarD = R3.j.d(d10);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y(arrayList);
    }

    private static d q(D d10) {
        long j10;
        d10.W(8);
        int iN = n(d10.q());
        d10.X(iN == 0 ? 8 : 16);
        long J10 = d10.J();
        int iF = d10.f();
        int i10 = iN == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                d10.X(i10);
                break;
            }
            if (d10.e()[iF + i11] != -1) {
                long J11 = iN == 0 ? d10.J() : d10.O();
                if (J11 != 0) {
                    long jV0 = P.V0(J11, 1000000L, J10);
                    J10 = J10;
                    j10 = jV0;
                }
            } else {
                i11++;
            }
        }
        int iP = d10.P();
        return new d(J10, j10, "" + ((char) (((iP >> 10) & 31) + 96)) + ((char) (((iP >> 5) & 31) + 96)) + ((char) ((iP & 31) + 96)));
    }

    private static void s(D d10, int i10, int i11, int i12, g gVar) {
        d10.W(i11 + 16);
        if (i10 == 1835365492) {
            d10.B();
            String strB = d10.B();
            if (strB != null) {
                gVar.f31678b = new t.b().e0(i12).u0(strB).N();
            }
        }
    }

    public static e3.e t(D d10) {
        long jA;
        long jA2;
        d10.W(8);
        if (n(d10.q()) == 0) {
            jA = d10.J();
            jA2 = d10.J();
        } else {
            jA = d10.A();
            jA2 = d10.A();
        }
        return new e3.e(jA, jA2, d10.J());
    }

    private static float u(D d10, int i10) {
        d10.W(i10 + 8);
        return d10.L() / d10.L();
    }

    private static byte[] v(D d10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            d10.W(i12);
            int iQ = d10.q();
            if (d10.q() == 1886547818) {
                return Arrays.copyOfRange(d10.e(), i12, iQ + i12);
            }
            i12 += iQ;
        }
        return null;
    }

    private static u x(D d10, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            d10.W(i14);
            int iQ = d10.q();
            if (d10.q() == 1952804451) {
                int iN = n(d10.q());
                d10.X(1);
                if (iN == 0) {
                    d10.X(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iH = d10.H();
                    i12 = iH & 15;
                    i13 = (iH & 240) >> 4;
                }
                boolean z10 = d10.H() == 1;
                int iH2 = d10.H();
                byte[] bArr2 = new byte[16];
                d10.l(bArr2, 0, 16);
                if (z10 && iH2 == 0) {
                    int iH3 = d10.H();
                    bArr = new byte[iH3];
                    d10.l(bArr, 0, iH3);
                }
                return new u(z10, str, iH2, bArr2, i13, i12, bArr);
            }
            i14 += iQ;
        }
    }

    private static c z(D d10, int i10, int i11) throws ParserException {
        d10.W(i10 + 8);
        int iF = d10.f();
        while (iF - i10 < i11) {
            d10.W(iF);
            int iQ = d10.q();
            C18079s.a(iQ > 0, "childAtomSize must be positive");
            if (d10.q() == 1937011305) {
                d10.X(4);
                int iH = d10.H();
                return new c(new f((iH & 1) == 1, (iH & 2) == 2, (iH & 8) == 8));
            }
            iF += iQ;
        }
        return null;
    }

    private static y J(D d10) {
        short sD = d10.D();
        d10.X(2);
        String strE = d10.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new y(new e3.d(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int c(D d10, int i10, int i11, int i12) throws ParserException {
        boolean z10;
        boolean z11;
        int iF = d10.f();
        if (iF >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        C18079s.a(z10, null);
        while (iF - i11 < i12) {
            d10.W(iF);
            int iQ = d10.q();
            if (iQ > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C18079s.a(z11, "childAtomSize must be positive");
            if (d10.q() == i10) {
                return iF;
            }
            iF += iQ;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 != 1952807028 && i10 != 1935832172 && i10 != 1937072756 && i10 != 1668047728) {
            if (i10 == 1835365473) {
                return 5;
            }
            return -1;
        }
        return 3;
    }

    public static void e(D d10) {
        int iF = d10.f();
        d10.X(4);
        if (d10.q() != 1751411826) {
            iF += 4;
        }
        d10.W(iF);
    }

    private static Pair<long[], long[]> j(c.b bVar) {
        long J10;
        long jQ;
        c.C2039c c2039cE = bVar.e(1701606260);
        if (c2039cE == null) {
            return null;
        }
        D d10 = c2039cE.f129414b;
        d10.W(8);
        int iN = n(d10.q());
        int iL = d10.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            if (iN == 1) {
                J10 = d10.O();
            } else {
                J10 = d10.J();
            }
            jArr[i10] = J10;
            if (iN == 1) {
                jQ = d10.A();
            } else {
                jQ = d10.q();
            }
            jArr2[i10] = jQ;
            if (d10.D() == 1) {
                d10.X(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static int l(D d10) {
        int iH = d10.H();
        int i10 = iH & l3.f93324d;
        while ((iH & 128) == 128) {
            iH = d10.H();
            i10 = (i10 << 7) | (iH & l3.f93324d);
        }
        return i10;
    }

    public static int m(int i10) {
        return i10 & 16777215;
    }

    public static y r(c.b bVar) {
        c.C2039c c2039cE = bVar.e(1751411826);
        c.C2039c c2039cE2 = bVar.e(1801812339);
        c.C2039c c2039cE3 = bVar.e(1768715124);
        if (c2039cE == null || c2039cE2 == null || c2039cE3 == null || o(c2039cE.f129414b) != 1835299937) {
            return null;
        }
        D d10 = c2039cE2.f129414b;
        d10.W(12);
        int iQ = d10.q();
        String[] strArr = new String[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            int iQ2 = d10.q();
            d10.X(4);
            strArr[i10] = d10.E(iQ2 - 8);
        }
        D d11 = c2039cE3.f129414b;
        d11.W(8);
        ArrayList arrayList = new ArrayList();
        while (d11.a() > 8) {
            int iF = d11.f();
            int iQ3 = d11.q();
            int iQ4 = d11.q() - 1;
            if (iQ4 >= 0 && iQ4 < iQ) {
                e3.b bVarI = R3.j.i(d11, iF + iQ3, strArr[iQ4]);
                if (bVarI != null) {
                    arrayList.add(bVarI);
                }
            } else {
                d3.r.i("BoxParsers", "Skipped metadata with unknown key index: " + iQ4);
            }
            d11.W(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y(arrayList);
    }

    private static Pair<Integer, u> w(D d10, int i10, int i11) throws ParserException {
        boolean z10;
        Pair<Integer, u> pairI;
        int iF = d10.f();
        while (iF - i10 < i11) {
            d10.W(iF);
            int iQ = d10.q();
            if (iQ > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C18079s.a(z10, "childAtomSize must be positive");
            if (d10.q() == 1936289382 && (pairI = i(d10, iF, iQ)) != null) {
                return pairI;
            }
            iF += iQ;
        }
        return null;
    }
}
