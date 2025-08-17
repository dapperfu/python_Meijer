package b2;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6180a {

    /* renamed from: a, reason: collision with root package name */
    private final float f59691a;

    /* renamed from: b, reason: collision with root package name */
    private final float f59692b;

    /* renamed from: c, reason: collision with root package name */
    private final float f59693c;

    /* renamed from: d, reason: collision with root package name */
    private final float f59694d;

    /* renamed from: e, reason: collision with root package name */
    private final float f59695e;

    /* renamed from: f, reason: collision with root package name */
    private final float f59696f;

    /* renamed from: g, reason: collision with root package name */
    private final float f59697g;

    /* renamed from: h, reason: collision with root package name */
    private final float f59698h;

    /* renamed from: i, reason: collision with root package name */
    private final float f59699i;

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    private static C6180a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C6180a c6180a = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int iP = e(f17, f11, f10).p();
            float fB = C6181b.b(iP);
            float fAbs = Math.abs(f12 - fB);
            if (fAbs < 0.2f) {
                C6180a c6180aC = c(iP);
                float fA = c6180aC.a(e(c6180aC.k(), c6180aC.i(), f10));
                if (fA <= 1.0f) {
                    c6180a = c6180aC;
                    f14 = fAbs;
                    f16 = fA;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                return c6180a;
            }
            if (fB < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return c6180a;
    }

    static C6180a c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, C6191l.f59737k, fArr, fArr2);
        return new C6180a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static int n(float f10, float f11, float f12, C6191l c6191l) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return C6181b.a(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C6180a c6180a = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C6180a c6180aB = b(fMin, f14, f12);
            if (!z10) {
                if (c6180aB == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    c6180a = c6180aB;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (c6180aB != null) {
                    return c6180aB.o(c6191l);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return c6180a == null ? C6181b.a(f12) : c6180a.o(c6191l);
    }

    static void d(int i10, C6191l c6191l, float[] fArr, float[] fArr2) {
        C6181b.f(i10, fArr2);
        float[][] fArr3 = C6181b.f59700a;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr4[0] * f10;
        float f12 = fArr2[1];
        float f13 = f11 + (fArr4[1] * f12);
        float f14 = fArr2[2];
        float f15 = f13 + (fArr4[2] * f14);
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[0] * f10) + (fArr5[1] * f12) + (fArr5[2] * f14);
        float[] fArr6 = fArr3[2];
        float f17 = (f10 * fArr6[0]) + (f12 * fArr6[1]) + (f14 * fArr6[2]);
        float f18 = c6191l.i()[0] * f15;
        float f19 = c6191l.i()[1] * f16;
        float f20 = c6191l.i()[2] * f17;
        float fPow = (float) Math.pow((c6191l.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((c6191l.c() * Math.abs(f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((c6191l.c() * Math.abs(f20)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * c6191l.f()) / c6191l.a(), c6191l.b() * c6191l.j())) * 100.0f;
        float fB = (4.0f / c6191l.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c6191l.a() + 4.0f) * c6191l.d();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c6191l.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c6191l.g()) * c6191l.h()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        float fD = c6191l.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * c6191l.b()) / (c6191l.a() + 4.0f))) * 50.0f;
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d11 = f26;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f27;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static C6180a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, C6191l.f59737k);
    }

    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, C6191l.f59737k);
    }

    float g() {
        return this.f59698h;
    }

    float h() {
        return this.f59699i;
    }

    float i() {
        return this.f59692b;
    }

    float j() {
        return this.f59691a;
    }

    float k() {
        return this.f59693c;
    }

    float l() {
        return this.f59697g;
    }

    int p() {
        return o(C6191l.f59737k);
    }

    C6180a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f59691a = f10;
        this.f59692b = f11;
        this.f59693c = f12;
        this.f59694d = f13;
        this.f59695e = f14;
        this.f59696f = f15;
        this.f59697g = f16;
        this.f59698h = f17;
        this.f59699i = f18;
    }

    private static C6180a f(float f10, float f11, float f12, C6191l c6191l) {
        float fB = (4.0f / c6191l.b()) * ((float) Math.sqrt(f10 / 100.0d)) * (c6191l.a() + 4.0f) * c6191l.d();
        float fD = c6191l.d() * f11;
        float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * c6191l.b()) / (c6191l.a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((fD * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C6180a(f12, f11, f10, fB, fD, fSqrt, f13, ((float) Math.cos(d10)) * fLog, fLog * ((float) Math.sin(d10)));
    }

    float a(C6180a c6180a) {
        float fL = l() - c6180a.l();
        float fG = g() - c6180a.g();
        float fH = h() - c6180a.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    int o(C6191l c6191l) {
        float fI;
        if (i() != 0.0d && k() != 0.0d) {
            fI = i() / ((float) Math.sqrt(k() / 100.0d));
        } else {
            fI = 0.0f;
        }
        float fPow = (float) Math.pow(fI / Math.pow(1.64d - Math.pow(0.29d, c6191l.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = c6191l.a() * ((float) Math.pow(k() / 100.0d, (1.0d / c6191l.b()) / c6191l.j()));
        float fG = fCos * 3846.1538f * c6191l.g() * c6191l.h();
        float f10 = fA / c6191l.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f11 = (((0.305f + f10) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f12 = fCos2 * f11;
        float f13 = f11 * fSin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float fSignum = Math.signum(f15) * (100.0f / c6191l.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float fSignum2 = Math.signum(f16) * (100.0f / c6191l.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f) * (100.0f / c6191l.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f17 = fSignum / c6191l.i()[0];
        float f18 = fSignum2 / c6191l.i()[1];
        float f19 = fSignum3 / c6191l.i()[2];
        float[][] fArr = C6181b.f59701b;
        float[] fArr2 = fArr[0];
        float f20 = (fArr2[0] * f17) + (fArr2[1] * f18) + (fArr2[2] * f19);
        float[] fArr3 = fArr[1];
        float f21 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * f19);
        float[] fArr4 = fArr[2];
        return c2.c.b(f20, f21, (f17 * fArr4[0]) + (f18 * fArr4[1]) + (f19 * fArr4[2]));
    }
}
