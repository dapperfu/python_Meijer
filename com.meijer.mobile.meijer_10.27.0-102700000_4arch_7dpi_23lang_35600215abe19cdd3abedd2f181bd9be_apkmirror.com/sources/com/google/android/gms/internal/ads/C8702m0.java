package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8702m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f76689a;

    private C8702m0(int i10, int i11, String str) {
        this.f76689a = str;
    }

    public static C8702m0 a(GQ gq2) {
        String str;
        gq2.m(2);
        int iC = gq2.C();
        int i10 = iC >> 1;
        int i11 = iC & 1;
        int iC2 = gq2.C() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i12 = iC2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(i12 >= 10 ? "." : ".0");
        sb2.append(i12);
        return new C8702m0(i10, i12, sb2.toString());
    }
}
