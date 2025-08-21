package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9018np {

    /* renamed from: a, reason: collision with root package name */
    public final int f77981a;

    /* renamed from: b, reason: collision with root package name */
    private final C9867vm f77982b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f77983c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f77984d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean[] f77985e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9018np.class == obj.getClass()) {
            C9018np c9018np = (C9018np) obj;
            if (this.f77983c == c9018np.f77983c && this.f77982b.equals(c9018np.f77982b) && Arrays.equals(this.f77984d, c9018np.f77984d) && Arrays.equals(this.f77985e, c9018np.f77985e)) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return this.f77982b.f79963c;
    }

    public final C b(int i10) {
        return this.f77982b.b(i10);
    }

    public final boolean c() {
        for (boolean z10 : this.f77985e) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i10) {
        return this.f77985e[i10];
    }

    public final int hashCode() {
        return (((((this.f77982b.hashCode() * 31) + (this.f77983c ? 1 : 0)) * 31) + Arrays.hashCode(this.f77984d)) * 31) + Arrays.hashCode(this.f77985e);
    }

    public C9018np(C9867vm c9867vm, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = c9867vm.f79961a;
        this.f77981a = i10;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        C8211gC.d(z11);
        this.f77982b = c9867vm;
        this.f77983c = z10 && i10 > 1;
        this.f77984d = (int[]) iArr.clone();
        this.f77985e = (boolean[]) zArr.clone();
    }
}
