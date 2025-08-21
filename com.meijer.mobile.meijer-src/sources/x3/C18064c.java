package x3;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.nio.ByteBuffer;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18064c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f170232a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, HttpResponseStatus.ERROR_BAD_REQUEST, HttpResponseStatus.ERROR_BAD_REQUEST, RecyclerView.m.FLAG_MOVED};

    /* renamed from: x3.c$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f170233a;

        /* renamed from: b, reason: collision with root package name */
        public int f170234b;

        /* renamed from: c, reason: collision with root package name */
        public int f170235c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f170236d;

        /* renamed from: e, reason: collision with root package name */
        public int f170237e;

        /* renamed from: f, reason: collision with root package name */
        public int f170238f;

        private b() {
            this.f170233a = true;
            this.f170234b = -1;
            this.f170235c = -1;
            this.f170236d = true;
            this.f170237e = 2;
            this.f170238f = 0;
        }
    }

    /* renamed from: x3.c$c, reason: collision with other inner class name */
    public static final class C2732c {

        /* renamed from: a, reason: collision with root package name */
        public final int f170239a;

        /* renamed from: b, reason: collision with root package name */
        public final int f170240b;

        /* renamed from: c, reason: collision with root package name */
        public final int f170241c;

        /* renamed from: d, reason: collision with root package name */
        public final int f170242d;

        /* renamed from: e, reason: collision with root package name */
        public final int f170243e;

        private C2732c(int i10, int i11, int i12, int i13, int i14) {
            this.f170239a = i10;
            this.f170241c = i11;
            this.f170240b = i12;
            this.f170242d = i13;
            this.f170243e = i14;
        }
    }

    public static void a(int i10, d3.D d10) {
        d10.S(7);
        byte[] bArrE = d10.e();
        bArrE[0] = -84;
        bArrE[1] = 64;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i10 >> 16) & l3.f93323c);
        bArrE[5] = (byte) ((i10 >> 8) & l3.f93323c);
        bArrE[6] = (byte) (i10 & l3.f93323c);
    }

    public static int g(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static void h(d3.C c10, b bVar) throws ParserException {
        int iH = c10.h(5);
        c10.r(2);
        if (c10.g()) {
            c10.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            c10.q();
        }
        if (c10.g()) {
            int iH2 = c10.h(3);
            if (bVar.f170234b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f170234b = iH;
            }
            if (c10.g()) {
                l(c10);
            }
        }
    }

    private static void i(d3.C c10, b bVar) throws ParserException {
        c10.r(2);
        boolean zG = c10.g();
        int iH = c10.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            c10.r(2);
            if (c10.g()) {
                c10.r(5);
            }
            if (zG) {
                c10.r(24);
            } else {
                if (c10.g()) {
                    if (!c10.g()) {
                        c10.r(4);
                    }
                    bVar.f170235c = c10.h(6) + 1;
                }
                c10.r(4);
            }
        }
        if (c10.g()) {
            c10.r(3);
            if (c10.g()) {
                l(c10);
            }
        }
    }

    private static int j(d3.C c10, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + c10.h(i10);
            if (!c10.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    private static void l(d3.C c10) throws ParserException {
        int iH = c10.h(6);
        if (iH < 2 || iH > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        c10.r(iH * 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a3.t d(d3.D r19, java.lang.String r20, java.lang.String r21, a3.o r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C18064c.d(d3.D, java.lang.String, java.lang.String, a3.o):a3.t");
    }

    public static int e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return f(new d3.C(bArr)).f170243e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x3.C18064c.C2732c f(d3.C r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = j(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.h(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = x3.C18064c.f170232a
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L95
        L65:
            if (r7 != r4) goto L93
            int[] r4 = x3.C18064c.f170232a
            int r6 = r4.length
            if (r11 >= r6) goto L93
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L8c
            r9 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L7e
            goto L91
        L7e:
            if (r11 == r2) goto L84
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
        L84:
            int r11 = r4 + 1
            goto L63
        L87:
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
            goto L84
        L8c:
            if (r11 == r2) goto L84
            if (r11 != r6) goto L91
            goto L84
        L91:
            r9 = r4
            goto L95
        L93:
            r11 = 0
            goto L63
        L95:
            x3.c$c r4 = new x3.c$c
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C18064c.f(d3.C):x3.c$c");
    }

    private static int b(int i10, boolean z10, int i11) {
        int iC = c(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iC;
        }
        if (!z10) {
            iC -= 2;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                return iC;
            }
            return iC - 2;
        }
        return iC - 4;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    private static boolean k(d3.C c10) {
        if (c10.b() < 66) {
            return false;
        }
        c10.r(66);
        return true;
    }
}
