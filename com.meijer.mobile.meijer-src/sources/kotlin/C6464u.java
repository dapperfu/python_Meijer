package kotlin;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Lc0/u;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "", "a", "(F[F)V", "b", "Lc0/u$a;", "[[Lc0/u$a;", "arcs", "", "Z", "isExtrapolate", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6464u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a[][] arcs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isExtrapolate = true;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010,\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0014\u0010.\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0014\u00102\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001cR\u0014\u00106\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001c¨\u00067"}, d2 = {"Lc0/u$a;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "j", "(F)F", "time", "", "k", "(F)V", "d", "()F", "e", "f", "g", "c", "(FFFF)V", "a", "F", "h", "b", "i", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "[F", "lut", "oneOverDeltaTime", "l", "arcVelocity", "m", "vertical", "n", "ellipseA", "o", "ellipseB", "", "p", "Z", "isLinear", "q", "ellipseCenterX", "r", "ellipseCenterY", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c0.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float time1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float time2;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private float arcDistance;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private float tmpSinAngle;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float tmpCosAngle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] lut;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final float oneOverDeltaTime;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final float arcVelocity;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final float vertical;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final float ellipseA;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final float ellipseB;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean isLinear;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final float ellipseCenterX;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final float ellipseCenterY;

        private final float j(float v10) {
            if (v10 <= 0.0f) {
                return 0.0f;
            }
            if (v10 >= 1.0f) {
                return 1.0f;
            }
            float f10 = v10 * 100;
            int i10 = (int) f10;
            float f11 = f10 - i10;
            float[] fArr = this.lut;
            float f12 = fArr[i10];
            return f12 + (f11 * (fArr[i10 + 1] - f12));
        }

        public final void c(float x12, float y12, float x22, float y22) {
            float f10;
            float f11;
            float fHypot;
            float f12 = x22 - x12;
            float f13 = y12 - y22;
            float[] fArr = C6465v.f61079a;
            int length = fArr.length - 1;
            float f14 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f15 = f13;
                int i10 = 1;
                fHypot = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    f11 = 0.0f;
                    double radians = (float) Math.toRadians((i10 * 90.0d) / length);
                    float fSin = ((float) Math.sin(radians)) * f12;
                    float fCos = ((float) Math.cos(radians)) * f13;
                    f10 = f14;
                    fHypot += (float) Math.hypot(fSin - f16, fCos - f15);
                    fArr[i10] = fHypot;
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    f15 = fCos;
                    f14 = f10;
                    f16 = fSin;
                }
            } else {
                f10 = f14;
                f11 = 0.0f;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i11 = 1;
                while (true) {
                    fArr[i11] = fArr[i11] / fHypot;
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                float f17 = i12 / 100.0f;
                int i13 = ArraysKt.i(fArr, f17, 0, 0, 6, null);
                if (i13 >= 0) {
                    fArr2[i12] = i13 / f10;
                } else if (i13 == -1) {
                    fArr2[i12] = f11;
                } else {
                    int i14 = -i13;
                    int i15 = i14 - 2;
                    float f18 = i15;
                    float f19 = fArr[i15];
                    fArr2[i12] = (f18 + ((f17 - f19) / (fArr[i14 - 1] - f19))) / f10;
                }
            }
        }

        public final float d() {
            float f10 = this.ellipseA * this.tmpCosAngle;
            return f10 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f10, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float e() {
            float f10 = this.ellipseA * this.tmpCosAngle;
            float f11 = (-this.ellipseB) * this.tmpSinAngle;
            return f11 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f10, f11)));
        }

        public final float f(float time) {
            float f10 = (time - this.time1) * this.oneOverDeltaTime;
            float f11 = this.x1;
            return f11 + (f10 * (this.x2 - f11));
        }

        public final float g(float time) {
            float f10 = (time - this.time1) * this.oneOverDeltaTime;
            float f11 = this.y1;
            return f11 + (f10 * (this.y2 - f11));
        }

        /* renamed from: h, reason: from getter */
        public final float getTime1() {
            return this.time1;
        }

        /* renamed from: i, reason: from getter */
        public final float getTime2() {
            return this.time2;
        }

        public final void k(float time) {
            double dJ = j((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dJ);
            this.tmpCosAngle = (float) Math.cos(dJ);
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            boolean z10;
            float f16;
            float f17;
            float f18;
            this.time1 = f10;
            this.time2 = f11;
            this.x1 = f12;
            this.y1 = f13;
            this.x2 = f14;
            this.y2 = f15;
            float f19 = f14 - f12;
            float f20 = f15 - f13;
            boolean z11 = true;
            if (i10 != 1 && (i10 == 4 ? f20 <= 0.0f : i10 != 5 || f20 >= 0.0f)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f16 = -1.0f;
            } else {
                f16 = 1.0f;
            }
            this.vertical = f16;
            float f21 = 1 / (f11 - f10);
            this.oneOverDeltaTime = f21;
            this.lut = new float[101];
            boolean z12 = i10 == 3;
            if (!z12 && Math.abs(f19) >= 0.001f && Math.abs(f20) >= 0.001f) {
                this.ellipseA = f19 * f16;
                this.ellipseB = f20 * (-f16);
                if (z10) {
                    f17 = f14;
                } else {
                    f17 = f12;
                }
                this.ellipseCenterX = f17;
                if (z10) {
                    f18 = f13;
                } else {
                    f18 = f15;
                }
                this.ellipseCenterY = f18;
                c(f12, f13, f14, f15);
                this.arcVelocity = this.arcDistance * f21;
                z11 = z12;
            } else {
                float fHypot = (float) Math.hypot(f20, f19);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f21;
                this.ellipseCenterX = f19 * f21;
                this.ellipseCenterY = f20 * f21;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            }
            this.isLinear = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6464u(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r0.<init>()
            r2 = 1
            r0.isExtrapolate = r2
            int r3 = r1.length
            int r3 = r3 - r2
            c0.u$a[][] r4 = new kotlin.C6464u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L69
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r2 = r8.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            c0.u$a[] r11 = new kotlin.C6464u.a[r2]
            r12 = r5
        L45:
            if (r12 >= r2) goto L63
            int r16 = r12 * 2
            r17 = r12
            c0.u$a r12 = new c0.u$a
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L45
        L63:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r2 = 1
            goto L12
        L69:
            r0.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C6464u.<init>(int[], float[], float[][]):void");
    }

    public final void a(float time, float[] v10) {
        a[][] aVarArr = this.arcs;
        int length = aVarArr.length - 1;
        int i10 = 0;
        float time1 = aVarArr[0][0].getTime1();
        float time2 = aVarArr[length][0].getTime2();
        int length2 = v10.length;
        if (!this.isExtrapolate) {
            time = Math.min(Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f10 = time - time1;
            int i11 = 0;
            while (i10 < length2 - 1) {
                a aVar = aVarArr[length][i11];
                if (aVar.isLinear) {
                    v10[i10] = aVar.f(time1) + (aVar.ellipseCenterX * f10);
                    v10[i10 + 1] = aVar.g(time1) + (aVar.ellipseCenterY * f10);
                } else {
                    aVar.k(time1);
                    v10[i10] = aVar.ellipseCenterX + (aVar.ellipseA * aVar.tmpSinAngle) + (aVar.d() * f10);
                    v10[i10 + 1] = aVar.ellipseCenterY + (aVar.ellipseB * aVar.tmpCosAngle) + (aVar.e() * f10);
                }
                i10 += 2;
                i11++;
            }
            return;
        }
        boolean z10 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < length2 - 1) {
                a aVar2 = aVarArr2[i13];
                if (time <= aVar2.getTime2()) {
                    if (aVar2.isLinear) {
                        v10[i12] = aVar2.f(time);
                        v10[i12 + 1] = aVar2.g(time);
                    } else {
                        aVar2.k(time);
                        v10[i12] = aVar2.ellipseCenterX + (aVar2.ellipseA * aVar2.tmpSinAngle);
                        v10[i12 + 1] = aVar2.ellipseCenterY + (aVar2.ellipseB * aVar2.tmpCosAngle);
                    }
                    z10 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z10) {
                return;
            }
        }
    }

    public final void b(float time, float[] v10) {
        a[][] aVarArr = this.arcs;
        float time1 = aVarArr[0][0].getTime1();
        float time2 = aVarArr[aVarArr.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v10.length;
        boolean z10 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < length - 1) {
                a aVar = aVarArr2[i11];
                if (time2 <= aVar.getTime2()) {
                    if (aVar.isLinear) {
                        v10[i10] = aVar.ellipseCenterX;
                        v10[i10 + 1] = aVar.ellipseCenterY;
                    } else {
                        aVar.k(time2);
                        v10[i10] = aVar.d();
                        v10[i10 + 1] = aVar.e();
                    }
                    z10 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z10) {
                return;
            }
        }
    }
}
