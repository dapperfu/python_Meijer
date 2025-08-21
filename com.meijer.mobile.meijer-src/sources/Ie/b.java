package Ie;

import De.d;
import De.p;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final d f14441a = d.f('.');

    /* renamed from: b, reason: collision with root package name */
    private static final d f14442b = d.f(':');

    /* renamed from: c, reason: collision with root package name */
    private static final Inet4Address f14443c = (Inet4Address) c("127.0.0.1");

    /* renamed from: d, reason: collision with root package name */
    private static final Inet4Address f14444d = (Inet4Address) c("0.0.0.0");

    /* renamed from: Ie.b$b, reason: collision with other inner class name */
    private static final class C0231b {

        /* renamed from: a, reason: collision with root package name */
        private String f14445a;

        private C0231b() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r3 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9 = b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r10.f14445a = r9.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        return j(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r2 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r1 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        return i(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] e(java.lang.String r9, Ie.b.C0231b r10) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L53
            if (r2 == 0) goto L3d
            java.lang.String r9 = b(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L4e
            if (r10 == 0) goto L4a
            int r2 = r1 + 1
            java.lang.String r2 = r9.substring(r2)
            Ie.b.C0231b.b(r10, r2)
        L4a:
            java.lang.String r9 = r9.substring(r0, r1)
        L4e:
            byte[] r9 = j(r9)
            return r9
        L53:
            if (r2 == 0) goto L5d
            if (r1 == r6) goto L58
            return r5
        L58:
            byte[] r9 = i(r9)
            return r9
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.b.e(java.lang.String, Ie.b$b):byte[]");
    }

    public static boolean f(String str) {
        return e(str, null) != null;
    }

    private static int k(String str, int i10, int i11) {
        int i12 = 0;
        while (i10 < i11) {
            if (i12 > 214748364) {
                return -1;
            }
            int i13 = i12 * 10;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                return -1;
            }
            i12 = i13 + iDigit;
            i10++;
        }
        return i12;
    }

    private static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrI = i(str.substring(iLastIndexOf));
        if (bArrI == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrI[0] & 255) << 8) | (bArrI[1] & 255)) + ":" + Integer.toHexString((bArrI[3] & 255) | ((bArrI[2] & 255) << 8));
    }

    public static InetAddress c(String str) {
        C0231b c0231b = new C0231b();
        byte[] bArrE = e(str, c0231b);
        if (bArrE != null) {
            return a(bArrE, c0231b.f14445a);
        }
        throw d("'%s' is not an IP string literal.", str);
    }

    private static IllegalArgumentException d(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static short g(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0 || i12 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (i10 < i11) {
            iDigit = (iDigit << 4) | Character.digit(str.charAt(i10), 16);
            i10++;
        }
        return (short) iDigit;
    }

    private static byte h(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0 || i12 > 3) {
            throw new NumberFormatException();
        }
        if (i12 > 1 && str.charAt(i10) == '0') {
            throw new NumberFormatException();
        }
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 * 10;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i13 = i14 + iDigit;
            i10++;
        }
        if (i13 <= 255) {
            return (byte) i13;
        }
        throw new NumberFormatException();
    }

    private static byte[] i(String str) {
        if (f14441a.d(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int iIndexOf = str.indexOf(46, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i11] = h(str, i10, iIndexOf);
                i10 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    private static byte[] j(String str) {
        int iD = f14442b.d(str);
        if (iD >= 2 && iD <= 8) {
            int i10 = 1;
            int i11 = iD + 1;
            int i12 = 8 - i11;
            boolean z10 = false;
            for (int i13 = 0; i13 < str.length() - 1; i13++) {
                if (str.charAt(i13) == ':' && str.charAt(i13 + 1) == ':') {
                    if (z10) {
                        return null;
                    }
                    int i14 = i12 + 1;
                    if (i13 == 0) {
                        i14 = i12 + 2;
                    }
                    if (i13 == str.length() - 2) {
                        i14++;
                    }
                    i12 = i14;
                    z10 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z10 && i12 <= 0) {
                return null;
            }
            if (!z10 && i11 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i10 = 0;
                }
                while (i10 < str.length()) {
                    int iIndexOf = str.indexOf(58, i10);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i10) == ':') {
                        for (int i15 = 0; i15 < i12; i15++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(g(str, i10, iIndexOf));
                    }
                    i10 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static InetAddress a(byte[] bArr, String str) throws SocketException, UnknownHostException {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            p.e(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int iK = k(str, 0, str.length());
            if (iK != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), iK);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw d("No such interface: '%s'", str);
            } catch (SocketException e10) {
                e = e10;
                throw new IllegalArgumentException("No such interface: " + str, e);
            } catch (UnknownHostException e11) {
                e = e11;
                throw new IllegalArgumentException("No such interface: " + str, e);
            }
        } catch (UnknownHostException e12) {
            throw new AssertionError(e12);
        }
    }
}
