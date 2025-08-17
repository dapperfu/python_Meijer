package S6;

import S6.i;
import S6.j;
import com.bugsnag.android.repackaged.dslplatform.json.ParsingException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: R, reason: collision with root package name */
    private static final byte[] f33422R;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f33423S;

    /* renamed from: T, reason: collision with root package name */
    private static final BigDecimal f33424T;

    /* renamed from: U, reason: collision with root package name */
    private static final BigDecimal f33425U;

    /* renamed from: a, reason: collision with root package name */
    public static final short[] f33426a = new short[0];

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f33427b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f33428c = new long[0];

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f33429d = new float[0];

    /* renamed from: e, reason: collision with root package name */
    public static final double[] f33430e = new double[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Short f33431f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f33432g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final Long f33433h = 0L;

    /* renamed from: i, reason: collision with root package name */
    public static final Float f33434i = Float.valueOf(0.0f);

    /* renamed from: j, reason: collision with root package name */
    public static final Double f33435j = Double.valueOf(0.0d);

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f33436k = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f33437l = {111, 222, 444, 888, 1776};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f33438m = {50, 100, HttpResponseStatus.SUCCESS_OK, HttpResponseStatus.ERROR_BAD_REQUEST, 800};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f33439n = {10000, 1000, 100, 10, 1};

    /* renamed from: o, reason: collision with root package name */
    private static final double[] f33440o = {10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d, 1.0E23d, 1.0E24d, 1.0E25d, 1.0E26d, 1.0E27d, 1.0E28d, 1.0E29d, 1.0E30d, 1.0E31d, 1.0E32d, 1.0E33d, 1.0E34d, 1.0E35d, 1.0E36d, 1.0E37d, 1.0E38d, 1.0E39d, 1.0E40d, 1.0E41d, 1.0E42d, 1.0E43d, 1.0E44d, 1.0E45d, 1.0E46d, 1.0E47d, 1.0E48d, 1.0E49d, 1.0E50d, 1.0E51d, 1.0E52d, 1.0E53d, 1.0E54d, 1.0E55d, 1.0E56d, 1.0E57d, 1.0E58d, 1.0E59d, 1.0E60d, 1.0E61d, 1.0E62d, 1.0E63d, 1.0E64d, 1.0E65d};

    /* renamed from: p, reason: collision with root package name */
    public static final i.f<Double> f33441p = new k();

    /* renamed from: q, reason: collision with root package name */
    public static final i.f<Double> f33442q = new u();

    /* renamed from: r, reason: collision with root package name */
    public static final j.a<Double> f33443r = new v();

    /* renamed from: s, reason: collision with root package name */
    public static final i.f<double[]> f33444s = new w();

    /* renamed from: t, reason: collision with root package name */
    public static final j.a<double[]> f33445t = new x();

    /* renamed from: u, reason: collision with root package name */
    public static final i.f<Float> f33446u = new y();

    /* renamed from: v, reason: collision with root package name */
    public static final i.f<Float> f33447v = new z();

    /* renamed from: w, reason: collision with root package name */
    public static final j.a<Float> f33448w = new A();

    /* renamed from: x, reason: collision with root package name */
    public static final i.f<float[]> f33449x = new B();

    /* renamed from: y, reason: collision with root package name */
    public static final j.a<float[]> f33450y = new C5220a();

    /* renamed from: z, reason: collision with root package name */
    public static final i.f<Integer> f33451z = new C5221b();

    /* renamed from: A, reason: collision with root package name */
    public static final i.f<Integer> f33405A = new C5222c();

    /* renamed from: B, reason: collision with root package name */
    public static final j.a<Integer> f33406B = new d();

    /* renamed from: C, reason: collision with root package name */
    public static final i.f<int[]> f33407C = new e();

    /* renamed from: D, reason: collision with root package name */
    public static final j.a<int[]> f33408D = new f();

    /* renamed from: E, reason: collision with root package name */
    public static final i.f<Short> f33409E = new g();

    /* renamed from: F, reason: collision with root package name */
    public static final i.f<Short> f33410F = new h();

    /* renamed from: G, reason: collision with root package name */
    public static final j.a<Short> f33411G = new i();

    /* renamed from: H, reason: collision with root package name */
    public static final i.f<short[]> f33412H = new j();

    /* renamed from: I, reason: collision with root package name */
    public static final j.a<short[]> f33413I = new C0752l();

    /* renamed from: J, reason: collision with root package name */
    public static final i.f<Long> f33414J = new m();

    /* renamed from: K, reason: collision with root package name */
    public static final i.f<Long> f33415K = new n();

    /* renamed from: L, reason: collision with root package name */
    public static final j.a<Long> f33416L = new o();

    /* renamed from: M, reason: collision with root package name */
    public static final i.f<long[]> f33417M = new p();

    /* renamed from: N, reason: collision with root package name */
    public static final j.a<long[]> f33418N = new q();

    /* renamed from: O, reason: collision with root package name */
    public static final i.f<BigDecimal> f33419O = new r();

    /* renamed from: P, reason: collision with root package name */
    public static final j.a<BigDecimal> f33420P = new s();

    /* renamed from: Q, reason: collision with root package name */
    static final i.f<Number> f33421Q = new t();

    class i implements j.a<Short> {
        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, Short sh2) throws IOException {
            if (sh2 == null) {
                jVar.n();
            } else {
                l.J(sh2.intValue(), jVar);
            }
        }

        i() {
        }
    }

    static {
        int i10 = 0;
        while (true) {
            int[] iArr = f33436k;
            if (i10 >= iArr.length) {
                f33422R = "-2147483648".getBytes();
                f33423S = "-9223372036854775808".getBytes();
                f33424T = BigDecimal.valueOf(Long.MAX_VALUE);
                f33425U = BigDecimal.valueOf(Long.MIN_VALUE);
                return;
            }
            iArr[i10] = (i10 < 10 ? 33554432 : i10 < 100 ? 16777216 : 0) + (((i10 / 100) + 48) << 16) + ((((i10 / 10) % 10) + 48) << 8) + (i10 % 10) + 48;
            i10++;
        }
    }

    private static BigDecimal A(char[] cArr, int i10, S6.i iVar, boolean z10) throws ParsingException {
        int i11;
        char c10;
        int i12 = i10;
        while (i12 > 0 && Character.isWhitespace(cArr[i12 - 1])) {
            i12--;
        }
        if (i12 > iVar.f33374v) {
            throw iVar.u("Too many digits detected in number", i10, "", "Too many digits detected in number", Integer.valueOf(i12), "");
        }
        int i13 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i13] == '0' && i12 > (i11 = i13 + 1) && (c10 = cArr[i11]) >= '0' && c10 <= '9') {
            throw iVar.r("Leading zero is not allowed. Error parsing number", i10 + (z10 ? 2 : 0));
        }
        try {
            return new BigDecimal(cArr, 0, i12);
        } catch (NumberFormatException e10) {
            throw iVar.s("Error parsing number", i10 + (z10 ? 2 : 0), e10);
        }
    }

    private static int C(byte[] bArr, S6.i iVar, int i10, int i11, int i12) throws IOException {
        int i13 = i12 + i10;
        if (i13 == i11) {
            q(iVar, i10, i11, "Digit not found");
        }
        int i14 = 0;
        for (int i15 = i13; i15 < i11; i15++) {
            int i16 = bArr[i15] - 48;
            if (i16 < 0 || i16 > 9) {
                if (i15 <= i13 || !iVar.a(i15, i11)) {
                    if (i15 == i11 - 1 && bArr[i15] == 46) {
                        q(iVar, i10, i11, "Number ends with a dot");
                    }
                    int i17 = i11 - i10;
                    BigDecimal bigDecimalA = A(iVar.z(i10, i17), i17, iVar, false);
                    if (bigDecimalA.scale() > 0) {
                        r(iVar, i10, i11, "Expecting int but found decimal value", bigDecimalA);
                    }
                    return bigDecimalA.intValue();
                }
                return i14;
            }
            i14 = (i14 << 3) + (i14 << 1) + i16;
            if (i14 < 0) {
                q(iVar, i10, i11, "Integer overflow detected");
            }
        }
        return i14;
    }

    private static Number V(char[] cArr, int i10, S6.i iVar) throws IOException {
        BigDecimal bigDecimalA = A(cArr, i10, iVar, false);
        if (bigDecimalA.scale() == 0 && bigDecimalA.precision() <= 19) {
            if (bigDecimalA.signum() == 1) {
                if (bigDecimalA.compareTo(f33424T) <= 0) {
                    return Long.valueOf(bigDecimalA.longValue());
                }
            } else if (bigDecimalA.compareTo(f33425U) >= 0) {
                return Long.valueOf(bigDecimalA.longValue());
            }
        }
        return b(bigDecimalA, iVar.f33373u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0163, code lost:
    
        if (r1 >= r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0165, code lost:
    
        r15 = r25[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0167, code lost:
    
        if (r15 == 101) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016b, code lost:
    
        if (r15 != 69) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016e, code lost:
    
        r4 = r15 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0172, code lost:
    
        if (r4 < 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0174, code lost:
    
        if (r4 <= 9) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017a, code lost:
    
        if (r26.a(r1, r28) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0186, code lost:
    
        return a(r3, r12 / r18, (r1 - r10) - r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0187, code lost:
    
        r(r26, r27, r28, "Unknown digit", java.lang.Character.valueOf((char) r25[r1]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0191, code lost:
    
        r3 = ((r3 << 3) + (r3 << 1)) + r4;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x019b, code lost:
    
        r2 = a(r3, r12 / r18, (r1 - r10) - r20);
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a7, code lost:
    
        if (r10 >= r28) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ab, code lost:
    
        if (r15 < 48) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01af, code lost:
    
        if (r15 > 57) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b1, code lost:
    
        r15 = r25[r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01b7, code lost:
    
        if (r15 == 101) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01bb, code lost:
    
        if (r15 != 69) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01bf, code lost:
    
        if (r9 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c8, code lost:
    
        return r2 * S6.l.f33440o[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c9, code lost:
    
        if (r9 >= 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d3, code lost:
    
        return r2 / S6.l.f33440o[(-r9) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01df, code lost:
    
        return o(r26, 0, r9, r2, r25, r27, r28, r29, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f3, code lost:
    
        return o(r26, r12, r10 - r4, 0.0d, r25, r27, r28, r29, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01f4, code lost:
    
        if (r11 == 101) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f8, code lost:
    
        if (r11 != 69) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01fc, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x020f, code lost:
    
        return o(r26, r12, 0, 0.0d, r25, r27, r28, r29, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r10 != r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        q(r26, r27, r28, "Digit not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r4 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r11 == 46) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r10 <= (r2 + 1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        q(r26, r27, r28, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r10 != r28) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        if (r11 != 46) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r4 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        if (r4 != r28) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        q(r26, r27, r28, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r18 = 1.0E15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r12 != r18) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        r10 = r10 + 16;
        r11 = r25[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        if (r11 != 48) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (r28 <= r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        return t(r26.z(r2, r1), r1, r26, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        if (r11 >= 56) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00da, code lost:
    
        r15 = r11;
        r18 = 1.0E14d;
        r11 = r10;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        r15 = r11;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        r11 = r10;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        r10 = r2 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
    
        if (r25[r2] >= 56) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:
    
        r9 = (r4 - r10) + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
    
        r9 = (r4 - r10) + 15;
        r15 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        if (r11 >= r28) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fa, code lost:
    
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        r20 = r10;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fe, code lost:
    
        if (r10 >= r11) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0100, code lost:
    
        r15 = r25[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        if (r15 == 101) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        if (r15 != r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        r3 = r15 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0109, code lost:
    
        if (r3 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010b, code lost:
    
        if (r3 <= r14) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        if (r26.a(r10, r28) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
    
        return r12 / S6.l.f33440o[(r10 - r4) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011d, code lost:
    
        r(r26, r27, r28, "Unknown digit", java.lang.Character.valueOf((char) r25[r10]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0127, code lost:
    
        r12 = ((r12 << 3) + (r12 << 1)) + r3;
        r10 = r10 + 1;
        r3 = 69;
        r14 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
    
        if (r10 != r28) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0142, code lost:
    
        return r12 / S6.l.f33440o[(r10 - r4) - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r15 == 101) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        if (r15 != 69) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014f, code lost:
    
        if (r26.f33371s != S6.i.b.HIGH) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015a, code lost:
    
        return t(r26.z(r2, r1), r1, r26, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015b, code lost:
    
        r3 = 0;
        r2 = r2 + 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015e, code lost:
    
        if (r2 >= r28) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0161, code lost:
    
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0162, code lost:
    
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double s(byte[] r25, S6.i r26, int r27, int r28, int r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.l.s(byte[], S6.i, int, int, int):double");
    }

    private static double t(char[] cArr, int i10, S6.i iVar, boolean z10) throws IOException {
        int i11;
        char c10;
        int i12 = i10;
        while (i12 > 0 && Character.isWhitespace(cArr[i12 - 1])) {
            i12--;
        }
        if (i12 > iVar.f33374v) {
            throw iVar.u("Too many digits detected in number", i10, "", "Too many digits detected in number", Integer.valueOf(i12), "");
        }
        int i13 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i13] == '0' && i12 > (i11 = i13 + 1) && (c10 = cArr[i11]) >= '0' && c10 <= '9') {
            throw iVar.r("Leading zero is not allowed. Error parsing number", i10 + (z10 ? 2 : 0));
        }
        try {
            return Double.parseDouble(new String(cArr, 0, i12));
        } catch (NumberFormatException e10) {
            throw iVar.s("Error parsing number", i10 + (z10 ? 2 : 0), e10);
        }
    }

    private static float v(char[] cArr, int i10, S6.i iVar, boolean z10) throws ParsingException {
        int i11;
        char c10;
        int i12 = i10;
        while (i12 > 0 && Character.isWhitespace(cArr[i12 - 1])) {
            i12--;
        }
        if (i12 > iVar.f33374v) {
            throw iVar.u("Too many digits detected in number", i10, "", "Too many digits detected in number", Integer.valueOf(i12), "");
        }
        int i13 = cArr[0] == '-' ? 1 : 0;
        if (cArr[i13] == '0' && i12 > (i11 = i13 + 1) && (c10 = cArr[i11]) >= '0' && c10 <= '9') {
            throw iVar.r("Leading zero is not allowed. Error parsing number", i10 + (z10 ? 2 : 0));
        }
        try {
            return Float.parseFloat(new String(cArr, 0, i12));
        } catch (NumberFormatException e10) {
            throw iVar.s("Error parsing number", i10 + (z10 ? 2 : 0), e10);
        }
    }

    class A implements j.a<Float> {
        A() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, Float f10) throws IOException {
            l.R(f10, jVar);
        }
    }

    class B implements i.f<float[]> {
        B() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public float[] a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                iVar.j();
                return l.g(iVar);
            }
            throw iVar.p("Expecting '[' for float array start");
        }
    }

    private static class C {

        /* renamed from: a, reason: collision with root package name */
        final char[] f33452a;

        /* renamed from: b, reason: collision with root package name */
        final int f33453b;

        C(char[] cArr, int i10) {
            this.f33452a = cArr;
            this.f33453b = i10;
        }
    }

    /* renamed from: S6.l$a, reason: case insensitive filesystem */
    class C5220a implements j.a<float[]> {
        C5220a() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, float[] fArr) throws IOException {
            l.M(fArr, jVar);
        }
    }

    /* renamed from: S6.l$b, reason: case insensitive filesystem */
    class C5221b implements i.f<Integer> {
        C5221b() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(S6.i iVar) throws IOException {
            return Integer.valueOf(l.h(iVar));
        }
    }

    /* renamed from: S6.l$c, reason: case insensitive filesystem */
    class C5222c implements i.f<Integer> {
        C5222c() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return Integer.valueOf(l.h(iVar));
        }
    }

    class d implements j.a<Integer> {
        d() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, Integer num) throws IOException {
            l.S(num, jVar);
        }
    }

    class e implements i.f<int[]> {
        e() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int[] a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                iVar.j();
                return l.i(iVar);
            }
            throw iVar.p("Expecting '[' for int array start");
        }
    }

    class f implements j.a<int[]> {
        f() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, int[] iArr) throws IOException {
            l.N(iArr, jVar);
        }
    }

    class g implements i.f<Short> {
        g() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short a(S6.i iVar) throws IOException {
            return Short.valueOf(l.m(iVar));
        }
    }

    class h implements i.f<Short> {
        h() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return Short.valueOf(l.m(iVar));
        }
    }

    class j implements i.f<short[]> {
        j() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public short[] a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                iVar.j();
                return l.n(iVar);
            }
            throw iVar.p("Expecting '[' for short array start");
        }
    }

    class k implements i.f<Double> {
        k() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(S6.i iVar) throws IOException {
            return Double.valueOf(l.d(iVar));
        }
    }

    /* renamed from: S6.l$l, reason: collision with other inner class name */
    class C0752l implements j.a<short[]> {
        C0752l() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, short[] sArr) throws IOException {
            l.P(sArr, jVar);
        }
    }

    class m implements i.f<Long> {
        m() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(S6.i iVar) throws IOException {
            return Long.valueOf(l.j(iVar));
        }
    }

    class n implements i.f<Long> {
        n() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return Long.valueOf(l.j(iVar));
        }
    }

    class o implements j.a<Long> {
        o() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, Long l10) throws IOException {
            l.T(l10, jVar);
        }
    }

    class p implements i.f<long[]> {
        p() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long[] a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                iVar.j();
                return l.k(iVar);
            }
            throw iVar.p("Expecting '[' for long array start");
        }
    }

    class q implements j.a<long[]> {
        q() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, long[] jArr) throws IOException {
            l.O(jArr, jVar);
        }
    }

    class r implements i.f<BigDecimal> {
        r() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return l.c(iVar);
        }
    }

    class s implements j.a<BigDecimal> {
        s() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, BigDecimal bigDecimal) throws IOException {
            l.U(bigDecimal, jVar);
        }
    }

    class t implements i.f<Number> {
        t() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return l.l(iVar);
        }
    }

    class u implements i.f<Double> {
        u() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return Double.valueOf(l.d(iVar));
        }
    }

    class v implements j.a<Double> {
        v() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, Double d10) throws IOException {
            l.Q(d10, jVar);
        }
    }

    class w implements i.f<double[]> {
        w() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public double[] a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                iVar.j();
                return l.e(iVar);
            }
            throw iVar.p("Expecting '[' for double array start");
        }
    }

    class x implements j.a<double[]> {
        x() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S6.j jVar, double[] dArr) throws IOException {
            l.L(dArr, jVar);
        }
    }

    class y implements i.f<Float> {
        y() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float a(S6.i iVar) throws IOException {
            return Float.valueOf(l.f(iVar));
        }
    }

    class z implements i.f<Float> {
        z() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float a(S6.i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return Float.valueOf(l.f(iVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r10 != r23) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        q(r22, r23, r24, "Digit not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r5 == 46) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r10 <= (r23 + 1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        q(r22, r23, r24, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r10 != r24) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        return java.math.BigDecimal.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r5 != 46) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r10 != r24) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        q(r22, r23, r24, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r15 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (r15 >= r24) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        r5 = r21[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r5 == 101) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        if (r5 != 69) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0092, code lost:
    
        r17 = r7;
        r7 = r5 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r7 < 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        if (r7 <= r14) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        if (r22.a(r15, r24) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
    
        return java.math.BigDecimal.valueOf(r8, r15 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a6, code lost:
    
        r(r22, r23, r24, "Unknown digit", java.lang.Character.valueOf((char) r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        r8 = ((r8 << 3) + (r8 << r17)) + r7;
        r15 = r15 + 1;
        r7 = r17;
        r14 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        if (r15 != r24) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        return java.math.BigDecimal.valueOf(r8, r24 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
    
        if (r5 == 101) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
    
        if (r5 != 69) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        return java.math.BigDecimal.valueOf(r8, r24 - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
    
        r2 = r15 + 1;
        r5 = r21[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
    
        if (r5 != 45) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
    
        r0 = y(r21, r22, r2, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        if (r5 != 43) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e2, code lost:
    
        r0 = C(r21, r22, r2, r24, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e9, code lost:
    
        r0 = C(r21, r22, r2, r24, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f4, code lost:
    
        return java.math.BigDecimal.valueOf(r8, (r15 - r10) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f5, code lost:
    
        if (r5 == 101) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f7, code lost:
    
        if (r5 != 69) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ff, code lost:
    
        return java.math.BigDecimal.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0100, code lost:
    
        r10 = r10 + 1;
        r5 = r21[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0103, code lost:
    
        if (r5 != 45) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0105, code lost:
    
        r0 = y(r21, r22, r10, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010a, code lost:
    
        if (r5 != 43) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010c, code lost:
    
        r0 = C(r21, r22, r10, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0111, code lost:
    
        r0 = C(r21, r22, r10, r24, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x011b, code lost:
    
        return java.math.BigDecimal.valueOf(r8, -r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.math.BigDecimal B(byte[] r21, S6.i r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.l.B(byte[], S6.i, int, int):java.math.BigDecimal");
    }

    private static Number D(byte[] bArr, S6.i iVar, int i10, int i11) throws IOException {
        boolean z10 = bArr[i10] == 48;
        long j10 = 0;
        byte b10 = 32;
        int i12 = i10;
        while (i12 < i11 && (b10 = bArr[i12]) != 46 && b10 != 101 && b10 != 69) {
            int i13 = b10 - 48;
            if (i13 < 0 || i13 > 9) {
                if (z10 && i12 > i10 + 1) {
                    q(iVar, i10, i11, "Leading zero is not allowed");
                }
                if (i12 > i10 && iVar.a(i12, i11)) {
                    return Long.valueOf(j10);
                }
                int i14 = i11 - i10;
                return V(iVar.z(i10, i14), i14, iVar);
            }
            j10 = i13 + (j10 << 3) + (j10 << 1);
            i12++;
        }
        if (i12 == i10) {
            q(iVar, i10, i11, "Digit not found");
        } else if (z10 && b10 != 46 && i12 > i10 + 1) {
            q(iVar, i10, i11, "Leading zero is not allowed");
        } else {
            if (i12 == i11) {
                return Long.valueOf(j10);
            }
            if (b10 == 46) {
                int i15 = i12 + 1;
                if (i15 == i11) {
                    q(iVar, i10, i11, "Number ends with a dot");
                }
                int i16 = i15;
                while (i16 < i11) {
                    b10 = bArr[i16];
                    if (b10 == 101 || b10 == 69) {
                        break;
                    }
                    int i17 = b10 - 48;
                    if (i17 < 0 || i17 > 9) {
                        if (iVar.a(i16, i11)) {
                            return BigDecimal.valueOf(j10, i16 - i15);
                        }
                        int i18 = i11 - i10;
                        return V(iVar.z(i10, i18), i18, iVar);
                    }
                    j10 = (j10 << 3) + (j10 << 1) + i17;
                    i16++;
                }
                if (i16 == i11) {
                    return b(BigDecimal.valueOf(j10, i11 - i15), iVar.f33373u);
                }
                if (b10 != 101 && b10 != 69) {
                    return BigDecimal.valueOf(j10, i11 - i15);
                }
                int i19 = i16 + 1;
                byte b11 = bArr[i19];
                return b(BigDecimal.valueOf(j10, (i16 - i15) - (b11 == 45 ? y(bArr, iVar, i19, i11) : b11 == 43 ? C(bArr, iVar, i19, i11, 1) : C(bArr, iVar, i19, i11, 0))), iVar.f33373u);
            }
            if (b10 == 101 || b10 == 69) {
                int i20 = i12 + 1;
                byte b12 = bArr[i20];
                return b(BigDecimal.valueOf(j10, -(b12 == 45 ? y(bArr, iVar, i20, i11) : b12 == 43 ? C(bArr, iVar, i20, i11, 1) : C(bArr, iVar, i20, i11, 0))), iVar.f33373u);
            }
        }
        return b(BigDecimal.valueOf(j10), iVar.f33373u);
    }

    private static int F(byte[] bArr, int i10, int i11) {
        int iX;
        if (i11 < 0) {
            if (i11 == Integer.MIN_VALUE) {
                int i12 = 0;
                while (true) {
                    byte[] bArr2 = f33422R;
                    if (i12 >= bArr2.length) {
                        return i10 + bArr2.length;
                    }
                    bArr[i10 + i12] = bArr2[i12];
                    i12++;
                }
            } else {
                i11 = -i11;
                bArr[i10] = 45;
                i10++;
            }
        }
        int i13 = i11 / 1000;
        if (i13 == 0) {
            return i10 + X(bArr, f33436k[i11], i10);
        }
        int i14 = i11 - (i13 * 1000);
        int i15 = i13 / 1000;
        if (i15 == 0) {
            int[] iArr = f33436k;
            int i16 = iArr[i14];
            int iX2 = X(bArr, iArr[i13], i10);
            W(bArr, i16, i10 + iX2);
            return i10 + 3 + iX2;
        }
        int i17 = i15 / 1000;
        int[] iArr2 = f33436k;
        int i18 = iArr2[i14];
        int i19 = iArr2[i13 - (i15 * 1000)];
        if (i17 == 0) {
            iX = i10 + X(bArr, iArr2[i15], i10);
        } else {
            bArr[i10] = (byte) (i17 + 48);
            W(bArr, iArr2[i15 - (i17 * 1000)], i10 + 1);
            iX = i10 + 4;
        }
        W(bArr, i19, iX);
        W(bArr, i18, iX + 3);
        return iX + 6;
    }

    private static int G(byte[] bArr, int i10, long j10) {
        int iX;
        if (j10 < 0) {
            if (j10 == Long.MIN_VALUE) {
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = f33423S;
                    if (i11 >= bArr2.length) {
                        return i10 + bArr2.length;
                    }
                    bArr[i10 + i11] = bArr2[i11];
                    i11++;
                }
            } else {
                j10 = -j10;
                bArr[i10] = 45;
                i10++;
            }
        }
        long j11 = j10 / 1000;
        if (j11 == 0) {
            return i10 + X(bArr, f33436k[(int) j10], i10);
        }
        int i12 = (int) (j10 - (j11 * 1000));
        long j12 = j11 / 1000;
        if (j12 == 0) {
            int[] iArr = f33436k;
            int i13 = iArr[i12];
            int iX2 = X(bArr, iArr[(int) j11], i10);
            W(bArr, i13, i10 + iX2);
            return i10 + 3 + iX2;
        }
        int i14 = (int) (j11 - (j12 * 1000));
        long j13 = j12 / 1000;
        if (j13 == 0) {
            int[] iArr2 = f33436k;
            int i15 = iArr2[i12];
            int i16 = iArr2[i14];
            int iX3 = i10 + X(bArr, iArr2[(int) j12], i10);
            W(bArr, i16, iX3);
            W(bArr, i15, iX3 + 3);
            return iX3 + 6;
        }
        int i17 = (int) (j12 - (j13 * 1000));
        int i18 = (int) (j13 / 1000);
        if (i18 == 0) {
            int[] iArr3 = f33436k;
            int i19 = iArr3[i12];
            int i20 = iArr3[i14];
            int i21 = iArr3[i17];
            int iX4 = i10 + X(bArr, iArr3[(int) j13], i10);
            W(bArr, i21, iX4);
            W(bArr, i20, iX4 + 3);
            W(bArr, i19, iX4 + 6);
            return iX4 + 9;
        }
        int i22 = (int) (j13 - (i18 * 1000));
        int i23 = i18 / 1000;
        if (i23 == 0) {
            int[] iArr4 = f33436k;
            int i24 = iArr4[i12];
            int i25 = iArr4[i14];
            int i26 = iArr4[i17];
            int i27 = iArr4[i22];
            int iX5 = i10 + X(bArr, iArr4[i18], i10);
            W(bArr, i27, iX5);
            W(bArr, i26, iX5 + 3);
            W(bArr, i25, iX5 + 6);
            W(bArr, i24, iX5 + 9);
            return iX5 + 12;
        }
        int i28 = i23 / 1000;
        int[] iArr5 = f33436k;
        int i29 = iArr5[i12];
        int i30 = iArr5[i14];
        int i31 = iArr5[i17];
        int i32 = iArr5[i22];
        int i33 = iArr5[i18 - (i23 * 1000)];
        if (i28 == 0) {
            iX = i10 + X(bArr, iArr5[i23], i10);
        } else {
            bArr[i10] = (byte) (i28 + 48);
            W(bArr, iArr5[i23 - (i28 * 1000)], i10 + 1);
            iX = i10 + 4;
        }
        W(bArr, i33, iX);
        W(bArr, i32, iX + 3);
        W(bArr, i31, iX + 6);
        W(bArr, i30, iX + 9);
        W(bArr, i29, iX + 12);
        return iX + 15;
    }

    public static void I(float f10, S6.j jVar) throws IOException {
        if (f10 == Float.POSITIVE_INFINITY) {
            jVar.i("\"Infinity\"");
            return;
        }
        if (f10 == Float.NEGATIVE_INFINITY) {
            jVar.i("\"-Infinity\"");
        } else if (f10 != f10) {
            jVar.i("\"NaN\"");
        } else {
            jVar.i(Float.toString(f10));
        }
    }

    public static void J(int i10, S6.j jVar) throws IOException {
        byte[] bArrC = jVar.c(11);
        int iH = jVar.h();
        jVar.a(F(bArrC, iH, i10) - iH);
    }

    public static void K(long j10, S6.j jVar) throws IOException {
        byte[] bArrC = jVar.c(21);
        int iH = jVar.h();
        jVar.a(G(bArrC, iH, j10) - iH);
    }

    public static void L(double[] dArr, S6.j jVar) throws IOException {
        if (dArr == null) {
            jVar.n();
            return;
        }
        if (dArr.length == 0) {
            jVar.i("[]");
            return;
        }
        jVar.l((byte) 91);
        H(dArr[0], jVar);
        for (int i10 = 1; i10 < dArr.length; i10++) {
            jVar.l((byte) 44);
            H(dArr[i10], jVar);
        }
        jVar.l((byte) 93);
    }

    public static void M(float[] fArr, S6.j jVar) throws IOException {
        if (fArr == null) {
            jVar.n();
            return;
        }
        if (fArr.length == 0) {
            jVar.i("[]");
            return;
        }
        jVar.l((byte) 91);
        I(fArr[0], jVar);
        for (int i10 = 1; i10 < fArr.length; i10++) {
            jVar.l((byte) 44);
            I(fArr[i10], jVar);
        }
        jVar.l((byte) 93);
    }

    public static void N(int[] iArr, S6.j jVar) throws IOException {
        if (iArr == null) {
            jVar.n();
            return;
        }
        if (iArr.length == 0) {
            jVar.i("[]");
            return;
        }
        byte[] bArrC = jVar.c((iArr.length * 11) + 2);
        int iH = jVar.h();
        bArrC[iH] = 91;
        int iF = F(bArrC, iH + 1, iArr[0]);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            bArrC[iF] = 44;
            iF = F(bArrC, iF + 1, iArr[i10]);
        }
        bArrC[iF] = 93;
        jVar.a((iF + 1) - jVar.h());
    }

    public static void O(long[] jArr, S6.j jVar) throws IOException {
        if (jArr == null) {
            jVar.n();
            return;
        }
        if (jArr.length == 0) {
            jVar.i("[]");
            return;
        }
        byte[] bArrC = jVar.c((jArr.length * 21) + 2);
        int iH = jVar.h();
        bArrC[iH] = 91;
        int iG = G(bArrC, iH + 1, jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            bArrC[iG] = 44;
            iG = G(bArrC, iG + 1, jArr[i10]);
        }
        bArrC[iG] = 93;
        jVar.a((iG + 1) - jVar.h());
    }

    public static void P(short[] sArr, S6.j jVar) throws IOException {
        if (sArr == null) {
            jVar.n();
            return;
        }
        if (sArr.length == 0) {
            jVar.i("[]");
            return;
        }
        jVar.l((byte) 91);
        J(sArr[0], jVar);
        for (int i10 = 1; i10 < sArr.length; i10++) {
            jVar.l((byte) 44);
            J(sArr[i10], jVar);
        }
        jVar.l((byte) 93);
    }

    public static void Q(Double d10, S6.j jVar) throws IOException {
        if (d10 == null) {
            jVar.n();
        } else {
            H(d10.doubleValue(), jVar);
        }
    }

    public static void R(Float f10, S6.j jVar) throws IOException {
        if (f10 == null) {
            jVar.n();
        } else {
            I(f10.floatValue(), jVar);
        }
    }

    public static void S(Integer num, S6.j jVar) throws IOException {
        if (num == null) {
            jVar.n();
        } else {
            J(num.intValue(), jVar);
        }
    }

    public static void T(Long l10, S6.j jVar) throws IOException {
        if (l10 == null) {
            jVar.n();
        } else {
            K(l10.longValue(), jVar);
        }
    }

    public static void U(BigDecimal bigDecimal, S6.j jVar) throws IOException {
        if (bigDecimal == null) {
            jVar.n();
        } else {
            jVar.i(bigDecimal.toString());
        }
    }

    private static void W(byte[] bArr, int i10, int i11) {
        bArr[i11] = (byte) (i10 >> 16);
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) i10;
    }

    private static int X(byte[] bArr, int i10, int i11) {
        int i12 = i10 >> 24;
        if (i12 == 0) {
            int i13 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 16);
            i11 += 2;
            bArr[i13] = (byte) (i10 >> 8);
        } else if (i12 == 1) {
            bArr[i11] = (byte) (i10 >> 8);
            i11++;
        }
        bArr[i11] = (byte) i10;
        return 3 - i12;
    }

    private static Number b(BigDecimal bigDecimal, i.g gVar) {
        return gVar == i.g.LONG_AND_BIGDECIMAL ? bigDecimal : Double.valueOf(bigDecimal.doubleValue());
    }

    public static long j(S6.i iVar) throws IOException {
        boolean z10;
        char c10 = 1;
        if (iVar.n() == 34) {
            int i10 = iVar.i();
            try {
                return A(iVar.G(), (iVar.i() - i10) - 1, iVar, true).longValueExact();
            } catch (ArithmeticException unused) {
                throw iVar.r("Long overflow detected", iVar.i() - i10);
            }
        }
        int iK = iVar.K();
        int i11 = iVar.i();
        byte[] bArr = iVar.f33360h;
        byte b10 = bArr[iK];
        char c11 = 3;
        int i12 = 9;
        if (b10 == 45) {
            int i13 = iK + 1;
            if (i13 == i11) {
                q(iVar, iK, i11, "Digit not found");
            }
            z10 = bArr[i13] == 48;
            int i14 = i13;
            long j10 = 0;
            while (i14 < i11) {
                int i15 = bArr[i14] - 48;
                if (i15 < 0 || i15 > 9) {
                    if (z10 && i14 > iK + 2) {
                        q(iVar, iK, i11, "Leading zero is not allowed");
                    }
                    if (i14 <= i13 || !iVar.a(i14, i11)) {
                        return w(iVar, iK, i11);
                    }
                    return j10;
                }
                char c12 = c10;
                byte[] bArr2 = bArr;
                j10 = ((j10 << 3) + (j10 << c10)) - i15;
                if (j10 > 0) {
                    q(iVar, iK, i11, "Long overflow detected");
                }
                i14++;
                c10 = c12;
                bArr = bArr2;
            }
            if (z10 && i14 > iK + 2) {
                q(iVar, iK, i11, "Leading zero is not allowed");
            }
            return j10;
        }
        if (iK == i11) {
            q(iVar, iK, i11, "Digit not found");
        }
        z10 = bArr[iK] == 48;
        int i16 = iK;
        long j11 = 0;
        while (i16 < i11) {
            int i17 = bArr[i16] - 48;
            if (i17 < 0 || i17 > i12) {
                if (z10 && i16 > iK + 1) {
                    q(iVar, iK, i11, "Leading zero is not allowed");
                }
                if ((b10 != 43 || i16 <= iK + 1 || !iVar.a(i16, i11)) && (b10 == 43 || i16 <= iK || !iVar.a(i16, i11))) {
                    return w(iVar, iK, i11);
                }
                return j11;
            }
            j11 = (j11 << c11) + (j11 << 1) + i17;
            if (j11 < 0) {
                q(iVar, iK, i11, "Long overflow detected");
            }
            i16++;
            c11 = 3;
            i12 = 9;
        }
        if (z10 && i16 > iK + 1) {
            q(iVar, iK, i11, "Leading zero is not allowed");
        }
        return j11;
    }

    public static Number l(S6.i iVar) throws IOException {
        i.g gVar = iVar.f33373u;
        if (gVar == i.g.BIGDECIMAL) {
            return c(iVar);
        }
        if (gVar == i.g.DOUBLE) {
            return Double.valueOf(d(iVar));
        }
        int iK = iVar.K();
        int i10 = iVar.i();
        if (i10 == iVar.o()) {
            C cE = E(iVar, iK);
            return V(cE.f33452a, cE.f33453b, iVar);
        }
        int i11 = i10 - iK;
        if (i11 > 18) {
            return V(iVar.z(iK, i11), i11, iVar);
        }
        byte[] bArr = iVar.f33360h;
        return bArr[iK] == 45 ? z(bArr, iVar, iK, i10) : D(bArr, iVar, iK, i10);
    }

    private static double o(S6.i iVar, long j10, int i10, double d10, byte[] bArr, int i11, int i12, int i13, int i14) throws IOException {
        double d11;
        double d12;
        if (iVar.f33371s == i.b.EXACT) {
            int i15 = (i12 - i11) - i13;
            return t(iVar.z(i11 + i13, i15), i15, iVar, false);
        }
        int i16 = i14 + 1;
        byte b10 = bArr[i16];
        int iY = (b10 == 45 ? y(bArr, iVar, i16, i12) : b10 == 43 ? C(bArr, iVar, i16, i12, 1) : C(bArr, iVar, i16, i12, 0)) - i10;
        if (d10 == 0.0d) {
            if (iY == 0 || j10 == 0) {
                return j10;
            }
            if (iY > 0) {
                double[] dArr = f33440o;
                if (iY < dArr.length) {
                    return j10 * dArr[iY - 1];
                }
            }
            if (iY < 0) {
                int i17 = -iY;
                double[] dArr2 = f33440o;
                if (i17 < dArr2.length) {
                    return j10 / dArr2[i17 - 1];
                }
            }
            if (iVar.f33371s != i.b.HIGH) {
                if (iY > 0 && iY < 300) {
                    return j10 * Math.pow(10.0d, iY);
                }
                if (iY > -300 && iY < 0) {
                    return j10 / Math.pow(10.0d, iY);
                }
            }
        } else {
            if (iY == 0) {
                return j10 + d10;
            }
            if (iY > 0) {
                double[] dArr3 = f33440o;
                if (iY < dArr3.length) {
                    double d13 = dArr3[iY - 1];
                    d11 = d10 * d13;
                    d12 = j10 * d13;
                }
                return d11 + d12;
            }
            if (iY < 0) {
                int i18 = -iY;
                double[] dArr4 = f33440o;
                if (i18 < dArr4.length) {
                    double d14 = dArr4[i18 - 1];
                    d11 = d10 / d14;
                    d12 = j10 / d14;
                    return d11 + d12;
                }
            }
            if (iVar.f33371s != i.b.HIGH) {
                if (iY > 0 && iY < 300) {
                    return j10 * Math.pow(10.0d, iY);
                }
                if (iY > -300 && iY < 0) {
                    return j10 / Math.pow(10.0d, iY);
                }
            }
        }
        int i19 = (i12 - i11) - i13;
        return t(iVar.z(i11 + i13, i19), i19, iVar, false);
    }

    private static float p(S6.i iVar, long j10, int i10, byte[] bArr, int i11, int i12) throws IOException {
        byte b10 = bArr[i12];
        int iY = (b10 == 45 ? y(bArr, iVar, i12, i11) : b10 == 43 ? C(bArr, iVar, i12, i11, 1) : C(bArr, iVar, i12, i11, 0)) - i10;
        if (iY == 0 || j10 == 0) {
            return j10;
        }
        if (iY > 0) {
            double[] dArr = f33440o;
            if (iY < dArr.length) {
                return (float) (j10 * dArr[iY - 1]);
            }
        }
        if (iY < 0) {
            int i13 = -iY;
            double[] dArr2 = f33440o;
            if (i13 < dArr2.length) {
                return (float) (j10 / dArr2[i13 - 1]);
            }
        }
        return iY > 0 ? Float.POSITIVE_INFINITY : 0.0f;
    }

    static void q(S6.i iVar, int i10, int i11, String str) throws ParsingException {
        int i12 = i11 - i10;
        if (i12 <= iVar.f33374v) {
            throw iVar.u("Error parsing number", i12, "", str, null, ". Error parsing number");
        }
        throw iVar.u("Too many digits detected in number", i12, "", "Too many digits detected in number", Integer.valueOf(i11), "");
    }

    static void r(S6.i iVar, int i10, int i11, String str, Object obj) throws ParsingException {
        int i12 = i11 - i10;
        if (i12 <= iVar.f33374v) {
            throw iVar.u("Error parsing number", i12, "", str, obj, ". Error parsing number");
        }
        throw iVar.u("Too many digits detected in number", i12, "", "Too many digits detected in number", Integer.valueOf(i11), "");
    }

    private static float u(byte[] bArr, S6.i iVar, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17 = i11;
        int i18 = i10 + i12;
        boolean z11 = bArr[i18] == 48;
        byte b10 = 32;
        int i19 = i18;
        long j10 = 0;
        while (i19 < i17 && (b10 = bArr[i19]) != 46 && b10 != 101 && b10 != 69) {
            int i20 = b10 - 48;
            if (i20 < 0 || i20 > 9) {
                if (z11 && i19 > i18 + 1) {
                    q(iVar, i10, i17, "Leading zero is not allowed");
                }
                if (i19 > i18 && iVar.a(i19, i17)) {
                    return j10;
                }
                r(iVar, i10, i17, "Unknown digit", Character.valueOf((char) b10));
            }
            j10 = (j10 << 3) + (j10 << 1) + i20;
            i19++;
        }
        if (i19 == i18) {
            q(iVar, i10, i17, "Digit not found");
        } else if (z11 && b10 != 46 && i19 > i18 + 1) {
            q(iVar, i10, i17, "Leading zero is not allowed");
        } else {
            if (i19 > i18 + 18) {
                int i21 = (i17 - i10) - i12;
                return v(iVar.z(i18, i21), i21, iVar, false);
            }
            if (i19 == i17) {
                return j10;
            }
            if (b10 == 46) {
                int i22 = i19 + 1;
                if (i22 == i17) {
                    q(iVar, i10, i17, "Number ends with a dot");
                }
                if (j10 == 0) {
                    i14 = i19 + 2;
                    while (i22 < i17 && bArr[i22] == 48) {
                        i22++;
                    }
                    i13 = i22 + 17;
                    i15 = 0;
                } else {
                    i13 = i18 + 17;
                    i14 = i22;
                    i15 = 1;
                }
                if (i13 >= i17) {
                    i13 = i17;
                }
                while (i22 < i13) {
                    b10 = bArr[i22];
                    if (b10 == 101 || b10 == 69) {
                        i22++;
                        z10 = true;
                        break;
                    }
                    int i23 = b10 - 48;
                    if (i23 < 0 || i23 > 9) {
                        if (iVar.a(i22, i17)) {
                            return (float) (j10 / f33440o[(i22 - i14) - i15]);
                        }
                        r(iVar, i10, i17, "Unknown digit", Character.valueOf((char) b10));
                    }
                    j10 = (j10 << 3) + (j10 << 1) + i23;
                    i22++;
                }
                z10 = false;
                if (i22 != i13 || z10) {
                    i16 = i22 - i15;
                } else {
                    i16 = (i22 + 1) - i15;
                    while (i22 < i17 && b10 >= 48 && b10 <= 57) {
                        b10 = bArr[i22];
                        i22++;
                    }
                }
                byte[] bArr2 = bArr;
                int i24 = i22;
                while (i24 == i17 && iVar.o() == i17) {
                    int iK = iVar.K();
                    i17 = iVar.i();
                    bArr2 = iVar.f33360h;
                    i24 = iK;
                    while (i24 < i17 && b10 >= 48 && b10 <= 57) {
                        b10 = bArr2[i24];
                        i24++;
                    }
                }
                if (b10 == 101 || b10 == 69) {
                    return p(iVar, j10, i16 - i14, bArr2, i17, i24);
                }
                int i25 = i16 - i14;
                return i25 > 0 ? (float) (j10 / f33440o[i25 - 1]) : i25 < 0 ? (float) (j10 * f33440o[(-i25) - 1]) : j10;
            }
            if (b10 == 101 || b10 == 69) {
                return p(iVar, j10, 0, bArr, i17, i19 + 1);
            }
        }
        return j10;
    }

    private static long w(S6.i iVar, int i10, int i11) throws IOException {
        int i12 = i11 - i10;
        char[] cArrZ = iVar.z(i10, i12);
        if (i12 > 0 && cArrZ[i12 - 1] == '.') {
            q(iVar, i10, i11, "Number ends with a dot");
        }
        BigDecimal bigDecimalA = A(cArrZ, i12, iVar, false);
        if (bigDecimalA.scale() > 0) {
            r(iVar, i10, i11, "Expecting long, but found decimal value ", bigDecimalA);
        }
        return bigDecimalA.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r11 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        q(r22, r23, r24, "Digit not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r6 == 46) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r11 <= (r23 + 2)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        q(r22, r23, r24, "Leading zero is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r11 != r24) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return java.math.BigDecimal.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r6 != 46) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        if (r11 != r24) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        q(r22, r23, r24, "Number ends with a dot");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        if (r12 >= r24) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r6 = r21[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r6 == 101) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        if (r6 != 69) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r14 = r6 - 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (r14 < 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        if (r14 <= r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        if (r22.a(r12, r24) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a9, code lost:
    
        return java.math.BigDecimal.valueOf(r9, r12 - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        r(r22, r23, r24, "Unknown digit", java.lang.Character.valueOf((char) r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        r9 = ((r9 << 3) + (r9 << 1)) - r14;
        r12 = r12 + 1;
        r15 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
    
        if (r12 != r24) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        return java.math.BigDecimal.valueOf(r9, r24 - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        if (r6 == 101) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        if (r6 != 69) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
    
        return java.math.BigDecimal.valueOf(r9, r24 - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
    
        r2 = r12 + 1;
        r6 = r21[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d9, code lost:
    
        if (r6 != 45) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00db, code lost:
    
        r0 = y(r21, r22, r2, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        if (r6 != 43) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        r0 = C(r21, r22, r2, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
    
        r0 = C(r21, r22, r2, r24, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        return java.math.BigDecimal.valueOf(r9, (r12 - r11) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f5, code lost:
    
        if (r6 == 101) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
    
        if (r6 != 69) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ff, code lost:
    
        return java.math.BigDecimal.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0100, code lost:
    
        r11 = r11 + 1;
        r6 = r21[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0103, code lost:
    
        if (r6 != 45) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0105, code lost:
    
        r0 = y(r21, r22, r11, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010a, code lost:
    
        if (r6 != 43) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
    
        r0 = C(r21, r22, r11, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0111, code lost:
    
        r0 = C(r21, r22, r11, r24, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011b, code lost:
    
        return java.math.BigDecimal.valueOf(r9, -r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.math.BigDecimal x(byte[] r21, S6.i r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.l.x(byte[], S6.i, int, int):java.math.BigDecimal");
    }

    private static int y(byte[] bArr, S6.i iVar, int i10, int i11) throws IOException {
        int i12 = i10 + 1;
        if (i12 == i11) {
            q(iVar, i10, i11, "Digit not found");
        }
        int i13 = 0;
        for (int i14 = i12; i14 < i11; i14++) {
            int i15 = bArr[i14] - 48;
            if (i15 < 0 || i15 > 9) {
                if (i14 <= i12 || !iVar.a(i14, i11)) {
                    if (i14 == i11 - 1 && bArr[i14] == 46) {
                        q(iVar, i10, i11, "Number ends with a dot");
                    }
                    int i16 = i11 - i10;
                    BigDecimal bigDecimalA = A(iVar.z(i10, i16), i16, iVar, false);
                    if (bigDecimalA.scale() > 0) {
                        r(iVar, i10, i11, "Expecting int but found decimal value", bigDecimalA);
                    }
                    return bigDecimalA.intValue();
                }
                return i13;
            }
            i13 = ((i13 << 3) + (i13 << 1)) - i15;
            if (i13 > 0) {
                q(iVar, i10, i11, "Integer overflow detected");
            }
        }
        return i13;
    }

    private static Number z(byte[] bArr, S6.i iVar, int i10, int i11) throws IOException {
        int i12 = i10 + 1;
        boolean z10 = bArr[i12] == 48;
        long j10 = 0;
        byte b10 = 32;
        int i13 = i12;
        while (i13 < i11 && (b10 = bArr[i13]) != 46 && b10 != 101 && b10 != 69) {
            int i14 = b10 - 48;
            if (i14 < 0 || i14 > 9) {
                if (z10 && i13 > i10 + 2) {
                    q(iVar, i10, i11, "Leading zero is not allowed");
                }
                if (i13 > i12 && iVar.a(i13, i11)) {
                    return Long.valueOf(j10);
                }
                int i15 = i11 - i10;
                return V(iVar.z(i10, i15), i15, iVar);
            }
            j10 = ((j10 << 3) + (j10 << 1)) - i14;
            i13++;
        }
        if (i13 == i12) {
            q(iVar, i10, i11, "Digit not found");
        } else if (z10 && b10 != 46 && i13 > i10 + 2) {
            q(iVar, i10, i11, "Leading zero is not allowed");
        } else {
            if (i13 == i11) {
                return Long.valueOf(j10);
            }
            if (b10 == 46) {
                int i16 = i13 + 1;
                if (i16 == i11) {
                    q(iVar, i10, i11, "Number ends with a dot");
                }
                int i17 = i16;
                while (i17 < i11) {
                    b10 = bArr[i17];
                    if (b10 == 101 || b10 == 69) {
                        break;
                    }
                    int i18 = b10 - 48;
                    if (i18 < 0 || i18 > 9) {
                        if (iVar.a(i17, i11)) {
                            return BigDecimal.valueOf(j10, i17 - i16);
                        }
                        int i19 = i11 - i10;
                        return V(iVar.z(i10, i19), i19, iVar);
                    }
                    j10 = ((j10 << 3) + (j10 << 1)) - i18;
                    i17++;
                }
                if (i17 == i11) {
                    return b(BigDecimal.valueOf(j10, i11 - i16), iVar.f33373u);
                }
                if (b10 != 101 && b10 != 69) {
                    return b(BigDecimal.valueOf(j10, i11 - i16), iVar.f33373u);
                }
                int i20 = i17 + 1;
                byte b11 = bArr[i20];
                return b(BigDecimal.valueOf(j10, (i17 - i16) - (b11 == 45 ? y(bArr, iVar, i20, i11) : b11 == 43 ? C(bArr, iVar, i20, i11, 1) : C(bArr, iVar, i20, i11, 0))), iVar.f33373u);
            }
            if (b10 == 101 || b10 == 69) {
                int i21 = i13 + 1;
                byte b12 = bArr[i21];
                return b(BigDecimal.valueOf(j10, -(b12 == 45 ? y(bArr, iVar, i21, i11) : b12 == 43 ? C(bArr, iVar, i21, i11, 1) : C(bArr, iVar, i21, i11, 0))), iVar.f33373u);
            }
        }
        return b(BigDecimal.valueOf(j10), iVar.f33373u);
    }

    private static C E(S6.i iVar, int i10) throws IOException {
        int iO = iVar.o() - i10;
        char[] cArrZ = iVar.z(i10, iO);
        while (iVar.o() == iVar.i() && !iVar.m()) {
            iVar.K();
            int i11 = iVar.i();
            int i12 = iO + i11;
            int i13 = iVar.f33374v;
            if (i12 <= i13) {
                char[] cArr = new char[i12];
                System.arraycopy(cArrZ, 0, cArr, 0, iO);
                System.arraycopy(iVar.z(0, i11), 0, cArr, iO, i11);
                iO = i12;
                cArrZ = cArr;
            } else {
                throw iVar.t("Too many digits detected in number", i12, "Number of digits larger than %d. Unable to read number", Integer.valueOf(i13));
            }
        }
        return new C(cArrZ, iO);
    }

    public static void H(double d10, S6.j jVar) throws IOException {
        jVar.m(d10);
    }

    private static double a(int i10, double d10, int i11) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i12 = ((int) (jDoubleToRawLongBits >> 52)) - 1022;
        return Double.longBitsToDouble(jDoubleToRawLongBits + (((i10 * f33439n[i11 + 1]) + f33438m[i12]) / f33437l[i12]));
    }

    public static BigDecimal c(S6.i iVar) throws IOException {
        if (iVar.n() == 34) {
            return A(iVar.f33361i, iVar.w(), iVar, true);
        }
        int iK = iVar.K();
        int i10 = iVar.i();
        if (i10 == iVar.o()) {
            C cE = E(iVar, iK);
            return A(cE.f33452a, cE.f33453b, iVar, false);
        }
        int i11 = i10 - iK;
        if (i11 > 18) {
            return A(iVar.z(iK, i11), i11, iVar, false);
        }
        byte[] bArr = iVar.f33360h;
        if (bArr[iK] == 45) {
            return x(bArr, iVar, iK, i10);
        }
        return B(bArr, iVar, iK, i10);
    }

    public static double d(S6.i iVar) throws IOException {
        if (iVar.n() == 34) {
            return t(iVar.G(), (iVar.i() - iVar.i()) - 1, iVar, true);
        }
        int iK = iVar.K();
        int i10 = iVar.i();
        byte[] bArr = iVar.f33360h;
        if (bArr[iK] == 45) {
            return -s(bArr, iVar, iK, i10, 1);
        }
        return s(bArr, iVar, iK, i10, 0);
    }

    public static double[] e(S6.i iVar) throws IOException {
        if (iVar.n() == 93) {
            return f33430e;
        }
        double[] dArrCopyOf = new double[4];
        dArrCopyOf[0] = d(iVar);
        int i10 = 1;
        while (iVar.j() == 44) {
            iVar.j();
            if (i10 == dArrCopyOf.length) {
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, dArrCopyOf.length << 1);
            }
            dArrCopyOf[i10] = d(iVar);
            i10++;
        }
        iVar.d();
        return Arrays.copyOf(dArrCopyOf, i10);
    }

    public static float f(S6.i iVar) throws IOException {
        if (iVar.n() == 34) {
            return v(iVar.G(), (iVar.i() - iVar.i()) - 1, iVar, true);
        }
        int iK = iVar.K();
        int i10 = iVar.i();
        if (i10 == iVar.o()) {
            C cE = E(iVar, iK);
            return v(cE.f33452a, cE.f33453b, iVar, false);
        }
        byte[] bArr = iVar.f33360h;
        if (bArr[iK] == 45) {
            return -u(bArr, iVar, iK, i10, 1);
        }
        return u(bArr, iVar, iK, i10, 0);
    }

    public static float[] g(S6.i iVar) throws IOException {
        if (iVar.n() == 93) {
            return f33429d;
        }
        float[] fArrCopyOf = new float[4];
        fArrCopyOf[0] = f(iVar);
        int i10 = 1;
        while (iVar.j() == 44) {
            iVar.j();
            if (i10 == fArrCopyOf.length) {
                fArrCopyOf = Arrays.copyOf(fArrCopyOf, fArrCopyOf.length << 1);
            }
            fArrCopyOf[i10] = f(iVar);
            i10++;
        }
        iVar.d();
        return Arrays.copyOf(fArrCopyOf, i10);
    }

    public static int h(S6.i iVar) throws IOException {
        int i10;
        byte b10;
        byte b11;
        if (iVar.n() == 34) {
            int i11 = iVar.i();
            try {
                return A(iVar.G(), (iVar.i() - i11) - 1, iVar, true).intValueExact();
            } catch (ArithmeticException unused) {
                throw iVar.r("Integer overflow detected", iVar.i() - i11);
            }
        }
        int iK = iVar.K();
        int i12 = iVar.i();
        byte[] bArr = iVar.f33360h;
        byte b12 = bArr[iK];
        if (b12 == 45) {
            int i13 = iK + 2;
            if (i12 > i13 && bArr[iK + 1] == 48 && (b11 = bArr[i13]) >= 48 && b11 <= 57) {
                q(iVar, iK, i12, "Leading zero is not allowed");
            }
            return y(bArr, iVar, iK, i12);
        }
        if (b12 == 48 && i12 > (i10 = iK + 1) && (b10 = bArr[i10]) >= 48 && b10 <= 57) {
            q(iVar, iK, i12, "Leading zero is not allowed");
        }
        return C(bArr, iVar, iK, i12, 0);
    }

    public static int[] i(S6.i iVar) throws IOException {
        if (iVar.n() == 93) {
            return f33427b;
        }
        int[] iArrCopyOf = new int[4];
        iArrCopyOf[0] = h(iVar);
        int i10 = 1;
        while (iVar.j() == 44) {
            iVar.j();
            if (i10 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
            }
            iArrCopyOf[i10] = h(iVar);
            i10++;
        }
        iVar.d();
        return Arrays.copyOf(iArrCopyOf, i10);
    }

    public static long[] k(S6.i iVar) throws IOException {
        if (iVar.n() == 93) {
            return f33428c;
        }
        long[] jArrCopyOf = new long[4];
        jArrCopyOf[0] = j(iVar);
        int i10 = 1;
        while (iVar.j() == 44) {
            iVar.j();
            if (i10 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
            }
            jArrCopyOf[i10] = j(iVar);
            i10++;
        }
        iVar.d();
        return Arrays.copyOf(jArrCopyOf, i10);
    }

    public static short m(S6.i iVar) throws IOException {
        int iC;
        if (iVar.n() == 34) {
            int i10 = iVar.i();
            try {
                return A(iVar.G(), (iVar.i() - i10) - 1, iVar, true).shortValueExact();
            } catch (ArithmeticException unused) {
                throw iVar.r("Short overflow detected", iVar.i() - i10);
            }
        }
        int iK = iVar.K();
        int i11 = iVar.i();
        byte[] bArr = iVar.f33360h;
        if (bArr[iK] == 45) {
            iC = y(bArr, iVar, iK, i11);
        } else {
            iC = C(bArr, iVar, iK, i11, 0);
        }
        if (iC >= -32768 && iC <= 32767) {
            return (short) iC;
        }
        throw iVar.r("Short overflow detected", iVar.i());
    }

    public static short[] n(S6.i iVar) throws IOException {
        if (iVar.n() == 93) {
            return f33426a;
        }
        short[] sArrCopyOf = new short[4];
        sArrCopyOf[0] = (short) h(iVar);
        int i10 = 1;
        while (iVar.j() == 44) {
            iVar.j();
            if (i10 == sArrCopyOf.length) {
                sArrCopyOf = Arrays.copyOf(sArrCopyOf, sArrCopyOf.length << 1);
            }
            sArrCopyOf[i10] = (short) h(iVar);
            i10++;
        }
        iVar.d();
        return Arrays.copyOf(sArrCopyOf, i10);
    }
}
