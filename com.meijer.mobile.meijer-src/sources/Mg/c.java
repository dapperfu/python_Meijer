package Mg;

import Ig.j;
import com.google.zxing.FormatException;
import com.medallia.digital.mobilesdk.l3;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f19884b;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f19886d;

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f19883a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f19885c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f19887e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static Ig.e a(byte[] r17) throws com.google.zxing.FormatException {
        /*
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            Ig.c r4 = new Ig.c
            r6 = r17
            r4.<init>(r6)
            Ig.j r5 = new Ig.j
            r7 = 100
            r5.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.<init>(r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.<init>(r11)
            Mg.c$b r13 = Mg.c.b.ASCII_ENCODE
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
        L33:
            Mg.c$b r15 = Mg.c.b.ASCII_ENCODE
            if (r13 != r15) goto L3c
            Mg.c$b r13 = c(r4, r5, r7, r14)
            goto L65
        L3c:
            int[] r16 = Mg.c.a.f19888a
            int r13 = r13.ordinal()
            r13 = r16[r13]
            switch(r13) {
                case 1: goto L61;
                case 2: goto L5d;
                case 3: goto L59;
                case 4: goto L55;
                case 5: goto L51;
                case 6: goto L4c;
                default: goto L47;
            }
        L47:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L4c:
            f(r4, r5)
            r8 = r11
            goto L64
        L51:
            d(r4, r5, r10)
            goto L64
        L55:
            g(r4, r5)
            goto L64
        L59:
            b(r4, r5)
            goto L64
        L5d:
            h(r4, r5, r14)
            goto L64
        L61:
            e(r4, r5, r14)
        L64:
            r13 = r15
        L65:
            Mg.c$b r15 = Mg.c.b.PAD_ENCODE
            if (r13 == r15) goto L6f
            int r15 = r4.a()
            if (r15 > 0) goto L33
        L6f:
            int r4 = r7.length()
            if (r4 <= 0) goto L78
            r5.e(r7)
        L78:
            if (r8 == 0) goto L99
            boolean r4 = r14.contains(r9)
            if (r4 != 0) goto L95
            boolean r3 = r14.contains(r3)
            if (r3 == 0) goto L87
            goto L95
        L87:
            boolean r0 = r14.contains(r12)
            if (r0 != 0) goto L97
            boolean r0 = r14.contains(r1)
            if (r0 == 0) goto L94
            goto L97
        L94:
            r0 = r2
        L95:
            r1 = r5
            goto Lba
        L97:
            r0 = 6
            goto L95
        L99:
            boolean r0 = r14.contains(r9)
            if (r0 != 0) goto Lb8
            boolean r0 = r14.contains(r3)
            if (r0 == 0) goto La6
            goto Lb8
        La6:
            boolean r0 = r14.contains(r12)
            if (r0 != 0) goto Lb6
            boolean r0 = r14.contains(r1)
            if (r0 == 0) goto Lb3
            goto Lb6
        Lb3:
            r1 = r5
            r0 = r11
            goto Lba
        Lb6:
            r0 = 3
            goto L95
        Lb8:
            r0 = 2
            goto L95
        Lba:
            Ig.e r5 = new Ig.e
            java.lang.String r7 = r1.toString()
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto Lc7
            r10 = 0
        Lc7:
            r8 = r10
            r9 = 0
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Mg.c.a(byte[]):Ig.e");
    }

    private static void b(Ig.c cVar, j jVar) throws FormatException {
        int iD;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            i(iD, cVar.d(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    jVar.b('\r');
                } else if (i11 == 1) {
                    jVar.b('*');
                } else if (i11 == 2) {
                    jVar.b('>');
                } else if (i11 == 3) {
                    jVar.b(' ');
                } else if (i11 < 14) {
                    jVar.b((char) (i11 + 44));
                } else {
                    if (i11 >= 40) {
                        throw FormatException.a();
                    }
                    jVar.b((char) (i11 + 51));
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(Ig.c cVar, j jVar, StringBuilder sb2, Set<Integer> set) throws FormatException {
        boolean z10 = false;
        do {
            int iD = cVar.d(8);
            if (iD == 0) {
                throw FormatException.a();
            }
            if (iD > 128) {
                if (iD != 129) {
                    if (iD > 229) {
                        switch (iD) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                set.add(Integer.valueOf(jVar.i()));
                                jVar.b((char) 29);
                                break;
                            case 233:
                            case 234:
                                break;
                            case 235:
                                z10 = true;
                                break;
                            case 236:
                                jVar.d("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                jVar.d("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            case 241:
                                return b.ECI_ENCODE;
                            default:
                                if (iD != 254 || cVar.a() != 0) {
                                    throw FormatException.a();
                                }
                                break;
                        }
                    } else {
                        int i10 = iD - 130;
                        if (i10 < 10) {
                            jVar.b('0');
                        }
                        jVar.c(i10);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z10) {
                    iD += 128;
                }
                jVar.b((char) (iD - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void e(Ig.c cVar, j jVar, Set<Integer> set) throws FormatException {
        int iD;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            i(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f19884b;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    jVar.b((char) (c10 + 128));
                                    z10 = false;
                                } else {
                                    jVar.b(c10);
                                }
                            } else if (i12 == 27) {
                                set.add(Integer.valueOf(jVar.i()));
                                jVar.b((char) 29);
                            } else {
                                if (i12 != 30) {
                                    throw FormatException.a();
                                }
                                z10 = true;
                            }
                            i10 = 0;
                        } else {
                            if (i10 != 3) {
                                throw FormatException.a();
                            }
                            if (z10) {
                                jVar.b((char) (i12 + 224));
                                z10 = false;
                                i10 = 0;
                            } else {
                                jVar.b((char) (i12 + 96));
                                i10 = 0;
                            }
                        }
                    } else if (z10) {
                        jVar.b((char) (i12 + 128));
                        z10 = false;
                        i10 = 0;
                    } else {
                        jVar.b((char) i12);
                        i10 = 0;
                    }
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr2 = f19883a;
                    if (i12 >= cArr2.length) {
                        throw FormatException.a();
                    }
                    char c11 = cArr2[i12];
                    if (z10) {
                        jVar.b((char) (c11 + 128));
                        z10 = false;
                    } else {
                        jVar.b(c11);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void h(Ig.c cVar, j jVar, Set<Integer> set) throws FormatException {
        int iD;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            i(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f19886d;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    jVar.b((char) (c10 + 128));
                                    z10 = false;
                                } else {
                                    jVar.b(c10);
                                }
                            } else if (i12 == 27) {
                                set.add(Integer.valueOf(jVar.i()));
                                jVar.b((char) 29);
                            } else {
                                if (i12 != 30) {
                                    throw FormatException.a();
                                }
                                z10 = true;
                            }
                            i10 = 0;
                        } else {
                            if (i10 != 3) {
                                throw FormatException.a();
                            }
                            char[] cArr2 = f19887e;
                            if (i12 >= cArr2.length) {
                                throw FormatException.a();
                            }
                            char c11 = cArr2[i12];
                            if (z10) {
                                jVar.b((char) (c11 + 128));
                                z10 = false;
                                i10 = 0;
                            } else {
                                jVar.b(c11);
                                i10 = 0;
                            }
                        }
                    } else if (z10) {
                        jVar.b((char) (i12 + 128));
                        z10 = false;
                        i10 = 0;
                    } else {
                        jVar.b((char) i12);
                        i10 = 0;
                    }
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr3 = f19885c;
                    if (i12 >= cArr3.length) {
                        throw FormatException.a();
                    }
                    char c12 = cArr3[i12];
                    if (z10) {
                        jVar.b((char) (c12 + 128));
                        z10 = false;
                    } else {
                        jVar.b(c12);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19888a;

        static {
            int[] iArr = new int[b.values().length];
            f19888a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19888a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19888a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19888a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19888a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19888a[b.ECI_ENCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f19884b = cArr;
        f19886d = cArr;
    }

    private static void i(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static int j(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % l3.f93323c) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }

    private static void d(Ig.c cVar, j jVar, Collection<byte[]> collection) throws FormatException {
        int iC = cVar.c();
        int i10 = iC + 2;
        int iJ = j(cVar.d(8), iC + 1);
        if (iJ == 0) {
            iJ = cVar.a() / 8;
        } else if (iJ >= 250) {
            iJ = ((iJ - 249) * 250) + j(cVar.d(8), i10);
            i10 = iC + 3;
        }
        if (iJ >= 0) {
            byte[] bArr = new byte[iJ];
            int i11 = 0;
            while (i11 < iJ) {
                if (cVar.a() >= 8) {
                    bArr[i11] = (byte) j(cVar.d(8), i10);
                    i11++;
                    i10++;
                } else {
                    throw FormatException.a();
                }
            }
            collection.add(bArr);
            jVar.d(new String(bArr, StandardCharsets.ISO_8859_1));
            return;
        }
        throw FormatException.a();
    }

    private static void f(Ig.c cVar, j jVar) throws FormatException {
        if (cVar.a() >= 8) {
            int iD = cVar.d(8);
            if (iD <= 127) {
                jVar.f(iD - 1);
                return;
            }
            return;
        }
        throw FormatException.a();
    }

    private static void g(Ig.c cVar, j jVar) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int iD = cVar.d(6);
                if (iD == 31) {
                    int iB = 8 - cVar.b();
                    if (iB != 8) {
                        cVar.d(iB);
                        return;
                    }
                    return;
                }
                if ((iD & 32) == 0) {
                    iD |= 64;
                }
                jVar.b((char) iD);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }
}
