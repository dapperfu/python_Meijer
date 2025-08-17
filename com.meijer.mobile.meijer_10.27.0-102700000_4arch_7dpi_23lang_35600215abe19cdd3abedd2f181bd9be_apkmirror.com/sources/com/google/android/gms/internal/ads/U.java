package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final List f70502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70503b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70504c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70505d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70506e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70507f;

    /* renamed from: g, reason: collision with root package name */
    public final int f70508g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70509h;

    /* renamed from: i, reason: collision with root package name */
    public final int f70510i;

    /* renamed from: j, reason: collision with root package name */
    public final int f70511j;

    /* renamed from: k, reason: collision with root package name */
    public final float f70512k;

    /* renamed from: l, reason: collision with root package name */
    public final String f70513l;

    private U(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f70502a = list;
        this.f70503b = i10;
        this.f70504c = i11;
        this.f70505d = i12;
        this.f70506e = i13;
        this.f70507f = i14;
        this.f70508g = i15;
        this.f70509h = i16;
        this.f70510i = i17;
        this.f70511j = i18;
        this.f70512k = f10;
        this.f70513l = str;
    }

    public static U a(GQ gq2) throws zzbc {
        String strC;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            gq2.m(4);
            int iC = gq2.C() & 3;
            int i18 = iC + 1;
            if (i18 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iC2 = gq2.C() & 31;
            for (int i19 = 0; i19 < iC2; i19++) {
                arrayList.add(b(gq2));
            }
            int iC3 = gq2.C();
            for (int i20 = 0; i20 < iC3; i20++) {
                arrayList.add(b(gq2));
            }
            if (iC2 > 0) {
                Q90 q90F = C9185qa0.f((byte[]) arrayList.get(0), iC + 2, ((byte[]) arrayList.get(0)).length);
                int i21 = q90F.f69521e;
                int i22 = q90F.f69522f;
                int i23 = q90F.f69524h + 8;
                int i24 = q90F.f69525i + 8;
                int i25 = q90F.f69526j;
                int i26 = q90F.f69527k;
                int i27 = q90F.f69528l;
                int i28 = q90F.f69529m;
                float f11 = q90F.f69523g;
                strC = C8302iD.c(q90F.f69517a, q90F.f69518b, q90F.f69519c);
                i14 = i27;
                i15 = i28;
                f10 = f11;
                i13 = i24;
                i16 = i25;
                i17 = i26;
                i10 = i21;
                i11 = i22;
                i12 = i23;
            } else {
                strC = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new U(arrayList, i18, i10, i11, i12, i13, i16, i17, i14, i15, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbc.a("Error parsing AVC config", e10);
        }
    }

    private static byte[] b(GQ gq2) {
        int iG = gq2.G();
        int iT = gq2.t();
        gq2.m(iG);
        return C8302iD.e(gq2.n(), iT, iG);
    }
}
