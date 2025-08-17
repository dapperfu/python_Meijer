package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import fsimpl.C14045dq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class A4 implements InterfaceC8924o4 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f65056h = {0, 7, 8, C14045dq.MULTIPLY};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f65057i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f65058j = {0, C14045dq.ADD, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f65059a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f65060b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f65061c;

    /* renamed from: d, reason: collision with root package name */
    private final C9458t4 f65062d;

    /* renamed from: e, reason: collision with root package name */
    private final C9351s4 f65063e;

    /* renamed from: f, reason: collision with root package name */
    private final C10100z4 f65064f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f65065g;

    private static int b(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int[] g() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8924o4
    public final void a(byte[] bArr, int i10, int i11, C8817n4 c8817n4, ME me2) {
        boolean z10;
        C8070g4 c8070g4;
        float f10;
        float f11;
        char c10;
        int i12;
        C9886x4 c9886x4;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i13;
        int iD5;
        C7999fQ c7999fQ = new C7999fQ(bArr, i10 + i11);
        c7999fQ.l(i10);
        while (true) {
            z10 = true;
            if (c7999fQ.a() >= 48 && c7999fQ.d(8) == 15) {
                C10100z4 c10100z4 = this.f65064f;
                int iD6 = c7999fQ.d(8);
                int iD7 = c7999fQ.d(16);
                int iD8 = c7999fQ.d(16);
                int iB = c7999fQ.b() + iD8;
                if (iD8 * 8 > c7999fQ.a()) {
                    C9917xL.f("DvbParser", "Data field length exceeds limit");
                    c7999fQ.n(c7999fQ.a());
                } else {
                    switch (iD6) {
                        case 16:
                            if (iD7 == c10100z4.f80347a) {
                                C9672v4 c9672v4 = c10100z4.f80355i;
                                int iD9 = c7999fQ.d(8);
                                int iD10 = c7999fQ.d(4);
                                int iD11 = c7999fQ.d(2);
                                c7999fQ.n(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i14 = iD8 - 2; i14 > 0; i14 -= 6) {
                                    int iD12 = c7999fQ.d(8);
                                    c7999fQ.n(8);
                                    sparseArray.put(iD12, new C9779w4(c7999fQ.d(16), c7999fQ.d(16)));
                                }
                                C9672v4 c9672v42 = new C9672v4(iD9, iD10, iD11, sparseArray);
                                if (c9672v42.f78979b != 0) {
                                    c10100z4.f80355i = c9672v42;
                                    c10100z4.f80349c.clear();
                                    c10100z4.f80350d.clear();
                                    c10100z4.f80351e.clear();
                                    break;
                                } else if (c9672v4 != null) {
                                    if (c9672v4.f78978a != c9672v42.f78978a) {
                                        c10100z4.f80355i = c9672v42;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            C9672v4 c9672v43 = c10100z4.f80355i;
                            if (iD7 == c10100z4.f80347a && c9672v43 != null) {
                                int iD13 = c7999fQ.d(8);
                                c7999fQ.n(4);
                                boolean zP = c7999fQ.p();
                                c7999fQ.n(3);
                                int iD14 = c7999fQ.d(16);
                                int iD15 = c7999fQ.d(16);
                                int iD16 = c7999fQ.d(3);
                                int iD17 = c7999fQ.d(3);
                                c7999fQ.n(2);
                                int iD18 = c7999fQ.d(8);
                                int iD19 = c7999fQ.d(8);
                                int iD20 = c7999fQ.d(4);
                                int iD21 = c7999fQ.d(2);
                                c7999fQ.n(2);
                                int i15 = iD8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i15 > 0) {
                                    int iD22 = c7999fQ.d(16);
                                    int iD23 = c7999fQ.d(2);
                                    int iD24 = c7999fQ.d(2);
                                    int iD25 = c7999fQ.d(12);
                                    c7999fQ.n(4);
                                    int iD26 = c7999fQ.d(12);
                                    int i16 = i15 - 6;
                                    if (iD23 == 1) {
                                        i15 -= 8;
                                        iD = c7999fQ.d(8);
                                        iD2 = c7999fQ.d(8);
                                    } else if (iD23 == 2) {
                                        iD23 = 2;
                                        i15 -= 8;
                                        iD = c7999fQ.d(8);
                                        iD2 = c7999fQ.d(8);
                                    } else {
                                        i15 = i16;
                                        iD = 0;
                                        iD2 = 0;
                                    }
                                    sparseArray2.put(iD22, new C9993y4(iD23, iD24, iD25, iD26, iD, iD2));
                                }
                                C9886x4 c9886x42 = new C9886x4(iD13, zP, iD14, iD15, iD16, iD17, iD18, iD19, iD20, iD21, sparseArray2);
                                if (c9672v43.f78979b == 0 && (c9886x4 = (C9886x4) c10100z4.f80349c.get(c9886x42.f79660a)) != null) {
                                    int i17 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = c9886x4.f79669j;
                                        if (i17 < sparseArray3.size()) {
                                            c9886x42.f79669j.put(sparseArray3.keyAt(i17), (C9993y4) sparseArray3.valueAt(i17));
                                            i17++;
                                        }
                                    }
                                }
                                c10100z4.f80349c.put(c9886x42.f79660a, c9886x42);
                                break;
                            }
                            break;
                        case 18:
                            if (iD7 == c10100z4.f80347a) {
                                C9351s4 c9351s4C = c(c7999fQ, iD8);
                                c10100z4.f80350d.put(c9351s4C.f78121a, c9351s4C);
                                break;
                            } else if (iD7 == c10100z4.f80348b) {
                                C9351s4 c9351s4C2 = c(c7999fQ, iD8);
                                c10100z4.f80352f.put(c9351s4C2.f78121a, c9351s4C2);
                                break;
                            }
                            break;
                        case 19:
                            if (iD7 == c10100z4.f80347a) {
                                C9565u4 c9565u4D = d(c7999fQ);
                                c10100z4.f80351e.put(c9565u4D.f78728a, c9565u4D);
                                break;
                            } else if (iD7 == c10100z4.f80348b) {
                                C9565u4 c9565u4D2 = d(c7999fQ);
                                c10100z4.f80353g.put(c9565u4D2.f78728a, c9565u4D2);
                                break;
                            }
                            break;
                        case 20:
                            if (iD7 == c10100z4.f80347a) {
                                c7999fQ.n(4);
                                boolean zP2 = c7999fQ.p();
                                c7999fQ.n(3);
                                int iD27 = c7999fQ.d(16);
                                int iD28 = c7999fQ.d(16);
                                if (zP2) {
                                    int iD29 = c7999fQ.d(16);
                                    iD3 = c7999fQ.d(16);
                                    iD5 = c7999fQ.d(16);
                                    iD4 = c7999fQ.d(16);
                                    i13 = iD29;
                                } else {
                                    iD3 = iD27;
                                    iD4 = iD28;
                                    i13 = 0;
                                    iD5 = 0;
                                }
                                c10100z4.f80354h = new C9458t4(iD27, iD28, i13, iD3, iD5, iD4);
                                break;
                            }
                            break;
                    }
                    c7999fQ.o(iB - c7999fQ.b());
                }
            }
        }
        C10100z4 c10100z42 = this.f65064f;
        C9672v4 c9672v44 = c10100z42.f80355i;
        if (c9672v44 == null) {
            c8070g4 = new C8070g4(AbstractC7917eh0.t(), -9223372036854775807L, -9223372036854775807L);
        } else {
            C9458t4 c9458t4 = c10100z42.f80354h;
            if (c9458t4 == null) {
                c9458t4 = this.f65062d;
            }
            Bitmap bitmap = this.f65065g;
            if (bitmap == null || c9458t4.f78475a + 1 != bitmap.getWidth() || c9458t4.f78476b + 1 != this.f65065g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c9458t4.f78475a + 1, c9458t4.f78476b + 1, Bitmap.Config.ARGB_8888);
                this.f65065g = bitmapCreateBitmap;
                this.f65061c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = c9672v44.f78980c;
            int i18 = 0;
            while (i18 < sparseArray4.size()) {
                this.f65061c.save();
                C9779w4 c9779w4 = (C9779w4) sparseArray4.valueAt(i18);
                C9886x4 c9886x43 = (C9886x4) this.f65064f.f80349c.get(sparseArray4.keyAt(i18));
                int i19 = c9779w4.f79410a + c9458t4.f78477c;
                int i20 = c9779w4.f79411b + c9458t4.f78479e;
                this.f65061c.clipRect(i19, i20, Math.min(c9886x43.f79662c + i19, c9458t4.f78478d), Math.min(c9886x43.f79663d + i20, c9458t4.f78480f));
                C9351s4 c9351s4 = (C9351s4) this.f65064f.f80350d.get(c9886x43.f79665f);
                if (c9351s4 == null) {
                    c9351s4 = (C9351s4) this.f65064f.f80352f.get(c9886x43.f79665f);
                    if (c9351s4 == null) {
                        c9351s4 = this.f65063e;
                    }
                }
                SparseArray sparseArray5 = c9886x43.f79669j;
                int i21 = 0;
                while (i21 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i21);
                    boolean z11 = z10;
                    C9993y4 c9993y4 = (C9993y4) sparseArray5.valueAt(i21);
                    C9565u4 c9565u4 = (C9565u4) this.f65064f.f80351e.get(iKeyAt);
                    if (c9565u4 == null) {
                        c9565u4 = (C9565u4) this.f65064f.f80353g.get(iKeyAt);
                    }
                    if (c9565u4 != null) {
                        Paint paint = c9565u4.f78729b ? null : this.f65059a;
                        int i22 = c9886x43.f79664e;
                        int i23 = i19 + c9993y4.f79961a;
                        int i24 = i20 + c9993y4.f79962b;
                        Canvas canvas = this.f65061c;
                        int[] iArr = i22 == 3 ? c9351s4.f78124d : i22 == 2 ? c9351s4.f78123c : c9351s4.f78122b;
                        e(c9565u4.f78730c, iArr, i22, i23, i24, paint, canvas);
                        e(c9565u4.f78731d, iArr, i22, i23, i24 + 1, paint, canvas);
                    }
                    i21++;
                    z10 = z11;
                }
                boolean z12 = z10;
                float f12 = i20;
                float f13 = i19;
                if (c9886x43.f79661b) {
                    int i25 = c9886x43.f79664e;
                    if (i25 == 3) {
                        i12 = c9351s4.f78124d[c9886x43.f79666g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i12 = i25 == 2 ? c9351s4.f78123c[c9886x43.f79667h] : c9351s4.f78122b[c9886x43.f79668i];
                    }
                    this.f65060b.setColor(i12);
                    f10 = f12;
                    f11 = f13;
                    this.f65061c.drawRect(f11, f10, c9886x43.f79662c + i19, c9886x43.f79663d + i20, this.f65060b);
                } else {
                    f10 = f12;
                    f11 = f13;
                    c10 = 2;
                }
                C7318Ww c7318Ww = new C7318Ww();
                c7318Ww.c(Bitmap.createBitmap(this.f65065g, i19, i20, c9886x43.f79662c, c9886x43.f79663d));
                c7318Ww.h(f11 / c9458t4.f78475a);
                c7318Ww.i(0);
                c7318Ww.e(f10 / c9458t4.f78476b, 0);
                c7318Ww.f(0);
                c7318Ww.k(c9886x43.f79662c / c9458t4.f78475a);
                c7318Ww.d(c9886x43.f79663d / c9458t4.f78476b);
                arrayList.add(c7318Ww.p());
                this.f65061c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f65061c.restore();
                i18++;
                z10 = z12;
            }
            c8070g4 = new C8070g4(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        me2.zza(c8070g4);
    }

    private static C9351s4 c(C7999fQ c7999fQ, int i10) {
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i11 = 8;
        int iD5 = c7999fQ.d(8);
        c7999fQ.n(8);
        int[] iArrG = g();
        int[] iArrH = h();
        int[] iArrI = i();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iD6 = c7999fQ.d(i11);
            int iD7 = c7999fQ.d(i11);
            int[] iArr = (iD7 & 128) != 0 ? iArrG : (iD7 & 64) != 0 ? iArrH : iArrI;
            if ((iD7 & 1) != 0) {
                iD3 = c7999fQ.d(i11);
                iD4 = c7999fQ.d(i11);
                iD = c7999fQ.d(i11);
                iD2 = c7999fQ.d(i11);
                i12 -= 6;
            } else {
                int iD8 = c7999fQ.d(6) << 2;
                int iD9 = c7999fQ.d(4) << 4;
                i12 -= 4;
                iD = c7999fQ.d(4) << 4;
                iD2 = c7999fQ.d(2) << 6;
                iD3 = iD8;
                iD4 = iD9;
            }
            if (iD3 == 0) {
                iD2 = 255;
            }
            if (iD3 == 0) {
                iD = 0;
            }
            if (iD3 == 0) {
                iD4 = 0;
            }
            int i13 = 255 - (iD2 & com.medallia.digital.mobilesdk.l3.f92484c);
            double d10 = iD3;
            double d11 = iD4 - 128;
            double d12 = iD - 128;
            iArr[iD6] = b((byte) i13, Math.max(0, Math.min((int) (d10 + (1.402d * d11)), com.medallia.digital.mobilesdk.l3.f92484c)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), com.medallia.digital.mobilesdk.l3.f92484c)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), com.medallia.digital.mobilesdk.l3.f92484c)));
            iD5 = iD5;
            i11 = 8;
        }
        return new C9351s4(iD5, iArrG, iArrH, iArrI);
    }

    private static C9565u4 d(C7999fQ c7999fQ) {
        byte[] bArr;
        int iD = c7999fQ.d(16);
        c7999fQ.n(4);
        int iD2 = c7999fQ.d(2);
        boolean zP = c7999fQ.p();
        c7999fQ.n(1);
        byte[] bArr2 = OV.f69096f;
        if (iD2 != 1) {
            if (iD2 == 0) {
                int iD3 = c7999fQ.d(16);
                int iD4 = c7999fQ.d(16);
                if (iD3 > 0) {
                    bArr2 = new byte[iD3];
                    c7999fQ.i(bArr2, 0, iD3);
                }
                if (iD4 > 0) {
                    bArr = new byte[iD4];
                    c7999fQ.i(bArr, 0, iD4);
                }
            }
            return new C9565u4(iD, zP, bArr2, bArr);
        }
        c7999fQ.n(c7999fQ.d(8) * 16);
        bArr = bArr2;
        return new C9565u4(iD, zP, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A4.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] f(int i10, int i11, C7999fQ c7999fQ) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c7999fQ.d(i11);
        }
        return bArr;
    }

    private static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f92484c, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                int i14 = com.medallia.digital.mobilesdk.l3.f92485d;
                int i15 = 1 != i13 ? 0 : 127;
                int i16 = i12 != 0 ? 127 : 0;
                if (i11 == 0) {
                    i14 = 0;
                }
                iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f92484c, i15, i16, i14);
            }
        }
        return iArr;
    }

    private static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = com.medallia.digital.mobilesdk.l3.f92484c;
            if (i10 < 8) {
                int i12 = i10 & 2;
                int i13 = i10 & 4;
                int i14 = 1 != (i10 & 1) ? 0 : 255;
                int i15 = i12 != 0 ? 255 : 0;
                if (i13 == 0) {
                    i11 = 0;
                }
                iArr[i10] = b(63, i14, i15, i11);
            } else {
                int i16 = i10 & 136;
                if (i16 == 0) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f92484c, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i16 == 8) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f92485d, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i16 == 128) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f92484c, (1 != (i10 & 1) ? 0 : 43) + com.medallia.digital.mobilesdk.l3.f92485d + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + com.medallia.digital.mobilesdk.l3.f92485d + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + com.medallia.digital.mobilesdk.l3.f92485d + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i16 == 136) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f92484c, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public A4(List list) {
        GQ gq2 = new GQ((byte[]) list.get(0));
        int iG = gq2.G();
        int iG2 = gq2.G();
        Paint paint = new Paint();
        this.f65059a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f65060b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f65061c = new Canvas();
        this.f65062d = new C9458t4(719, 575, 0, 719, 0, 575);
        this.f65063e = new C9351s4(0, g(), h(), i());
        this.f65064f = new C10100z4(iG, iG2);
    }
}
