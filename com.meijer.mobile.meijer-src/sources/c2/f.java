package c2;

import android.graphics.Path;
import com.fullstory.FS;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private char f61168a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f61169b;

        b(char c10, float[] fArr) {
            this.f61168a = c10;
            this.f61169b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c10, char c11, float[] fArr2) {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            char c12;
            char c13;
            int i12;
            float f10;
            boolean z12;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            boolean z13;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            Path path2 = path;
            boolean z14 = false;
            float f26 = fArr[0];
            boolean z15 = true;
            float f27 = fArr[1];
            char c14 = 2;
            float f28 = fArr[2];
            char c15 = 3;
            float f29 = fArr[3];
            float f30 = fArr[4];
            float f31 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i10 = 7;
                    i11 = i10;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    i11 = i10;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f30, f31);
                    f26 = f30;
                    f28 = f26;
                    f27 = f31;
                    f29 = f27;
                    i11 = 2;
                    break;
            }
            float f32 = f26;
            float f33 = f27;
            float f34 = f30;
            float f35 = f31;
            int i13 = 0;
            char c16 = c10;
            while (i13 < fArr2.length) {
                if (c11 == 'A') {
                    float f36 = f32;
                    float f37 = f33;
                    z10 = z14;
                    z11 = z15;
                    c12 = c14;
                    c13 = c15;
                    i12 = i13;
                    int i14 = i12 + 5;
                    float f38 = fArr2[i14];
                    int i15 = i12 + 6;
                    float f39 = fArr2[i15];
                    float f40 = fArr2[i12];
                    float f41 = fArr2[i12 + 1];
                    float f42 = fArr2[i12 + 2];
                    if (fArr2[i12 + 3] != 0.0f) {
                        f10 = 0.0f;
                        z12 = z11;
                    } else {
                        f10 = 0.0f;
                        z12 = z10;
                    }
                    g(path, f36, f37, f38, f39, f40, f41, f42, z12, fArr2[i12 + 4] != f10 ? z11 : z10);
                    f28 = fArr2[i14];
                    f32 = f28;
                    f29 = fArr2[i15];
                    f33 = f29;
                } else if (c11 == 'C') {
                    z10 = z14;
                    z11 = z15;
                    c12 = c14;
                    c13 = c15;
                    i12 = i13;
                    int i16 = i12 + 2;
                    int i17 = i12 + 3;
                    int i18 = i12 + 4;
                    int i19 = i12 + 5;
                    path2.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                    float f43 = fArr2[i18];
                    float f44 = fArr2[i19];
                    float f45 = fArr2[i16];
                    float f46 = fArr2[i17];
                    f32 = f43;
                    f33 = f44;
                    f29 = f46;
                    f28 = f45;
                } else if (c11 != 'H') {
                    if (c11 != 'Q') {
                        z10 = z14;
                        if (c11 == 'V') {
                            z11 = z15;
                            c12 = c14;
                            c13 = c15;
                            i12 = i13;
                            path2.lineTo(f32, fArr2[i12]);
                            f13 = fArr2[i12];
                        } else if (c11 != 'a') {
                            if (c11 != 'c') {
                                z11 = z15;
                                if (c11 != 'h') {
                                    if (c11 != 'q') {
                                        c12 = c14;
                                        if (c11 != 'v') {
                                            if (c11 != 'L') {
                                                if (c11 != 'M') {
                                                    c13 = c15;
                                                    if (c11 == 'S') {
                                                        if (c16 == 'c' || c16 == 's' || c16 == 'C' || c16 == 'S') {
                                                            f32 = (f32 * 2.0f) - f28;
                                                            f33 = (f33 * 2.0f) - f29;
                                                        }
                                                        float f47 = f32;
                                                        float f48 = f33;
                                                        int i20 = i13 + 1;
                                                        int i21 = i13 + 2;
                                                        int i22 = i13 + 3;
                                                        path2.cubicTo(f47, f48, fArr2[i13], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                        f11 = fArr2[i13];
                                                        f12 = fArr2[i20];
                                                        f32 = fArr2[i21];
                                                        f33 = fArr2[i22];
                                                        i12 = i13;
                                                    } else if (c11 == 'T') {
                                                        if (c16 == 'q' || c16 == 't' || c16 == 'Q' || c16 == 'T') {
                                                            f32 = (f32 * 2.0f) - f28;
                                                            f33 = (f33 * 2.0f) - f29;
                                                        }
                                                        int i23 = i13 + 1;
                                                        path2.quadTo(f32, f33, fArr2[i13], fArr2[i23]);
                                                        float f49 = fArr2[i13];
                                                        f13 = fArr2[i23];
                                                        f28 = f32;
                                                        f29 = f33;
                                                        i12 = i13;
                                                        f32 = f49;
                                                    } else if (c11 == 'l') {
                                                        int i24 = i13 + 1;
                                                        path2.rLineTo(fArr2[i13], fArr2[i24]);
                                                        f32 += fArr2[i13];
                                                        f19 = fArr2[i24];
                                                    } else if (c11 == 'm') {
                                                        float f50 = fArr2[i13];
                                                        f32 += f50;
                                                        float f51 = fArr2[i13 + 1];
                                                        f33 += f51;
                                                        if (i13 > 0) {
                                                            path2.rLineTo(f50, f51);
                                                        } else {
                                                            path2.rMoveTo(f50, f51);
                                                            f34 = f32;
                                                        }
                                                    } else if (c11 == 's') {
                                                        if (c16 == 'c' || c16 == 's' || c16 == 'C' || c16 == 'S') {
                                                            f22 = f33 - f29;
                                                            f23 = f32 - f28;
                                                        } else {
                                                            f23 = 0.0f;
                                                            f22 = 0.0f;
                                                        }
                                                        int i25 = i13 + 1;
                                                        int i26 = i13 + 2;
                                                        int i27 = i13 + 3;
                                                        path2.rCubicTo(f23, f22, fArr2[i13], fArr2[i25], fArr2[i26], fArr2[i27]);
                                                        f16 = fArr2[i13] + f32;
                                                        f17 = fArr2[i25] + f33;
                                                        f32 += fArr2[i26];
                                                        f18 = fArr2[i27];
                                                    } else if (c11 == 't') {
                                                        if (c16 == 'q' || c16 == 't' || c16 == 'Q' || c16 == 'T') {
                                                            f24 = f32 - f28;
                                                            f25 = f33 - f29;
                                                        } else {
                                                            f25 = 0.0f;
                                                            f24 = 0.0f;
                                                        }
                                                        int i28 = i13 + 1;
                                                        path2.rQuadTo(f24, f25, fArr2[i13], fArr2[i28]);
                                                        float f52 = f24 + f32;
                                                        float f53 = f25 + f33;
                                                        f32 += fArr2[i13];
                                                        f33 += fArr2[i28];
                                                        f29 = f53;
                                                        f28 = f52;
                                                    }
                                                } else {
                                                    c13 = c15;
                                                    f20 = fArr2[i13];
                                                    f21 = fArr2[i13 + 1];
                                                    if (i13 > 0) {
                                                        path2.lineTo(f20, f21);
                                                    } else {
                                                        path2.moveTo(f20, f21);
                                                        f32 = f20;
                                                        f34 = f32;
                                                        f33 = f21;
                                                    }
                                                }
                                                f35 = f33;
                                            } else {
                                                c13 = c15;
                                                int i29 = i13 + 1;
                                                path2.lineTo(fArr2[i13], fArr2[i29]);
                                                f20 = fArr2[i13];
                                                f21 = fArr2[i29];
                                            }
                                            f32 = f20;
                                            f33 = f21;
                                        } else {
                                            c13 = c15;
                                            path2.rLineTo(0.0f, fArr2[i13]);
                                            f19 = fArr2[i13];
                                        }
                                        f33 += f19;
                                    } else {
                                        c12 = c14;
                                        c13 = c15;
                                        int i30 = i13 + 1;
                                        int i31 = i13 + 2;
                                        int i32 = i13 + 3;
                                        path2.rQuadTo(fArr2[i13], fArr2[i30], fArr2[i31], fArr2[i32]);
                                        f16 = fArr2[i13] + f32;
                                        f17 = fArr2[i30] + f33;
                                        f32 += fArr2[i31];
                                        f18 = fArr2[i32];
                                    }
                                    f33 += f18;
                                    f28 = f16;
                                    f29 = f17;
                                } else {
                                    c12 = c14;
                                    c13 = c15;
                                    path2.rLineTo(fArr2[i13], 0.0f);
                                    f32 += fArr2[i13];
                                }
                            } else {
                                z11 = z15;
                                c12 = c14;
                                c13 = c15;
                                int i33 = i13 + 2;
                                int i34 = i13 + 3;
                                int i35 = i13 + 4;
                                int i36 = i13 + 5;
                                path2.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                float f54 = fArr2[i33] + f32;
                                float f55 = fArr2[i34] + f33;
                                f32 += fArr2[i35];
                                f33 += fArr2[i36];
                                f28 = f54;
                                f29 = f55;
                            }
                            i12 = i13;
                        } else {
                            z11 = z15;
                            c12 = c14;
                            c13 = c15;
                            int i37 = i13 + 5;
                            float f56 = fArr2[i37] + f32;
                            int i38 = i13 + 6;
                            float f57 = fArr2[i38] + f33;
                            float f58 = fArr2[i13];
                            float f59 = fArr2[i13 + 1];
                            float f60 = fArr2[i13 + 2];
                            if (fArr2[i13 + 3] != 0.0f) {
                                f14 = 0.0f;
                                f15 = f33;
                                z13 = z11;
                            } else {
                                f14 = 0.0f;
                                f15 = f33;
                                z13 = z10;
                            }
                            i12 = i13;
                            boolean z16 = fArr2[i13 + 4] != f14 ? z11 : z10;
                            float f61 = f32;
                            g(path, f61, f15, f56, f57, f58, f59, f60, z13, z16);
                            f32 = f61 + fArr2[i37];
                            f33 = f15 + fArr2[i38];
                            f28 = f32;
                            f29 = f33;
                        }
                        f33 = f13;
                    } else {
                        z10 = z14;
                        z11 = z15;
                        c12 = c14;
                        c13 = c15;
                        i12 = i13;
                        int i39 = i12 + 1;
                        int i40 = i12 + 2;
                        int i41 = i12 + 3;
                        path2.quadTo(fArr2[i12], fArr2[i39], fArr2[i40], fArr2[i41]);
                        f11 = fArr2[i12];
                        f12 = fArr2[i39];
                        f32 = fArr2[i40];
                        f33 = fArr2[i41];
                    }
                    f28 = f11;
                    f29 = f12;
                } else {
                    z10 = z14;
                    z11 = z15;
                    c12 = c14;
                    c13 = c15;
                    i12 = i13;
                    path2.lineTo(fArr2[i12], f33);
                    f32 = fArr2[i12];
                }
                i13 = i12 + i11;
                path2 = path;
                c16 = c11;
                z14 = z10;
                z15 = z11;
                c14 = c12;
                c15 = c13;
            }
            fArr[z14 ? 1 : 0] = f32;
            fArr[z15 ? 1 : 0] = f33;
            fArr[c14] = f28;
            fArr[c15] = f29;
            fArr[4] = f34;
            fArr[5] = f35;
        }

        private static void f(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int iCeil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d16);
            double dSin = Math.sin(d16);
            double dCos2 = Math.cos(d17);
            double dSin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * dCos;
            double d22 = d13 * dSin;
            double d23 = (d21 * dSin2) - (d22 * dCos2);
            double d24 = d20 * dSin;
            double d25 = d13 * dCos;
            double d26 = (dSin2 * d24) + (dCos2 * d25);
            double d27 = d18 / iCeil;
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < iCeil) {
                double d33 = d32 + d27;
                double dSin3 = Math.sin(d33);
                double dCos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * dCos) * dCos3)) - (d22 * dSin3);
                int i11 = i10;
                double d35 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
                double d36 = (d21 * dSin3) - (d22 * dCos3);
                double d37 = (dSin3 * d24) + (dCos3 * d25);
                double d38 = d33 - d32;
                double dTan = Math.tan(d38 / 2.0d);
                double dSin4 = (Math.sin(d38) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d36)), (float) (d35 - (dSin4 * d37)), (float) d34, (float) d35);
                dSin = dSin;
                d27 = d27;
                d30 = d34;
                d24 = d24;
                d32 = d33;
                d28 = d37;
                dCos = dCos;
                d19 = d12;
                d31 = d35;
                i10 = i11 + 1;
                iCeil = iCeil;
                d29 = d36;
            }
        }

        private static void g(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = f14;
            double d15 = ((d12 * dCos) + (d13 * dSin)) / d14;
            double d16 = f15;
            double d17 = (((-f10) * dSin) + (d13 * dCos)) / d16;
            double d18 = f13;
            double d19 = ((f12 * dCos) + (d18 * dSin)) / d14;
            double d20 = (((-f12) * dSin) + (d18 * dCos)) / d16;
            double d21 = d15 - d19;
            double d22 = d17 - d20;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d21 * d21) + (d22 * d22);
            if (d25 == 0.0d) {
                FS.log_w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                FS.log_w("PathParser", "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                g(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = d21 * dSqrt;
            double d28 = dSqrt * d22;
            if (z10 == z11) {
                d10 = d23 - d28;
                d11 = d24 + d27;
            } else {
                d10 = d23 + d28;
                d11 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
            double dAtan22 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
            if (z11 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d29 = d10 * d14;
            double d30 = d11 * d16;
            f(path, (d29 * dCos) - (d30 * dSin), (d29 * dSin) + (d30 * dCos), d14, d16, d12, d13, radians, dAtan2, dAtan22);
        }

        @Deprecated
        public static void h(b[] bVarArr, Path path) {
            f.j(bVarArr, path);
        }

        b(b bVar) {
            this.f61168a = bVar.f61168a;
            float[] fArr = bVar.f61169b;
            this.f61169b = f.c(fArr, 0, fArr.length);
        }
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].f61168a != bVarArr2[i10].f61168a || bVarArr[i10].f61169b.length != bVarArr2[i10].f61169b.length) {
                return false;
            }
        }
        return true;
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r8, int r9, c2.f.a r10) {
        /*
            r0 = 0
            r10.f61167b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f61167b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f61167b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f61166a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.f.g(java.lang.String, int, c2.f$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                g(str, i10, aVar);
                int i12 = aVar.f61166a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f61167b ? i12 : i12 + 1;
            }
            return c(fArr, 0, i11);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e10);
        }
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c10 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c10, bVar.f61168a, bVar.f61169b);
            c10 = bVar.f61168a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f61168a = bVarArr2[i10].f61168a;
            for (int i11 = 0; i11 < bVarArr2[i10].f61169b.length; i11++) {
                bVarArr[i10].f61169b[i11] = bVarArr2[i10].f61169b[i11];
            }
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f61166a;

        /* renamed from: b, reason: collision with root package name */
        boolean f61167b;

        a() {
        }
    }

    private static void a(ArrayList<b> arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    static float[] c(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int iMin = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            int i12 = i(str, i11);
            String strTrim = str.substring(i10, i12).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i10 = i12;
            i11 = i12 + 1;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            a(arrayList, str.charAt(i10), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.h(d(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    private static int i(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i10++;
        }
        return i10;
    }
}
