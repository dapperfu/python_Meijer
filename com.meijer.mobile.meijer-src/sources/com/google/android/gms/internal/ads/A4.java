package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import fsimpl.C14170dq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class A4 implements InterfaceC9049o4 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f65896h = {0, 7, 8, C14170dq.MULTIPLY};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f65897i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f65898j = {0, C14170dq.ADD, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f65899a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f65900b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f65901c;

    /* renamed from: d, reason: collision with root package name */
    private final C9583t4 f65902d;

    /* renamed from: e, reason: collision with root package name */
    private final C9476s4 f65903e;

    /* renamed from: f, reason: collision with root package name */
    private final C10225z4 f65904f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f65905g;

    private static int b(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int[] g() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9049o4
    public final void a(byte[] bArr, int i10, int i11, C8942n4 c8942n4, ME me2) {
        boolean z10;
        C8195g4 c8195g4;
        float f10;
        float f11;
        char c10;
        int i12;
        C10011x4 c10011x4;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i13;
        int iD5;
        C8124fQ c8124fQ = new C8124fQ(bArr, i10 + i11);
        c8124fQ.l(i10);
        while (true) {
            z10 = true;
            if (c8124fQ.a() >= 48 && c8124fQ.d(8) == 15) {
                C10225z4 c10225z4 = this.f65904f;
                int iD6 = c8124fQ.d(8);
                int iD7 = c8124fQ.d(16);
                int iD8 = c8124fQ.d(16);
                int iB = c8124fQ.b() + iD8;
                if (iD8 * 8 > c8124fQ.a()) {
                    C10042xL.f("DvbParser", "Data field length exceeds limit");
                    c8124fQ.n(c8124fQ.a());
                } else {
                    switch (iD6) {
                        case 16:
                            if (iD7 == c10225z4.f81187a) {
                                C9797v4 c9797v4 = c10225z4.f81195i;
                                int iD9 = c8124fQ.d(8);
                                int iD10 = c8124fQ.d(4);
                                int iD11 = c8124fQ.d(2);
                                c8124fQ.n(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i14 = iD8 - 2; i14 > 0; i14 -= 6) {
                                    int iD12 = c8124fQ.d(8);
                                    c8124fQ.n(8);
                                    sparseArray.put(iD12, new C9904w4(c8124fQ.d(16), c8124fQ.d(16)));
                                }
                                C9797v4 c9797v42 = new C9797v4(iD9, iD10, iD11, sparseArray);
                                if (c9797v42.f79819b != 0) {
                                    c10225z4.f81195i = c9797v42;
                                    c10225z4.f81189c.clear();
                                    c10225z4.f81190d.clear();
                                    c10225z4.f81191e.clear();
                                    break;
                                } else if (c9797v4 != null) {
                                    if (c9797v4.f79818a != c9797v42.f79818a) {
                                        c10225z4.f81195i = c9797v42;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            C9797v4 c9797v43 = c10225z4.f81195i;
                            if (iD7 == c10225z4.f81187a && c9797v43 != null) {
                                int iD13 = c8124fQ.d(8);
                                c8124fQ.n(4);
                                boolean zP = c8124fQ.p();
                                c8124fQ.n(3);
                                int iD14 = c8124fQ.d(16);
                                int iD15 = c8124fQ.d(16);
                                int iD16 = c8124fQ.d(3);
                                int iD17 = c8124fQ.d(3);
                                c8124fQ.n(2);
                                int iD18 = c8124fQ.d(8);
                                int iD19 = c8124fQ.d(8);
                                int iD20 = c8124fQ.d(4);
                                int iD21 = c8124fQ.d(2);
                                c8124fQ.n(2);
                                int i15 = iD8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i15 > 0) {
                                    int iD22 = c8124fQ.d(16);
                                    int iD23 = c8124fQ.d(2);
                                    int iD24 = c8124fQ.d(2);
                                    int iD25 = c8124fQ.d(12);
                                    c8124fQ.n(4);
                                    int iD26 = c8124fQ.d(12);
                                    int i16 = i15 - 6;
                                    if (iD23 == 1) {
                                        i15 -= 8;
                                        iD = c8124fQ.d(8);
                                        iD2 = c8124fQ.d(8);
                                    } else if (iD23 == 2) {
                                        iD23 = 2;
                                        i15 -= 8;
                                        iD = c8124fQ.d(8);
                                        iD2 = c8124fQ.d(8);
                                    } else {
                                        i15 = i16;
                                        iD = 0;
                                        iD2 = 0;
                                    }
                                    sparseArray2.put(iD22, new C10118y4(iD23, iD24, iD25, iD26, iD, iD2));
                                }
                                C10011x4 c10011x42 = new C10011x4(iD13, zP, iD14, iD15, iD16, iD17, iD18, iD19, iD20, iD21, sparseArray2);
                                if (c9797v43.f79819b == 0 && (c10011x4 = (C10011x4) c10225z4.f81189c.get(c10011x42.f80500a)) != null) {
                                    int i17 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = c10011x4.f80509j;
                                        if (i17 < sparseArray3.size()) {
                                            c10011x42.f80509j.put(sparseArray3.keyAt(i17), (C10118y4) sparseArray3.valueAt(i17));
                                            i17++;
                                        }
                                    }
                                }
                                c10225z4.f81189c.put(c10011x42.f80500a, c10011x42);
                                break;
                            }
                            break;
                        case 18:
                            if (iD7 == c10225z4.f81187a) {
                                C9476s4 c9476s4C = c(c8124fQ, iD8);
                                c10225z4.f81190d.put(c9476s4C.f78961a, c9476s4C);
                                break;
                            } else if (iD7 == c10225z4.f81188b) {
                                C9476s4 c9476s4C2 = c(c8124fQ, iD8);
                                c10225z4.f81192f.put(c9476s4C2.f78961a, c9476s4C2);
                                break;
                            }
                            break;
                        case 19:
                            if (iD7 == c10225z4.f81187a) {
                                C9690u4 c9690u4D = d(c8124fQ);
                                c10225z4.f81191e.put(c9690u4D.f79568a, c9690u4D);
                                break;
                            } else if (iD7 == c10225z4.f81188b) {
                                C9690u4 c9690u4D2 = d(c8124fQ);
                                c10225z4.f81193g.put(c9690u4D2.f79568a, c9690u4D2);
                                break;
                            }
                            break;
                        case 20:
                            if (iD7 == c10225z4.f81187a) {
                                c8124fQ.n(4);
                                boolean zP2 = c8124fQ.p();
                                c8124fQ.n(3);
                                int iD27 = c8124fQ.d(16);
                                int iD28 = c8124fQ.d(16);
                                if (zP2) {
                                    int iD29 = c8124fQ.d(16);
                                    iD3 = c8124fQ.d(16);
                                    iD5 = c8124fQ.d(16);
                                    iD4 = c8124fQ.d(16);
                                    i13 = iD29;
                                } else {
                                    iD3 = iD27;
                                    iD4 = iD28;
                                    i13 = 0;
                                    iD5 = 0;
                                }
                                c10225z4.f81194h = new C9583t4(iD27, iD28, i13, iD3, iD5, iD4);
                                break;
                            }
                            break;
                    }
                    c8124fQ.o(iB - c8124fQ.b());
                }
            }
        }
        C10225z4 c10225z42 = this.f65904f;
        C9797v4 c9797v44 = c10225z42.f81195i;
        if (c9797v44 == null) {
            c8195g4 = new C8195g4(AbstractC8042eh0.t(), -9223372036854775807L, -9223372036854775807L);
        } else {
            C9583t4 c9583t4 = c10225z42.f81194h;
            if (c9583t4 == null) {
                c9583t4 = this.f65902d;
            }
            Bitmap bitmap = this.f65905g;
            if (bitmap == null || c9583t4.f79315a + 1 != bitmap.getWidth() || c9583t4.f79316b + 1 != this.f65905g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c9583t4.f79315a + 1, c9583t4.f79316b + 1, Bitmap.Config.ARGB_8888);
                this.f65905g = bitmapCreateBitmap;
                this.f65901c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = c9797v44.f79820c;
            int i18 = 0;
            while (i18 < sparseArray4.size()) {
                this.f65901c.save();
                C9904w4 c9904w4 = (C9904w4) sparseArray4.valueAt(i18);
                C10011x4 c10011x43 = (C10011x4) this.f65904f.f81189c.get(sparseArray4.keyAt(i18));
                int i19 = c9904w4.f80250a + c9583t4.f79317c;
                int i20 = c9904w4.f80251b + c9583t4.f79319e;
                this.f65901c.clipRect(i19, i20, Math.min(c10011x43.f80502c + i19, c9583t4.f79318d), Math.min(c10011x43.f80503d + i20, c9583t4.f79320f));
                C9476s4 c9476s4 = (C9476s4) this.f65904f.f81190d.get(c10011x43.f80505f);
                if (c9476s4 == null) {
                    c9476s4 = (C9476s4) this.f65904f.f81192f.get(c10011x43.f80505f);
                    if (c9476s4 == null) {
                        c9476s4 = this.f65903e;
                    }
                }
                SparseArray sparseArray5 = c10011x43.f80509j;
                int i21 = 0;
                while (i21 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i21);
                    boolean z11 = z10;
                    C10118y4 c10118y4 = (C10118y4) sparseArray5.valueAt(i21);
                    C9690u4 c9690u4 = (C9690u4) this.f65904f.f81191e.get(iKeyAt);
                    if (c9690u4 == null) {
                        c9690u4 = (C9690u4) this.f65904f.f81193g.get(iKeyAt);
                    }
                    if (c9690u4 != null) {
                        Paint paint = c9690u4.f79569b ? null : this.f65899a;
                        int i22 = c10011x43.f80504e;
                        int i23 = i19 + c10118y4.f80801a;
                        int i24 = i20 + c10118y4.f80802b;
                        Canvas canvas = this.f65901c;
                        int[] iArr = i22 == 3 ? c9476s4.f78964d : i22 == 2 ? c9476s4.f78963c : c9476s4.f78962b;
                        e(c9690u4.f79570c, iArr, i22, i23, i24, paint, canvas);
                        e(c9690u4.f79571d, iArr, i22, i23, i24 + 1, paint, canvas);
                    }
                    i21++;
                    z10 = z11;
                }
                boolean z12 = z10;
                float f12 = i20;
                float f13 = i19;
                if (c10011x43.f80501b) {
                    int i25 = c10011x43.f80504e;
                    if (i25 == 3) {
                        i12 = c9476s4.f78964d[c10011x43.f80506g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i12 = i25 == 2 ? c9476s4.f78963c[c10011x43.f80507h] : c9476s4.f78962b[c10011x43.f80508i];
                    }
                    this.f65900b.setColor(i12);
                    f10 = f12;
                    f11 = f13;
                    this.f65901c.drawRect(f11, f10, c10011x43.f80502c + i19, c10011x43.f80503d + i20, this.f65900b);
                } else {
                    f10 = f12;
                    f11 = f13;
                    c10 = 2;
                }
                C7443Ww c7443Ww = new C7443Ww();
                c7443Ww.c(Bitmap.createBitmap(this.f65905g, i19, i20, c10011x43.f80502c, c10011x43.f80503d));
                c7443Ww.h(f11 / c9583t4.f79315a);
                c7443Ww.i(0);
                c7443Ww.e(f10 / c9583t4.f79316b, 0);
                c7443Ww.f(0);
                c7443Ww.k(c10011x43.f80502c / c9583t4.f79315a);
                c7443Ww.d(c10011x43.f80503d / c9583t4.f79316b);
                arrayList.add(c7443Ww.p());
                this.f65901c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f65901c.restore();
                i18++;
                z10 = z12;
            }
            c8195g4 = new C8195g4(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        me2.zza(c8195g4);
    }

    private static C9476s4 c(C8124fQ c8124fQ, int i10) {
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i11 = 8;
        int iD5 = c8124fQ.d(8);
        c8124fQ.n(8);
        int[] iArrG = g();
        int[] iArrH = h();
        int[] iArrI = i();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iD6 = c8124fQ.d(i11);
            int iD7 = c8124fQ.d(i11);
            int[] iArr = (iD7 & 128) != 0 ? iArrG : (iD7 & 64) != 0 ? iArrH : iArrI;
            if ((iD7 & 1) != 0) {
                iD3 = c8124fQ.d(i11);
                iD4 = c8124fQ.d(i11);
                iD = c8124fQ.d(i11);
                iD2 = c8124fQ.d(i11);
                i12 -= 6;
            } else {
                int iD8 = c8124fQ.d(6) << 2;
                int iD9 = c8124fQ.d(4) << 4;
                i12 -= 4;
                iD = c8124fQ.d(4) << 4;
                iD2 = c8124fQ.d(2) << 6;
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
            int i13 = 255 - (iD2 & com.medallia.digital.mobilesdk.l3.f93323c);
            double d10 = iD3;
            double d11 = iD4 - 128;
            double d12 = iD - 128;
            iArr[iD6] = b((byte) i13, Math.max(0, Math.min((int) (d10 + (1.402d * d11)), com.medallia.digital.mobilesdk.l3.f93323c)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), com.medallia.digital.mobilesdk.l3.f93323c)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), com.medallia.digital.mobilesdk.l3.f93323c)));
            iD5 = iD5;
            i11 = 8;
        }
        return new C9476s4(iD5, iArrG, iArrH, iArrI);
    }

    private static C9690u4 d(C8124fQ c8124fQ) {
        byte[] bArr;
        int iD = c8124fQ.d(16);
        c8124fQ.n(4);
        int iD2 = c8124fQ.d(2);
        boolean zP = c8124fQ.p();
        c8124fQ.n(1);
        byte[] bArr2 = OV.f69936f;
        if (iD2 != 1) {
            if (iD2 == 0) {
                int iD3 = c8124fQ.d(16);
                int iD4 = c8124fQ.d(16);
                if (iD3 > 0) {
                    bArr2 = new byte[iD3];
                    c8124fQ.i(bArr2, 0, iD3);
                }
                if (iD4 > 0) {
                    bArr = new byte[iD4];
                    c8124fQ.i(bArr, 0, iD4);
                }
            }
            return new C9690u4(iD, zP, bArr2, bArr);
        }
        c8124fQ.n(c8124fQ.d(8) * 16);
        bArr = bArr2;
        return new C9690u4(iD, zP, bArr2, bArr);
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

    private static byte[] f(int i10, int i11, C8124fQ c8124fQ) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c8124fQ.d(i11);
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
                iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f93323c, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                int i14 = com.medallia.digital.mobilesdk.l3.f93324d;
                int i15 = 1 != i13 ? 0 : 127;
                int i16 = i12 != 0 ? 127 : 0;
                if (i11 == 0) {
                    i14 = 0;
                }
                iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f93323c, i15, i16, i14);
            }
        }
        return iArr;
    }

    private static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = com.medallia.digital.mobilesdk.l3.f93323c;
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
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f93323c, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i16 == 8) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f93324d, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i16 == 128) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f93323c, (1 != (i10 & 1) ? 0 : 43) + com.medallia.digital.mobilesdk.l3.f93324d + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + com.medallia.digital.mobilesdk.l3.f93324d + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + com.medallia.digital.mobilesdk.l3.f93324d + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i16 == 136) {
                    iArr[i10] = b(com.medallia.digital.mobilesdk.l3.f93323c, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
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
        this.f65899a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f65900b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f65901c = new Canvas();
        this.f65902d = new C9583t4(719, 575, 0, 719, 0, 575);
        this.f65903e = new C9476s4(0, g(), h(), i());
        this.f65904f = new C10225z4(iG, iG2);
    }
}
