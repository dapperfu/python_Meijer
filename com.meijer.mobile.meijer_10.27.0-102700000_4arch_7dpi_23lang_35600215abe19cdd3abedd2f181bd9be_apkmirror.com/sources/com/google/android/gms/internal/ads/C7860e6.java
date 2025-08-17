package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7860e6 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private final C7999fQ f73765a = new C7999fQ(new byte[5], 5);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f73766b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f73767c = new SparseIntArray();

    /* renamed from: d, reason: collision with root package name */
    private final int f73768d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7967f6 f73769e;

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(C8857nU c8857nU, InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
    }

    public C7860e6(C7967f6 c7967f6, int i10) {
        this.f73769e = c7967f6;
        this.f73768d = i10;
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void a(GQ gq2) {
        int i10;
        int i11;
        if (gq2.C() != 2) {
            return;
        }
        C8857nU c8857nU = (C8857nU) this.f73769e.f74032b.get(0);
        if ((gq2.C() & 128) != 0) {
            gq2.m(1);
            int iG = gq2.G();
            int i12 = 3;
            gq2.m(3);
            gq2.g(this.f73765a, 2);
            this.f73765a.n(3);
            int i13 = 13;
            this.f73769e.f74048r = this.f73765a.d(13);
            gq2.g(this.f73765a, 2);
            int i14 = 4;
            this.f73765a.n(4);
            int i15 = 12;
            gq2.m(this.f73765a.d(12));
            this.f73766b.clear();
            this.f73767c.clear();
            int iR = gq2.r();
            while (iR > 0) {
                int i16 = 5;
                gq2.g(this.f73765a, 5);
                C7999fQ c7999fQ = this.f73765a;
                int iD = c7999fQ.d(8);
                c7999fQ.n(i12);
                int iD2 = this.f73765a.d(i13);
                this.f73765a.n(i14);
                int iD3 = this.f73765a.d(i15);
                int iT = gq2.t();
                int i17 = iT + iD3;
                int iC = 0;
                String str = null;
                ArrayList arrayList = null;
                int i18 = -1;
                while (gq2.t() < i17) {
                    int iC2 = gq2.C();
                    int iT2 = gq2.t() + gq2.C();
                    if (iT2 > i17) {
                        break;
                    }
                    if (iC2 == i16) {
                        long jK = gq2.K();
                        if (jK != 1094921523) {
                            if (jK != 1161904947) {
                                if (jK != 1094921524) {
                                    if (jK == 1212503619) {
                                        i11 = 36;
                                        i10 = iR;
                                        i18 = i11;
                                    }
                                    i10 = iR;
                                }
                                i10 = iR;
                                i18 = 172;
                            }
                            i10 = iR;
                            i18 = 135;
                        }
                        i10 = iR;
                        i18 = 129;
                    } else if (iC2 == 106) {
                        i10 = iR;
                        i18 = 129;
                    } else if (iC2 == 122) {
                        i10 = iR;
                        i18 = 135;
                    } else {
                        if (iC2 == 127) {
                            int iC3 = gq2.C();
                            if (iC3 != 21) {
                                if (iC3 == 14) {
                                    i11 = 136;
                                } else {
                                    if (iC3 == 33) {
                                        i11 = 139;
                                    }
                                    i10 = iR;
                                }
                            }
                            i10 = iR;
                            i18 = 172;
                        } else if (iC2 == 123) {
                            i11 = 138;
                        } else if (iC2 == 10) {
                            String strTrim = gq2.b(i12, StandardCharsets.UTF_8).trim();
                            iC = gq2.C();
                            i10 = iR;
                            str = strTrim;
                        } else if (iC2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (gq2.t() < iT2) {
                                String strTrim2 = gq2.b(i12, StandardCharsets.UTF_8).trim();
                                int iC4 = gq2.C();
                                int i19 = iR;
                                byte[] bArr = new byte[i14];
                                gq2.h(bArr, 0, i14);
                                arrayList2.add(new C8074g6(strTrim2, iC4, bArr));
                                iR = i19;
                                i12 = 3;
                                i14 = 4;
                            }
                            i10 = iR;
                            arrayList = arrayList2;
                            i18 = 89;
                        } else {
                            i10 = iR;
                            if (iC2 == 111) {
                                i18 = 257;
                            }
                        }
                        i10 = iR;
                        i18 = i11;
                    }
                    gq2.m(iT2 - gq2.t());
                    iR = i10;
                    i12 = 3;
                    i14 = 4;
                    i16 = 5;
                }
                int i20 = iR;
                gq2.l(i17);
                C8181h6 c8181h6 = new C8181h6(i18, str, iC, arrayList, Arrays.copyOfRange(gq2.n(), iT, i17));
                if (iD == 6 || iD == 5) {
                    iD = c8181h6.f74600a;
                }
                int i21 = i20 - (iD3 + 5);
                if (!this.f73769e.f74038h.get(iD2)) {
                    InterfaceC8500k6 interfaceC8500k6A = this.f73769e.f74035e.a(iD, c8181h6);
                    this.f73767c.put(iD2, iD2);
                    this.f73766b.put(iD2, interfaceC8500k6A);
                }
                iR = i21;
                i12 = 3;
                i14 = 4;
                i15 = 12;
                i13 = 13;
            }
            int size = this.f73767c.size();
            for (int i22 = 0; i22 < size; i22++) {
                SparseIntArray sparseIntArray = this.f73767c;
                C7967f6 c7967f6 = this.f73769e;
                int iKeyAt = sparseIntArray.keyAt(i22);
                int iValueAt = sparseIntArray.valueAt(i22);
                c7967f6.f74038h.put(iKeyAt, true);
                this.f73769e.f74039i.put(iValueAt, true);
                InterfaceC8500k6 interfaceC8500k6 = (InterfaceC8500k6) this.f73766b.valueAt(i22);
                if (interfaceC8500k6 != null) {
                    interfaceC8500k6.b(c8857nU, this.f73769e.f74042l, new C8393j6(iG, iKeyAt, 8192));
                    this.f73769e.f74037g.put(iValueAt, interfaceC8500k6);
                }
            }
            this.f73769e.f74037g.remove(this.f73768d);
            this.f73769e.f74043m = 0;
            C7967f6 c7967f62 = this.f73769e;
            if (c7967f62.f74043m == 0) {
                c7967f62.f74042l.e();
                this.f73769e.f74044n = true;
            }
        }
    }
}
