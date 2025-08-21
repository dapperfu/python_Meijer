package Xe;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f42195a = Charset.forName("UTF-8");

    static class b extends a {

        /* renamed from: f, reason: collision with root package name */
        private static final int[] f42198f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        private static final int[] f42199g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c, reason: collision with root package name */
        private int f42200c;

        /* renamed from: d, reason: collision with root package name */
        private int f42201d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f42202e;

        public boolean a(byte[] bArr, int i10, int i11, boolean z10) {
            int i12 = this.f42200c;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f42201d;
            byte[] bArr2 = this.f42196a;
            int[] iArr = this.f42202e;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & 255] << 18) | (iArr[bArr[i18 + 1] & 255] << 12) | (iArr[bArr[i18 + 2] & 255] << 6) | iArr[bArr[i18 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & 255];
                if (i17 != 0) {
                    if (i17 == 1) {
                        if (i21 < 0) {
                            if (i21 != -1) {
                                this.f42200c = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 == 2) {
                        if (i21 < 0) {
                            if (i21 == -2) {
                                bArr2[i15] = (byte) (i16 >> 4);
                                i15++;
                                i17 = 4;
                            } else if (i21 != -1) {
                                this.f42200c = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 != 3) {
                        if (i17 != 4) {
                            if (i17 == 5 && i21 != -1) {
                                this.f42200c = 6;
                                return false;
                            }
                        } else if (i21 == -2) {
                            i17++;
                        } else if (i21 != -1) {
                            this.f42200c = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        int i22 = i21 | (i16 << 6);
                        bArr2[i15 + 2] = (byte) i22;
                        bArr2[i15 + 1] = (byte) (i22 >> 8);
                        bArr2[i15] = (byte) (i22 >> 16);
                        i15 += 3;
                        i16 = i22;
                        i17 = 0;
                    } else if (i21 == -2) {
                        bArr2[i15 + 1] = (byte) (i16 >> 2);
                        bArr2[i15] = (byte) (i16 >> 10);
                        i15 += 2;
                        i17 = 5;
                    } else if (i21 != -1) {
                        this.f42200c = 6;
                        return false;
                    }
                    i17++;
                    i16 = i21;
                } else if (i21 >= 0) {
                    i17++;
                    i16 = i21;
                } else if (i21 != -1) {
                    this.f42200c = 6;
                    return false;
                }
                i18 = i20;
            }
            if (!z10) {
                this.f42200c = i17;
                this.f42201d = i16;
                this.f42197b = i15;
                return true;
            }
            if (i17 == 1) {
                this.f42200c = 6;
                return false;
            }
            if (i17 == 2) {
                bArr2[i15] = (byte) (i16 >> 4);
                i15++;
            } else if (i17 == 3) {
                int i23 = i15 + 1;
                bArr2[i15] = (byte) (i16 >> 10);
                i15 += 2;
                bArr2[i23] = (byte) (i16 >> 2);
            } else if (i17 == 4) {
                this.f42200c = 6;
                return false;
            }
            this.f42200c = i17;
            this.f42197b = i15;
            return true;
        }

        public b(int i10, byte[] bArr) {
            int[] iArr;
            this.f42196a = bArr;
            if ((i10 & 8) == 0) {
                iArr = f42198f;
            } else {
                iArr = f42199g;
            }
            this.f42202e = iArr;
            this.f42200c = 0;
            this.f42201d = 0;
        }
    }

    static class c extends a {

        /* renamed from: j, reason: collision with root package name */
        private static final byte[] f42203j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k, reason: collision with root package name */
        private static final byte[] f42204k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f42205c;

        /* renamed from: d, reason: collision with root package name */
        int f42206d;

        /* renamed from: e, reason: collision with root package name */
        private int f42207e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f42208f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f42209g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f42210h;

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f42211i;

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 490
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Xe.e.c.a(byte[], int, int, boolean):boolean");
        }

        public c(int i10, byte[] bArr) {
            boolean z10;
            boolean z11;
            byte[] bArr2;
            int i11;
            this.f42196a = bArr;
            if ((i10 & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42208f = z10;
            if ((i10 & 2) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f42209g = z11;
            this.f42210h = (i10 & 4) != 0;
            if ((i10 & 8) == 0) {
                bArr2 = f42203j;
            } else {
                bArr2 = f42204k;
            }
            this.f42211i = bArr2;
            this.f42205c = new byte[2];
            this.f42206d = 0;
            if (z11) {
                i11 = 19;
            } else {
                i11 = -1;
            }
            this.f42207e = i11;
        }
    }

    public static byte[] b(byte[] bArr, int i10) {
        return c(bArr, 0, bArr.length, i10);
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i10) {
        return f(bArr, 0, bArr.length, i10);
    }

    static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f42196a;

        /* renamed from: b, reason: collision with root package name */
        public int f42197b;

        a() {
        }
    }

    public static byte[] a(String str, int i10) {
        return b(str.getBytes(f42195a), i10);
    }

    public static byte[] c(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[(i11 * 3) / 4]);
        if (!bVar.a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = bVar.f42197b;
        byte[] bArr2 = bVar.f42196a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    public static byte[] f(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!cVar.f42208f) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f42209g && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (cVar.f42210h ? 2 : 1);
        }
        cVar.f42196a = new byte[i13];
        cVar.a(bArr, i10, i11, true);
        return cVar.f42196a;
    }

    public static String g(byte[] bArr, int i10) {
        try {
            return new String(e(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
