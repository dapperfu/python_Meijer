package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9867vm {

    /* renamed from: a, reason: collision with root package name */
    public final int f79961a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79963c;

    /* renamed from: d, reason: collision with root package name */
    private final C[] f79964d;

    /* renamed from: e, reason: collision with root package name */
    private int f79965e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final int a(C c10) {
        int i10 = 0;
        while (true) {
            C[] cArr = this.f79964d;
            if (i10 >= cArr.length) {
                return -1;
            }
            if (c10 == cArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9867vm.class == obj.getClass()) {
            C9867vm c9867vm = (C9867vm) obj;
            if (this.f79962b.equals(c9867vm.f79962b) && Arrays.equals(this.f79964d, c9867vm.f79964d)) {
                return true;
            }
        }
        return false;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i10) {
        C10042xL.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final C b(int i10) {
        return this.f79964d[i10];
    }

    public final int hashCode() {
        int i10 = this.f79965e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.f79962b.hashCode() + 527) * 31) + Arrays.hashCode(this.f79964d);
        this.f79965e = iHashCode;
        return iHashCode;
    }

    public C9867vm(String str, C... cArr) {
        boolean z10;
        int length = cArr.length;
        int i10 = 1;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f79962b = str;
        this.f79964d = cArr;
        this.f79961a = length;
        int iB = C7182Pc.b(cArr[0].f66504o);
        this.f79963c = iB == -1 ? C7182Pc.b(cArr[0].f66503n) : iB;
        String strC = c(cArr[0].f66493d);
        int i11 = cArr[0].f66495f | 16384;
        while (true) {
            C[] cArr2 = this.f79964d;
            if (i10 < cArr2.length) {
                if (!strC.equals(c(cArr2[i10].f66493d))) {
                    C[] cArr3 = this.f79964d;
                    d("languages", cArr3[0].f66493d, cArr3[i10].f66493d, i10);
                    return;
                } else {
                    C[] cArr4 = this.f79964d;
                    if (i11 != (cArr4[i10].f66495f | 16384)) {
                        d("role flags", Integer.toBinaryString(cArr4[0].f66495f), Integer.toBinaryString(this.f79964d[i10].f66495f), i10);
                        return;
                    }
                    i10++;
                }
            } else {
                return;
            }
        }
    }
}
