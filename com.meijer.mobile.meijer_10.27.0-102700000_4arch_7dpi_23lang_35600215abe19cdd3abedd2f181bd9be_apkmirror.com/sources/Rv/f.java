package Rv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kw.C15328e;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001d¨\u0006\u001f"}, d2 = {"", "", "a", "(Ljava/lang/String;)Z", "d", "c", "input", "", "pos", "limit", "", "f", "(Ljava/lang/String;II)[B", PlaceTypes.ADDRESS, "addressOffset", "e", "(Ljava/lang/String;II[BI)Z", "i", "([B)Ljava/lang/String;", "b", "([B)[B", "j", "([B)Z", "h", "k", "(Ljava/lang/String;)Ljava/lang/String;", "host", "g", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Regex f33040a = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private static final boolean j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final boolean a(String str) {
        Intrinsics.j(str, "<this>");
        return f33040a.j(str);
    }

    public static final byte[] b(byte[] address) {
        Intrinsics.j(address, "address");
        return j(address) ? ArraysKt.T0(address, RangesKt.x(12, 16)) : address;
    }

    public static final boolean c(String str) {
        Intrinsics.j(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.k(cCharAt, 31) <= 0 || Intrinsics.k(cCharAt, l3.f92485d) >= 0 || StringsKt.o0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(String str) {
        Intrinsics.j(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iO0 = StringsKt.o0(str2, '.', i10, false, 4, null);
                int length2 = iO0 == -1 ? str2.length() - i10 : iO0 - i10;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (iO0 == -1 || iO0 == str2.length() - 1) {
                    break;
                }
                i10 = iO0 + 1;
                str = str2;
            }
            return false;
        }
        return true;
    }

    public static final boolean e(String input, int i10, int i11, byte[] address, int i12) {
        Intrinsics.j(input, "input");
        Intrinsics.j(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = input.charAt(i14);
                if (Intrinsics.k(cCharAt, 48) < 0 || Intrinsics.k(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        kotlin.collections.ArraysKt.j(r8, r8, 16 - (r11 - r12), r12, r11);
        kotlin.collections.ArraysKt.x(r8, (byte) 0, r12, (16 - r11) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] f(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r6 = r18
            java.lang.String r1 = "input"
            kotlin.jvm.internal.Intrinsics.j(r0, r1)
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        L14:
            r14 = 0
            if (r2 >= r6) goto L95
            if (r11 != r7) goto L1a
            return r14
        L1a:
            int r15 = r2 + 2
            if (r15 > r6) goto L38
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            boolean r1 = kotlin.text.StringsKt.V(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L38
            if (r12 == r10) goto L2c
            return r14
        L2c:
            int r11 = r11 + 2
            if (r15 != r6) goto L33
            r12 = r11
            goto L95
        L33:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L67
        L38:
            if (r11 == 0) goto L49
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.StringsKt.V(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L4d
            int r2 = r2 + 1
        L49:
            r0 = r16
            r13 = r2
            goto L67
        L4d:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.StringsKt.V(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L66
            int r1 = r11 + (-2)
            boolean r0 = e(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L63
            return r14
        L63:
            int r11 = r11 + 2
            goto L95
        L66:
            return r14
        L67:
            r1 = r9
            r2 = r13
        L69:
            if (r2 >= r6) goto L7b
            char r3 = r0.charAt(r2)
            int r3 = Rv.h.z(r3)
            if (r3 == r10) goto L7b
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L69
        L7b:
            int r3 = r2 - r13
            if (r3 == 0) goto L94
            r4 = 4
            if (r3 <= r4) goto L83
            goto L94
        L83:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L14
        L94:
            return r14
        L95:
            if (r11 == r7) goto La6
            if (r12 != r10) goto L9a
            return r14
        L9a:
            int r0 = r11 - r12
            int r0 = 16 - r0
            kotlin.collections.ArraysKt.j(r8, r8, r0, r12, r11)
            int r7 = r7 - r11
            int r7 = r7 + r12
            kotlin.collections.ArraysKt.x(r8, r9, r12, r7)
        La6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Rv.f.f(java.lang.String, int, int):byte[]");
    }

    public static final String g(String host) throws EOFException {
        Intrinsics.j(host, "host");
        C15328e c15328eI0 = new C15328e().I0(host);
        C15328e c15328e = new C15328e();
        while (!c15328eI0.j2()) {
            if (!aw.b.a().c(c15328eI0.L2(), c15328e)) {
                return null;
            }
        }
        c15328eI0.I0(g.a(c15328e.n3()));
        aw.d dVar = aw.d.f59504a;
        String strC = dVar.c(c15328eI0.n3());
        if (strC != null && Intrinsics.e(strC, g.a(strC))) {
            return dVar.e(strC);
        }
        return null;
    }

    public static final String h(byte[] address) {
        Intrinsics.j(address, "address");
        if (address.length == 4) {
            return new C15328e().E1(h.b(address[0], l3.f92484c)).writeByte(46).E1(h.b(address[1], l3.f92484c)).writeByte(46).E1(h.b(address[2], l3.f92484c)).writeByte(46).E1(h.b(address[3], l3.f92484c)).n3();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final String i(byte[] address) {
        Intrinsics.j(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C15328e c15328e = new C15328e();
        while (i11 < address.length) {
            if (i11 == i10) {
                c15328e.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    c15328e.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    c15328e.writeByte(58);
                }
                c15328e.N2((h.b(address[i11], l3.f92484c) << 8) | h.b(address[i11 + 1], l3.f92484c));
                i11 += 2;
            }
        }
        return c15328e.n3();
    }

    public static final String k(String str) {
        Intrinsics.j(str, "<this>");
        if (!StringsKt.c0(str, ":", false, 2, null)) {
            String strG = g(str);
            if (strG == null || strG.length() == 0 || c(strG) || d(strG)) {
                return null;
            }
            return strG;
        }
        byte[] bArrF = (StringsKt.W(str, "[", false, 2, null) && StringsKt.G(str, "]", false, 2, null)) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (bArrF == null) {
            return null;
        }
        byte[] bArrB = b(bArrF);
        if (bArrB.length == 16) {
            return i(bArrB);
        }
        if (bArrB.length == 4) {
            return h(bArrB);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
