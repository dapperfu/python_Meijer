package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9742vm {

    /* renamed from: a, reason: collision with root package name */
    public final int f79121a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79123c;

    /* renamed from: d, reason: collision with root package name */
    private final C[] f79124d;

    /* renamed from: e, reason: collision with root package name */
    private int f79125e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final int a(C c10) {
        int i10 = 0;
        while (true) {
            C[] cArr = this.f79124d;
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
        if (obj != null && C9742vm.class == obj.getClass()) {
            C9742vm c9742vm = (C9742vm) obj;
            if (this.f79122b.equals(c9742vm.f79122b) && Arrays.equals(this.f79124d, c9742vm.f79124d)) {
                return true;
            }
        }
        return false;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i10) {
        C9917xL.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final C b(int i10) {
        return this.f79124d[i10];
    }

    public final int hashCode() {
        int i10 = this.f79125e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.f79122b.hashCode() + 527) * 31) + Arrays.hashCode(this.f79124d);
        this.f79125e = iHashCode;
        return iHashCode;
    }

    public C9742vm(String str, C... cArr) {
        boolean z10;
        int length = cArr.length;
        int i10 = 1;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f79122b = str;
        this.f79124d = cArr;
        this.f79121a = length;
        int iB = C7057Pc.b(cArr[0].f65664o);
        this.f79123c = iB == -1 ? C7057Pc.b(cArr[0].f65663n) : iB;
        String strC = c(cArr[0].f65653d);
        int i11 = cArr[0].f65655f | 16384;
        while (true) {
            C[] cArr2 = this.f79124d;
            if (i10 < cArr2.length) {
                if (!strC.equals(c(cArr2[i10].f65653d))) {
                    C[] cArr3 = this.f79124d;
                    d("languages", cArr3[0].f65653d, cArr3[i10].f65653d, i10);
                    return;
                } else {
                    C[] cArr4 = this.f79124d;
                    if (i11 != (cArr4[i10].f65655f | 16384)) {
                        d("role flags", Integer.toBinaryString(cArr4[0].f65655f), Integer.toBinaryString(this.f79124d[i10].f65655f), i10);
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
