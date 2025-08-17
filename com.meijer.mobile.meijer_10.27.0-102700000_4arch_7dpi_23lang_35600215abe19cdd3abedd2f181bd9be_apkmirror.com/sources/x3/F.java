package x3;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f169063a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f169064b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f169065c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f169066d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f169067e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f169068f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f169069g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f169070a;

        /* renamed from: b, reason: collision with root package name */
        public String f169071b;

        /* renamed from: c, reason: collision with root package name */
        public int f169072c;

        /* renamed from: d, reason: collision with root package name */
        public int f169073d;

        /* renamed from: e, reason: collision with root package name */
        public int f169074e;

        /* renamed from: f, reason: collision with root package name */
        public int f169075f;

        /* renamed from: g, reason: collision with root package name */
        public int f169076g;

        public a() {
        }

        public a(a aVar) {
            this.f169070a = aVar.f169070a;
            this.f169071b = aVar.f169071b;
            this.f169072c = aVar.f169072c;
            this.f169073d = aVar.f169073d;
            this.f169074e = aVar.f169074e;
            this.f169075f = aVar.f169075f;
            this.f169076g = aVar.f169076g;
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            if (!F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f169070a = i11;
            this.f169071b = F.f169063a[3 - i12];
            int i17 = F.f169064b[i14];
            this.f169073d = i17;
            int i18 = 2;
            if (i11 == 2) {
                this.f169073d = i17 / 2;
            } else if (i11 == 0) {
                this.f169073d = i17 / 4;
            }
            int i19 = (i10 >>> 9) & 1;
            this.f169076g = F.k(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = F.f169065c[i13 - 1];
                } else {
                    i16 = F.f169066d[i13 - 1];
                }
                this.f169075f = i16;
                this.f169072c = (((i16 * 12) / this.f169073d) + i19) * 4;
            } else {
                int i20 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = F.f169067e[i13 - 1];
                    } else {
                        i15 = F.f169068f[i13 - 1];
                    }
                    this.f169075f = i15;
                    this.f169072c = ((i15 * 144) / this.f169073d) + i19;
                } else {
                    int i21 = F.f169069g[i13 - 1];
                    this.f169075f = i21;
                    if (i12 == 1) {
                        i20 = 72;
                    }
                    this.f169072c = ((i20 * i21) / this.f169073d) + i19;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.f169074e = i18;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f169064b[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f169065c[i13 - 1];
            } else {
                i16 = f169066d[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f169067e[i13 - 1];
            } else {
                i15 = f169068f[i13 - 1];
            }
        } else {
            i15 = f169069g[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i17) + i18;
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return ((i19 * i15) / i17) + i18;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
