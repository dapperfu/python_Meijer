package bh;

import Ig.p;
import com.google.zxing.FormatException;
import com.medallia.digital.mobilesdk.l3;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes8.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f60386a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    private static void f(Ig.c cVar, StringBuilder sb2, int i10) throws FormatException {
        while (i10 >= 3) {
            if (cVar.a() < 10) {
                throw FormatException.a();
            }
            int iD = cVar.d(10);
            if (iD >= 1000) {
                throw FormatException.a();
            }
            sb2.append(h(iD / 100));
            sb2.append(h((iD / 10) % 10));
            sb2.append(h(iD % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (cVar.a() < 7) {
                throw FormatException.a();
            }
            int iD2 = cVar.d(7);
            if (iD2 >= 100) {
                throw FormatException.a();
            }
            sb2.append(h(iD2 / 10));
            sb2.append(h(iD2 % 10));
            return;
        }
        if (i10 == 1) {
            if (cVar.a() < 4) {
                throw FormatException.a();
            }
            int iD3 = cVar.d(4);
            if (iD3 >= 10) {
                throw FormatException.a();
            }
            sb2.append(h(iD3));
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60387a;

        static {
            int[] iArr = new int[h.values().length];
            f60387a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60387a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60387a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60387a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60387a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60387a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60387a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60387a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60387a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60387a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff A[LOOP:0: B:64:0x001e->B:61:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static Ig.e a(byte[] r19, bh.j r20, bh.f r21, java.util.Map<com.google.zxing.d, ?> r22) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.d.a(byte[], bh.j, bh.f, java.util.Map):Ig.e");
    }

    private static void c(Ig.c cVar, StringBuilder sb2, int i10, Ig.d dVar, Collection<byte[]> collection, Map<com.google.zxing.d, ?> map) throws FormatException {
        if (i10 * 8 > cVar.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) cVar.d(8);
        }
        sb2.append(new String(bArr, dVar == null ? p.a(bArr, map) : dVar.l()));
        collection.add(bArr);
    }

    private static void d(Ig.c cVar, StringBuilder sb2, int i10) throws FormatException {
        if (p.f14559c == null) {
            throw FormatException.a();
        }
        if (i10 * 13 > cVar.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iD = cVar.d(13);
            int i12 = (iD % 96) | ((iD / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & l3.f93323c);
            bArr[i11 + 1] = (byte) (i13 & l3.f93323c);
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, p.f14559c));
    }

    private static void e(Ig.c cVar, StringBuilder sb2, int i10) throws FormatException {
        if (p.f14558b == null) {
            throw FormatException.a();
        }
        if (i10 * 13 > cVar.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iD = cVar.d(13);
            int i12 = (iD % 192) | ((iD / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, p.f14558b));
    }

    private static int g(Ig.c cVar) throws FormatException {
        int iD = cVar.d(8);
        if ((iD & 128) == 0) {
            return iD & l3.f93324d;
        }
        if ((iD & 192) == 128) {
            return cVar.d(8) | ((iD & 63) << 8);
        }
        if ((iD & 224) == 192) {
            return cVar.d(16) | ((iD & 31) << 16);
        }
        throw FormatException.a();
    }

    private static char h(int i10) throws FormatException {
        char[] cArr = f60386a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw FormatException.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(Ig.c r3, java.lang.StringBuilder r4, int r5, boolean r6) throws com.google.zxing.FormatException {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.a()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.d(r2)
            int r2 = r1 / 45
            char r2 = h(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = h(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.a()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.a()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.d(r2)
            char r3 = h(r3)
            r4.append(r3)
            goto L47
        L42:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.a()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.d.b(Ig.c, java.lang.StringBuilder, int, boolean):void");
    }
}
